package com.waze.system;

import android.app.NotificationManager;
import android.os.Build;
import android.provider.Settings;
import androidx.core.content.ContextCompat;
import com.waze.mg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {
    private c() {
    }

    public static final NotificationManager a() {
        return (NotificationManager) mg.a().getSystemService("notification");
    }

    public static boolean b() {
        return Settings.canDrawOverlays(mg.a()) && (Build.VERSION.SDK_INT < 31 || ContextCompat.checkSelfPermission(mg.a(), "android.permission.READ_PHONE_STATE") == 0);
    }
}
