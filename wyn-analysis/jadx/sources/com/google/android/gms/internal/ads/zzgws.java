package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzgws extends zzgwt {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzgwt zzc;

    public zzgws(zzgwt zzgwtVar, int i5, int i10) {
        Objects.requireNonNull(zzgwtVar);
        this.zzc = zzgwtVar;
        this.zza = i5;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzgtr.zzm(i5, this.zzb, "index");
        return this.zzc.get(i5 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwt, java.util.List
    /* renamed from: zzh */
    public final zzgwt subList(int i5, int i10) {
        zzgtr.zzo(i5, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i5 + i11, i10 + i11);
    }
}
