package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class ybx<T> extends yno<T> {
    private Object a;

    protected ybx(Object obj) {
        this.a = obj;
    }

    protected abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = (T) this.a;
        if (t == null) {
            throw new NoSuchElementException();
        }
        this.a = a(t);
        return t;
    }
}
