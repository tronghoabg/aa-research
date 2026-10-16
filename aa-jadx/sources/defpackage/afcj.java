package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afcj implements java.util.Iterator, defpackage.afhc {
    private final java.util.Iterator a;
    private int b;

    public afcj(java.util.Iterator it) {
        it.getClass();
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i = this.b;
        this.b = i + 1;
        if (i < 0) {
            defpackage.afga.ai();
        }
        return new defpackage.afch(i, this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
