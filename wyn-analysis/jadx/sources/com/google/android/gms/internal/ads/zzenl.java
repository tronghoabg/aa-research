package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzenl implements zzdnw {
    final /* synthetic */ zzcgd zza;
    final /* synthetic */ zzfkn zzb;
    final /* synthetic */ zzenn zzc;

    public zzenl(zzenn zzennVar, zzcgd zzcgdVar, zzfkn zzfknVar) {
        this.zza = zzcgdVar;
        this.zzb = zzfknVar;
        Objects.requireNonNull(zzennVar);
        this.zzc = zzennVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z2, Context context, zzddm zzddmVar) {
        try {
            Xd.c cVar = C6.n.f1857D.f1862b;
            Xd.c.t(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zzb;
    }
}
