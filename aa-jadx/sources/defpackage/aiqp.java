package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aiqp extends defpackage.aiqq {
    private final int myInitialModCount;
    final /* synthetic */ defpackage.aiqr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiqp(defpackage.aiqr aiqrVar) {
        super(null);
        this.this$0 = aiqrVar;
        this.myInitialModCount = aiqrVar.modCount;
    }

    @Override // defpackage.aiqq
    protected void checkCoModification() {
        if (this.this$0.modCount == this.myInitialModCount) {
            return;
        }
        throw new java.util.ConcurrentModificationException("ModCount: " + this.this$0.modCount + "; expected: " + this.myInitialModCount);
    }

    @Override // defpackage.aiqq
    protected java.lang.Object getElement() {
        return this.this$0.myElem;
    }

    @Override // java.util.Iterator
    public void remove() {
        checkCoModification();
        this.this$0.clear();
    }
}
