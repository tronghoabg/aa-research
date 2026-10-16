package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public abstract class yeg<E> extends yee<E> implements ListIterator<E> {
    protected yeg() {
    }

    @Override // defpackage.yee
    protected /* bridge */ /* synthetic */ Iterator a() {
        throw null;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        c().add(e);
    }

    protected abstract ListIterator c();

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        return (E) c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        c().set(e);
    }
}
