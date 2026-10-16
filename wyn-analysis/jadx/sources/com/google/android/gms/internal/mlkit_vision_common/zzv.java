package com.google.android.gms.internal.mlkit_vision_common;

import java.util.AbstractMap;

/* loaded from: classes4.dex */
final class zzv extends zzp {
    final /* synthetic */ zzw zza;

    public zzv(zzw zzwVar) {
        this.zza = zzwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        zzf.zza(i5, this.zza.zzc, "index");
        zzw zzwVar = this.zza;
        int i10 = i5 + i5;
        Object obj = zzwVar.zzb[i10];
        obj.getClass();
        Object obj2 = zzwVar.zzb[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
