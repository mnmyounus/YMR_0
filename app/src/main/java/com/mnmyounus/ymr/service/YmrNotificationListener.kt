
package com.mnmyounus.ymr.service

import android.app.Notification
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

class YmrNotificationListener : NotificationListenerService() {

 override fun onNotificationPosted(sbn: StatusBarNotification) {

  val extras = sbn.notification.extras
  val title = extras.getString(Notification.EXTRA_TITLE)
  val text = extras.getCharSequence(Notification.EXTRA_TEXT)?.toString()

  Log.d("YMR","Message from: $title -> $text")
 }
}
