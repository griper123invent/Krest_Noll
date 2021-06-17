package com.grisha123invent.krest_noll.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.grisha123invent.krest_noll.R

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val glav_1: TextView = root.findViewById(R.id.text_dashboardglav_1)
        val podr_1: TextView = root.findViewById(R.id.text_dashboardpodr_1)
        val glav_2: TextView = root.findViewById(R.id.text_dashboardglav_2)
        val podr_2: TextView = root.findViewById(R.id.text_dashboardpodr_2)
        val glav_3: TextView = root.findViewById(R.id.text_dashboardglav_3)
        val podr_3: TextView = root.findViewById(R.id.text_dashboardpodr_3)
        val glav_4: TextView = root.findViewById(R.id.text_dashboardglav_4)
        val podr_4: TextView = root.findViewById(R.id.text_dashboardpodr_4)
        val glav_5: TextView = root.findViewById(R.id.text_dashboardglav_5)
        val podr_5: TextView = root.findViewById(R.id.text_dashboardpodr_5)
        val glav_6: TextView = root.findViewById(R.id.text_dashboardglav_6)
        val podr_6: TextView = root.findViewById(R.id.text_dashboardpodr_6)
        val glav_7: TextView = root.findViewById(R.id.text_dashboardglav_7)
        val podr_7: TextView = root.findViewById(R.id.text_dashboardpodr_7)
        val glav_8: TextView = root.findViewById(R.id.text_dashboardglav_8)
        val podr_8: TextView = root.findViewById(R.id.text_dashboardpodr_8)
        val glav_9: TextView = root.findViewById(R.id.text_dashboardglav_9)
        val podr_9: TextView = root.findViewById(R.id.text_dashboardpodr_9)
        val glav_10: TextView = root.findViewById(R.id.text_dashboardglav_10)
        val podr_10: TextView = root.findViewById(R.id.text_dashboardpodr_10)
        val glav_11: TextView = root.findViewById(R.id.text_dashboardglav_11)
        val podr_11: TextView = root.findViewById(R.id.text_dashboardpodr_11)
        val glav_12: TextView = root.findViewById(R.id.text_dashboardglav_12)
        val podr_12: TextView = root.findViewById(R.id.text_dashboardpodr_12)
        val glav_13: TextView = root.findViewById(R.id.text_dashboardglav_13)
        val podr_13: TextView = root.findViewById(R.id.text_dashboardpodr_13)
        val glav_14: TextView = root.findViewById(R.id.text_dashboardglav_14)
        val podr_14: TextView = root.findViewById(R.id.text_dashboardpodr_14)
        val glav_15: TextView = root.findViewById(R.id.text_dashboardglav_15)
        val podr_15: TextView = root.findViewById(R.id.text_dashboardpodr_15)
        val glav_16: TextView = root.findViewById(R.id.text_dashboardglav_16)
        val podr_16: TextView = root.findViewById(R.id.text_dashboardpodr_16)
        val glav_17: TextView = root.findViewById(R.id.text_dashboardglav_17)
        val podr_17: TextView = root.findViewById(R.id.text_dashboardpodr_17)
        val glav_18: TextView = root.findViewById(R.id.text_dashboardglav_18)
        val podr_18: TextView = root.findViewById(R.id.text_dashboardpodr_18)

        dashboardViewModel.glav_1.observe(viewLifecycleOwner, Observer {
            glav_1.text = it
        })
        dashboardViewModel.podr_1.observe(viewLifecycleOwner, Observer {
            podr_1.text = it
        })
        dashboardViewModel.glav_2.observe(viewLifecycleOwner, Observer {
            glav_2.text = it
        })
        dashboardViewModel.podr_2.observe(viewLifecycleOwner, Observer {
            podr_2.text = it
        })
        dashboardViewModel.glav_3.observe(viewLifecycleOwner, Observer {
            glav_3.text = it
        })
        dashboardViewModel.podr_3.observe(viewLifecycleOwner, Observer {
            podr_3.text = it
        })
        dashboardViewModel.glav_4.observe(viewLifecycleOwner, Observer {
            glav_4.text = it
        })
        dashboardViewModel.podr_4.observe(viewLifecycleOwner, Observer {
            podr_4.text = it
        })
        dashboardViewModel.glav_5.observe(viewLifecycleOwner, Observer {
            glav_5.text = it
        })
        dashboardViewModel.podr_5.observe(viewLifecycleOwner, Observer {
            podr_5.text = it
        })
        dashboardViewModel.glav_6.observe(viewLifecycleOwner, Observer {
            glav_6.text = it
        })
        dashboardViewModel.podr_6.observe(viewLifecycleOwner, Observer {
            podr_6.text = it
        })
        dashboardViewModel.glav_7.observe(viewLifecycleOwner, Observer {
            glav_7.text = it
        })
        dashboardViewModel.podr_7.observe(viewLifecycleOwner, Observer {
            podr_7.text = it
        })
        dashboardViewModel.glav_8.observe(viewLifecycleOwner, Observer {
            glav_8.text = it
        })
        dashboardViewModel.podr_8.observe(viewLifecycleOwner, Observer {
            podr_8.text = it
        })
        dashboardViewModel.glav_9.observe(viewLifecycleOwner, Observer {
            glav_9.text = it
        })
        dashboardViewModel.podr_9.observe(viewLifecycleOwner, Observer {
            podr_9.text = it
        })
        dashboardViewModel.glav_10.observe(viewLifecycleOwner, Observer {
            glav_10.text = it
        })
        dashboardViewModel.podr_10.observe(viewLifecycleOwner, Observer {
            podr_10.text = it
        })
        dashboardViewModel.glav_11.observe(viewLifecycleOwner, Observer {
            glav_11.text = it
        })
        dashboardViewModel.podr_11.observe(viewLifecycleOwner, Observer {
            podr_11.text = it
        })
        dashboardViewModel.glav_12.observe(viewLifecycleOwner, Observer {
            glav_12.text = it
        })
        dashboardViewModel.podr_12.observe(viewLifecycleOwner, Observer {
            podr_12.text = it
        })
        dashboardViewModel.glav_13.observe(viewLifecycleOwner, Observer {
            glav_13.text = it
        })
        dashboardViewModel.podr_13.observe(viewLifecycleOwner, Observer {
            podr_13.text = it
        })
        dashboardViewModel.glav_14.observe(viewLifecycleOwner, Observer {
            glav_14.text = it
        })
        dashboardViewModel.podr_14.observe(viewLifecycleOwner, Observer {
            podr_14.text = it
        })
        dashboardViewModel.glav_15.observe(viewLifecycleOwner, Observer {
            glav_15.text = it
        })
        dashboardViewModel.podr_15.observe(viewLifecycleOwner, Observer {
            podr_15.text = it
        })
        dashboardViewModel.glav_16.observe(viewLifecycleOwner, Observer {
            glav_16.text = it
        })
        dashboardViewModel.podr_16.observe(viewLifecycleOwner, Observer {
            podr_16.text = it
        })
        dashboardViewModel.glav_17.observe(viewLifecycleOwner, Observer {
            glav_17.text = it
        })
        dashboardViewModel.podr_17.observe(viewLifecycleOwner, Observer {
            podr_17.text = it
        })
        dashboardViewModel.glav_18.observe(viewLifecycleOwner, Observer {
            glav_18.text = it
        })
        dashboardViewModel.podr_18.observe(viewLifecycleOwner, Observer {
            podr_18.text = it
        })

        return root
    }
}