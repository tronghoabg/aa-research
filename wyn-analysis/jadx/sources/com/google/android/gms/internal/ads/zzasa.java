package com.google.android.gms.internal.ads;

import android.util.Pair;
import cb.AbstractC1593a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzasa {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = new zzeu(8);
        int i5 = zzarz.zza(zzagbVar, zzeuVar).zza;
        if (i5 != 1380533830 && i5 != 1380333108) {
            return false;
        }
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        int iZzB = zzeuVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb2.append("Unsupported form type: ");
        sb2.append(iZzB);
        zzeh.zze("WavHeaderReader", sb2.toString());
        return false;
    }

    public static zzary zzb(zzagb zzagbVar) throws IOException {
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i10;
        zzeu zzeuVar = new zzeu(16);
        long j8 = zzd(1718449184, zzagbVar, zzeuVar).zzb;
        zzgtr.zzi(j8 >= 16);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 16);
        zzeuVar.zzh(0);
        int iZzu = zzeuVar.zzu();
        int iZzu2 = zzeuVar.zzu();
        int iZzI = zzeuVar.zzI();
        int iZzI2 = zzeuVar.zzI();
        int iZzu3 = zzeuVar.zzu();
        int iZzu4 = zzeuVar.zzu();
        int i11 = ((int) j8) - 16;
        if (i11 > 0) {
            bArr = new byte[i11];
            zzagbVar.zzi(bArr, 0, i11);
            if (iZzu == 65534) {
                if (i11 == 24) {
                    zzeu zzeuVar2 = new zzeu(bArr);
                    zzeuVar2.zzu();
                    int iZzu5 = zzeuVar2.zzu();
                    if (iZzu5 != 0 && iZzu5 != iZzu4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzu4).length() + String.valueOf(iZzu5).length() + 33 + 19);
                        N0.a.l(iZzu5, iZzu4, "validBits ( ", ")  != bitsPerSample( ", sb2);
                        sb2.append(") are not supported");
                        throw zzat.zzc(sb2.toString());
                    }
                    int iZzI3 = zzeuVar2.zzI();
                    if (!zzft.zza(iZzI3, iZzu2)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzI3).length() + 57 + String.valueOf(iZzu2).length());
                        sb3.append("Channel mask ");
                        sb3.append(iZzI3);
                        sb3.append(" is invalid or does not match channel count ");
                        sb3.append(iZzu2);
                        throw zzat.zzc(sb3.toString());
                    }
                    int iZzu6 = zzeuVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzeuVar2.zzm(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                        throw zzat.zzc("invalid wav format extension guid");
                    }
                    i10 = iZzI3;
                    bArr2 = bArr;
                    i5 = iZzu6;
                    zzagbVar.zzf((int) (zzagbVar.zzm() - zzagbVar.zzn()));
                    return new zzary(i5, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2, i10);
                }
                bArr2 = bArr;
                i5 = 65534;
            }
            i10 = 0;
            zzagbVar.zzf((int) (zzagbVar.zzm() - zzagbVar.zzn()));
            return new zzary(i5, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2, i10);
        }
        bArr = zzfm.zzb;
        i5 = iZzu;
        bArr2 = bArr;
        i10 = 0;
        zzagbVar.zzf((int) (zzagbVar.zzm() - zzagbVar.zzn()));
        return new zzary(i5, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2, i10);
    }

    public static Pair zzc(zzagb zzagbVar) throws IOException {
        zzagbVar.zzl();
        zzarz zzarzVarZzd = zzd(1684108385, zzagbVar, new zzeu(8));
        zzagbVar.zzf(8);
        return Pair.create(Long.valueOf(zzagbVar.zzn()), Long.valueOf(zzarzVarZzd.zzb));
    }

    private static zzarz zzd(int i5, zzagb zzagbVar, zzeu zzeuVar) throws IOException {
        zzarz zzarzVarZza = zzarz.zza(zzagbVar, zzeuVar);
        while (true) {
            int i10 = zzarzVarZza.zza;
            if (i10 == i5) {
                return zzarzVarZza;
            }
            AbstractC1593a.v(new StringBuilder(String.valueOf(i10).length() + 28), "Ignoring unknown WAV chunk: ", i10, "WavHeaderReader");
            long j8 = zzarzVarZza.zzb;
            long j10 = 8 + j8;
            if ((1 & j8) != 0) {
                j10 = 9 + j8;
            }
            if (j10 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i10);
                throw zzat.zzc(sb2.toString());
            }
            zzagbVar.zzf((int) j10);
            zzarzVarZza = zzarz.zza(zzagbVar, zzeuVar);
        }
    }
}
