package defpackage;

import java.util.ConcurrentModificationException;

/* loaded from: classes3.dex */
final class aipp extends aipq {
    private final int myInitialModCount;
    final /* synthetic */ aipr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aipp(aipr aiprVar) {
        super(null);
        this.this$0 = aiprVar;
        this.myInitialModCount = aiprVar.modCount;
    }

    @Override // defpackage.aipq
    protected void checkCoModification() {
        if (this.this$0.modCount == this.myInitialModCount) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + this.this$0.modCount + "; expected: " + this.myInitialModCount);
    }

    @Override // defpackage.aipq
    protected Object getElement() {
        return this.this$0.myElem;
    }

    @Override // java.util.Iterator
    public void remove() {
        checkCoModification();
        this.this$0.clear();
    }
}
