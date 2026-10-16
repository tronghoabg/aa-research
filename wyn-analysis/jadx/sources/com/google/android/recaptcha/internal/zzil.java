package com.google.android.recaptcha.internal;

import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
final class zzil {
    public static int zza(byte[] bArr, int i5, zzik zzikVar) throws zzlc {
        int iZzi = zzi(bArr, i5, zzikVar);
        int i10 = zzikVar.zza;
        if (i10 < 0) {
            throw zzlc.zzf();
        }
        if (i10 > bArr.length - iZzi) {
            throw zzlc.zzi();
        }
        if (i10 == 0) {
            zzikVar.zzc = zziv.zzb;
            return iZzi;
        }
        zzikVar.zzc = zziv.zzk(bArr, iZzi, i10);
        return iZzi + i10;
    }

    public static int zzb(byte[] bArr, int i5) {
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzmk zzmkVar, byte[] bArr, int i5, int i10, int i11, zzik zzikVar) throws IOException {
        Object objZze = zzmkVar.zze();
        int iZzm = zzm(objZze, zzmkVar, bArr, i5, i10, i11, zzikVar);
        zzmkVar.zzf(objZze);
        zzikVar.zzc = objZze;
        return iZzm;
    }

    public static int zzd(zzmk zzmkVar, byte[] bArr, int i5, int i10, zzik zzikVar) throws IOException {
        Object objZze = zzmkVar.zze();
        int iZzn = zzn(objZze, zzmkVar, bArr, i5, i10, zzikVar);
        zzmkVar.zzf(objZze);
        zzikVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzmk zzmkVar, int i5, byte[] bArr, int i10, int i11, zzkz zzkzVar, zzik zzikVar) throws IOException {
        int iZzd = zzd(zzmkVar, bArr, i10, i11, zzikVar);
        zzkzVar.add(zzikVar.zzc);
        while (iZzd < i11) {
            int iZzi = zzi(bArr, iZzd, zzikVar);
            if (i5 != zzikVar.zza) {
                break;
            }
            iZzd = zzd(zzmkVar, bArr, iZzi, i11, zzikVar);
            zzkzVar.add(zzikVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i5, zzkz zzkzVar, zzik zzikVar) throws IOException {
        zzkt zzktVar = (zzkt) zzkzVar;
        int iZzi = zzi(bArr, i5, zzikVar);
        int i10 = zzikVar.zza + iZzi;
        while (iZzi < i10) {
            iZzi = zzi(bArr, iZzi, zzikVar);
            zzktVar.zzh(zzikVar.zza);
        }
        if (iZzi == i10) {
            return iZzi;
        }
        throw zzlc.zzi();
    }

    public static int zzg(byte[] bArr, int i5, zzik zzikVar) throws zzlc {
        int iZzi = zzi(bArr, i5, zzikVar);
        int i10 = zzikVar.zza;
        if (i10 < 0) {
            throw zzlc.zzf();
        }
        if (i10 == 0) {
            zzikVar.zzc = "";
            return iZzi;
        }
        zzikVar.zzc = new String(bArr, iZzi, i10, zzla.zza);
        return iZzi + i10;
    }

    public static int zzh(int i5, byte[] bArr, int i10, int i11, zznc zzncVar, zzik zzikVar) throws zzlc {
        if ((i5 >>> 3) == 0) {
            throw zzlc.zzc();
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            int iZzl = zzl(bArr, i10, zzikVar);
            zzncVar.zzj(i5, Long.valueOf(zzikVar.zzb));
            return iZzl;
        }
        if (i12 == 1) {
            zzncVar.zzj(i5, Long.valueOf(zzp(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzi = zzi(bArr, i10, zzikVar);
            int i13 = zzikVar.zza;
            if (i13 < 0) {
                throw zzlc.zzf();
            }
            if (i13 > bArr.length - iZzi) {
                throw zzlc.zzi();
            }
            if (i13 == 0) {
                zzncVar.zzj(i5, zziv.zzb);
            } else {
                zzncVar.zzj(i5, zziv.zzk(bArr, iZzi, i13));
            }
            return iZzi + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzlc.zzc();
            }
            zzncVar.zzj(i5, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i5 & (-8)) | 4;
        zznc zzncVarZzf = zznc.zzf();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzi2 = zzi(bArr, i10, zzikVar);
            i15 = zzikVar.zza;
            if (i15 == i14) {
                i10 = iZzi2;
                break;
            }
            i10 = zzh(i15, bArr, iZzi2, i11, zzncVarZzf, zzikVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw zzlc.zzg();
        }
        zzncVar.zzj(i5, zzncVarZzf);
        return i10;
    }

    public static int zzi(byte[] bArr, int i5, zzik zzikVar) {
        int i10 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 < 0) {
            return zzj(b5, bArr, i10, zzikVar);
        }
        zzikVar.zza = b5;
        return i10;
    }

    public static int zzj(int i5, byte[] bArr, int i10, zzik zzikVar) {
        byte b5 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i5 & 127;
        if (b5 >= 0) {
            zzikVar.zza = i12 | (b5 << 7);
            return i11;
        }
        int i13 = i12 | ((b5 & 127) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzikVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & 127) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzikVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzikVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzikVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzk(int i5, byte[] bArr, int i10, int i11, zzkz zzkzVar, zzik zzikVar) {
        zzkt zzktVar = (zzkt) zzkzVar;
        int iZzi = zzi(bArr, i10, zzikVar);
        zzktVar.zzh(zzikVar.zza);
        while (iZzi < i11) {
            int iZzi2 = zzi(bArr, iZzi, zzikVar);
            if (i5 != zzikVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzikVar);
            zzktVar.zzh(zzikVar.zza);
        }
        return iZzi;
    }

    public static int zzl(byte[] bArr, int i5, zzik zzikVar) {
        long j8 = bArr[i5];
        int i10 = i5 + 1;
        if (j8 >= 0) {
            zzikVar.zzb = j8;
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
        zzikVar.zzb = j10;
        return i11;
    }

    public static int zzm(Object obj, zzmk zzmkVar, byte[] bArr, int i5, int i10, int i11, zzik zzikVar) throws IOException {
        int iZzc = ((zzma) zzmkVar).zzc(obj, bArr, i5, i10, i11, zzikVar);
        zzikVar.zzc = obj;
        return iZzc;
    }

    public static int zzn(Object obj, zzmk zzmkVar, byte[] bArr, int i5, int i10, zzik zzikVar) throws IOException {
        int iZzj = i5 + 1;
        int i11 = bArr[i5];
        if (i11 < 0) {
            iZzj = zzj(i11, bArr, iZzj, zzikVar);
            i11 = zzikVar.zza;
        }
        int i12 = iZzj;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzlc.zzi();
        }
        int i13 = i12 + i11;
        zzmkVar.zzi(obj, bArr, i12, i13, zzikVar);
        zzikVar.zzc = obj;
        return i13;
    }

    public static int zzo(int i5, byte[] bArr, int i10, int i11, zzik zzikVar) throws zzlc {
        if ((i5 >>> 3) == 0) {
            throw zzlc.zzc();
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            return zzl(bArr, i10, zzikVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zzi(bArr, i10, zzikVar) + zzikVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw zzlc.zzc();
        }
        int i13 = (i5 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zzi(bArr, i10, zzikVar);
            i14 = zzikVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zzo(i14, bArr, i10, i11, zzikVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw zzlc.zzg();
        }
        return i10;
    }

    public static long zzp(byte[] bArr, int i5) {
        return (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }
}
