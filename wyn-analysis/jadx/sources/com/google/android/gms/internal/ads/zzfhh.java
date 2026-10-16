package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfhh implements zzfno {
    private final zzfie zza;

    public zzfhh(zzfie zzfieVar) {
        this.zza = zzfieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfno
    public final p8.p zza(zzfnp zzfnpVar) {
        zzfhk zzfhkVar = (zzfhk) zzfnpVar;
        return ((zzfhg) this.zza).zzb(zzfhkVar.zzb, zzfhkVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfno
    public final void zzb(zzfne zzfneVar) {
        zzfneVar.zza = ((zzfhg) this.zza).zza();
    }
}
