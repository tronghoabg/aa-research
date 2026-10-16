package com.google.android.gms.internal.play_billing;

/* loaded from: classes4.dex */
final class zzah extends zzai {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzai zzc;

    public zzah(zzai zzaiVar, int i5, int i10) {
        this.zzc = zzaiVar;
        this.zza = i5;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzaa.zza(i5, this.zzb, "index");
        return this.zzc.get(i5 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzai, java.util.List
    /* renamed from: zzh */
    public final zzai subList(int i5, int i10) {
        zzaa.zzd(i5, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i5 + i11, i10 + i11);
    }
}
