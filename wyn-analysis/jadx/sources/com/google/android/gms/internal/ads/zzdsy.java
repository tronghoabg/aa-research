package com.google.android.gms.internal.ads;

import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
final class zzdsy implements zzhcc {
    final /* synthetic */ zzcgd zza;

    public zzdsy(zzdtk zzdtkVar, zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
        Objects.requireNonNull(zzdtkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        int i5 = G6.L.f4523b;
        H6.l.c("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzclb zzclbVar = (zzclb) obj;
        if (zzclbVar == null) {
            this.zza.zzd(new zzepp(1, "Missing webview from video view future."));
            return;
        }
        final zzcgd zzcgdVar = this.zza;
        zzclbVar.zzab("/video", new zzcit(new zzcis() { // from class: com.google.android.gms.internal.ads.zzdsx
            @Override // com.google.android.gms.internal.ads.zzcis
            public final /* synthetic */ void zza(String str) {
                zzcgdVar.zzc(AbstractC3256n.b("mediaUrl", str));
            }
        }));
        zzclbVar.zzI();
    }
}
