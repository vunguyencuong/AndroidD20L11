package com.dungtran.androidd20l11

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (fragmentManager: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
        return when(position){
            0-> FavoriteFragment()
            else -> MusicFragment()
        }
    }


}