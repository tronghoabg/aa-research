package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class afbj implements Iterator, afgc {
    private final Iterator a;
    private int b;

    public afbj(Iterator it) {
        it.getClass();
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        if (i < 0) {
            woy.bo();
        }
        return new afbh(i, this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
