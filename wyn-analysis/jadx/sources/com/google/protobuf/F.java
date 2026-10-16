package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class F extends D {

    /* renamed from: e, reason: collision with root package name */
    public final ByteOutput f27553e;

    public F(ByteOutput byteOutput, int i5) {
        super(i5);
        if (byteOutput == null) {
            throw new NullPointerException("out");
        }
        this.f27553e = byteOutput;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() throws IOException {
        if (this.f27538c > 0) {
            g();
        }
    }

    public final void g() throws IOException {
        this.f27553e.write(this.f27536a, 0, this.f27538c);
        this.f27538c = 0;
    }

    public final void h(int i5) throws IOException {
        if (this.f27537b - this.f27538c < i5) {
            g();
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b5) throws IOException {
        if (this.f27538c == this.f27537b) {
            g();
        }
        a(b5);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i5, boolean z2) throws IOException {
        h(11);
        d(i5, 0);
        a(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i5, byte[] bArr) throws IOException {
        writeByteArray(i5, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArrayNoTag(byte[] bArr, int i5, int i10) throws IOException {
        writeUInt32NoTag(i10);
        write(bArr, i5, i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteBuffer(int i5, ByteBuffer byteBuffer) throws IOException {
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
    public final void writeFixed32(int i5, int i10) throws IOException {
        h(14);
        d(i5, 5);
        b(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i5) throws IOException {
        h(4);
        b(i5);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i5, long j8) throws IOException {
        h(18);
        d(i5, 1);
        c(j8);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j8) throws IOException {
        h(8);
        c(j8);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i5, int i10) throws IOException {
        h(20);
        d(i5, 0);
        if (i10 >= 0) {
            e(i10);
        } else {
            f(i10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i5) throws IOException {
        if (i5 >= 0) {
            writeUInt32NoTag(i5);
        } else {
            writeUInt64NoTag(i5);
        }
    }

    @Override // com.google.protobuf.D, com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(byte[] bArr, int i5, int i10) throws IOException {
        flush();
        this.f27553e.writeLazy(bArr, i5, i10);
        this.f27539d += i10;
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
    public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
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
        int length = str.length() * 3;
        int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
        int i5 = iComputeUInt32SizeNoTag + length;
        int i10 = this.f27537b;
        if (i5 > i10) {
            byte[] bArr = new byte[length];
            int iD = f2.d(0, length, str, bArr);
            writeUInt32NoTag(iD);
            writeLazy(bArr, 0, iD);
            return;
        }
        if (i5 > i10 - this.f27538c) {
            g();
        }
        int i11 = this.f27538c;
        try {
            int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            byte[] bArr2 = this.f27536a;
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                int iF = f2.f(str);
                e(iF);
                this.f27538c = f2.d(this.f27538c, iF, str, bArr2);
                this.f27539d += iF;
                return;
            }
            int i12 = i11 + iComputeUInt32SizeNoTag2;
            this.f27538c = i12;
            int iD2 = f2.d(i12, i10 - i12, str, bArr2);
            this.f27538c = i11;
            int i13 = (iD2 - i11) - iComputeUInt32SizeNoTag2;
            e(i13);
            this.f27538c = iD2;
            this.f27539d += i13;
        } catch (e2 e7) {
            this.f27539d -= this.f27538c - i11;
            this.f27538c = i11;
            inefficientWriteStringNoTag(str, e7);
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i5, int i10) throws IOException {
        writeUInt32NoTag(WireFormat.makeTag(i5, i10));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i5, int i10) throws IOException {
        h(20);
        d(i5, 0);
        e(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i5) throws IOException {
        h(5);
        e(i5);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i5, long j8) throws IOException {
        h(20);
        d(i5, 0);
        f(j8);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j8) throws IOException {
        h(10);
        f(j8);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i5, byte[] bArr, int i10, int i11) throws IOException {
        writeTag(i5, 2);
        writeByteArrayNoTag(bArr, i10, i11);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i5, MessageLite messageLite, D1 d12) throws IOException {
        writeTag(i5, 2);
        writeMessageNoTag(messageLite, d12);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, D1 d12) throws IOException {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(d12));
        d12.d(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i5, int i10) throws IOException {
        flush();
        this.f27553e.write(bArr, i5, i10);
        this.f27539d += i10;
    }

    @Override // com.google.protobuf.D, com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
        flush();
        int iRemaining = byteBuffer.remaining();
        this.f27553e.writeLazy(byteBuffer);
        this.f27539d += iRemaining;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) throws IOException {
        flush();
        int iRemaining = byteBuffer.remaining();
        this.f27553e.write(byteBuffer);
        this.f27539d += iRemaining;
    }
}
