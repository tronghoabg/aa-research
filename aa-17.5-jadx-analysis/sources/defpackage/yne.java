package defpackage;

import java.util.Queue;

/* loaded from: classes.dex */
public final class yne extends ymz implements Queue {
    private static final long serialVersionUID = 0;

    public yne(Queue queue) {
        super(queue, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ymz
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Queue a() {
        return (Queue) super.a();
    }

    @Override // java.util.Queue
    public final Object element() {
        Object objElement;
        synchronized (this.g) {
            objElement = a().element();
        }
        return objElement;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        boolean zOffer;
        synchronized (this.g) {
            zOffer = a().offer(obj);
        }
        return zOffer;
    }

    @Override // java.util.Queue
    public final Object peek() {
        Object objPeek;
        synchronized (this.g) {
            objPeek = a().peek();
        }
        return objPeek;
    }

    @Override // java.util.Queue
    public final Object poll() {
        Object objPoll;
        synchronized (this.g) {
            objPoll = a().poll();
        }
        return objPoll;
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object objRemove;
        synchronized (this.g) {
            objRemove = a().remove();
        }
        return objRemove;
    }
}
