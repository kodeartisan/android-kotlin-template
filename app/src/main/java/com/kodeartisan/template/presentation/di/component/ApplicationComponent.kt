package com.tutorial.learnlinuxpro.presentation.di.component

import com.kodeartisan.template.domain.executor.scheduler.BaseSchedulerProvider
import com.kodeartisan.template.presentation.di.scope.ApplicationScope
import com.tutorial.learnlinuxpro.presentation.di.module.ApplicationModule
import com.tutorial.learnlinuxpro.presentation.di.module.DataModule
import com.tutorial.learnlinuxpro.presentation.di.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by kodeartisan on 12/10/17.
 */
@Singleton
@ApplicationScope
@Component(modules = arrayOf(ApplicationModule::class, NetworkModule::class, DataModule::class))
interface ApplicationComponent {

    fun getSchedulerProvider(): BaseSchedulerProvider

}