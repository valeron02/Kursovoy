package com.example.kursovoy.ui.fragments

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import com.example.kursovoy.R


class SettingsFragment : BazeFragment(R.layout.fragment_chat) {




    override fun onResume() {
        super.onResume()
    setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.settings_action_menu,menu)
    }

}