package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzguu extends zzgxw {
    final /* synthetic */ zzguw zza;

    public zzguu(zzguw zzguwVar) {
        Objects.requireNonNull(zzguwVar);
        this.zza = zzguwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzgvr.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzguv(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzguw zzguwVar = this.zza;
        zzguwVar.zzb.zzn(entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    public final Map zza() {
        return this.zza;
    }
}
