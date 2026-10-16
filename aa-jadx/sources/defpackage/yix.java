package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yix<T> implements java.util.Iterator<T> {
    private java.util.Iterator a;
    private java.util.Iterator b = defpackage.yiw.a;
    private java.util.Iterator c;
    private java.util.Deque d;

    public yix(java.util.Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.Iterator it;
        while (true) {
            java.util.Iterator it2 = this.b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                java.util.Iterator it3 = this.c;
                if (it3 != null && it3.hasNext()) {
                    it = this.c;
                    break;
                }
                java.util.Deque deque = this.d;
                if (deque == null || deque.isEmpty()) {
                    it = null;
                    break;
                }
                this.c = (java.util.Iterator) this.d.removeFirst();
            }
            this.c = it;
            if (it == null) {
                return false;
            }
            java.util.Iterator it4 = (java.util.Iterator) it.next();
            this.b = it4;
            if (it4 instanceof defpackage.yix) {
                defpackage.yix yixVar = (defpackage.yix) it4;
                this.b = yixVar.b;
                if (this.d == null) {
                    this.d = new java.util.ArrayDeque();
                }
                this.d.addFirst(this.c);
                if (yixVar.d != null) {
                    while (!yixVar.d.isEmpty()) {
                        this.d.addFirst((java.util.Iterator) yixVar.d.removeLast());
                    }
                }
                this.c = yixVar.c;
            }
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.util.Iterator it = this.b;
        this.a = it;
        it.getClass();
        return (T) it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        java.util.Iterator it = this.a;
        if (it == null) {
            throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.a = null;
    }
}
