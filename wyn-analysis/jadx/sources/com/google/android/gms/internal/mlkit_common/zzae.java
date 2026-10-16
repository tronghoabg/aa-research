package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes4.dex */
final class zzae extends zzaf {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaf zzc;

    public zzae(zzaf zzafVar, int i5, int i10) {
        this.zzc = zzafVar;
        this.zza = i5;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzt.zza(i5, this.zzb, "index");
        return this.zzc.get(i5 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzaf subList(int i5, int i10) {
        zzt.zzd(i5, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i5 + i11, i10 + i11);
    }
}
