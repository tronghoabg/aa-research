package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
final class zzail {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i5) {
        return Double.longBitsToDouble(zzd(bArr, i5));
    }

    public static float zzb(byte[] bArr, int i5) {
        return Float.intBitsToFloat(zzc(bArr, i5));
    }

    public static int zzc(byte[] bArr, int i5) {
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (bArr[i5] & ForkServer.ERROR) | ((bArr[i5 + 1] & ForkServer.ERROR) << 8) | ((bArr[i5 + 2] & ForkServer.ERROR) << 16);
    }

    public static int zzd(byte[] bArr, int i5, zzaik zzaikVar) {
        int i10 = i5 + 1;
        long j8 = bArr[i5];
        if (j8 >= 0) {
            zzaikVar.zzb = j8;
            return i10;
        }
        int i11 = i5 + 2;
        byte b5 = bArr[i10];
        long j10 = (j8 & 127) | ((b5 & 127) << 7);
        int i12 = 7;
        while (b5 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j10 |= (r10 & 127) << i12;
            b5 = bArr[i11];
            i11 = i13;
        }
        zzaikVar.zzb = j10;
        return i11;
    }

    public static int zza(byte[] bArr, int i5, zzaik zzaikVar) throws zzakf {
        int iZzc = zzc(bArr, i5, zzaikVar);
        int i10 = zzaikVar.zza;
        if (i10 < 0) {
            throw zzakf.zzf();
        }
        if (i10 > bArr.length - iZzc) {
            throw zzakf.zzj();
        }
        if (i10 == 0) {
            zzaikVar.zzc = zzaip.zza;
            return iZzc;
        }
        zzaikVar.zzc = zzaip.zza(bArr, iZzc, i10);
        return iZzc + i10;
    }

    public static int zzb(zzalv<?> zzalvVar, int i5, byte[] bArr, int i10, int i11, zzakc<?> zzakcVar, zzaik zzaikVar) throws IOException {
        int iZza = zza(zzalvVar, bArr, i10, i11, zzaikVar);
        zzakcVar.add(zzaikVar.zzc);
        while (iZza < i11) {
            int iZzc = zzc(bArr, iZza, zzaikVar);
            if (i5 != zzaikVar.zza) {
                break;
            }
            iZza = zza(zzalvVar, bArr, iZzc, i11, zzaikVar);
            zzakcVar.add(zzaikVar.zzc);
        }
        return iZza;
    }

    public static int zzc(byte[] bArr, int i5, zzaik zzaikVar) {
        int i10 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 < 0) {
            return zza(b5, bArr, i10, zzaikVar);
        }
        zzaikVar.zza = b5;
        return i10;
    }

    public static long zzd(byte[] bArr, int i5) {
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i5, zzaik zzaikVar) throws zzakf {
        int iZzc = zzc(bArr, i5, zzaikVar);
        int i10 = zzaikVar.zza;
        if (i10 < 0) {
            throw zzakf.zzf();
        }
        if (i10 == 0) {
            zzaikVar.zzc = "";
            return iZzc;
        }
        zzaikVar.zzc = zzamt.zzb(bArr, iZzc, i10);
        return iZzc + i10;
    }

    public static int zza(int i5, byte[] bArr, int i10, int i11, Object obj, zzalc zzalcVar, zzamo<zzamn, zzamn> zzamoVar, zzaik zzaikVar) throws IOException {
        if (zzaikVar.zzd.zza(zzalcVar, i5 >>> 3) == null) {
            return zza(i5, bArr, i10, i11, zzalg.zzc(obj), zzaikVar);
        }
        zzajy.zzb zzbVar = (zzajy.zzb) obj;
        zzbVar.zza();
        zzajr<zzajy.zze> zzajrVar = zzbVar.zzc;
        throw new NoSuchMethodError();
    }

    private static int zza(zzalv zzalvVar, byte[] bArr, int i5, int i10, int i11, zzaik zzaikVar) throws IOException {
        Object objZza = zzalvVar.zza();
        int iZza = zza(objZza, zzalvVar, bArr, i5, i10, i11, zzaikVar);
        zzalvVar.zzd(objZza);
        zzaikVar.zzc = objZza;
        return iZza;
    }

    public static int zza(zzalv zzalvVar, int i5, byte[] bArr, int i10, int i11, zzakc<?> zzakcVar, zzaik zzaikVar) throws IOException {
        int i12 = (i5 & (-8)) | 4;
        int iZza = zza(zzalvVar, bArr, i10, i11, i12, zzaikVar);
        zzakcVar.add(zzaikVar.zzc);
        while (iZza < i11) {
            int iZzc = zzc(bArr, iZza, zzaikVar);
            if (i5 != zzaikVar.zza) {
                break;
            }
            iZza = zza(zzalvVar, bArr, iZzc, i11, i12, zzaikVar);
            zzakcVar.add(zzaikVar.zzc);
        }
        return iZza;
    }

    public static int zza(zzalv zzalvVar, byte[] bArr, int i5, int i10, zzaik zzaikVar) throws IOException {
        Object objZza = zzalvVar.zza();
        int iZza = zza(objZza, zzalvVar, bArr, i5, i10, zzaikVar);
        zzalvVar.zzd(objZza);
        zzaikVar.zzc = objZza;
        return iZza;
    }

    public static int zza(byte[] bArr, int i5, zzakc<?> zzakcVar, zzaik zzaikVar) throws IOException {
        zzajz zzajzVar = (zzajz) zzakcVar;
        int iZzc = zzc(bArr, i5, zzaikVar);
        int i10 = zzaikVar.zza + iZzc;
        while (iZzc < i10) {
            iZzc = zzc(bArr, iZzc, zzaikVar);
            zzajzVar.zzc(zzaikVar.zza);
        }
        if (iZzc == i10) {
            return iZzc;
        }
        throw zzakf.zzj();
    }

    public static int zza(int i5, byte[] bArr, int i10, int i11, zzamn zzamnVar, zzaik zzaikVar) throws zzakf {
        if ((i5 >>> 3) == 0) {
            throw zzakf.zzc();
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            int iZzd = zzd(bArr, i10, zzaikVar);
            zzamnVar.zza(i5, Long.valueOf(zzaikVar.zzb));
            return iZzd;
        }
        if (i12 == 1) {
            zzamnVar.zza(i5, Long.valueOf(zzd(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzc = zzc(bArr, i10, zzaikVar);
            int i13 = zzaikVar.zza;
            if (i13 >= 0) {
                if (i13 > bArr.length - iZzc) {
                    throw zzakf.zzj();
                }
                if (i13 == 0) {
                    zzamnVar.zza(i5, zzaip.zza);
                } else {
                    zzamnVar.zza(i5, zzaip.zza(bArr, iZzc, i13));
                }
                return iZzc + i13;
            }
            throw zzakf.zzf();
        }
        if (i12 != 3) {
            if (i12 == 5) {
                zzamnVar.zza(i5, Integer.valueOf(zzc(bArr, i10)));
                return i10 + 4;
            }
            throw zzakf.zzc();
        }
        zzamn zzamnVarZzd = zzamn.zzd();
        int i14 = (i5 & (-8)) | 4;
        int i15 = zzaikVar.zze + 1;
        zzaikVar.zze = i15;
        zza(i15);
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzc2 = zzc(bArr, i10, zzaikVar);
            i16 = zzaikVar.zza;
            if (i16 == i14) {
                i10 = iZzc2;
                break;
            }
            i10 = zza(i16, bArr, iZzc2, i11, zzamnVarZzd, zzaikVar);
        }
        zzaikVar.zze--;
        if (i10 <= i11 && i16 == i14) {
            zzamnVar.zza(i5, zzamnVarZzd);
            return i10;
        }
        throw zzakf.zzg();
    }

    public static int zza(int i5, byte[] bArr, int i10, zzaik zzaikVar) {
        int i11 = i5 & 127;
        int i12 = i10 + 1;
        byte b5 = bArr[i10];
        if (b5 >= 0) {
            zzaikVar.zza = i11 | (b5 << 7);
            return i12;
        }
        int i13 = i11 | ((b5 & 127) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            zzaikVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & 127) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzaikVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzaikVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzaikVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zza(int i5, byte[] bArr, int i10, int i11, zzakc<?> zzakcVar, zzaik zzaikVar) {
        zzajz zzajzVar = (zzajz) zzakcVar;
        int iZzc = zzc(bArr, i10, zzaikVar);
        zzajzVar.zzc(zzaikVar.zza);
        while (iZzc < i11) {
            int iZzc2 = zzc(bArr, iZzc, zzaikVar);
            if (i5 != zzaikVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzaikVar);
            zzajzVar.zzc(zzaikVar.zza);
        }
        return iZzc;
    }

    public static int zza(Object obj, zzalv zzalvVar, byte[] bArr, int i5, int i10, int i11, zzaik zzaikVar) throws IOException {
        int i12 = zzaikVar.zze + 1;
        zzaikVar.zze = i12;
        zza(i12);
        int iZza = ((zzalg) zzalvVar).zza((zzalg) obj, bArr, i5, i10, i11, zzaikVar);
        zzaikVar.zze--;
        zzaikVar.zzc = obj;
        return iZza;
    }

    public static int zza(Object obj, zzalv zzalvVar, byte[] bArr, int i5, int i10, zzaik zzaikVar) throws IOException {
        int iZza = i5 + 1;
        int i11 = bArr[i5];
        if (i11 < 0) {
            iZza = zza(i11, bArr, iZza, zzaikVar);
            i11 = zzaikVar.zza;
        }
        int i12 = iZza;
        if (i11 >= 0 && i11 <= i10 - i12) {
            int i13 = zzaikVar.zze + 1;
            zzaikVar.zze = i13;
            zza(i13);
            int i14 = i12 + i11;
            zzalvVar.zza(obj, bArr, i12, i14, zzaikVar);
            zzaikVar.zze--;
            zzaikVar.zzc = obj;
            return i14;
        }
        throw zzakf.zzj();
    }

    public static int zza(int i5, byte[] bArr, int i10, int i11, zzaik zzaikVar) throws zzakf {
        if ((i5 >>> 3) == 0) {
            throw zzakf.zzc();
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            return zzd(bArr, i10, zzaikVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zzc(bArr, i10, zzaikVar) + zzaikVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw zzakf.zzc();
        }
        int i13 = (i5 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zzc(bArr, i10, zzaikVar);
            i14 = zzaikVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zza(i14, bArr, i10, i11, zzaikVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw zzakf.zzg();
        }
        return i10;
    }

    private static void zza(int i5) throws zzakf {
        if (i5 >= zza) {
            throw zzakf.zzh();
        }
    }
}
