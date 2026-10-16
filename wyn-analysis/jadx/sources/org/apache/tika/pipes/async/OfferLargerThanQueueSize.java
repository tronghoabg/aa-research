package org.apache.tika.pipes.async;

/* loaded from: classes5.dex */
public class OfferLargerThanQueueSize extends IllegalArgumentException {
    private final int queueSize;
    private final int sizeOffered;

    public OfferLargerThanQueueSize(int i5, int i10) {
        this.sizeOffered = i5;
        this.queueSize = i10;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return N0.a.e("sizeOffered (", this.sizeOffered, ") is greater than queue size (", this.queueSize, ")");
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getSizeOffered() {
        return this.sizeOffered;
    }
}
