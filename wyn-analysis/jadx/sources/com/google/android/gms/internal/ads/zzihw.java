package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import uf.InterfaceC4291a;

/* loaded from: classes3.dex */
public final class zzihw implements Iterator, InterfaceC4291a {
    final /* synthetic */ Iterator zza;
    private final /* synthetic */ Iterator zzb;

    public zzihw(Iterator it) {
        this.zza = it;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzihy((Map.Entry) this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
