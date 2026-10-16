package com.google.android.gms.internal.ads;

import D6.C0392q;
import Va.M6;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfmd {
    public static void zza(int i5, Throwable th, String str) {
        String strD = N0.a.d(i5, "Ad failed to load : ", new StringBuilder(String.valueOf(i5).length() + 20));
        int i10 = G6.L.f4523b;
        H6.l.e(strD);
        G6.L.l(str, th);
        if (i5 == 3) {
            return;
        }
        C6.n.f1857D.f1868h.zzi(th, str);
    }

    public static void zzb(Context context, boolean z2) {
        if (z2) {
            int i5 = G6.L.f4523b;
            H6.l.e("This request is sent from a test device.");
            return;
        }
        H6.f fVar = C0392q.f2477g.f2478a;
        String strC = H6.f.c(context);
        String strT = M6.t(new StringBuilder(String.valueOf(strC).length() + 102), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", strC, "\")) to get test ads on this device.");
        int i10 = G6.L.f4523b;
        H6.l.e(strT);
    }
}
