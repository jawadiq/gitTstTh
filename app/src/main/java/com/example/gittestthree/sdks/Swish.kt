package com.example.gittestthree.sdks

import android.content.Context
import android.content.pm.PackageManager
import android.widget.Toast


class Swish {
    fun isSwishInstalled(context: Context): Boolean {
        return try {
            context.getPackageManager()
                .getPackageInfo("se.bankgirot.swish", 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
//        Toast.makeText(context,"this",Toast.LENGTH_LONG).show()
            false
        }
    }
}