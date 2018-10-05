/*
 * Copyright (C) 2017 Álinson Santos Xavier <isoron@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.isoron.uhabits.activities

import dagger.Component
import org.isoron.androidbase.activities.ActivityContextModule
import org.isoron.androidbase.activities.ActivityScope
import org.isoron.androidbase.activities.BaseActivityModule
import org.isoron.uhabits.HabitsApplicationComponent
import org.isoron.uhabits.activities.about.AboutModule
import org.isoron.uhabits.activities.about.AboutRootView
import org.isoron.uhabits.activities.about.AboutScreen
import org.isoron.uhabits.activities.common.dialogs.ColorPickerDialogFactory
import org.isoron.uhabits.activities.habits.list.*
import org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter
import org.isoron.uhabits.activities.habits.show.ShowHabitModule
import org.isoron.uhabits.activities.habits.show.ShowHabitScreen
import org.isoron.uhabits.core.ui.ThemeSwitcher
import org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsBehavior

@ActivityScope
@Component(modules = arrayOf(
        ActivityContextModule::class,
        BaseActivityModule::class,
        AboutModule::class,
        HabitsActivityModule::class,
        ListHabitsModule::class,
        ShowHabitModule::class,
        HabitModule::class
), dependencies = arrayOf(HabitsApplicationComponent::class))
interface HabitsActivityComponent {
    val aboutRootView: AboutRootView
    val aboutScreen: AboutScreen
    val colorPickerDialogFactory: ColorPickerDialogFactory
    val habitCardListAdapter: HabitCardListAdapter
    val listHabitsBehavior: ListHabitsBehavior
    val listHabitsMenu: ListHabitsMenu
    val listHabitsRootView: ListHabitsRootView
    val listHabitsScreen: ListHabitsScreen
    val listHabitsSelectionMenu: ListHabitsSelectionMenu
    val showHabitScreen: ShowHabitScreen
    val themeSwitcher: ThemeSwitcher
}
