package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzatj implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzatl zzc;

    public zzatj(zzatl zzatlVar, String str, long j8) {
        this.zza = str;
        this.zzb = j8;
        Objects.requireNonNull(zzatlVar);
        this.zzc = zzatlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzatl zzatlVar = this.zzc;
        zzatlVar.zzx().zza(this.zza, this.zzb);
        zzatlVar.zzx().zzb(zzatlVar.toString());
    }
}
