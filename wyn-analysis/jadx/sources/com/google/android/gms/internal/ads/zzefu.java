package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzefu implements zzhcc {
    final /* synthetic */ zzega zza;

    public zzefu(zzega zzegaVar) {
        Objects.requireNonNull(zzegaVar);
        this.zza = zzegaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        zzfky zzfkyVar = (zzfky) obj;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcX)).booleanValue()) {
            this.zza.zzf().zzdQ(zzfkyVar);
        }
    }
}
