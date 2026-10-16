package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzaif implements zzafl {
    private final zzagn zza;
    private final int zzb;
    private final zzagh zzc = new zzagh();

    public /* synthetic */ zzaif(zzagn zzagnVar, int i5, byte[] bArr) {
        this.zza = zzagnVar;
        this.zzb = i5;
    }

    private final long zzc(zzagb zzagbVar) throws IOException {
        while (zzagbVar.zzm() < zzagbVar.zzo() - 6) {
            zzagn zzagnVar = this.zza;
            int i5 = this.zzb;
            zzagh zzaghVar = this.zzc;
            long jZzm = zzagbVar.zzm();
            zzeu zzeuVar = new zzeu(17);
            zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
            if (zzeuVar.zzo() != i5) {
                zzagbVar.zzl();
                zzagbVar.zzk((int) (jZzm - zzagbVar.zzn()));
            } else {
                zzeuVar.zzf(zzage.zzb(zzagbVar, zzeuVar.zzi(), 2, 15) + 2);
                zzagbVar.zzl();
                zzagbVar.zzk((int) (jZzm - zzagbVar.zzn()));
                if (zzagi.zza(zzeuVar, zzagnVar, i5, zzaghVar)) {
                    break;
                }
            }
            zzagbVar.zzk(1);
        }
        if (zzagbVar.zzm() < zzagbVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzagbVar.zzk((int) (zzagbVar.zzo() - zzagbVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final zzafk zza(zzagb zzagbVar, long j8) throws IOException {
        long jZzn = zzagbVar.zzn();
        long jZzc = zzc(zzagbVar);
        long jZzm = zzagbVar.zzm();
        zzagbVar.zzk(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzagbVar);
        return (jZzc > j8 || jZzc2 <= j8) ? jZzc2 <= j8 ? zzafk.zzb(jZzc2, zzagbVar.zzm()) : zzafk.zza(jZzc, jZzn) : zzafk.zzc(jZzm);
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final /* synthetic */ void zzb() {
        AbstractC1741e.a(this);
    }
}
