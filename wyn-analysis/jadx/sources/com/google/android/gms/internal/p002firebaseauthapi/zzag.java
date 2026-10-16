package com.google.android.gms.internal.p002firebaseauthapi;

import N0.a;
import R8.v;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzag {
    public static String zza(String str) {
        return zzt.zzb(str);
    }

    public static String zzb(String str) {
        return zzt.zzc(str);
    }

    public static boolean zzc(String str) {
        return zzt.zzd(str);
    }

    public static String zza(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i5 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            objArr[i10] = zza(objArr[i10]);
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i11 = 0;
        while (i5 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i11)) != -1) {
            sb2.append((CharSequence) strValueOf, i11, iIndexOf);
            sb2.append(objArr[i5]);
            i11 = iIndexOf + 2;
            i5++;
        }
        sb2.append((CharSequence) strValueOf, i11, strValueOf.length());
        if (i5 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i5]);
            for (int i12 = i5 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    private static String zza(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e7) {
            String strG = a.g(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", v.f("Exception during lenientFormat for ", strG), (Throwable) e7);
            return v.g("<", strG, " threw ", e7.getClass().getName(), ">");
        }
    }
}
