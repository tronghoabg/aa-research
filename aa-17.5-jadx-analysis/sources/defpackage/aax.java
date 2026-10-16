package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class aax implements Iterator, afgc {
    final /* synthetic */ aau a;
    private int b;

    public aax(aau aauVar) {
        this.a = aauVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 1;
        return this.a.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
