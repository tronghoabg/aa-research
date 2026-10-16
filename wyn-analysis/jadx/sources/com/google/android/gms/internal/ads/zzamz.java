package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzamz implements zzaga {
    private zzagd zza;
    private zzang zzb;
    private boolean zzc;

    private final boolean zzh(zzagb zzagbVar) throws IOException {
        zzanb zzanbVar = new zzanb();
        if (zzanbVar.zzc(zzagbVar, true) && (zzanbVar.zza & 2) == 2) {
            int iMin = Math.min(zzanbVar.zze, 8);
            zzeu zzeuVar = new zzeu(iMin);
            zzagbVar.zzi(zzeuVar.zzi(), 0, iMin);
            zzeuVar.zzh(0);
            if (zzeuVar.zzd() >= 5 && zzeuVar.zzs() == 127 && zzeuVar.zzz() == 1179402563) {
                this.zzb = new zzamx();
            } else {
                zzeuVar.zzh(0);
                if (zzhg.zzc(1, zzeuVar, true)) {
                    this.zzb = new zzani();
                } else {
                    zzeuVar.zzh(0);
                    if (zzand.zzd(zzeuVar)) {
                        this.zzb = new zzand();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        try {
            return zzh(zzagbVar);
        } catch (zzat unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zza = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        this.zza.getClass();
        if (this.zzb == null) {
            if (!zzh(zzagbVar)) {
                throw zzat.zzb("Failed to determine bitstream type", null);
            }
            zzagbVar.zzl();
        }
        if (!this.zzc) {
            zzahm zzahmVarZzs = this.zza.zzs(0, 1);
            this.zza.zzv();
            this.zzb.zze(this.zza, zzahmVarZzs);
            this.zzc = true;
        }
        return this.zzb.zzg(zzagbVar, zzahaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        zzang zzangVar = this.zzb;
        if (zzangVar != null) {
            zzangVar.zzf(j8, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }
}
