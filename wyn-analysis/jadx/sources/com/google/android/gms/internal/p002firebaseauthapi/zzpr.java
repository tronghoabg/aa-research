package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class zzpr {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i5 = 0;
        while (i5 == 0) {
            secureRandom.nextBytes(bArr);
            i5 = ((bArr[0] & ForkServer.ERROR) << 24) | ((bArr[1] & ForkServer.ERROR) << 16) | ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR);
        }
        return i5;
    }

    public static final zzzc zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new zzpp("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i5] = (byte) cCharAt;
        }
        return zzzc.zza(bArr);
    }

    public static final zzzc zza(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            if (cCharAt >= '!' && cCharAt <= '~') {
                bArr[i5] = (byte) cCharAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
        }
        return zzzc.zza(bArr);
    }

    public static Integer zzb() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            if (bArr2[i5] != bArr[i5]) {
                return false;
            }
        }
        return true;
    }
}
