package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;

/* loaded from: classes2.dex */
public final class pxv {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/paintfe/PaintfeClientPropertiesProviderImpl");
    public final DisplayMetrics b;
    public final ackk c;
    public final ackk d;
    public final ackk e;
    public final Context f;
    public final int g;

    public pxv(Context context, DisplayMetrics displayMetrics, ackk ackkVar, ackk ackkVar2, ackk ackkVar3) {
        this.f = context;
        this.b = displayMetrics;
        this.c = ackkVar;
        this.d = ackkVar2;
        this.e = ackkVar3;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getClass();
        activityManager.getMemoryInfo(memoryInfo);
        Resources resources = context.getResources();
        resources.getClass();
        DisplayMetrics displayMetrics2 = resources.getDisplayMetrics();
        displayMetrics2.getClass();
        int iMax = (int) Math.max(displayMetrics2.xdpi, displayMetrics2.ydpi);
        long j = memoryInfo.totalMem;
        int i = Build.VERSION.SDK_INT;
        int i2 = 4;
        if ((j < 8589934592L || i < 31 || iMax < 371) && (j < 6442450944L || i < 33 || iMax < 371)) {
            i2 = 3;
            if ((j < 6442450944L || (i >= 33 && iMax >= 371)) && (j <= 2147483648L || i < 31)) {
                i2 = 2;
                if (j > 2147483648L && i >= 31) {
                    i2 = 1;
                }
            }
        }
        this.g = i2;
    }
}
