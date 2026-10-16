package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aioz implements java.util.Iterator, defpackage.afhc {
    private boolean notVisited = true;
    final /* synthetic */ defpackage.aipa this$0;

    public aioz(defpackage.aipa aipaVar) {
        this.this$0 = aipaVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.notVisited;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.notVisited) {
            throw new java.util.NoSuchElementException();
        }
        this.notVisited = false;
        return this.this$0.getValue();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
