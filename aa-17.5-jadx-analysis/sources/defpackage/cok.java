package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class cok implements Iterator, afgc {
    private final Iterator a;

    public cok(col colVar) {
        this.a = colVar.j.iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final czz next() {
        return (czz) this.a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
