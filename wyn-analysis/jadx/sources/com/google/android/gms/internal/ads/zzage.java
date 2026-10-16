package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzage {
    public static void zza(boolean z2, String str) throws zzat {
        if (!z2) {
            throw zzat.zzb(str, null);
        }
    }

    public static int zzb(zzagb zzagbVar, byte[] bArr, int i5, int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int iZzg = zzagbVar.zzg(bArr, i5 + i11, i10 - i11);
            if (iZzg == -1) {
                break;
            }
            i11 += iZzg;
        }
        return i11;
    }

    public static boolean zzc(zzagb zzagbVar, byte[] bArr, int i5, int i10) throws IOException {
        try {
            zzagbVar.zzc(bArr, i5, i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzd(zzagb zzagbVar, int i5) throws IOException {
        try {
            zzagbVar.zzf(i5);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzagb zzagbVar, byte[] bArr, int i5, int i10, boolean z2) throws IOException {
        try {
            return zzagbVar.zzh(bArr, 0, i10, z2);
        } catch (EOFException e7) {
            if (z2) {
                return false;
            }
            throw e7;
        }
    }

    public static int zzf(int i5) {
        if (i5 == 20) {
            return 63750;
        }
        if (i5 == 30) {
            return 2250000;
        }
        switch (i5) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i5) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }
}
