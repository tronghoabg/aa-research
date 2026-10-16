package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import d7.f;

/* loaded from: classes.dex */
public final class zzadn {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iD = f.f34129b.d(context, 12451000);
            zza = Boolean.valueOf(iD == 0 || iD == 2);
        }
        return zza.booleanValue();
    }
}
