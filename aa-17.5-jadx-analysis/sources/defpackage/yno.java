package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class yno<E> implements Iterator<E> {
    protected yno() {
    }

    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
