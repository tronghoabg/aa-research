package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzhaq extends zzhar {
    public static int zza(long j8) {
        int i5 = (int) j8;
        zzgtr.zze(((long) i5) == j8, "Out of range: %s", j8);
        return i5;
    }

    public static int zzb(long j8) {
        if (j8 > 2147483647L) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    public static int zzc(int i5, int i10, int i11) {
        zzgtr.zzg(true, "min (%s) must be less than or equal to max (%s)", i10, 1073741823);
        return Math.min(Math.max(i5, i10), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzgtr.zzg(length >= 4, "array too small: %s < %s", length, 4);
        return zze(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int zze(byte b5, byte b10, byte b11, byte b12) {
        return (b5 << 24) | ((b10 & ForkServer.ERROR) << 16) | ((b11 & ForkServer.ERROR) << 8) | (b12 & ForkServer.ERROR);
    }

    public static int[] zzf(Collection collection) {
        if (collection instanceof zzhap) {
            zzhap zzhapVar = (zzhap) collection;
            return Arrays.copyOfRange(zzhapVar.zza, zzhapVar.zzb, zzhapVar.zzc);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            Object obj = array[i5];
            obj.getClass();
            iArr[i5] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new zzhap(iArr, 0, length);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer zzh(java.lang.String r11, int r12) {
        /*
            r11.getClass()
            boolean r12 = r11.isEmpty()
            r0 = 0
            if (r12 == 0) goto Ld
        La:
            r11 = r0
            goto L6f
        Ld:
            r12 = 0
            char r1 = r11.charAt(r12)
            r2 = 45
            if (r1 != r2) goto L17
            r12 = 1
        L17:
            int r3 = r11.length()
            if (r12 != r3) goto L1e
            goto La
        L1e:
            int r3 = r12 + 1
            char r12 = r11.charAt(r12)
            int r12 = com.google.android.gms.internal.ads.zzhas.zza(r12)
            if (r12 < 0) goto La
            r4 = 10
            if (r12 < r4) goto L2f
            goto La
        L2f:
            int r12 = -r12
            long r5 = (long) r12
        L31:
            int r12 = r11.length()
            r7 = -9223372036854775808
            if (r3 >= r12) goto L5e
            int r12 = r3 + 1
            char r3 = r11.charAt(r3)
            int r3 = com.google.android.gms.internal.ads.zzhas.zza(r3)
            if (r3 < 0) goto La
            if (r3 >= r4) goto La
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 >= 0) goto L51
            goto La
        L51:
            r9 = 10
            long r5 = r5 * r9
            long r9 = (long) r3
            long r7 = r7 + r9
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L5b
            goto La
        L5b:
            long r5 = r5 - r9
            r3 = r12
            goto L31
        L5e:
            if (r1 != r2) goto L65
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            goto L6f
        L65:
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L6a
            goto La
        L6a:
            long r11 = -r5
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
        L6f:
            if (r11 == 0) goto L88
            long r1 = r11.longValue()
            int r12 = r11.intValue()
            long r3 = (long) r12
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 == 0) goto L7f
            goto L88
        L7f:
            int r11 = r11.intValue()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            return r11
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaq.zzh(java.lang.String, int):java.lang.Integer");
    }

    public static /* synthetic */ int zzi(int[] iArr, int i5, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i5) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
