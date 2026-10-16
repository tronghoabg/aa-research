package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdot implements zzbpx {
    private final WeakReference zza;
    private final WeakReference zzb;

    public zzdot(zzdov zzdovVar, View view, byte[] bArr) {
        this.zza = new WeakReference(zzdovVar);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoE)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzdov zzdovVar = (zzdov) this.zza.get();
        if (zzdovVar == null) {
            return;
        }
        zzdovVar.zzC().zza();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoE)).booleanValue()) {
            zzdovVar.zzB((View) this.zzb.get());
        }
    }
}
