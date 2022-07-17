package com.imesh.music_player.di

import com.google.android.exoplayer2.audio.AudioAttributes
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import javax.inject.Singleton


@Module
@InstallIn(ServiceComponent::class)
object ServiceModule {

    @Provides
    @Singleton
    fun provideAudioAttributes() {
        AudioAttributes.Builder()
    }


}