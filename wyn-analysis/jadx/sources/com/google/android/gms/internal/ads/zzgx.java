package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzgx {
    public static List zza(byte[] bArr) {
        long jZze = zze(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzh(zzi(jZze)));
        arrayList.add(zzh(zzi(3840L)));
        return arrayList;
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i5;
        if ((byteBuffer.get(5) & 2) == 0) {
            i5 = 0;
        } else {
            byte b5 = byteBuffer.get(26);
            int i10 = 28;
            int i11 = 28;
            for (int i12 = 0; i12 < b5; i12++) {
                i11 += byteBuffer.get(i12 + 27);
            }
            byte b10 = byteBuffer.get(i11 + 26);
            for (int i13 = 0; i13 < b10; i13++) {
                i10 += byteBuffer.get(i11 + 27 + i13);
            }
            i5 = i11 + i10;
        }
        int i14 = byteBuffer.get(i5 + 26) + 27 + i5;
        return (int) ((zzg(byteBuffer.get(i14), byteBuffer.limit() - i14 > 1 ? byteBuffer.get(i14 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (int) ((zzg(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        return zzg(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int zze(byte[] bArr) {
        return (bArr[10] & ForkServer.ERROR) | ((bArr[11] & ForkServer.ERROR) << 8);
    }

    public static boolean zzf(long j8, long j10) {
        return j8 - j10 <= zzi(3840L) / 1000;
    }

    private static long zzg(byte b5, byte b10) {
        int i5;
        int i10 = b5 & ForkServer.ERROR;
        int i11 = b5 & 3;
        if (i11 != 0) {
            i5 = 2;
            if (i11 != 1 && i11 != 2) {
                i5 = b10 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i5 = 1;
        }
        int i12 = i10 >> 3;
        return i5 * (i12 >= 16 ? UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL << r6 : i12 >= 12 ? 10000 << (i12 & 1) : (i12 & 3) == 3 ? 60000 : 10000 << r6);
    }

    private static byte[] zzh(long j8) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j8).array();
    }

    private static long zzi(long j8) {
        return (j8 * 1000000000) / 48000;
    }
}
