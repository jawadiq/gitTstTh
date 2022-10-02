package com.example.gittestthree.sdks;

import android.content.Context;
import android.content.pm.PackageManager;

public class SwishCli {
    public static boolean isSwishInstalled(Context context) {
        try {
            context.getPackageManager()
                    .getPackageInfo("se.bankgirot.swish", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            // Swish app is not installed
            return false;
        }
    }
}
