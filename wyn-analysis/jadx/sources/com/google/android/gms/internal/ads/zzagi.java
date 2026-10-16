package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzagi {
    public static boolean zza(zzeu zzeuVar, zzagn zzagnVar, int i5, zzagh zzaghVar) {
        int iZzg = zzeuVar.zzg();
        long jZzz = zzeuVar.zzz();
        long j8 = jZzz >>> 16;
        if (j8 != i5) {
            return false;
        }
        boolean z2 = (j8 & 1) == 1;
        long j10 = jZzz >> 12;
        long j11 = jZzz >> 8;
        long j12 = jZzz >> 4;
        long j13 = jZzz >> 1;
        long j14 = jZzz & 1;
        int i10 = (int) (j12 & 15);
        if (i10 <= 7) {
            if (i10 != zzagnVar.zzg - 1) {
                return false;
            }
        } else if (i10 > 10 || zzagnVar.zzg != 2) {
            return false;
        }
        int i11 = (int) (j13 & 7);
        if ((i11 != 0 && i11 != zzagnVar.zzi) || j14 == 1 || !zzd(zzeuVar, zzagnVar, z2, zzaghVar)) {
            return false;
        }
        long j15 = zzaghVar.zza;
        int iZzc = zzc(zzeuVar, (int) (j10 & 15));
        long j16 = zzagnVar.zzj;
        boolean z10 = j16 == 0 || j15 + ((long) iZzc) >= j16;
        if (iZzc == -1) {
            return false;
        }
        if ((!z10 && iZzc < zzagnVar.zza) || iZzc > zzagnVar.zzb) {
            return false;
        }
        int i12 = zzagnVar.zze;
        int i13 = (int) (j11 & 15);
        if (i13 != 0) {
            if (i13 <= 11) {
                if (i13 != zzagnVar.zzf) {
                    return false;
                }
            } else if (i13 == 12) {
                if (zzeuVar.zzs() * 1000 != i12) {
                    return false;
                }
            } else {
                if (i13 > 14) {
                    return false;
                }
                int iZzt = zzeuVar.zzt();
                if (i13 == 14) {
                    iZzt *= 10;
                }
                if (iZzt != i12) {
                    return false;
                }
            }
        }
        if (zzeuVar.zzs() != zzfm.zzN(zzeuVar.zzi(), iZzg, zzeuVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzeuVar.zzd() != 0) {
            int iZzn = zzeuVar.zzn();
            if ((iZzn & 128) != 0) {
                return false;
            }
            int i14 = (iZzn & 126) >> 1;
            if ((i14 >= 2 && i14 <= 7) || (i14 >= 13 && i14 <= 31)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + 57);
                sb2.append("Ignoring frame where first subframe has a reserved type: ");
                sb2.append(i14);
                zzeh.zzb("FlacFrameReader", sb2.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzagb zzagbVar, zzagn zzagnVar) throws IOException {
        zzagbVar.zzl();
        zzagbVar.zzk(1);
        byte[] bArr = new byte[1];
        zzagbVar.zzi(bArr, 0, 1);
        int i5 = bArr[0] & 1;
        boolean z2 = 1 == i5;
        zzagbVar.zzk(2);
        int i10 = 1 != i5 ? 6 : 7;
        zzeu zzeuVar = new zzeu(i10);
        zzeuVar.zzf(zzage.zzb(zzagbVar, zzeuVar.zzi(), 0, i10));
        zzagbVar.zzl();
        zzagh zzaghVar = new zzagh();
        if (zzd(zzeuVar, zzagnVar, z2, zzaghVar)) {
            return zzaghVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzeu zzeuVar, int i5) {
        switch (i5) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i5 - 2);
            case 6:
                return zzeuVar.zzs() + 1;
            case 7:
                return zzeuVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i5 - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzeu zzeuVar, zzagn zzagnVar, boolean z2, zzagh zzaghVar) {
        try {
            long jZzO = zzeuVar.zzO();
            if (!z2) {
                jZzO *= zzagnVar.zzb;
            }
            long j8 = zzagnVar.zzj;
            if (j8 != 0 && jZzO > j8) {
                return false;
            }
            zzaghVar.zza = jZzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
