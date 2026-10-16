package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ahnw implements ahny {
    private final int limit;
    private int position;
    final /* synthetic */ ahnx this$0;

    private ahnw(ahnx ahnxVar) {
        this.this$0 = ahnxVar;
        int offsetIntoBytes = ahnxVar.getOffsetIntoBytes();
        this.position = offsetIntoBytes;
        this.limit = offsetIntoBytes + ahnxVar.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // java.util.Iterator
    public Byte next() {
        return Byte.valueOf(nextByte());
    }

    @Override // defpackage.ahny
    public byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new NoSuchElementException();
        }
        byte[] bArr = this.this$0.bytes;
        this.position = i + 1;
        return bArr[i];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
