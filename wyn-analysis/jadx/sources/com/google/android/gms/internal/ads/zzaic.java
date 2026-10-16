package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaic implements zzaga {
    private final zzeu zza = new zzeu(4);
    private final zzahf zzb = new zzahf(-1, -1, "image/avif");

    private final boolean zzh(zzagb zzagbVar, int i5) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(4);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        return zzeuVar.zzz() == ((long) i5);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzagbVar.zzk(4);
        return zzh(zzagbVar, 1718909296) && zzh(zzagbVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzb.zzc(zzagdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        return this.zzb.zzd(zzagbVar, zzahaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        this.zzb.zze(j8, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }
}
