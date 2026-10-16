package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgwx extends zzgzh {
    final Iterator zza;
    Object zzb;
    Iterator zzc;
    final /* synthetic */ zzgxb zzd;

    public zzgwx(zzgxb zzgxbVar) {
        Objects.requireNonNull(zzgxbVar);
        this.zzd = zzgxbVar;
        this.zza = zzgxbVar.map.entrySet().zze().listIterator(0);
        this.zzb = null;
        this.zzc = zzgxj.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            this.zzc = ((zzgwp) entry.getValue()).iterator();
        }
        Object obj = this.zzb;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.zzc.next());
    }
}
