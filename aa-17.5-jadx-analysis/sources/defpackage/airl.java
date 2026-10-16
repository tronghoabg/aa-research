package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class airl implements Iterator, afgc {
    final /* synthetic */ airm a;
    private final Iterator b;
    private Iterator c;
    private int d;

    public airl(airm airmVar) {
        this.a = airmVar;
        this.b = airmVar.a.a();
    }

    private final boolean a() {
        Iterator it;
        Iterator it2 = this.c;
        if (it2 != null && it2.hasNext()) {
            this.d = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.d = 2;
                this.c = null;
                return false;
            }
            Object next = it3.next();
            airm airmVar = this.a;
            it = (Iterator) airmVar.c.invoke(airmVar.b.invoke(next));
        } while (!it.hasNext());
        this.c = it;
        this.d = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 2) {
            throw new NoSuchElementException();
        }
        if (i == 0 && !a()) {
            throw new NoSuchElementException();
        }
        this.d = 0;
        Iterator it = this.c;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
