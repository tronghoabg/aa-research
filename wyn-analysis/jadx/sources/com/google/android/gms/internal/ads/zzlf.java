package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzlf implements zzmi {
    private final Object zza;
    private zzbf zzb;

    public zzlf(Object obj, zzxg zzxgVar) {
        this.zza = obj;
        this.zzb = zzxgVar.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final zzbf zzb() {
        return this.zzb;
    }

    public final void zzc(zzbf zzbfVar) {
        this.zzb = zzbfVar;
    }
}
