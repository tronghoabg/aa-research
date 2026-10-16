package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahow implements defpackage.ahoy {
    private final int limit;
    private int position;
    final /* synthetic */ defpackage.ahox this$0;

    private ahow(defpackage.ahox ahoxVar) {
        this.this$0 = ahoxVar;
        int offsetIntoBytes = ahoxVar.getOffsetIntoBytes();
        this.position = offsetIntoBytes;
        this.limit = offsetIntoBytes + ahoxVar.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // java.util.Iterator
    public java.lang.Byte next() {
        return java.lang.Byte.valueOf(nextByte());
    }

    @Override // defpackage.ahoy
    public byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new java.util.NoSuchElementException();
        }
        byte[] bArr = this.this$0.bytes;
        this.position = i + 1;
        return bArr[i];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
