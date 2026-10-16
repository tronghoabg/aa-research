package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ahpd implements ahny {
    private final int limit;
    private int position;
    final /* synthetic */ ahpe this$0;

    private ahpd(ahpe ahpeVar) {
        this.this$0 = ahpeVar;
        this.position = 0;
        this.limit = ahpeVar.size();
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
        try {
            byte[] bArr = this.this$0.bytes;
            int i = this.position;
            this.position = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
