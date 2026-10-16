package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class airq<T> extends airr<T> implements Iterator<T>, afck, afgc {
    public afck a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        int i = this.b;
        return i != 4 ? i != 5 ? new IllegalStateException(a.bp(i, "Unexpected state of the iterator: ")) : new IllegalStateException("Iterator has failed.") : new NoSuchElementException();
    }

    @Override // defpackage.airr
    public final Object a(Object obj, afck afckVar) {
        this.c = obj;
        this.b = 3;
        this.a = afckVar;
        return afcr.a;
    }

    @Override // defpackage.airr
    public final Object b(Iterator it, afck afckVar) {
        if (!it.hasNext()) {
            return afak.a;
        }
        this.d = it;
        this.b = 2;
        this.a = afckVar;
        return afcr.a;
    }

    @Override // defpackage.afck
    public final afco hH() {
        return afcp.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.d;
                it.getClass();
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            afck afckVar = this.a;
            afckVar.getClass();
            this.a = null;
            afckVar.w(afak.a);
        }
    }

    @Override // java.util.Iterator
    public final T next() throws Throwable {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.b = 1;
            Iterator it = this.d;
            it.getClass();
            return (T) it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        T t = (T) this.c;
        this.c = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.afck
    public final void w(Object obj) throws Throwable {
        woy.dF(obj);
        this.b = 4;
    }
}
