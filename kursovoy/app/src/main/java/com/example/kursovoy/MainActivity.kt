package com.example.kursovoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar //бу баар этэ ошибка "import android.widget.Toolbar"  бу оннугар ити суруйдум кеннерен
import com.example.kursovoy.activities.RegisterActivity
import com.example.kursovoy.databinding.ActivityMainBinding
import com.example.kursovoy.ui.`object`.AppDrawer
import com.example.kursovoy.ui.fragments.ChatFragment

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mAppDrawer: AppDrawer
    private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFileds()
        initFunc()
    }

    private fun initFunc() {
        if (false) {
            setSupportActionBar(mToolbar)
            mAppDrawer.create()
            supportFragmentManager.beginTransaction()
                .replace(R.id.dataContainer,
                    ChatFragment()
                ).commit()
        }else{
           val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }



    private fun initFileds() {
        mToolbar = mBinding.mainToolbar
        mAppDrawer = AppDrawer(this,mToolbar)
    }


}