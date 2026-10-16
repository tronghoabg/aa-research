package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
final class zzig {
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

    public static int zzd(byte[] bArr, int i5, zzij zzijVar) {
        int i10 = i5 + 1;
        long j8 = bArr[i5];
        if (j8 >= 0) {
            zzijVar.zzb = j8;
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
        zzijVar.zzb = j10;
        return i11;
    }

    public static int zza(byte[] bArr, int i5, zzij zzijVar) throws zzkb {
        int iZzc = zzc(bArr, i5, zzijVar);
        int i10 = zzijVar.zza;
        if (i10 < 0) {
            throw zzkb.zzf();
        }
        if (i10 > bArr.length - iZzc) {
            throw zzkb.zzi();
        }
        if (i10 == 0) {
            zzijVar.zzc = zzik.zza;
            return iZzc;
        }
        zzijVar.zzc = zzik.zza(bArr, iZzc, i10);
        return iZzc + i10;
    }

    public static int zzb(zzlu<?> zzluVar, int i5, byte[] bArr, int i10, int i11, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        int iZza = zza(zzluVar, bArr, i10, i11, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (iZza < i11) {
            int iZzc = zzc(bArr, iZza, zzijVar);
            if (i5 != zzijVar.zza) {
                break;
            }
            iZza = zza(zzluVar, bArr, iZzc, i11, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return iZza;
    }

    public static int zzc(byte[] bArr, int i5, zzij zzijVar) {
        int i10 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 < 0) {
            return zza(b5, bArr, i10, zzijVar);
        }
        zzijVar.zza = b5;
        return i10;
    }

    public static long zzd(byte[] bArr, int i5) {
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i5, zzij zzijVar) throws zzkb {
        int iZzc = zzc(bArr, i5, zzijVar);
        int i10 = zzijVar.zza;
        if (i10 < 0) {
            throw zzkb.zzf();
        }
        if (i10 == 0) {
            zzijVar.zzc = "";
            return iZzc;
        }
        zzijVar.zzc = zzmp.zzb(bArr, iZzc, i10);
        return iZzc + i10;
    }

    public static int zza(int i5, byte[] bArr, int i10, int i11, Object obj, zzlc zzlcVar, zzmk<zzmj, zzmj> zzmkVar, zzij zzijVar) throws IOException {
        if (zzijVar.zzd.zza(zzlcVar, i5 >>> 3) == null) {
            return zza(i5, bArr, i10, i11, zzlg.zzc(obj), zzijVar);
        }
        zzjt.zzd zzdVar = (zzjt.zzd) obj;
        zzdVar.zza();
        zzjm<zzjt.zzc> zzjmVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    private static int zza(zzlu zzluVar, byte[] bArr, int i5, int i10, int i11, zzij zzijVar) throws IOException {
        Object objZza = zzluVar.zza();
        int iZza = zza(objZza, zzluVar, bArr, i5, i10, i11, zzijVar);
        zzluVar.zzd(objZza);
        zzijVar.zzc = objZza;
        return iZza;
    }

    public static int zza(zzlu zzluVar, int i5, byte[] bArr, int i10, int i11, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        int i12 = (i5 & (-8)) | 4;
        int iZza = zza(zzluVar, bArr, i10, i11, i12, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (iZza < i11) {
            int iZzc = zzc(bArr, iZza, zzijVar);
            if (i5 != zzijVar.zza) {
                break;
            }
            iZza = zza(zzluVar, bArr, iZzc, i11, i12, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return iZza;
    }

    public static int zza(zzlu zzluVar, byte[] bArr, int i5, int i10, zzij zzijVar) throws IOException {
        Object objZza = zzluVar.zza();
        int iZza = zza(objZza, zzluVar, bArr, i5, i10, zzijVar);
        zzluVar.zzd(objZza);
        zzijVar.zzc = objZza;
        return iZza;
    }

    public static int zza(byte[] bArr, int i5, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int iZzc = zzc(bArr, i5, zzijVar);
        int i10 = zzijVar.zza + iZzc;
        while (iZzc < i10) {
            iZzc = zzc(bArr, iZzc, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        if (iZzc == i10) {
            return iZzc;
        }
        throw zzkb.zzi();
    }

    public static int zza(int i5, byte[] bArr, int i10, int i11, zzmj zzmjVar, zzij zzijVar) throws zzkb {
        if ((i5 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            int iZzd = zzd(bArr, i10, zzijVar);
            zzmjVar.zza(i5, Long.valueOf(zzijVar.zzb));
            return iZzd;
        }
        if (i12 == 1) {
            zzmjVar.zza(i5, Long.valueOf(zzd(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzc = zzc(bArr, i10, zzijVar);
            int i13 = zzijVar.zza;
            if (i13 >= 0) {
                if (i13 > bArr.length - iZzc) {
                    throw zzkb.zzi();
                }
                if (i13 == 0) {
                    zzmjVar.zza(i5, zzik.zza);
                } else {
                    zzmjVar.zza(i5, zzik.zza(bArr, iZzc, i13));
                }
                return iZzc + i13;
            }
            throw zzkb.zzf();
        }
        if (i12 != 3) {
            if (i12 == 5) {
                zzmjVar.zza(i5, Integer.valueOf(zzc(bArr, i10)));
                return i10 + 4;
            }
            throw zzkb.zzc();
        }
        zzmj zzmjVarZzd = zzmj.zzd();
        int i14 = (i5 & (-8)) | 4;
        int i15 = zzijVar.zze + 1;
        zzijVar.zze = i15;
        zza(i15);
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzc2 = zzc(bArr, i10, zzijVar);
            i16 = zzijVar.zza;
            if (i16 == i14) {
                i10 = iZzc2;
                break;
            }
            i10 = zza(i16, bArr, iZzc2, i11, zzmjVarZzd, zzijVar);
        }
        zzijVar.zze--;
        if (i10 <= i11 && i16 == i14) {
            zzmjVar.zza(i5, zzmjVarZzd);
            return i10;
        }
        throw zzkb.zzg();
    }

    public static int zza(int i5, byte[] bArr, int i10, zzij zzijVar) {
        int i11 = i5 & 127;
        int i12 = i10 + 1;
        byte b5 = bArr[i10];
        if (b5 >= 0) {
            zzijVar.zza = i11 | (b5 << 7);
            return i12;
        }
        int i13 = i11 | ((b5 & 127) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            zzijVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & 127) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzijVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzijVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzijVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zza(int i5, byte[] bArr, int i10, int i11, zzkc<?> zzkcVar, zzij zzijVar) {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int iZzc = zzc(bArr, i10, zzijVar);
        zzjwVar.zzd(zzijVar.zza);
        while (iZzc < i11) {
            int iZzc2 = zzc(bArr, iZzc, zzijVar);
            if (i5 != zzijVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        return iZzc;
    }

    public static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i5, int i10, int i11, zzij zzijVar) throws IOException {
        int i12 = zzijVar.zze + 1;
        zzijVar.zze = i12;
        zza(i12);
        int iZza = ((zzlg) zzluVar).zza((zzlg) obj, bArr, i5, i10, i11, zzijVar);
        zzijVar.zze--;
        zzijVar.zzc = obj;
        return iZza;
    }

    public static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i5, int i10, zzij zzijVar) throws IOException {
        int iZza = i5 + 1;
        int i11 = bArr[i5];
        if (i11 < 0) {
            iZza = zza(i11, bArr, iZza, zzijVar);
            i11 = zzijVar.zza;
        }
        int i12 = iZza;
        if (i11 >= 0 && i11 <= i10 - i12) {
            int i13 = zzijVar.zze + 1;
            zzijVar.zze = i13;
            zza(i13);
            int i14 = i12 + i11;
            zzluVar.zza(obj, bArr, i12, i14, zzijVar);
            zzijVar.zze--;
            zzijVar.zzc = obj;
            return i14;
        }
        throw zzkb.zzi();
    }

    public static int zza(int i5, byte[] bArr, int i10, int i11, zzij zzijVar) throws zzkb {
        if ((i5 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            return zzd(bArr, i10, zzijVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zzc(bArr, i10, zzijVar) + zzijVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw zzkb.zzc();
        }
        int i13 = (i5 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zzc(bArr, i10, zzijVar);
            i14 = zzijVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zza(i14, bArr, i10, i11, zzijVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw zzkb.zzg();
        }
        return i10;
    }

    private static void zza(int i5) throws zzkb {
        if (i5 >= zza) {
            throw zzkb.zzh();
        }
    }
}
