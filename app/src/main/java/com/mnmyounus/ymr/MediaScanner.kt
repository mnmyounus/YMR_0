
package com.mnmyounus.ymr

import android.os.Environment
import java.io.File

object MediaScanner {

    fun scanWhatsAppImages(): List<File> {

        val list = mutableListOf<File>()

        val folder = File(Environment.getExternalStorageDirectory(),"WhatsApp/Media/WhatsApp Images")

        if(folder.exists()){
            folder.listFiles()?.forEach {
                if(it.isFile){
                    list.add(it)
                }
            }
        }

        return list
    }
}
