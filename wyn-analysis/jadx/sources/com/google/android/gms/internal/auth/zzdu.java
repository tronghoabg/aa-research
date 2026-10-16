package com.google.android.gms.internal.auth;

import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzdu {
    public static int zza(byte[] bArr, int i5, zzdt zzdtVar) throws zzfb {
        int iZzh = zzh(bArr, i5, zzdtVar);
        int i10 = zzdtVar.zza;
        if (i10 < 0) {
            throw zzfb.zzc();
        }
        if (i10 > bArr.length - iZzh) {
            throw zzfb.zzf();
        }
        if (i10 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return iZzh;
        }
        zzdtVar.zzc = zzef.zzk(bArr, iZzh, i10);
        return iZzh + i10;
    }

    public static int zzb(byte[] bArr, int i5) {
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzgi zzgiVar, byte[] bArr, int i5, int i10, int i11, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzl = zzl(objZzd, zzgiVar, bArr, i5, i10, i11, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzl;
    }

    public static int zzd(zzgi zzgiVar, byte[] bArr, int i5, int i10, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzm = zzm(objZzd, zzgiVar, bArr, i5, i10, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzm;
    }

    public static int zze(zzgi zzgiVar, int i5, byte[] bArr, int i10, int i11, zzez zzezVar, zzdt zzdtVar) throws IOException {
        int iZzd = zzd(zzgiVar, bArr, i10, i11, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (iZzd < i11) {
            int iZzh = zzh(bArr, iZzd, zzdtVar);
            if (i5 != zzdtVar.zza) {
                break;
            }
            iZzd = zzd(zzgiVar, bArr, iZzh, i11, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i5, zzez zzezVar, zzdt zzdtVar) throws IOException {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i5, zzdtVar);
        int i10 = zzdtVar.zza + iZzh;
        while (iZzh < i10) {
            iZzh = zzh(bArr, iZzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (iZzh == i10) {
            return iZzh;
        }
        throw zzfb.zzf();
    }

    public static int zzg(int i5, byte[] bArr, int i10, int i11, zzha zzhaVar, zzdt zzdtVar) throws zzfb {
        if ((i5 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            int iZzk = zzk(bArr, i10, zzdtVar);
            zzhaVar.zzh(i5, Long.valueOf(zzdtVar.zzb));
            return iZzk;
        }
        if (i12 == 1) {
            zzhaVar.zzh(i5, Long.valueOf(zzn(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzh = zzh(bArr, i10, zzdtVar);
            int i13 = zzdtVar.zza;
            if (i13 < 0) {
                throw zzfb.zzc();
            }
            if (i13 > bArr.length - iZzh) {
                throw zzfb.zzf();
            }
            if (i13 == 0) {
                zzhaVar.zzh(i5, zzef.zzb);
            } else {
                zzhaVar.zzh(i5, zzef.zzk(bArr, iZzh, i13));
            }
            return iZzh + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i5, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i5 & (-8)) | 4;
        zzha zzhaVarZzd = zzha.zzd();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzh2 = zzh(bArr, i10, zzdtVar);
            i15 = zzdtVar.zza;
            if (i15 == i14) {
                i10 = iZzh2;
                break;
            }
            i10 = zzg(i15, bArr, iZzh2, i11, zzhaVarZzd, zzdtVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i5, zzhaVarZzd);
        return i10;
    }

    public static int zzh(byte[] bArr, int i5, zzdt zzdtVar) {
        int i10 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 < 0) {
            return zzi(b5, bArr, i10, zzdtVar);
        }
        zzdtVar.zza = b5;
        return i10;
    }

    public static int zzi(int i5, byte[] bArr, int i10, zzdt zzdtVar) {
        byte b5 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i5 & 127;
        if (b5 >= 0) {
            zzdtVar.zza = i12 | (b5 << 7);
            return i11;
        }
        int i13 = i12 | ((b5 & 127) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzdtVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & 127) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzdtVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzdtVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzdtVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzj(int i5, byte[] bArr, int i10, int i11, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i10, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (iZzh < i11) {
            int iZzh2 = zzh(bArr, iZzh, zzdtVar);
            if (i5 != zzdtVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i5, zzdt zzdtVar) {
        long j8 = bArr[i5];
        int i10 = i5 + 1;
        if (j8 >= 0) {
            zzdtVar.zzb = j8;
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
        zzdtVar.zzb = j10;
        return i11;
    }

    public static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i5, int i10, int i11, zzdt zzdtVar) throws IOException {
        int iZzb = ((zzga) zzgiVar).zzb(obj, bArr, i5, i10, i11, zzdtVar);
        zzdtVar.zzc = obj;
        return iZzb;
    }

    public static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i5, int i10, zzdt zzdtVar) throws IOException {
        int iZzi = i5 + 1;
        int i11 = bArr[i5];
        if (i11 < 0) {
            iZzi = zzi(i11, bArr, iZzi, zzdtVar);
            i11 = zzdtVar.zza;
        }
        int i12 = iZzi;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzfb.zzf();
        }
        int i13 = i12 + i11;
        zzgiVar.zzg(obj, bArr, i12, i13, zzdtVar);
        zzdtVar.zzc = obj;
        return i13;
    }

    public static long zzn(byte[] bArr, int i5) {
        return (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }
}
