package com.example.assignmentseekbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alpha.max = 225
        red.max = 225
        green.max = 225
        blue.max = 225

        val button1 = findViewById<Button>(R.id.b1) as Button
        val button2 = findViewById<Button>(R.id.b2) as Button
        val button3 = findViewById<Button>(R.id.b3) as Button
        val button4 = findViewById<Button>(R.id.b4) as Button
        val button5 = findViewById<Button>(R.id.b5) as Button
        val button6 = findViewById<Button>(R.id.b6) as Button

        button1.setOnClickListener{
            class CommonListener: SeekBar.OnSeekBarChangeListener{
                var al = 0
                var redCo = 0
                var greenCo = 0
                var blueCo = 0
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                   when(p0?.id)
                   {
                       R.id.alpha->
                       {
                           al = p1
                       }
                       R.id.red->
                       {
                           redCo = p1
                       }
                       R.id.green->
                       {
                           greenCo = p1
                       }
                       R.id.blue->
                       {
                           blueCo = p1
                       }
                   }
                    var myCo = Color.argb(al, redCo, greenCo, blueCo)
                    b1.setBackgroundColor(myCo)
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {}

                override fun onStopTrackingTouch(p0: SeekBar?) {}

            }
           var commonListener = CommonListener()
            alpha.setOnSeekBarChangeListener(commonListener)
            red.setOnSeekBarChangeListener(commonListener)
            green.setOnSeekBarChangeListener(commonListener)
            blue.setOnSeekBarChangeListener(commonListener)
        }
        button2.setOnClickListener{
            class CommonListener: SeekBar.OnSeekBarChangeListener{
                var al = 0
                var redCo = 0
                var greenCo = 0
                var blueCo = 0
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    when(p0?.id)
                    {
                        R.id.alpha->
                        {
                            al = p1
                        }
                        R.id.red->
                        {
                            redCo = p1
                        }
                        R.id.green->
                        {
                            greenCo = p1
                        }
                        R.id.blue->
                        {
                            blueCo = p1
                        }
                    }
                    var myCo = Color.argb(al, redCo, greenCo, blueCo)
                    b2.setBackgroundColor(myCo)
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {}

                override fun onStopTrackingTouch(p0: SeekBar?) {}

            }
            var commonListener = CommonListener()
            alpha.setOnSeekBarChangeListener(commonListener)
            red.setOnSeekBarChangeListener(commonListener)
            green.setOnSeekBarChangeListener(commonListener)
            blue.setOnSeekBarChangeListener(commonListener)
        }
        button3.setOnClickListener{
            class CommonListener: SeekBar.OnSeekBarChangeListener{
                var al = 0
                var redCo = 0
                var greenCo = 0
                var blueCo = 0
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    when(p0?.id)
                    {
                        R.id.alpha->
                        {
                            al = p1
                        }
                        R.id.red->
                        {
                            redCo = p1
                        }
                        R.id.green->
                        {
                            greenCo = p1
                        }
                        R.id.blue->
                        {
                            blueCo = p1
                        }
                    }
                    var myCo = Color.argb(al, redCo, greenCo, blueCo)
                    b3.setBackgroundColor(myCo)
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {}

                override fun onStopTrackingTouch(p0: SeekBar?) {}

            }
            var commonListener = CommonListener()
            alpha.setOnSeekBarChangeListener(commonListener)
            red.setOnSeekBarChangeListener(commonListener)
            green.setOnSeekBarChangeListener(commonListener)
            blue.setOnSeekBarChangeListener(commonListener)
        }
        button4.setOnClickListener{
            class CommonListener: SeekBar.OnSeekBarChangeListener{
                var al = 0
                var redCo = 0
                var greenCo = 0
                var blueCo = 0
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    when(p0?.id)
                    {
                        R.id.alpha->
                        {
                            al = p1
                        }
                        R.id.red->
                        {
                            redCo = p1
                        }
                        R.id.green->
                        {
                            greenCo = p1
                        }
                        R.id.blue->
                        {
                            blueCo = p1
                        }
                    }
                    var myCo = Color.argb(al, redCo, greenCo, blueCo)
                    b4.setBackgroundColor(myCo)
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {}

                override fun onStopTrackingTouch(p0: SeekBar?) {}

            }
            var commonListener = CommonListener()
            alpha.setOnSeekBarChangeListener(commonListener)
            red.setOnSeekBarChangeListener(commonListener)
            green.setOnSeekBarChangeListener(commonListener)
            blue.setOnSeekBarChangeListener(commonListener)
        }
        button5.setOnClickListener{
            class CommonListener: SeekBar.OnSeekBarChangeListener{
                var al = 0
                var redCo = 0
                var greenCo = 0
                var blueCo = 0
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    when(p0?.id)
                    {
                        R.id.alpha->
                        {
                            al = p1
                        }
                        R.id.red->
                        {
                            redCo = p1
                        }
                        R.id.green->
                        {
                            greenCo = p1
                        }
                        R.id.blue->
                        {
                            blueCo = p1
                        }
                    }
                    var myCo = Color.argb(al, redCo, greenCo, blueCo)
                    b5.setBackgroundColor(myCo)
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {}

                override fun onStopTrackingTouch(p0: SeekBar?) {}

            }
            var commonListener = CommonListener()
            alpha.setOnSeekBarChangeListener(commonListener)
            red.setOnSeekBarChangeListener(commonListener)
            green.setOnSeekBarChangeListener(commonListener)
            blue.setOnSeekBarChangeListener(commonListener)
        }
        button6.setOnClickListener{
            class CommonListener: SeekBar.OnSeekBarChangeListener{
                var al = 0
                var redCo = 0
                var greenCo = 0
                var blueCo = 0
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    when(p0?.id)
                    {
                        R.id.alpha->
                        {
                            al = p1
                        }
                        R.id.red->
                        {
                            redCo = p1
                        }
                        R.id.green->
                        {
                            greenCo = p1
                        }
                        R.id.blue->
                        {
                            blueCo = p1
                        }
                    }
                    var myCo = Color.argb(al, redCo, greenCo, blueCo)
                    b6.setBackgroundColor(myCo)
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {}

                override fun onStopTrackingTouch(p0: SeekBar?) {}

            }
            var commonListener = CommonListener()
            alpha.setOnSeekBarChangeListener(commonListener)
            red.setOnSeekBarChangeListener(commonListener)
            green.setOnSeekBarChangeListener(commonListener)
            blue.setOnSeekBarChangeListener(commonListener)
        }

    }
}
