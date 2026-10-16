package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class ylh<E> implements Iterator<E> {
    private final ylc a;
    private final Iterator b;
    private ylb c;
    private int d;
    private int e;
    private boolean f;

    public ylh(ylc ylcVar, Iterator it) {
        this.a = ylcVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int iA = this.d;
        if (iA == 0) {
            ylb ylbVar = (ylb) this.b.next();
            this.c = ylbVar;
            iA = ylbVar.a();
            this.e = iA;
        }
        this.d = iA - 1;
        this.f = true;
        ylb ylbVar2 = this.c;
        ylbVar2.getClass();
        return (E) ylbVar2.b();
    }

    @Override // java.util.Iterator
    public final void remove() {
        woy.aa(this.f, "no calls to next() since the last call to remove()");
        if (this.e == 1) {
            this.b.remove();
        } else {
            ylc ylcVar = this.a;
            ylb ylbVar = this.c;
            ylbVar.getClass();
            ylcVar.remove(ylbVar.b());
        }
        this.e--;
        this.f = false;
    }
}
