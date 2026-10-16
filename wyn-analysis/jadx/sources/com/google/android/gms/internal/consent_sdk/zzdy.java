package com.google.android.gms.internal.consent_sdk;

import j$.util.Objects;

/* loaded from: classes.dex */
final class zzdy extends zzdv {
    static final zzdv zza = new zzdy(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzdy(Object[] objArr, int i5) {
        this.zzb = objArr;
        this.zzc = i5;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzdj.zza(i5, this.zzc, "index");
        Object obj = this.zzb[i5];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdv, com.google.android.gms.internal.consent_sdk.zzds
    public final int zza(Object[] objArr, int i5) {
        Object[] objArr2 = this.zzb;
        int i10 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final Object[] zze() {
        return this.zzb;
    }
}
