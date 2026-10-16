package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* loaded from: classes4.dex */
final class zzas extends zzai {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzas(Object[] objArr, int i5, int i10) {
        this.zza = objArr;
        this.zzb = i5;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzaa.zza(i5, this.zzc, "index");
        Object obj = this.zza[i5 + i5 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final boolean zzf() {
        return true;
    }
}
