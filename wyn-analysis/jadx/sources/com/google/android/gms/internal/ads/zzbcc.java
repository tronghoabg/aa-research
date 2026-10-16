package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;
import com.unity3d.services.UnityAdsConstants;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzbcc {
    public static final /* synthetic */ int zza = 0;
    private static final char[] zzb = "0123456789abcdef".toCharArray();

    public static String zza(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            byte b5 = bArr[i5];
            int i10 = b5 & ForkServer.ERROR;
            char[] cArr2 = zzb;
            int i11 = i5 + i5;
            cArr[i11] = cArr2[i10 >>> 4];
            cArr[i11 + 1] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public static byte[] zzb(String str) {
        int length = str.length();
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length >> 1];
        for (int i5 = 0; i5 < length; i5 += 2) {
            bArr[i5 / 2] = (byte) (Character.digit(str.charAt(i5 + 1), 16) + (Character.digit(str.charAt(i5), 16) << 4));
        }
        return bArr;
    }

    public static boolean zzc(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean zzd() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zze(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
    }

    public static long zzf(double d3, int i5, DisplayMetrics displayMetrics) {
        return Math.round(d3 / displayMetrics.density);
    }
}
