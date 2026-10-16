package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzto {
    private final zzv zza;
    private final zzv zzb;
    private final int zzc;
    private final int zzd;
    private final zzrg zze;
    private final zzck zzf;
    private final zzbf zzg;
    private final Object zzh;

    private zzto(zzv zzvVar, zzv zzvVar2, int i5, int i10, zzrg zzrgVar, zzck zzckVar, zzbf zzbfVar, Object obj) {
        this.zza = zzvVar;
        this.zzb = zzvVar2;
        this.zzc = i5;
        this.zzd = i10;
        this.zze = zzrgVar;
        this.zzf = zzckVar;
        this.zzg = zzbfVar;
        this.zzh = obj;
    }

    public final /* synthetic */ zzto zza(zzrg zzrgVar) {
        return new zzto(this.zza, this.zzb, this.zzc, this.zzd, zzrgVar, this.zzf, this.zzg, this.zzh);
    }

    public final /* synthetic */ long zzb(long j8) {
        return zzfm.zzu(j8, this.zza.zzJ);
    }

    public final /* synthetic */ long zzc(long j8) {
        return zzfm.zzu(j8, this.zze.zzb);
    }

    public final /* synthetic */ zzsa zzd() {
        zzrg zzrgVar = this.zze;
        return new zzsa(zzrgVar.zza, zzrgVar.zzb, zzrgVar.zzc, false, false, zzrgVar.zze);
    }

    public final /* synthetic */ boolean zze() {
        return Objects.equals(this.zza.zzp, "audio/raw");
    }

    public final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    public final /* synthetic */ zzv zzg() {
        return this.zzb;
    }

    public final /* synthetic */ int zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }

    public final /* synthetic */ zzrg zzj() {
        return this.zze;
    }

    public final /* synthetic */ zzck zzk() {
        return this.zzf;
    }

    public final /* synthetic */ zzbf zzl() {
        return this.zzg;
    }

    public final /* synthetic */ Object zzm() {
        return this.zzh;
    }

    public /* synthetic */ zzto(zzv zzvVar, zzv zzvVar2, int i5, int i10, zzrg zzrgVar, zzck zzckVar, zzbf zzbfVar, Object obj, byte[] bArr) {
        this(zzvVar, zzvVar2, i5, i10, zzrgVar, zzckVar, zzbfVar, obj);
    }
}
