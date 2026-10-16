package com.google.android.gms.internal.mlkit_vision_text_common;

import j$.util.Objects;
import java.util.AbstractMap;

/* loaded from: classes4.dex */
final class zzcf extends zzbk {
    final /* synthetic */ zzcg zza;

    public zzcf(zzcg zzcgVar) {
        this.zza = zzcgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        zzx.zza(i5, this.zza.zzc, "index");
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
