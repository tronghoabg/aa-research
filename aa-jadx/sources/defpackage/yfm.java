package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yfm<E> extends defpackage.yfk<E> implements java.util.ListIterator<E> {
    protected yfm() {
    }

    @Override // defpackage.yfk
    protected /* bridge */ /* synthetic */ java.util.Iterator a() {
        throw null;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        c().add(e);
    }

    protected abstract java.util.ListIterator c();

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
