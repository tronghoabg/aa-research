package com.google.android.gms.internal.p002firebaseauthapi;

import R8.v;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1729s;
import java.util.List;

/* loaded from: classes.dex */
public final class zzads {
    private final int zza;

    private zzads(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> listZza = zzx.zza("[.-]").zza((CharSequence) str);
            if (listZza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (listZza.size() >= 3) {
                return (Integer.parseInt(listZza.get(1)) * 1000) + (Integer.parseInt(listZza.get(0)) * 1000000) + Integer.parseInt(listZza.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e7) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e7));
            return -1;
        }
    }

    public final String zzb() {
        return v.f("X", Integer.toString(this.zza));
    }

    public static zzads zza() throws Throwable {
        String strA = C1729s.f26680c.a("firebase-auth");
        if (TextUtils.isEmpty(strA) || strA.equals("UNKNOWN")) {
            strA = "-1";
        }
        return new zzads(strA);
    }
}
