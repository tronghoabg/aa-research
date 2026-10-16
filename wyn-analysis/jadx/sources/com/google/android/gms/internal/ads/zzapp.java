package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzapp implements zzaga {
    private final zzapq zza = new zzapq(null, 0, "audio/ac3");
    private final zzeu zzb = new zzeu(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = new zzeu(10);
        int i5 = 0;
        while (true) {
            zzagbVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(0);
            if (zzeuVar.zzx() != 4801587) {
                break;
            }
            zzeuVar.zzk(3);
            int iZzG = zzeuVar.zzG();
            i5 += iZzG + 10;
            zzagbVar.zzk(iZzG);
        }
        zzagbVar.zzl();
        zzagbVar.zzk(i5);
        int i10 = 0;
        int i11 = i5;
        while (true) {
            zzagbVar.zzi(zzeuVar.zzi(), 0, 6);
            zzeuVar.zzh(0);
            if (zzeuVar.zzt() != 2935) {
                zzagbVar.zzl();
                i11++;
                if (i11 - i5 >= 8192) {
                    return false;
                }
                zzagbVar.zzk(i11);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                int iZzd = zzafa.zzd(zzeuVar.zzi());
                if (iZzd == -1) {
                    return false;
                }
                zzagbVar.zzk(iZzd - 6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zza.zzb(zzagdVar, new zzaro(Integer.MIN_VALUE, 0, 1));
        zzagdVar.zzv();
        zzagdVar.zzw(new zzahc(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        zzeu zzeuVar = this.zzb;
        int iZza = zzagbVar.zza(zzeuVar.zzi(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        zzeuVar.zzh(0);
        zzeuVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }
}
