package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzgyo extends zzgwt {
    static final zzgwt zza = new zzgyo(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzgyo(Object[] objArr, int i5) {
        this.zzb = objArr;
        this.zzc = i5;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzgtr.zzm(i5, this.zzc, "index");
        Object obj = this.zzb[i5];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwt, com.google.android.gms.internal.ads.zzgwp
    public final int zzg(Object[] objArr, int i5) {
        Object[] objArr2 = this.zzb;
        int i10 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i5, i10);
        return i5 + i10;
    }
}
