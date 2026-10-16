package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzaq extends zzal {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzal zzc;

    public zzaq(zzal zzalVar, int i5, int i10) {
        this.zzc = zzalVar;
        this.zza = i5;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzy.zza(i5, this.zzb);
        return this.zzc.get(i5 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final Object[] zzf() {
        return this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.List
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzal subList(int i5, int i10) {
        zzy.zza(i5, i10, this.zzb);
        zzal zzalVar = this.zzc;
        int i11 = this.zza;
        return (zzal) zzalVar.subList(i5 + i11, i10 + i11);
    }
}
