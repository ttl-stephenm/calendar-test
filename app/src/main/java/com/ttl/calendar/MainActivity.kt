package com.ttl.calendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ttl.calendar.calendarview.DatePickerController
import com.ttl.calendar.calendarview.SimpleMonthAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DatePickerController {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        pickerView.setController(this)

    }

    override fun getMaxYear(): Int {
        return 2021
    }

    override fun onDateRangeSelected(selectedDays: SimpleMonthAdapter.SelectedDays<SimpleMonthAdapter.CalendarDay>?) {
        Log.e("Calendar", "onDateRangeSelected")
    }

    override fun onDayOfMonthSelected(year: Int, month: Int, day: Int) {
        Log.e("Calendar", "onDayOfMonthSelected")
    }
}
