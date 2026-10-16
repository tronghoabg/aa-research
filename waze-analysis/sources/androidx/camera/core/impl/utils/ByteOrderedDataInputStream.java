package androidx.camera.core.impl.utils;

import androidx.media3.muxer.MuxerUtil;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ByteOrderedDataInputStream extends InputStream implements DataInput, InputStreamRetargetInterface {
    private ByteOrder mByteOrder;
    private final DataInputStream mDataInputStream;
    final int mLength;
    int mPosition;
    private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;

    ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) {
        this.mByteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.mDataInputStream = dataInputStream;
        int iAvailable = dataInputStream.available();
        this.mLength = iAvailable;
        this.mPosition = 0;
        dataInputStream.mark(iAvailable);
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.mDataInputStream.available();
    }

    public int getLength() {
        return this.mLength;
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        synchronized (this.mDataInputStream) {
            this.mDataInputStream.mark(i2);
        }
    }

    public int peek() {
        return this.mPosition;
    }

    @Override // java.io.InputStream
    public int read() {
        this.mPosition++;
        return this.mDataInputStream.read();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        this.mPosition++;
        return this.mDataInputStream.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws EOFException {
        int i2 = this.mPosition + 1;
        this.mPosition = i2;
        if (i2 > this.mLength) {
            throw new EOFException();
        }
        int i3 = this.mDataInputStream.read();
        if (i3 >= 0) {
            return (byte) i3;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() {
        this.mPosition += 2;
        return this.mDataInputStream.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        int i2 = this.mPosition;
        int length = bArr.length;
        int i3 = i2 + length;
        this.mPosition = i3;
        if (i3 > this.mLength) {
            throw new EOFException();
        }
        if (this.mDataInputStream.read(bArr, 0, length) != length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        int i2 = this.mPosition + 4;
        this.mPosition = i2;
        if (i2 > this.mLength) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.mDataInputStream;
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        if ((i3 | i4 | i5 | i6) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (i6 << 24) + (i5 << 16) + (i4 << 8) + i3;
        }
        if (byteOrder != BIG_ENDIAN) {
            ByteOrder byteOrder2 = this.mByteOrder;
            Objects.toString(byteOrder2);
            throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder2)));
        }
        return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        int i2 = this.mPosition + 8;
        this.mPosition = i2;
        if (i2 > this.mLength) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.mDataInputStream;
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i3 | i4 | i5 | i6 | i7 | i8 | i9 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (i10 << 56) + (i9 << 48) + (i8 << 40) + (i7 << 32) + (i6 << 24) + (i5 << 16) + (i4 << 8) + i3;
        }
        if (byteOrder != BIG_ENDIAN) {
            ByteOrder byteOrder2 = this.mByteOrder;
            Objects.toString(byteOrder2);
            throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder2)));
        }
        return (i3 << 56) + (i4 << 48) + (i5 << 40) + (i6 << 32) + (i7 << 24) + (i8 << 16) + (i9 << 8) + i10;
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        int i2;
        int i3 = this.mPosition + 2;
        this.mPosition = i3;
        if (i3 > this.mLength) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.mDataInputStream;
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        if ((i4 | i5) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            i2 = (i5 << 8) + i4;
        } else {
            if (byteOrder != BIG_ENDIAN) {
                ByteOrder byteOrder2 = this.mByteOrder;
                Objects.toString(byteOrder2);
                throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder2)));
            }
            i2 = (i4 << 8) + i5;
        }
        return (short) i2;
    }

    @Override // java.io.DataInput
    public String readUTF() {
        this.mPosition += 2;
        return this.mDataInputStream.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        this.mPosition++;
        return this.mDataInputStream.readUnsignedByte();
    }

    public long readUnsignedInt() {
        return readInt() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        int i2 = this.mPosition + 2;
        this.mPosition = i2;
        if (i2 > this.mLength) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.mDataInputStream;
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (i4 << 8) + i3;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (i3 << 8) + i4;
        }
        ByteOrder byteOrder2 = this.mByteOrder;
        Objects.toString(byteOrder2);
        throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder2)));
    }

    public void seek(long j2) throws IOException {
        long j3 = this.mPosition;
        if (j3 > j2) {
            this.mPosition = 0;
            this.mDataInputStream.reset();
            this.mDataInputStream.mark(this.mLength);
        } else {
            j2 -= j3;
        }
        int i2 = (int) j2;
        if (skipBytes(i2) != i2) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i2) {
        int iMin = Math.min(i2, this.mLength - this.mPosition);
        int iSkipBytes = 0;
        while (iSkipBytes < iMin) {
            iSkipBytes += this.mDataInputStream.skipBytes(iMin - iSkipBytes);
        }
        this.mPosition += iSkipBytes;
        return iSkipBytes;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.mDataInputStream.read(bArr, i2, i3);
        this.mPosition += i4;
        return i4;
    }

    ByteOrderedDataInputStream(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    ByteOrderedDataInputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.mPosition + i3;
        this.mPosition = i4;
        if (i4 <= this.mLength) {
            if (this.mDataInputStream.read(bArr, i2, i3) != i3) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }
}
