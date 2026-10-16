package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class zzdml {
    private final zzdnw zza;
    private final zzclb zzb;

    public zzdml(zzdnw zzdnwVar, zzclb zzclbVar) {
        this.zza = zzdnwVar;
        this.zzb = zzclbVar;
    }

    public final zzdnw zza() {
        return this.zza;
    }

    public final zzclb zzb() {
        return this.zzb;
    }

    public final View zzc() {
        zzclb zzclbVar = this.zzb;
        if (zzclbVar != null) {
            return zzclbVar.zzD();
        }
        return null;
    }

    public final View zzd() {
        zzclb zzclbVar = this.zzb;
        if (zzclbVar == null) {
            return null;
        }
        return zzclbVar.zzD();
    }

    public Set zze(zzdbs zzdbsVar) {
        return Collections.singleton(new zzdky(zzdbsVar, zzcfy.zzh));
    }

    public Set zzf(zzdbs zzdbsVar) {
        return Collections.singleton(new zzdky(zzdbsVar, zzcfy.zzh));
    }

    public final zzdky zzg(Executor executor) {
        final zzclb zzclbVar = this.zzb;
        return new zzdky(new zzdhw() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // com.google.android.gms.internal.ads.zzdhw
            public final /* synthetic */ void zza() {
                F6.l lVarZzL;
                zzclb zzclbVar2 = zzclbVar;
                if (zzclbVar2 == null || (lVarZzL = zzclbVar2.zzL()) == null) {
                    return;
                }
                lVarZzL.zzb();
            }
        }, executor);
    }
}
