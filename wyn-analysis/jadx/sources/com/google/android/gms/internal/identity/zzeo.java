package com.google.android.gms.internal.identity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzeo {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static String zza(long j8) {
        return j8 >= 0 ? zza.format(new Date(j8)) : Long.toString(j8);
    }

    public static String zzb(long j8) {
        String string;
        StringBuilder sb2 = zzc;
        synchronized (sb2) {
            sb2.setLength(0);
            zzc(j8, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public static StringBuilder zzc(long j8, StringBuilder sb2) {
        if (j8 == 0) {
            sb2.append("0s");
            return sb2;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z2 = false;
        if (j8 < 0) {
            sb2.append("-");
            if (j8 != Long.MIN_VALUE) {
                j8 = -j8;
            } else {
                j8 = Long.MAX_VALUE;
                z2 = true;
            }
        }
        if (j8 >= 86400000) {
            sb2.append(j8 / 86400000);
            sb2.append("d");
            j8 %= 86400000;
        }
        if (true == z2) {
            j8 = 25975808;
        }
        if (j8 >= 3600000) {
            sb2.append(j8 / 3600000);
            sb2.append("h");
            j8 %= 3600000;
        }
        if (j8 >= 60000) {
            sb2.append(j8 / 60000);
            sb2.append("m");
            j8 %= 60000;
        }
        if (j8 >= 1000) {
            sb2.append(j8 / 1000);
            sb2.append("s");
            j8 %= 1000;
        }
        if (j8 > 0) {
            sb2.append(j8);
            sb2.append("ms");
        }
        return sb2;
    }
}
