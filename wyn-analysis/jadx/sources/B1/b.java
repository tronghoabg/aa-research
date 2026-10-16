package B1;

import A7.AbstractC0279p0;
import android.util.Log;
import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f1499a;

    /* renamed from: b, reason: collision with root package name */
    public int f1500b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f1501c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f1502d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1503e;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f1503e = bArr.length;
    }

    public final void a(int i5) throws IOException {
        int i10 = 0;
        while (i10 < i5) {
            DataInputStream dataInputStream = this.f1499a;
            int i11 = i5 - i10;
            int iSkip = (int) dataInputStream.skip(i11);
            if (iSkip <= 0) {
                if (this.f1502d == null) {
                    this.f1502d = new byte[Segment.SIZE];
                }
                iSkip = dataInputStream.read(this.f1502d, 0, Math.min(Segment.SIZE, i11));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC0279p0.i(i5, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += iSkip;
        }
        this.f1500b += i10;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1499a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i5) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f1500b++;
        return this.f1499a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f1500b++;
        return this.f1499a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f1500b++;
        int i5 = this.f1499a.read();
        if (i5 >= 0) {
            return (byte) i5;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1500b += 2;
        return this.f1499a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i5, int i10) throws IOException {
        this.f1500b += i10;
        this.f1499a.readFully(bArr, i5, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f1500b += 4;
        DataInputStream dataInputStream = this.f1499a;
        int i5 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i5 | i10 | i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1501c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i12 << 24) + (i11 << 16) + (i10 << 8) + i5;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i5 << 24) + (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IOException("Invalid byte order: " + this.f1501c);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j8;
        long j10;
        this.f1500b += 8;
        DataInputStream dataInputStream = this.f1499a;
        int i5 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        if ((i5 | i10 | i11 | i12 | i13 | i14 | i15 | i16) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1501c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j8 = (i16 << 56) + (i15 << 48) + (i14 << 40) + (i13 << 32) + (i12 << 24) + (i11 << 16) + (i10 << 8);
            j10 = i5;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f1501c);
            }
            j8 = (i5 << 56) + (i10 << 48) + (i11 << 40) + (i12 << 32) + (i13 << 24) + (i14 << 16) + (i15 << 8);
            j10 = i16;
        }
        return j8 + j10;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f1500b += 2;
        DataInputStream dataInputStream = this.f1499a;
        int i5 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i5 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1501c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i10 << 8) + i5);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i5 << 8) + i10);
        }
        throw new IOException("Invalid byte order: " + this.f1501c);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f1500b += 2;
        return this.f1499a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f1500b++;
        return this.f1499a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f1500b += 2;
        DataInputStream dataInputStream = this.f1499a;
        int i5 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i5 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1501c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i10 << 8) + i5;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i5 << 8) + i10;
        }
        throw new IOException("Invalid byte order: " + this.f1501c);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i5) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        int i11 = this.f1499a.read(bArr, i5, i10);
        this.f1500b += i11;
        return i11;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f1500b += bArr.length;
        this.f1499a.readFully(bArr);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1499a = dataInputStream;
        dataInputStream.mark(0);
        this.f1500b = 0;
        this.f1501c = byteOrder;
        this.f1503e = inputStream instanceof b ? ((b) inputStream).f1503e : -1;
    }
}
