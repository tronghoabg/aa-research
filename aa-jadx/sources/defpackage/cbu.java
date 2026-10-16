package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cbu<E> extends defpackage.cbn<E> {
    private final java.lang.Object c;

    public cbu(java.lang.Object obj, int i) {
        super(i, 1);
        this.c = obj;
    }

    @Override // defpackage.cbn, java.util.ListIterator, java.util.Iterator
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
