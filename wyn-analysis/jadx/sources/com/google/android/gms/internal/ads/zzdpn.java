package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.view.View;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzdpn implements zzhcc {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdpw zzb;

    public zzdpn(zzdpw zzdpwVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzdpwVar);
        this.zzb = zzdpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgy)).booleanValue()) {
            C6.n.f1857D.f1868h.zzi(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzY(this.zza, (zzelv) obj);
    }
}
