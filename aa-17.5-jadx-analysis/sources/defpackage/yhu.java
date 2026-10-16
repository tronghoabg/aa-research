package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class yhu<T> extends yno<T> {
    private final Object a;
    private boolean b;

    public yhu(Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.b) {
            throw new NoSuchElementException();
        }
        this.b = true;
        return (T) this.a;
    }
}
