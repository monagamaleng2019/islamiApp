package com.demo.islamiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bottom_navigation_bar.selectedItemId = R.id.menu_item_quraan
        setCurrentActivity(QuraanFragment())
        bottom_navigation_bar.setOnNavigationItemSelectedListener {
            if (it.itemId == R.id.menu_item_quraan)
                setCurrentActivity(QuraanFragment())
            if (it.itemId == R.id.menu_item_tasbeeh) setCurrentActivity(SebhaaFragment())
            if (it.itemId == R.id.menu_item_hadeeth) setCurrentActivity(HadeethFragment())
            true
        }
    }

    private fun setCurrentActivity(currentFragmentName: Fragment) {
        val manger = supportFragmentManager.beginTransaction()
        manger.replace(R.id.frameLayout_fragment_container, currentFragmentName)
        manger.commit()
    }
}