package com.google.android.gms.internal.ads;

import D6.C0395s;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdzt {
    private final zzdzy zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdzt(zzdzy zzdzyVar, Executor executor) {
        this.zza = zzdzyVar;
        this.zzc = zzdzyVar.zza();
        this.zzb = executor;
    }

    public final zzdzs zza() {
        zzdzs zzdzsVar = new zzdzs(this);
        zzdzsVar.zzj();
        return zzdzsVar;
    }

    public final void zzb() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznn)).booleanValue()) {
            zzdzs zzdzsVarZza = zza();
            zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "pecr");
            zzdzsVarZza.zzd();
        }
    }

    public final /* synthetic */ zzdzy zzc() {
        return this.zza;
    }

    public final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
