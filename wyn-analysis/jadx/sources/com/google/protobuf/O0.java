package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class O0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f27599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f27600b;

    public O0(Internal.MapAdapter mapAdapter, Iterator it) {
        this.f27600b = mapAdapter;
        this.f27599a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27599a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new N0(this.f27600b, (Map.Entry) this.f27599a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f27599a.remove();
    }
}
