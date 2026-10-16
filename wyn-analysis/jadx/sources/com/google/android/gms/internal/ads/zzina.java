package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzina implements zzimz, zzimt {
    private static final zzina zza = new zzina(null);
    private final Object zzb;

    private zzina(Object obj) {
        this.zzb = obj;
    }

    public static zzimz zza(Object obj) {
        zzinh.zza(obj, "instance cannot be null");
        return new zzina(obj);
    }

    public static zzimz zzc(Object obj) {
        return obj == null ? zza : new zzina(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        return this.zzb;
    }
}
