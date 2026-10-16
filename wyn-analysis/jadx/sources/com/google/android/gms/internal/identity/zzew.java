package com.google.android.gms.internal.identity;

/* loaded from: classes.dex */
final class zzew extends zzex {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzex zzc;

    public zzew(zzex zzexVar, int i5, int i10) {
        this.zzc = zzexVar;
        this.zza = i5;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzer.zzc(i5, this.zzb, "index");
        return this.zzc.get(i5 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.identity.zzex, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzex subList(int i5, int i10) {
        zzer.zze(i5, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i5 + i11, i10 + i11);
    }
}
