package com.base.common

import android.content.Context
import android.widget.Toast

/**
 * @author: seth
 * @date: 2021/9/30 11:55
 */
object CommonUtil {
    fun showCommonMessage(context: Context){
        Toast.makeText(context,"common Library",Toast.LENGTH_SHORT).show()
    }
}