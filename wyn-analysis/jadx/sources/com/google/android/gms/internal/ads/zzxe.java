package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzxe extends zzwz {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zzxe(zzbf zzbfVar, Object obj, Object obj2) {
        super(zzbfVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzxe zzp(zzak zzakVar) {
        return new zzxe(new zzxf(zzakVar), zzbe.zza, zzc);
    }

    public static zzxe zzq(zzbf zzbfVar, Object obj, Object obj2) {
        return new zzxe(zzbfVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i5, zzbe zzbeVar, long j8) {
        this.zzb.zzb(i5, zzbeVar, j8);
        if (Objects.equals(zzbeVar.zzb, this.zzd)) {
            zzbeVar.zzb = zzbe.zza;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i5, zzbd zzbdVar, boolean z2) {
        this.zzb.zzd(i5, zzbdVar, z2);
        if (Objects.equals(zzbdVar.zzb, this.zze) && z2) {
            zzbdVar.zzb = zzc;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i5) {
        Object objZzf = this.zzb.zzf(i5);
        return Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    public final zzxe zzr(zzbf zzbfVar) {
        return new zzxe(zzbfVar, this.zzd, this.zze);
    }

    public final /* synthetic */ Object zzs() {
        return this.zze;
    }
}
