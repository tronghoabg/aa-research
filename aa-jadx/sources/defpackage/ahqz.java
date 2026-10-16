package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahqz implements java.util.ListIterator {
    java.util.ListIterator<java.lang.String> iter;
    final /* synthetic */ defpackage.ahrb this$0;
    final /* synthetic */ int val$index;

    public ahqz(defpackage.ahrb ahrbVar, int i) {
        this.this$0 = ahrbVar;
        this.val$index = i;
        this.iter = ahrbVar.list.listIterator(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.iter.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.iter.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.String next() {
        return this.iter.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.iter.nextIndex();
    }

    @Override // java.util.ListIterator
    public java.lang.String previous() {
        return this.iter.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.iter.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void set(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }
}
