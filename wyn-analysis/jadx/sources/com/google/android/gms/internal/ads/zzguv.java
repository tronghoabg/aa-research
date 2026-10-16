package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzguv implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzguw zzc;

    public zzguv(zzguw zzguwVar) {
        Objects.requireNonNull(zzguwVar);
        this.zzc = zzguwVar;
        this.zza = zzguwVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zzb(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgtr.zzj(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        int size = this.zzb.size();
        zzgvj zzgvjVar = this.zzc.zzb;
        zzgvjVar.zzq(zzgvjVar.zzp() - size);
        this.zzb.clear();
        this.zzb = null;
    }
}
