package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzagv {
    private final zzeu zza = new zzeu(10);

    private final boolean zzb(zzagb zzagbVar, int i5) throws IOException {
        int i10;
        int i11 = 0;
        do {
            int i12 = i11 % 10;
            if (i12 == 0) {
                if (i11 != 0) {
                    zzeu zzeuVar = this.zza;
                    System.arraycopy(zzeuVar.zzi(), 10, zzeuVar.zzi(), 0, 9);
                }
                i10 = 0;
            } else {
                i10 = i12;
            }
            int i13 = i11 != 0 ? 1 : 10;
            try {
                zzeu zzeuVar2 = this.zza;
                int i14 = i12 + 10;
                zzagbVar.zzi(zzeuVar2.zzi(), i14 - i13, i13);
                zzeuVar2.zzh(i10);
                zzeuVar2.zzf(i14);
                if (zzeuVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzagy.zza(zzeuVar2.zzr()) != -1) {
                    return false;
                }
                if (i11 == 0) {
                    zzeuVar2.zzc(20);
                }
                i11++;
            } catch (EOFException unused) {
            }
        } while (i11 <= i5);
        return false;
    }

    public final zzap zza(zzagb zzagbVar, zzajo zzajoVar, int i5) throws IOException {
        zzap zzapVarZza = null;
        int i10 = 0;
        while (zzb(zzagbVar, i5)) {
            zzeu zzeuVar = this.zza;
            int iZzg = zzeuVar.zzg();
            zzeuVar.zzk(6);
            int iZzG = zzeuVar.zzG();
            int i11 = iZzG + 10;
            if (zzapVarZza == null) {
                byte[] bArr = new byte[i11];
                System.arraycopy(zzeuVar.zzi(), iZzg, bArr, 0, 10);
                zzagbVar.zzi(bArr, 10, iZzG);
                zzapVarZza = zzajr.zza(bArr, i11, zzajoVar, new zzajc());
            } else {
                zzagbVar.zzk(iZzG);
            }
            i10 += i11;
        }
        zzagbVar.zzl();
        zzagbVar.zzk(i10);
        return zzapVarZza;
    }
}
