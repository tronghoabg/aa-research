package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.Objects;

/* loaded from: classes.dex */
final class zzba extends zzal<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzba(Object[] objArr, int i5, int i10) {
        this.zza = objArr;
        this.zzb = i5;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzy.zza(i5, this.zzc);
        Object obj = this.zza[(i5 * 2) + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }
}
