package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes4.dex */
public final class J extends CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f27577a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f27578b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27579c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27580d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27581e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27582f;

    /* renamed from: g, reason: collision with root package name */
    public long f27583g;

    public J(ByteBuffer byteBuffer) {
        super();
        this.f27577a = byteBuffer;
        this.f27578b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long jB = d2.b(byteBuffer);
        this.f27579c = jB;
        long jPosition = byteBuffer.position() + jB;
        this.f27580d = jPosition;
        long jLimit = jB + byteBuffer.limit();
        this.f27581e = jLimit;
        this.f27582f = jLimit - 10;
        this.f27583g = jPosition;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f27577a.position((int) (this.f27583g - this.f27579c));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return (int) (this.f27583g - this.f27580d);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return (int) (this.f27581e - this.f27583g);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b5) throws CodedOutputStream.OutOfSpaceException {
        long j8 = this.f27583g;
        long j10 = this.f27581e;
        if (j8 >= j10) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f27583g), Long.valueOf(j10), 1));
        }
        this.f27583g = 1 + j8;
        d2.k(b5, j8);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i5, boolean z2) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 0);
        write(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i5, byte[] bArr) throws CodedOutputStream.OutOfSpaceException {
        writeByteArray(i5, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArrayNoTag(byte[] bArr, int i5, int i10) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(i10);
        write(bArr, i5, i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteBuffer(int i5, ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytes(int i5, ByteString byteString) throws IOException {
        writeTag(i5, 2);
        writeBytesNoTag(byteString);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytesNoTag(ByteString byteString) throws IOException {
        writeUInt32NoTag(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32(int i5, int i10) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 5);
        writeFixed32NoTag(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i5) {
        this.f27578b.putInt((int) (this.f27583g - this.f27579c), i5);
        this.f27583g += 4;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i5, long j8) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 1);
        writeFixed64NoTag(j8);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j8) {
        this.f27578b.putLong((int) (this.f27583g - this.f27579c), j8);
        this.f27583g += 8;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i5, int i10) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 0);
        writeInt32NoTag(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i5) throws CodedOutputStream.OutOfSpaceException {
        if (i5 >= 0) {
            writeUInt32NoTag(i5);
        } else {
            writeUInt64NoTag(i5);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(byte[] bArr, int i5, int i10) throws CodedOutputStream.OutOfSpaceException {
        write(bArr, i5, i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i5, MessageLite messageLite) throws IOException {
        writeTag(i5, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
        writeUInt32NoTag(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageSetExtension(int i5, MessageLite messageLite) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i5);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawBytes(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        write(byteBufferDuplicate);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawMessageSetExtension(int i5, ByteString byteString) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i5);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeString(int i5, String str) throws IOException {
        writeTag(i5, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeStringNoTag(String str) throws IOException {
        long j8 = this.f27579c;
        ByteBuffer byteBuffer = this.f27578b;
        long j10 = this.f27583g;
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                int iF = f2.f(str);
                writeUInt32NoTag(iF);
                byteBuffer.position((int) (this.f27583g - j8));
                f2.e(str, byteBuffer);
                this.f27583g += iF;
                return;
            }
            int i5 = ((int) (this.f27583g - j8)) + iComputeUInt32SizeNoTag2;
            byteBuffer.position(i5);
            f2.e(str, byteBuffer);
            int iPosition = byteBuffer.position() - i5;
            writeUInt32NoTag(iPosition);
            this.f27583g += iPosition;
        } catch (e2 e7) {
            this.f27583g = j10;
            byteBuffer.position((int) (j10 - j8));
            inefficientWriteStringNoTag(str, e7);
        } catch (IllegalArgumentException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new CodedOutputStream.OutOfSpaceException(e11);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i5, int i10) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(WireFormat.makeTag(i5, i10));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i5, int i10) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 0);
        writeUInt32NoTag(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i5) throws CodedOutputStream.OutOfSpaceException {
        if (this.f27583g <= this.f27582f) {
            while ((i5 & (-128)) != 0) {
                long j8 = this.f27583g;
                this.f27583g = j8 + 1;
                d2.k((byte) ((i5 & 127) | 128), j8);
                i5 >>>= 7;
            }
            long j10 = this.f27583g;
            this.f27583g = 1 + j10;
            d2.k((byte) i5, j10);
            return;
        }
        while (true) {
            long j11 = this.f27583g;
            long j12 = this.f27581e;
            if (j11 >= j12) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f27583g), Long.valueOf(j12), 1));
            }
            if ((i5 & (-128)) == 0) {
                this.f27583g = 1 + j11;
                d2.k((byte) i5, j11);
                return;
            } else {
                this.f27583g = j11 + 1;
                d2.k((byte) ((i5 & 127) | 128), j11);
                i5 >>>= 7;
            }
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i5, long j8) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 0);
        writeUInt64NoTag(j8);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j8) throws CodedOutputStream.OutOfSpaceException {
        if (this.f27583g <= this.f27582f) {
            while ((j8 & (-128)) != 0) {
                long j10 = this.f27583g;
                this.f27583g = j10 + 1;
                d2.k((byte) ((((int) j8) & 127) | 128), j10);
                j8 >>>= 7;
            }
            long j11 = this.f27583g;
            this.f27583g = 1 + j11;
            d2.k((byte) j8, j11);
            return;
        }
        while (true) {
            long j12 = this.f27583g;
            long j13 = this.f27581e;
            if (j12 >= j13) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f27583g), Long.valueOf(j13), 1));
            }
            if ((j8 & (-128)) == 0) {
                this.f27583g = 1 + j12;
                d2.k((byte) j8, j12);
                return;
            } else {
                this.f27583g = j12 + 1;
                d2.k((byte) ((((int) j8) & 127) | 128), j12);
                j8 >>>= 7;
            }
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i5, byte[] bArr, int i10, int i11) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 2);
        writeByteArrayNoTag(bArr, i10, i11);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i5, MessageLite messageLite, D1 d12) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 2);
        writeMessageNoTag(messageLite, d12);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, D1 d12) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(d12));
        d12.d(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i5, int i10) throws CodedOutputStream.OutOfSpaceException {
        long j8 = this.f27581e;
        if (bArr != null && i5 >= 0 && i10 >= 0 && bArr.length - i10 >= i5) {
            long j10 = i10;
            long j11 = j8 - j10;
            long j12 = this.f27583g;
            if (j11 >= j12) {
                d2.f27664c.d(bArr, i5, j12, j10);
                this.f27583g += j10;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        }
        throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f27583g), Long.valueOf(j8), Integer.valueOf(i10)));
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        ByteBuffer byteBuffer2 = this.f27578b;
        try {
            int iRemaining = byteBuffer.remaining();
            byteBuffer2.position((int) (this.f27583g - this.f27579c));
            byteBuffer2.put(byteBuffer);
            this.f27583g += iRemaining;
        } catch (BufferOverflowException e7) {
            throw new CodedOutputStream.OutOfSpaceException(e7);
        }
    }
}
