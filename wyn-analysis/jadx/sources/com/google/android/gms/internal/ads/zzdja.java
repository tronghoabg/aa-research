package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdja implements zzimz {
    private final zzdiz zza;
    private final zzini zzb;

    private zzdja(zzdiz zzdizVar, zzini zziniVar) {
        this.zza = zzdizVar;
        this.zzb = zziniVar;
    }

    public static zzdja zza(zzdiz zzdizVar, zzini zziniVar) {
        return new zzdja(zzdizVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzddb zzddbVarZzp = this.zza.zzp(((zzinl) this.zzb).zzb());
        zzinh.zzb(zzddbVarZzp);
        return zzddbVarZzp;
    }
}
