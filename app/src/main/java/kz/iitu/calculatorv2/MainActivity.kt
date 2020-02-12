package kz.iitu.calculatorv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            var first = Integer.parseInt(first_arg.text.toString());
            var sec = Integer.parseInt(second_arg.text.toString());
            var res = first + sec;
            result.text = res.toString();
        }
        button2.setOnClickListener {
            var first = Integer.parseInt(first_arg.text.toString());
            var sec = Integer.parseInt(second_arg.text.toString());
            var res = first - sec;
            result.text = res.toString();
        }
        button3.setOnClickListener {
            var first = Integer.parseInt(first_arg.text.toString());
            var sec = Integer.parseInt(second_arg.text.toString());
            var res = first * sec;
            result.text = res.toString();
        }
        button4.setOnClickListener {
            var first = Integer.parseInt(first_arg.text.toString());
            var sec = Integer.parseInt(second_arg.text.toString());
            if (sec.equals(0)){
                result.text = "you can not divide to 0"
            }
            var res = first / sec;
            result.text = res.toString();
        }
        button5.setOnClickListener {
            result.text = "";
            first_arg.text.clear();
            second_arg.text.clear();
        }
    }

}

