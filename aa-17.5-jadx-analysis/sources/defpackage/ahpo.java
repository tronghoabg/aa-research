package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
final class ahpo extends InputStream implements InputStreamRetargetInterface {
    private ahpe currentPiece;
    private int currentPieceIndex;
    private int currentPieceOffsetInRope;
    private int currentPieceSize;
    private int mark;
    private ahpm pieceIterator;
    final /* synthetic */ ahpp this$0;

    public ahpo(ahpp ahppVar) {
        this.this$0 = ahppVar;
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
                    ahpe next = this.pieceIterator.next();
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
        ahpm ahpmVar = new ahpm(this.this$0);
        this.pieceIterator = ahpmVar;
        ahpe next = ahpmVar.next();
        this.currentPiece = next;
        this.currentPieceSize = next.size();
        this.currentPieceIndex = 0;
        this.currentPieceOffsetInRope = 0;
    }

    private int readSkipInternal(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (true) {
            if (i3 <= 0) {
                break;
            }
            advanceIfCurrentPieceFullyRead();
            if (this.currentPiece != null) {
                int iMin = Math.min(this.currentPieceSize - this.currentPieceIndex, i3);
                if (bArr != null) {
                    this.currentPiece.copyTo(bArr, this.currentPieceIndex, i, iMin);
                    i += iMin;
                }
                this.currentPieceIndex += iMin;
                i3 -= iMin;
            } else if (i3 == i2) {
                return -1;
            }
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
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
    public int read() throws IOException {
        advanceIfCurrentPieceFullyRead();
        ahpe ahpeVar = this.currentPiece;
        if (ahpeVar == null) {
            return -1;
        }
        int i = this.currentPieceIndex;
        this.currentPieceIndex = i + 1;
        return ahpeVar.byteAt(i) & 255;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        initialize();
        readSkipInternal(null, 0, this.mark);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return readSkipInternal(null, 0, (int) j);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            return readSkipInternal(bArr, i, i2);
        }
        throw new IndexOutOfBoundsException();
    }
}
