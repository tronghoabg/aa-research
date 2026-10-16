package com.google.d.c;

import com.google.d.d.ci;
import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n extends AbstractQueue {
    n() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return ci.o().listIterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return null;
    }

    @Override // java.util.Queue
    public final Object poll() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }
}
