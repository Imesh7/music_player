package com.imesh.music_player


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.imesh.music_player.data.remote.MusicDatabase


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val musicDatabase = MusicDatabase(this)
        musicDatabase.getSongs()

    }
}