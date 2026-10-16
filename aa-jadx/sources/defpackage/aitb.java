package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aitb implements java.util.Iterator, defpackage.afhc {
    final /* synthetic */ defpackage.aitc a;
    private final java.util.Iterator b;

    public aitb(defpackage.aitc aitcVar) {
        this.a = aitcVar;
        this.b = aitcVar.a.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return this.a.b.invoke(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
