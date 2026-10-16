package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public final class I extends CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f27574a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f27575b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27576c;

    public I(ByteBuffer byteBuffer) {
        super();
        this.f27574a = byteBuffer;
        this.f27575b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.f27576c = byteBuffer.position();
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f27574a.position(this.f27575b.position());
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f27575b.position() - this.f27576c;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.f27575b.remaining();
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b5) throws CodedOutputStream.OutOfSpaceException {
        try {
            this.f27575b.put(b5);
        } catch (BufferOverflowException e7) {
            throw new CodedOutputStream.OutOfSpaceException(e7);
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
            this.f27575b.putInt(i5);
        } catch (BufferOverflowException e7) {
            throw new CodedOutputStream.OutOfSpaceException(e7);
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
            this.f27575b.putLong(j8);
        } catch (BufferOverflowException e7) {
            throw new CodedOutputStream.OutOfSpaceException(e7);
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
        ByteBuffer byteBuffer = this.f27575b;
        int iPosition = byteBuffer.position();
        try {
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                writeUInt32NoTag(f2.f(str));
                try {
                    f2.e(str, byteBuffer);
                    return;
                } catch (IndexOutOfBoundsException e7) {
                    throw new CodedOutputStream.OutOfSpaceException(e7);
                }
            }
            int iPosition2 = byteBuffer.position() + iComputeUInt32SizeNoTag2;
            byteBuffer.position(iPosition2);
            try {
                f2.e(str, byteBuffer);
                int iPosition3 = byteBuffer.position();
                byteBuffer.position(iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                byteBuffer.position(iPosition3);
            } catch (IndexOutOfBoundsException e10) {
                throw new CodedOutputStream.OutOfSpaceException(e10);
            }
        } catch (e2 e11) {
            byteBuffer.position(iPosition);
            inefficientWriteStringNoTag(str, e11);
        } catch (IllegalArgumentException e12) {
            throw new CodedOutputStream.OutOfSpaceException(e12);
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
            ByteBuffer byteBuffer = this.f27575b;
            if (i10 == 0) {
                byteBuffer.put((byte) i5);
                return;
            }
            try {
                byteBuffer.put((byte) ((i5 & 127) | 128));
                i5 >>>= 7;
            } catch (BufferOverflowException e7) {
                throw new CodedOutputStream.OutOfSpaceException(e7);
            }
            throw new CodedOutputStream.OutOfSpaceException(e7);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i5, long j8) throws CodedOutputStream.OutOfSpaceException {
        writeTag(i5, 0);
        writeUInt64NoTag(j8);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j8) throws CodedOutputStream.OutOfSpaceException {
        while (true) {
            long j10 = (-128) & j8;
            ByteBuffer byteBuffer = this.f27575b;
            if (j10 == 0) {
                byteBuffer.put((byte) j8);
                return;
            }
            try {
                byteBuffer.put((byte) ((((int) j8) & 127) | 128));
                j8 >>>= 7;
            } catch (BufferOverflowException e7) {
                throw new CodedOutputStream.OutOfSpaceException(e7);
            }
            throw new CodedOutputStream.OutOfSpaceException(e7);
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

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i5, int i10) throws CodedOutputStream.OutOfSpaceException {
        try {
            this.f27575b.put(bArr, i5, i10);
        } catch (IndexOutOfBoundsException e7) {
            throw new CodedOutputStream.OutOfSpaceException(e7);
        } catch (BufferOverflowException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
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
    public final void write(ByteBuffer byteBuffer) throws CodedOutputStream.OutOfSpaceException {
        try {
            this.f27575b.put(byteBuffer);
        } catch (BufferOverflowException e7) {
            throw new CodedOutputStream.OutOfSpaceException(e7);
        }
    }
}
