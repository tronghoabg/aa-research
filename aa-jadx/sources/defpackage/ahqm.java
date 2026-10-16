package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahqm implements java.util.Iterator {
    private final java.util.Stack<defpackage.ahqp> breadCrumbs;
    private defpackage.ahqe next;

    private ahqm(defpackage.ahpa ahpaVar) {
        this.breadCrumbs = new java.util.Stack<>();
        this.next = getLeafByLeft(ahpaVar);
    }

    private defpackage.ahqe getLeafByLeft(defpackage.ahpa ahpaVar) {
        while (ahpaVar instanceof defpackage.ahqp) {
            defpackage.ahqp ahqpVar = (defpackage.ahqp) ahpaVar;
            this.breadCrumbs.push(ahqpVar);
            ahpaVar = ahqpVar.left;
        }
        return (defpackage.ahqe) ahpaVar;
    }

    private defpackage.ahqe getNextNonEmptyLeaf() {
        while (!this.breadCrumbs.isEmpty()) {
            defpackage.ahqe leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
            if (!leafByLeft.isEmpty()) {
                return leafByLeft;
            }
        }
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public defpackage.ahqe next() {
        defpackage.ahqe ahqeVar = this.next;
        if (ahqeVar == null) {
            throw new java.util.NoSuchElementException();
        }
        this.next = getNextNonEmptyLeaf();
        return ahqeVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
