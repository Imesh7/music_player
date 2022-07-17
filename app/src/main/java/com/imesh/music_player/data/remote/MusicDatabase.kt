package com.imesh.music_player.data.remote

import android.content.Context
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import com.imesh.music_player.data.entity.Song
import com.imesh.music_player.utils.Constants.SONG_COLLECTION
import kotlinx.coroutines.tasks.await


class MusicDatabase(private val context: Context) {
      private val firebase = FirebaseFirestore.getInstance();

    private val getData = firebase.collection(SONG_COLLECTION)

    suspend fun getSongs() : List<Song> {
         println("getting data")

        return try {
            getData.get().await().toObjects(Song::class.java)
        } catch (e : Exception){
            emptyList()
        }


        /*println(getData.get().addOnSuccessListener {
            Toast.makeText(context, "Your first name is ${it.documents.get(0).data?.get("name") }  and last name is ${it.documents.get(0).data?.get("image") }", Toast.LENGTH_SHORT).show()
        }
            .addOnFailureListener{
                it.printStackTrace()
                Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()

     }
        )*/
    }


}