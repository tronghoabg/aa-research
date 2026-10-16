package com.google.android.gms.internal.mlkit_vision_text_common;

import j$.util.Objects;

/* loaded from: classes4.dex */
final class zzci extends zzbk {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc = 1;

    public zzci(Object[] objArr, int i5, int i10) {
        this.zza = objArr;
        this.zzb = i5;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzx.zza(i5, this.zzc, "index");
        Object obj = this.zza[i5 + i5 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
