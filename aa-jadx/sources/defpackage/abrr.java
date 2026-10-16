package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abrr implements java.util.Iterator, defpackage.afhc {
    final /* synthetic */ java.util.Iterator a;
    private final /* synthetic */ java.util.Iterator b;

    public abrr(java.util.Iterator it) {
        this.a = it;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return new defpackage.abrt((java.util.Map.Entry) this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
