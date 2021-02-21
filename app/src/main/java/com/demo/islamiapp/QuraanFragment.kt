package com.demo.islamiapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.demo.islamiapp.datamodels.Sura
import kotlinx.android.synthetic.main.activity_home.*
import java.io.BufferedReader
import java.io.InputStreamReader


class QuraanFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_quraan,
            frameLayout_fragment_container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dummyLIst = mutableListOf<Sura>()

    }
//    fun readSuraNAme(){
//        val inputStream = resources.getResourceName(R.raw.sura_name)
//        val bufferedReader =
//            BufferedReader(InputStreamReader(inputStream))
//        var eachline = bufferedReader.readLine()
//        while (eachline != null) {
//            // `the words in the file are separated by space`, so to get each words
//            val words = eachline.split(" ".toRegex()).toTypedArray()
//            eachline = bufferedReader.readLine()
//        }
//    }
}