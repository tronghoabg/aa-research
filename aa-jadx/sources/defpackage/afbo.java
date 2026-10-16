package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class afbo implements java.util.Iterator, defpackage.afhc {
    public int a;
    final /* synthetic */ defpackage.afbr b;

    public afbo(defpackage.afbr afbrVar) {
        this.b = afbrVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        defpackage.afbr afbrVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return afbrVar.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
