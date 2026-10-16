package defpackage;

/* loaded from: classes.dex */
public final class cbo<E> extends cbh<E> {
    private final Object c;

    public cbo(Object obj, int i) {
        super(i, 1);
        this.c = obj;
    }

    @Override // defpackage.cbh, java.util.ListIterator, java.util.Iterator
    public final E next() {
        a();
        this.a++;
        return (E) this.c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        b();
        this.a--;
        return (E) this.c;
    }
}
