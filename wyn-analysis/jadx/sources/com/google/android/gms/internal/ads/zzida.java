package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzida {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i5, zzicz zziczVar) {
        int i10 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 < 0) {
            return zzb(b5, bArr, i10, zziczVar);
        }
        zziczVar.zza = b5;
        return i10;
    }

    public static int zzb(int i5, byte[] bArr, int i10, zzicz zziczVar) {
        byte b5 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i5 & 127;
        if (b5 >= 0) {
            zziczVar.zza = i12 | (b5 << 7);
            return i11;
        }
        int i13 = i12 | ((b5 & 127) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zziczVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & 127) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zziczVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zziczVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zziczVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzc(byte[] bArr, int i5, zzicz zziczVar) {
        long j8 = bArr[i5];
        int i10 = i5 + 1;
        if (j8 >= 0) {
            zziczVar.zzb = j8;
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
        zziczVar.zzb = j10;
        return i11;
    }

    public static int zzd(byte[] bArr, int i5) {
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static long zze(byte[] bArr, int i5) {
        return (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i5, zzicz zziczVar) throws zzifh {
        int iZza = zza(bArr, i5, zziczVar);
        int i10 = zziczVar.zza;
        if (i10 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            zziczVar.zzc = "";
            return iZza;
        }
        zziczVar.zzc = zzihp.zze(bArr, iZza, i10);
        return iZza + i10;
    }

    public static int zzg(byte[] bArr, int i5, zzicz zziczVar) throws zzifh {
        int iZza = zza(bArr, i5, zziczVar);
        int i10 = zziczVar.zza;
        if (i10 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iZza) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            zziczVar.zzc = zzidl.zza;
            return iZza;
        }
        zziczVar.zzc = zzidl.zzt(bArr, iZza, i10);
        return iZza + i10;
    }

    public static int zzh(zzigr zzigrVar, byte[] bArr, int i5, int i10, zzicz zziczVar) throws IOException {
        Object objZza = zzigrVar.zza();
        int iZzj = zzj(objZza, zzigrVar, bArr, i5, i10, zziczVar);
        zzigrVar.zzk(objZza);
        zziczVar.zzc = objZza;
        return iZzj;
    }

    public static int zzi(zzigr zzigrVar, byte[] bArr, int i5, int i10, int i11, zzicz zziczVar) throws IOException {
        Object objZza = zzigrVar.zza();
        int iZzk = zzk(objZza, zzigrVar, bArr, i5, i10, i11, zziczVar);
        zzigrVar.zzk(objZza);
        zziczVar.zzc = objZza;
        return iZzk;
    }

    public static int zzj(Object obj, zzigr zzigrVar, byte[] bArr, int i5, int i10, zzicz zziczVar) throws IOException {
        int iZzb = i5 + 1;
        int i11 = bArr[i5];
        if (i11 < 0) {
            iZzb = zzb(i11, bArr, iZzb, zziczVar);
            i11 = zziczVar.zza;
        }
        int i12 = iZzb;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = zziczVar.zze + 1;
        zziczVar.zze = i13;
        zzq(i13);
        int i14 = i12 + i11;
        zzigrVar.zzj(obj, bArr, i12, i14, zziczVar);
        zziczVar.zze--;
        zziczVar.zzc = obj;
        return i14;
    }

    public static int zzk(Object obj, zzigr zzigrVar, byte[] bArr, int i5, int i10, int i11, zzicz zziczVar) throws IOException {
        int i12 = zziczVar.zze + 1;
        zziczVar.zze = i12;
        zzq(i12);
        int iZzi = ((zzigc) zzigrVar).zzi(obj, bArr, i5, i10, i11, zziczVar);
        zziczVar.zze--;
        zziczVar.zzc = obj;
        return iZzi;
    }

    public static int zzl(int i5, byte[] bArr, int i10, int i11, zzifb zzifbVar, zzicz zziczVar) {
        zzieq zzieqVar = (zzieq) zzifbVar;
        int iZza = zza(bArr, i10, zziczVar);
        zzieqVar.zzi(zziczVar.zza);
        while (iZza < i11) {
            int iZza2 = zza(bArr, iZza, zziczVar);
            if (i5 != zziczVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zziczVar);
            zzieqVar.zzi(zziczVar.zza);
        }
        return iZza;
    }

    public static int zzm(byte[] bArr, int i5, zzifb zzifbVar, zzicz zziczVar) throws IOException {
        zzieq zzieqVar = (zzieq) zzifbVar;
        int iZza = zza(bArr, i5, zziczVar);
        int i10 = zziczVar.zza + iZza;
        while (iZza < i10) {
            iZza = zza(bArr, iZza, zziczVar);
            zzieqVar.zzi(zziczVar.zza);
        }
        if (iZza == i10) {
            return iZza;
        }
        throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zzigr zzigrVar, int i5, byte[] bArr, int i10, int i11, zzifb zzifbVar, zzicz zziczVar) throws IOException {
        int iZzh = zzh(zzigrVar, bArr, i10, i11, zziczVar);
        zzifbVar.add(zziczVar.zzc);
        while (iZzh < i11) {
            int iZza = zza(bArr, iZzh, zziczVar);
            if (i5 != zziczVar.zza) {
                break;
            }
            iZzh = zzh(zzigrVar, bArr, iZza, i11, zziczVar);
            zzifbVar.add(zziczVar.zzc);
        }
        return iZzh;
    }

    public static int zzo(int i5, byte[] bArr, int i10, int i11, zzihe zziheVar, zzicz zziczVar) throws zzifh {
        if ((i5 >>> 3) == 0) {
            throw new zzifh("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            int iZzc = zzc(bArr, i10, zziczVar);
            zziheVar.zzk(i5, Long.valueOf(zziczVar.zzb));
            return iZzc;
        }
        if (i12 == 1) {
            zziheVar.zzk(i5, Long.valueOf(zze(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZza = zza(bArr, i10, zziczVar);
            int i13 = zziczVar.zza;
            if (i13 < 0) {
                throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iZza) {
                throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                zziheVar.zzk(i5, zzidl.zza);
            } else {
                zziheVar.zzk(i5, zzidl.zzt(bArr, iZza, i13));
            }
            return iZza + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new zzifh("Protocol message contained an invalid tag (zero).");
            }
            zziheVar.zzk(i5, Integer.valueOf(zzd(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i5 & (-8)) | 4;
        zzihe zziheVarZzb = zzihe.zzb();
        int i15 = zziczVar.zze + 1;
        zziczVar.zze = i15;
        zzq(i15);
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZza2 = zza(bArr, i10, zziczVar);
            int i17 = zziczVar.zza;
            if (i17 == i14) {
                i16 = i17;
                i10 = iZza2;
                break;
            }
            i10 = zzo(i17, bArr, iZza2, i11, zziheVarZzb, zziczVar);
            i16 = i17;
        }
        zziczVar.zze--;
        if (i10 > i11 || i16 != i14) {
            throw new zzifh("Failed to parse the message.");
        }
        zziheVar.zzk(i5, zziheVarZzb);
        return i10;
    }

    public static int zzp(int i5, byte[] bArr, int i10, int i11, zzicz zziczVar) throws zzifh {
        if ((i5 >>> 3) == 0) {
            throw new zzifh("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            return zzc(bArr, i10, zziczVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zza(bArr, i10, zziczVar) + zziczVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new zzifh("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i5 & (-8)) | 4;
        int i14 = zziczVar.zze + 1;
        zziczVar.zze = i14;
        zzq(i14);
        int i15 = 0;
        while (i10 < i11) {
            i10 = zza(bArr, i10, zziczVar);
            i15 = zziczVar.zza;
            if (i15 == i13) {
                break;
            }
            i10 = zzp(i15, bArr, i10, i11, zziczVar);
        }
        zziczVar.zze--;
        if (i10 > i11 || i15 != i13) {
            throw new zzifh("Failed to parse the message.");
        }
        return i10;
    }

    private static void zzq(int i5) throws zzifh {
        if (i5 >= zzb) {
            throw new zzifh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
