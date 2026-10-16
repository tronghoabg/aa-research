package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class zzgyp extends zzgwt {
    final /* synthetic */ zzgyq zza;

    public zzgyp(zzgyq zzgyqVar) {
        Objects.requireNonNull(zzgyqVar);
        this.zza = zzgyqVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        zzgyq zzgyqVar = this.zza;
        zzgtr.zzm(i5, zzgyqVar.zzx(), "index");
        int i10 = i5 + i5;
        Object obj = zzgyqVar.zzw()[i10];
        Objects.requireNonNull(obj);
        Object obj2 = zzgyqVar.zzw()[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzf() {
        return true;
    }
}
