package com.google.d.d;

import java.util.AbstractSet;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class fk<E> extends AbstractSet<E> {
    fk() {
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        return fo.i(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        com.google.d.b.an.B(collection);
        return super.retainAll(collection);
    }
}
