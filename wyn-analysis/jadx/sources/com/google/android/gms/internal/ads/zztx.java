package com.google.android.gms.internal.ads;

import android.os.Build;

/* loaded from: classes3.dex */
final class zztx {
    public static boolean zza(int i5) {
        if (i5 == 8 || i5 == 7) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 || !(i5 == 26 || i5 == 27)) {
            return i10 >= 33 && i5 == 30;
        }
        return true;
    }
}
