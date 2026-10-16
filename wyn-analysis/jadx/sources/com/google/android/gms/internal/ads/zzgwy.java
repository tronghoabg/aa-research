package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzgwy extends zzgzh {
    final Iterator zza;
    Iterator zzb;
    final /* synthetic */ zzgxb zzc;

    public zzgwy(zzgxb zzgxbVar) {
        Objects.requireNonNull(zzgxbVar);
        this.zzc = zzgxbVar;
        this.zza = ((zzgwt) zzgxbVar.map.values()).listIterator(0);
        this.zzb = zzgxj.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgwp) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }
}
