package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgvx extends AbstractSet {
    final /* synthetic */ zzgwa zza;

    public /* synthetic */ zzgvx(zzgwa zzgwaVar, byte[] bArr) {
        Objects.requireNonNull(zzgwaVar);
        this.zza = zzgwaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        return mapZzc != null ? mapZzc.keySet().iterator() : new zzgvs(zzgwaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        return mapZzc != null ? mapZzc.keySet().remove(obj) : zzgwaVar.zzj(obj) != zzgwa.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
