package com.google.android.gms.internal.consent_sdk;

import j$.util.Objects;

/* loaded from: classes.dex */
final class zzdu extends zzdv {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzdv zzc;

    public zzdu(zzdv zzdvVar, int i5, int i10) {
        Objects.requireNonNull(zzdvVar);
        this.zzc = zzdvVar;
        this.zza = i5;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzdj.zza(i5, this.zzb, "index");
        return this.zzc.get(i5 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdv, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzdv subList(int i5, int i10) {
        zzdj.zzc(i5, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i5 + i11, i10 + i11);
    }
}
