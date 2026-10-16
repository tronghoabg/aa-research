package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes3.dex */
final class zzdrz implements zzhcc {
    final /* synthetic */ zzdsb zza;

    public zzdrz(zzdsb zzdsbVar) {
        Objects.requireNonNull(zzdsbVar);
        this.zza = zzdsbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgy)).booleanValue()) {
            C6.n.f1857D.f1868h.zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzclb zzclbVar = (zzclb) list.get(0);
            if (zzclbVar != null) {
                this.zza.zza(zzclbVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e7) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgy)).booleanValue()) {
                C6.n.f1857D.f1868h.zzh(e7, "omid native display exp");
            }
        }
    }
}
