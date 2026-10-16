package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahra implements java.util.Iterator {
    java.util.Iterator<java.lang.String> iter;
    final /* synthetic */ defpackage.ahrb this$0;

    public ahra(defpackage.ahrb ahrbVar) {
        this.this$0 = ahrbVar;
        this.iter = ahrbVar.list.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iter.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.String next() {
        return this.iter.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
