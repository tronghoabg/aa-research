package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.Executor;
import x.C4412e;

/* loaded from: classes3.dex */
public final class zzdsb implements zzddt {
    private final zzdqb zza;
    private final zzdqg zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdsb(zzdqb zzdqbVar, zzdqg zzdqgVar, Executor executor, Executor executor2) {
        this.zza = zzdqbVar;
        this.zzb = zzdqgVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzclb zzclbVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsa
            @Override // java.lang.Runnable
            public final void run() {
                zzclbVar.zze("onSdkImpression", new C4412e(0));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        if (this.zzb.zzd()) {
            zzdqb zzdqbVar = this.zza;
            zzelv zzelvVarZzZ = zzdqbVar.zzZ();
            if (zzelvVarZzZ == null && zzdqbVar.zzX() != null && ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgx)).booleanValue()) {
                p8.p pVarZzX = zzdqbVar.zzX();
                zzcgd zzcgdVarZzY = zzdqbVar.zzY();
                if (pVarZzX == null || zzcgdVarZzY == null) {
                    return;
                }
                zzhcf.zzr(zzhcf.zzq(pVarZzX, zzcgdVarZzY), new zzdrz(this), this.zzd);
                return;
            }
            if (zzelvVarZzZ != null) {
                zzclb zzclbVarZzW = zzdqbVar.zzW();
                zzclb zzclbVarZzT = zzdqbVar.zzT();
                if (zzclbVarZzW == null) {
                    zzclbVarZzW = zzclbVarZzT == null ? null : zzclbVarZzT;
                }
                if (zzclbVarZzW != null) {
                    zza(zzclbVarZzW);
                }
            }
        }
    }
}
