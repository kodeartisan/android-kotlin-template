package com.tutorial.learnlinuxpro.presentation.di.module

import android.content.Context
import com.kodeartisan.template.BaseApp
import com.kodeartisan.template.domain.executor.scheduler.BaseSchedulerProvider
import com.kodeartisan.template.domain.executor.scheduler.SchedulerProvider
import com.tutorial.learnlinuxpro.presentation.bus.RxBus
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by kodeartisan on 12/10/17.
 */
@Module
class ApplicationModule(private val app: BaseApp) {

    @Provides
    @Singleton
    fun provideApplication(): BaseApp = app

    @Provides
    @Singleton
    fun provideContext(): Context = app

    @Provides
    @Singleton
    fun provideSchedulerProvider(): BaseSchedulerProvider = SchedulerProvider()


    @Provides
    @Singleton
    fun provideRxBus(): RxBus = RxBus()

}