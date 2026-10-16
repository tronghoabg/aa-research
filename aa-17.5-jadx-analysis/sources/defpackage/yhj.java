package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class yhj implements Iterator {
    boolean a = true;
    final /* synthetic */ Iterator b;

    public yhj(Iterator it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.b.next();
        this.a = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        woy.aa(!this.a, "no calls to next() since the last call to remove()");
        this.b.remove();
    }
}
