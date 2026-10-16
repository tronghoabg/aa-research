package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* loaded from: classes3.dex */
public final class zzbiz {
    public static Object zza(zzguj zzgujVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzgujVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
