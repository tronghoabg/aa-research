package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzeen implements zzdgf, zzdls, zzden, zzddt {
    private final Context zza;
    private final zzdzt zzb;

    public zzeen(Context context, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = zzdztVar;
    }

    private final void zzf(final Context context) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfI)).booleanValue()) {
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeem
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(context);
                }
            });
        }
    }

    public final void zzc(Context context) {
        C6.n.f1857D.f1873n.zza(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zzd(N6.s sVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfL)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfK)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfN)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zze(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfM)).booleanValue()) {
            zzf(this.zza);
        }
    }
}
