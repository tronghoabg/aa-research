package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahqv implements java.util.Iterator {
    private java.util.Iterator<java.util.Map.Entry> lazyOverflowIterator;
    private boolean nextCalledBeforeRemove;
    private int pos;
    final /* synthetic */ defpackage.ahqx this$0;

    private ahqv(defpackage.ahqx ahqxVar) {
        this.this$0 = ahqxVar;
        this.pos = -1;
    }

    private java.util.Iterator<java.util.Map.Entry> getOverflowIterator() {
        java.util.Iterator<java.util.Map.Entry> it = this.lazyOverflowIterator;
        if (it != null) {
            return it;
        }
        java.util.Iterator<java.util.Map.Entry> it2 = this.this$0.overflowEntries.entrySet().iterator();
        this.lazyOverflowIterator = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.pos + 1 < this.this$0.entryList.size() || getOverflowIterator().hasNext();
    }

    @Override // java.util.Iterator
    public java.util.Map.Entry next() {
        this.nextCalledBeforeRemove = true;
        int i = this.pos + 1;
        this.pos = i;
        return i < this.this$0.entryList.size() ? (java.util.Map.Entry) this.this$0.entryList.get(this.pos) : getOverflowIterator().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.nextCalledBeforeRemove) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.nextCalledBeforeRemove = false;
        this.this$0.checkMutable();
        if (this.pos >= this.this$0.entryList.size()) {
            getOverflowIterator().remove();
            return;
        }
        defpackage.ahqx ahqxVar = this.this$0;
        int i = this.pos;
        this.pos = i - 1;
        ahqxVar.removeArrayEntryAt(i);
    }

    public /* synthetic */ ahqv(defpackage.ahqx ahqxVar, defpackage.ahqq ahqqVar) {
        this(ahqxVar);
    }
}
