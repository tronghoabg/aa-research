package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzifq {
    private static final zzifx zzb = new zzifo();
    private final zzifx zza;

    public zzifq() {
        zziei zzieiVarZza = zziei.zza();
        int i5 = zzicy.zza;
        this.zza = new zzifp(zzieiVarZza, zzb);
    }

    public final zzigr zza(Class cls) {
        int i5 = zzigs.zza;
        if (!zziep.class.isAssignableFrom(cls)) {
            int i10 = zzicy.zza;
        }
        zzifw zzifwVarZzc = this.zza.zzc(cls);
        if (zzifwVarZzc.zza()) {
            int i11 = zzicy.zza;
            return zzigd.zzh(zzigs.zzE(), zziec.zza(), zzifwVarZzc.zzb());
        }
        int i12 = zzicy.zza;
        return zzigc.zzm(cls, zzifwVarZzc, zzigg.zza(), zzifm.zza(), zzigs.zzE(), zzifwVarZzc.zzc() + (-1) != 1 ? zziec.zza() : null, zzifv.zza());
    }
}
