package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahqo extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private defpackage.ahqe currentPiece;
    private int currentPieceIndex;
    private int currentPieceOffsetInRope;
    private int currentPieceSize;
    private int mark;
    private defpackage.ahqm pieceIterator;
    final /* synthetic */ defpackage.ahqp this$0;

    public ahqo(defpackage.ahqp ahqpVar) {
        this.this$0 = ahqpVar;
        initialize();
    }

    private void advanceIfCurrentPieceFullyRead() {
        if (this.currentPiece != null) {
            int i = this.currentPieceIndex;
            int i2 = this.currentPieceSize;
            if (i == i2) {
                this.currentPieceOffsetInRope += i2;
                int size = 0;
                this.currentPieceIndex = 0;
                if (this.pieceIterator.hasNext()) {
                    defpackage.ahqe next = this.pieceIterator.next();
                    this.currentPiece = next;
                    size = next.size();
                } else {
                    this.currentPiece = null;
                }
                this.currentPieceSize = size;
            }
        }
    }

    private void initialize() {
        defpackage.ahqm ahqmVar = new defpackage.ahqm(this.this$0);
        this.pieceIterator = ahqmVar;
        defpackage.ahqe next = ahqmVar.next();
        this.currentPiece = next;
        this.currentPieceSize = next.size();
        this.currentPieceIndex = 0;
        this.currentPieceOffsetInRope = 0;
    }

    private int readSkipInternal(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            advanceIfCurrentPieceFullyRead();
            if (this.currentPiece == null) {
                if (i3 != i2) {
                    break;
                }
                return -1;
            }
            int iMin = java.lang.Math.min(this.currentPieceSize - this.currentPieceIndex, i3);
            if (bArr != null) {
                this.currentPiece.copyTo(bArr, this.currentPieceIndex, i, iMin);
                i += iMin;
            }
            this.currentPieceIndex += iMin;
            i3 -= iMin;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        return this.this$0.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        advanceIfCurrentPieceFullyRead();
        defpackage.ahqe ahqeVar = this.currentPiece;
        if (ahqeVar == null) {
            return -1;
        }
        int i = this.currentPieceIndex;
        this.currentPieceIndex = i + 1;
        return ahqeVar.byteAt(i) & 255;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        initialize();
        readSkipInternal(null, 0, this.mark);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (j < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return readSkipInternal(null, 0, (int) j);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            return readSkipInternal(bArr, i, i2);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }
}
