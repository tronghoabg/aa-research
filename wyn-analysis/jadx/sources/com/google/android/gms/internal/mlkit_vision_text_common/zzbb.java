package com.google.android.gms.internal.mlkit_vision_text_common;

import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
final class zzbb {
    public static int zza(int i5) {
        return (i5 + 1) * (i5 < 32 ? 4 : 2);
    }

    public static int zzb(Object obj, Object obj2, int i5, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int iZza = zzbc.zza(obj);
        int i12 = iZza & i5;
        int iZzc = zzc(obj3, i12);
        if (iZzc != 0) {
            int i13 = ~i5;
            int i14 = iZza & i13;
            int i15 = -1;
            while (true) {
                i10 = iZzc - 1;
                int i16 = iArr[i10];
                i11 = i16 & i5;
                if ((i16 & i13) != i14 || !zzw.zza(obj, objArr[i10]) || (objArr2 != null && !zzw.zza(obj2, objArr2[i10]))) {
                    if (i11 == 0) {
                        break;
                    }
                    i15 = i10;
                    iZzc = i11;
                } else {
                    break;
                }
            }
            if (i15 == -1) {
                zze(obj3, i12, i11);
                return i10;
            }
            iArr[i15] = (iArr[i15] & i13) | (i11 & i5);
            return i10;
        }
        return -1;
    }

    public static int zzc(Object obj, int i5) {
        return obj instanceof byte[] ? ((byte[]) obj)[i5] & ForkServer.ERROR : obj instanceof short[] ? (char) ((short[]) obj)[i5] : ((int[]) obj)[i5];
    }

    public static Object zzd(int i5) {
        if (i5 < 2 || i5 > 1073741824 || Integer.highestOneBit(i5) != i5) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i5 <= 256 ? new byte[i5] : i5 <= 65536 ? new short[i5] : new int[i5];
    }

    public static void zze(Object obj, int i5, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i5] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i5] = (short) i10;
        } else {
            ((int[]) obj)[i5] = i10;
        }
    }
}
