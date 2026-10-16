package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
final class zzbd {
    public static int zza(byte[] bArr, int i5, zzbc zzbcVar) throws zzdc {
        int iZzh = zzh(bArr, i5, zzbcVar);
        int i10 = zzbcVar.zza;
        if (i10 < 0) {
            throw zzdc.zzd();
        }
        if (i10 > bArr.length - iZzh) {
            throw zzdc.zzg();
        }
        if (i10 == 0) {
            zzbcVar.zzc = zzbq.zzb;
            return iZzh;
        }
        zzbcVar.zzc = zzbq.zzl(bArr, iZzh, i10);
        return iZzh + i10;
    }

    public static int zzb(byte[] bArr, int i5) {
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzeo zzeoVar, byte[] bArr, int i5, int i10, int i11, zzbc zzbcVar) throws IOException {
        Object objZze = zzeoVar.zze();
        int iZzl = zzl(objZze, zzeoVar, bArr, i5, i10, i11, zzbcVar);
        zzeoVar.zzf(objZze);
        zzbcVar.zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzeo zzeoVar, byte[] bArr, int i5, int i10, zzbc zzbcVar) throws IOException {
        Object objZze = zzeoVar.zze();
        int iZzm = zzm(objZze, zzeoVar, bArr, i5, i10, zzbcVar);
        zzeoVar.zzf(objZze);
        zzbcVar.zzc = objZze;
        return iZzm;
    }

    public static int zze(zzeo zzeoVar, int i5, byte[] bArr, int i10, int i11, zzcz zzczVar, zzbc zzbcVar) throws IOException {
        int iZzd = zzd(zzeoVar, bArr, i10, i11, zzbcVar);
        zzczVar.add(zzbcVar.zzc);
        while (iZzd < i11) {
            int iZzh = zzh(bArr, iZzd, zzbcVar);
            if (i5 != zzbcVar.zza) {
                break;
            }
            iZzd = zzd(zzeoVar, bArr, iZzh, i11, zzbcVar);
            zzczVar.add(zzbcVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i5, zzcz zzczVar, zzbc zzbcVar) throws IOException {
        zzct zzctVar = (zzct) zzczVar;
        int iZzh = zzh(bArr, i5, zzbcVar);
        int i10 = zzbcVar.zza + iZzh;
        while (iZzh < i10) {
            iZzh = zzh(bArr, iZzh, zzbcVar);
            zzctVar.zzg(zzbcVar.zza);
        }
        if (iZzh == i10) {
            return iZzh;
        }
        throw zzdc.zzg();
    }

    public static int zzg(int i5, byte[] bArr, int i10, int i11, zzfg zzfgVar, zzbc zzbcVar) throws zzdc {
        if ((i5 >>> 3) == 0) {
            throw zzdc.zzb();
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            int iZzk = zzk(bArr, i10, zzbcVar);
            zzfgVar.zzj(i5, Long.valueOf(zzbcVar.zzb));
            return iZzk;
        }
        if (i12 == 1) {
            zzfgVar.zzj(i5, Long.valueOf(zzn(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzh = zzh(bArr, i10, zzbcVar);
            int i13 = zzbcVar.zza;
            if (i13 < 0) {
                throw zzdc.zzd();
            }
            if (i13 > bArr.length - iZzh) {
                throw zzdc.zzg();
            }
            if (i13 == 0) {
                zzfgVar.zzj(i5, zzbq.zzb);
            } else {
                zzfgVar.zzj(i5, zzbq.zzl(bArr, iZzh, i13));
            }
            return iZzh + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzdc.zzb();
            }
            zzfgVar.zzj(i5, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i5 & (-8)) | 4;
        zzfg zzfgVarZzf = zzfg.zzf();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzh2 = zzh(bArr, i10, zzbcVar);
            i15 = zzbcVar.zza;
            if (i15 == i14) {
                i10 = iZzh2;
                break;
            }
            i10 = zzg(i15, bArr, iZzh2, i11, zzfgVarZzf, zzbcVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw zzdc.zze();
        }
        zzfgVar.zzj(i5, zzfgVarZzf);
        return i10;
    }

    public static int zzh(byte[] bArr, int i5, zzbc zzbcVar) {
        int i10 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 < 0) {
            return zzi(b5, bArr, i10, zzbcVar);
        }
        zzbcVar.zza = b5;
        return i10;
    }

    public static int zzi(int i5, byte[] bArr, int i10, zzbc zzbcVar) {
        byte b5 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i5 & 127;
        if (b5 >= 0) {
            zzbcVar.zza = i12 | (b5 << 7);
            return i11;
        }
        int i13 = i12 | ((b5 & 127) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzbcVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & 127) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzbcVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzbcVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzbcVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzj(int i5, byte[] bArr, int i10, int i11, zzcz zzczVar, zzbc zzbcVar) {
        zzct zzctVar = (zzct) zzczVar;
        int iZzh = zzh(bArr, i10, zzbcVar);
        zzctVar.zzg(zzbcVar.zza);
        while (iZzh < i11) {
            int iZzh2 = zzh(bArr, iZzh, zzbcVar);
            if (i5 != zzbcVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzbcVar);
            zzctVar.zzg(zzbcVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i5, zzbc zzbcVar) {
        long j8 = bArr[i5];
        int i10 = i5 + 1;
        if (j8 >= 0) {
            zzbcVar.zzb = j8;
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
        zzbcVar.zzb = j10;
        return i11;
    }

    public static int zzl(Object obj, zzeo zzeoVar, byte[] bArr, int i5, int i10, int i11, zzbc zzbcVar) throws IOException {
        int iZzc = ((zzef) zzeoVar).zzc(obj, bArr, i5, i10, i11, zzbcVar);
        zzbcVar.zzc = obj;
        return iZzc;
    }

    public static int zzm(Object obj, zzeo zzeoVar, byte[] bArr, int i5, int i10, zzbc zzbcVar) throws IOException {
        int iZzi = i5 + 1;
        int i11 = bArr[i5];
        if (i11 < 0) {
            iZzi = zzi(i11, bArr, iZzi, zzbcVar);
            i11 = zzbcVar.zza;
        }
        int i12 = iZzi;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzdc.zzg();
        }
        int i13 = i12 + i11;
        zzeoVar.zzh(obj, bArr, i12, i13, zzbcVar);
        zzbcVar.zzc = obj;
        return i13;
    }

    public static long zzn(byte[] bArr, int i5) {
        return (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }
}
