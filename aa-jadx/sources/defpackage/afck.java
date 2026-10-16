package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class afck implements java.util.Iterator, defpackage.afhc {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
