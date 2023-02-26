package com.udemy.myapplication.presentation.di.tvshow

import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {

    fun inject(tvShowModule: TvShowModule)

    @Subcomponent.Factory
    interface Factory {
        fun create(): TvShowSubComponent
    }
}