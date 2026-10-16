package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* loaded from: classes3.dex */
public final class zzhlz {
    public static boolean zza(String str) {
        int length = str.length();
        int i5 = 0;
        while (i5 != length) {
            char cCharAt = str.charAt(i5);
            int i10 = i5 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i5 = i10;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i10 == length || !Character.isLowSurrogate(str.charAt(i10))) {
                    return false;
                }
                i5 += 2;
            }
        }
        return true;
    }

    public static zzibr zzb(String str) throws IOException {
        try {
            zzico zzicoVar = new zzico(new StringReader(str));
            zzicoVar.zza(zzibw.LEGACY_STRICT);
            return zzhlx.zza(zzicoVar);
        } catch (NumberFormatException e7) {
            throw new IOException(e7);
        }
    }

    public static long zzc(Number number) {
        if (number instanceof zzhly) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }
}
