package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yoj extends defpackage.yoe implements java.util.Queue {
    private static final long serialVersionUID = 0;

    public yoj(java.util.Queue queue) {
        super(queue, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.yoe
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.util.Queue a() {
        return (java.util.Queue) super.a();
    }

    @Override // java.util.Queue
    public final java.lang.Object element() {
        java.lang.Object objElement;
        synchronized (this.g) {
            objElement = a().element();
        }
        return objElement;
    }

    @Override // java.util.Queue
    public final boolean offer(java.lang.Object obj) {
        boolean zOffer;
        synchronized (this.g) {
            zOffer = a().offer(obj);
        }
        return zOffer;
    }

    @Override // java.util.Queue
    public final java.lang.Object peek() {
        java.lang.Object objPeek;
        synchronized (this.g) {
            objPeek = a().peek();
        }
        return objPeek;
    }

    @Override // java.util.Queue
    public final java.lang.Object poll() {
        java.lang.Object objPoll;
        synchronized (this.g) {
            objPoll = a().poll();
        }
        return objPoll;
    }

    @Override // java.util.Queue
    public final java.lang.Object remove() {
        java.lang.Object objRemove;
        synchronized (this.g) {
            objRemove = a().remove();
        }
        return objRemove;
    }
}
