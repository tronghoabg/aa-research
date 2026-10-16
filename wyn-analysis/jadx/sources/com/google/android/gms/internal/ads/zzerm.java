package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzerm implements C6.e {
    final /* synthetic */ zzcgd zza;
    final /* synthetic */ zzfky zzb;
    final /* synthetic */ zzfkn zzc;
    final /* synthetic */ zzert zzd;
    final /* synthetic */ zzero zze;

    public zzerm(zzero zzeroVar, zzcgd zzcgdVar, zzfky zzfkyVar, zzfkn zzfknVar, zzert zzertVar) {
        this.zza = zzcgdVar;
        this.zzb = zzfkyVar;
        this.zzc = zzfknVar;
        this.zzd = zzertVar;
        Objects.requireNonNull(zzeroVar);
        this.zze = zzeroVar;
    }

    @Override // C6.e
    public final void zza(View view) {
        zzert zzertVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzertVar));
    }

    @Override // C6.e
    public final void zzb() {
    }

    @Override // C6.e
    public final void zzc() {
    }
}
