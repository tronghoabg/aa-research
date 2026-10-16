package com.google.v.b;

import h.g.b.x;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends d implements Set, j$.util.Set, h.g.b.a.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Collection collection) {
        super(collection);
        x.f(collection, "delegate");
    }

    @Override // com.google.v.b.d, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
