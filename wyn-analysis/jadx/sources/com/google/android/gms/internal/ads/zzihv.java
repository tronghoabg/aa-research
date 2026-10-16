package com.google.android.gms.internal.ads;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import uf.InterfaceC4291a;

/* loaded from: classes3.dex */
public final class zzihv implements Iterator, InterfaceC4291a {
    private final /* synthetic */ Iterator zza;

    public zzihv(@NotNull Iterator delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
