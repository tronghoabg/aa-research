package com.google.v;

import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class er implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f12914a;

    public er(Iterator it) {
        this.f12914a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12914a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f12914a.next();
        return entry.getValue() instanceof es ? new eq(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12914a.remove();
    }
}
