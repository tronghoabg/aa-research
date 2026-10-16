package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class E extends CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f27545a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27546b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27547c;

    /* renamed from: d, reason: collision with root package name */
    public int f27548d;

    public E(byte[] bArr, int i5, int i10) {
        super();
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i11 = i5 + i10;
        if ((i5 | i10 | (bArr.length - i11)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i10)));
        }
        this.f27545a = bArr;
        this.f27546b = i5;
        this.f27548d = i5;
        this.f27547c = i11;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void flush() {
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f27548d - this.f27546b;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.f27547c - this.f27548d;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b5) throws CodedOutputStream.OutOfSpaceException {
        try {
            byte[] bArr = this.f27545a;
            int i5 = this.f27548d;
            this.f27548d = i5 + 1;
            bArr[i5] = b5;
        } catch (IndexOutOfBoundsException e7) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27548d), Integer.valueOf(this.f27547c), 1), e7);
        }
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
    public final void writeFixed32NoTag(int i5) throws CodedOutputStream.OutOfSpaceException {
        try {
            byte[] bArr = this.f27545a;
            int i10 = this.f27548d;
            int i11 = i10 + 1;
            this.f27548d = i11;
            bArr[i10] = (byte) (i5 & 255);
            int i12 = i10 + 2;
            this.f27548d = i12;
            bArr[i11] = (byte) ((i5 >> 8) & 255);
            int i13 = i10 + 3;
            this.f27548d = i13;
            bArr[i12] = (byte) ((i5 >> 16) & 255);
            this.f27548d = i10 + 4;
            bArr[i13] = (byte) ((i5 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27548d), Integer.valueOf(this.f27547c), 1), e7);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i5, long j8) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 1);
        writeFixed64NoTag(j8);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j8) throws CodedOutputStream.OutOfSpaceException {
        try {
            byte[] bArr = this.f27545a;
            int i5 = this.f27548d;
            int i10 = i5 + 1;
            this.f27548d = i10;
            bArr[i5] = (byte) (((int) j8) & 255);
            int i11 = i5 + 2;
            this.f27548d = i11;
            bArr[i10] = (byte) (((int) (j8 >> 8)) & 255);
            int i12 = i5 + 3;
            this.f27548d = i12;
            bArr[i11] = (byte) (((int) (j8 >> 16)) & 255);
            int i13 = i5 + 4;
            this.f27548d = i13;
            bArr[i12] = (byte) (((int) (j8 >> 24)) & 255);
            int i14 = i5 + 5;
            this.f27548d = i14;
            bArr[i13] = (byte) (((int) (j8 >> 32)) & 255);
            int i15 = i5 + 6;
            this.f27548d = i15;
            bArr[i14] = (byte) (((int) (j8 >> 40)) & 255);
            int i16 = i5 + 7;
            this.f27548d = i16;
            bArr[i15] = (byte) (((int) (j8 >> 48)) & 255);
            this.f27548d = i5 + 8;
            bArr[i16] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27548d), Integer.valueOf(this.f27547c), 1), e7);
        }
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
        int i5 = this.f27548d;
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            byte[] bArr = this.f27545a;
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                writeUInt32NoTag(f2.f(str));
                this.f27548d = f2.d(this.f27548d, spaceLeft(), str, bArr);
                return;
            }
            int i10 = i5 + iComputeUInt32SizeNoTag2;
            this.f27548d = i10;
            int iD = f2.d(i10, spaceLeft(), str, bArr);
            this.f27548d = i5;
            writeUInt32NoTag((iD - i5) - iComputeUInt32SizeNoTag2);
            this.f27548d = iD;
        } catch (e2 e7) {
            this.f27548d = i5;
            inefficientWriteStringNoTag(str, e7);
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
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
        while (true) {
            int i10 = i5 & (-128);
            byte[] bArr = this.f27545a;
            if (i10 == 0) {
                int i11 = this.f27548d;
                this.f27548d = i11 + 1;
                bArr[i11] = (byte) i5;
                return;
            } else {
                try {
                    int i12 = this.f27548d;
                    this.f27548d = i12 + 1;
                    bArr[i12] = (byte) ((i5 & 127) | 128);
                    i5 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27548d), Integer.valueOf(this.f27547c), 1), e7);
                }
            }
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27548d), Integer.valueOf(this.f27547c), 1), e7);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i5, long j8) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 0);
        writeUInt64NoTag(j8);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j8) throws CodedOutputStream.OutOfSpaceException {
        boolean z2 = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f27545a;
        if (z2 && spaceLeft() >= 10) {
            while ((j8 & (-128)) != 0) {
                int i5 = this.f27548d;
                this.f27548d = i5 + 1;
                d2.l(bArr, i5, (byte) ((((int) j8) & 127) | 128));
                j8 >>>= 7;
            }
            int i10 = this.f27548d;
            this.f27548d = 1 + i10;
            d2.l(bArr, i10, (byte) j8);
            return;
        }
        while ((j8 & (-128)) != 0) {
            try {
                int i11 = this.f27548d;
                this.f27548d = i11 + 1;
                bArr[i11] = (byte) ((((int) j8) & 127) | 128);
                j8 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27548d), Integer.valueOf(this.f27547c), 1), e7);
            }
        }
        int i12 = this.f27548d;
        this.f27548d = i12 + 1;
        bArr[i12] = (byte) j8;
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
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(d12));
        d12.d(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, D1 d12) throws CodedOutputStream.OutOfSpaceException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(d12));
        d12.d(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i5, int i10) throws CodedOutputStream.OutOfSpaceException {
        try {
            System.arraycopy(bArr, i5, this.f27545a, this.f27548d, i10);
            this.f27548d += i10;
        } catch (IndexOutOfBoundsException e7) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27548d), Integer.valueOf(this.f27547c), Integer.valueOf(i10)), e7);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        int iRemaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.f27545a, this.f27548d, iRemaining);
            this.f27548d += iRemaining;
        } catch (IndexOutOfBoundsException e7) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27548d), Integer.valueOf(this.f27547c), Integer.valueOf(iRemaining)), e7);
        }
    }
}
