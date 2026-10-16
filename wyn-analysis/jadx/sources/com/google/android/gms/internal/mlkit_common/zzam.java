package com.google.android.gms.internal.mlkit_common;

import j$.util.Objects;
import java.util.AbstractMap;

/* loaded from: classes4.dex */
final class zzam extends zzaf {
    final /* synthetic */ zzan zza;

    public zzam(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        zzt.zza(i5, this.zza.zzc, "index");
        int i10 = i5 + i5;
        Object obj = this.zza.zzb[i10];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
