package com.imesh.music_player.di

import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.imesh.music_player.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //this function is injecting to the some places in here to load images this fun is used
    @Provides
    @Singleton
    fun provideGlideInstance(
        @ApplicationContext context: Context
    ) {

        Glide.with(context).setDefaultRequestOptions(
            RequestOptions().error(R.drawable.ic_launcher_background)
                    .placeholder(R.drawable.ic_launcher_background)
                    .diskCacheStrategy(DiskCacheStrategy.DATA)
        )

    }
}