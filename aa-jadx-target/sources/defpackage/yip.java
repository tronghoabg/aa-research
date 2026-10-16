package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yip implements java.util.Iterator {
    boolean a = true;
    final /* synthetic */ java.util.Iterator b;

    public yip(java.util.Iterator it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object next = this.b.next();
        this.a = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        defpackage.ysr.bk(!this.a, "no calls to next() since the last call to remove()");
        this.b.remove();
    }
}
