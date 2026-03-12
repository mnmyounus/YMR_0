
package com.mnmyounus.ymr.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mnmyounus.ymr.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)

  btnGrantPermission.setOnClickListener {
   startActivity(Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"))
  }
 }
}
