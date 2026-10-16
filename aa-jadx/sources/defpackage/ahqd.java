package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahqd implements defpackage.ahoy {
    private final int limit;
    private int position;
    final /* synthetic */ defpackage.ahqe this$0;

    private ahqd(defpackage.ahqe ahqeVar) {
        this.this$0 = ahqeVar;
        this.position = 0;
        this.limit = ahqeVar.size();
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
        try {
            byte[] bArr = this.this$0.bytes;
            int i = this.position;
            this.position = i + 1;
            return bArr[i];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
