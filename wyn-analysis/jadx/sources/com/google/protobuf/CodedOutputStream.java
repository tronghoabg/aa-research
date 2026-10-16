package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    L wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = d2.f27666e;

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(String str) {
            super(R8.v.f("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super(R8.v.f("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    public static int computeBoolSize(int i5, boolean z2) {
        return computeBoolSizeNoTag(z2) + computeTagSize(i5);
    }

    public static int computeBoolSizeNoTag(boolean z2) {
        return 1;
    }

    public static int computeByteArraySize(int i5, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i5);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i5, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i5);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i5, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i5);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i5, double d3) {
        return computeDoubleSizeNoTag(d3) + computeTagSize(i5);
    }

    public static int computeDoubleSizeNoTag(double d3) {
        return 8;
    }

    public static int computeEnumSize(int i5, int i10) {
        return computeEnumSizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeEnumSizeNoTag(int i5) {
        return computeInt32SizeNoTag(i5);
    }

    public static int computeFixed32Size(int i5, int i10) {
        return computeFixed32SizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeFixed32SizeNoTag(int i5) {
        return 4;
    }

    public static int computeFixed64Size(int i5, long j8) {
        return computeFixed64SizeNoTag(j8) + computeTagSize(i5);
    }

    public static int computeFixed64SizeNoTag(long j8) {
        return 8;
    }

    public static int computeFloatSize(int i5, float f10) {
        return computeFloatSizeNoTag(f10) + computeTagSize(i5);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i5, MessageLite messageLite) {
        return messageLite.getSerializedSize() + (computeTagSize(i5) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i5, int i10) {
        return computeInt32SizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeInt32SizeNoTag(int i5) {
        if (i5 >= 0) {
            return computeUInt32SizeNoTag(i5);
        }
        return 10;
    }

    public static int computeInt64Size(int i5, long j8) {
        return computeInt64SizeNoTag(j8) + computeTagSize(i5);
    }

    public static int computeInt64SizeNoTag(long j8) {
        return computeUInt64SizeNoTag(j8);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i5, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSize(3, lazyFieldLite) + computeUInt32Size(2, i5) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i5, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSizeNoTag(lazyFieldLite) + computeTagSize(i5);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i5) {
        return computeUInt32SizeNoTag(i5) + i5;
    }

    public static int computeMessageSetExtensionSize(int i5, MessageLite messageLite) {
        return computeMessageSize(3, messageLite) + computeUInt32Size(2, i5) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i5, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i5);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i5) {
        if (i5 > 4096) {
            return 4096;
        }
        return i5;
    }

    public static int computeRawMessageSetExtensionSize(int i5, ByteString byteString) {
        return computeBytesSize(3, byteString) + computeUInt32Size(2, i5) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i5) {
        return computeUInt32SizeNoTag(i5);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j8) {
        return computeUInt64SizeNoTag(j8);
    }

    public static int computeSFixed32Size(int i5, int i10) {
        return computeSFixed32SizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeSFixed32SizeNoTag(int i5) {
        return 4;
    }

    public static int computeSFixed64Size(int i5, long j8) {
        return computeSFixed64SizeNoTag(j8) + computeTagSize(i5);
    }

    public static int computeSFixed64SizeNoTag(long j8) {
        return 8;
    }

    public static int computeSInt32Size(int i5, int i10) {
        return computeSInt32SizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeSInt32SizeNoTag(int i5) {
        return computeUInt32SizeNoTag(encodeZigZag32(i5));
    }

    public static int computeSInt64Size(int i5, long j8) {
        return computeSInt64SizeNoTag(j8) + computeTagSize(i5);
    }

    public static int computeSInt64SizeNoTag(long j8) {
        return computeUInt64SizeNoTag(encodeZigZag64(j8));
    }

    public static int computeStringSize(int i5, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i5);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = f2.f(str);
        } catch (e2 unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i5) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i5, 0));
    }

    public static int computeUInt32Size(int i5, int i10) {
        return computeUInt32SizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeUInt32SizeNoTag(int i5) {
        if ((i5 & (-128)) == 0) {
            return 1;
        }
        if ((i5 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i5) == 0) {
            return 3;
        }
        return (i5 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i5, long j8) {
        return computeUInt64SizeNoTag(j8) + computeTagSize(i5);
    }

    public static int computeUInt64SizeNoTag(long j8) {
        int i5;
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if (((-34359738368L) & j8) != 0) {
            j8 >>>= 28;
            i5 = 6;
        } else {
            i5 = 2;
        }
        if (((-2097152) & j8) != 0) {
            i5 += 2;
            j8 >>>= 14;
        }
        return (j8 & (-16384)) != 0 ? i5 + 1 : i5;
    }

    public static int encodeZigZag32(int i5) {
        return (i5 >> 31) ^ (i5 << 1);
    }

    public static long encodeZigZag64(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new I(byteBuffer);
    }

    public static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new J(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, e2 e2Var) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2Var);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new OutOfSpaceException(e7);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte b5) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i5, int i10) throws IOException;

    public abstract void writeBool(int i5, boolean z2) throws IOException;

    public final void writeBoolNoTag(boolean z2) throws IOException {
        write(z2 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i5, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i5, byte[] bArr, int i10, int i11) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i5, int i10) throws IOException;

    public abstract void writeByteBuffer(int i5, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i5, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i5, double d3) throws IOException {
        writeFixed64(i5, Double.doubleToRawLongBits(d3));
    }

    public final void writeDoubleNoTag(double d3) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d3));
    }

    public final void writeEnum(int i5, int i10) throws IOException {
        writeInt32(i5, i10);
    }

    public final void writeEnumNoTag(int i5) throws IOException {
        writeInt32NoTag(i5);
    }

    public abstract void writeFixed32(int i5, int i10) throws IOException;

    public abstract void writeFixed32NoTag(int i5) throws IOException;

    public abstract void writeFixed64(int i5, long j8) throws IOException;

    public abstract void writeFixed64NoTag(long j8) throws IOException;

    public final void writeFloat(int i5, float f10) throws IOException {
        writeFixed32(i5, Float.floatToRawIntBits(f10));
    }

    public final void writeFloatNoTag(float f10) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void writeGroup(int i5, MessageLite messageLite) throws IOException {
        writeTag(i5, 3);
        writeGroupNoTag(messageLite);
        writeTag(i5, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i5, int i10) throws IOException;

    public abstract void writeInt32NoTag(int i5) throws IOException;

    public final void writeInt64(int i5, long j8) throws IOException {
        writeUInt64(i5, j8);
    }

    public final void writeInt64NoTag(long j8) throws IOException {
        writeUInt64NoTag(j8);
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i5, int i10) throws IOException;

    public abstract void writeMessage(int i5, MessageLite messageLite) throws IOException;

    public abstract void writeMessage(int i5, MessageLite messageLite, D1 d12) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite, D1 d12) throws IOException;

    public abstract void writeMessageSetExtension(int i5, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b5) throws IOException {
        write(b5);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i5) throws IOException {
        writeFixed32NoTag(i5);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j8) throws IOException {
        writeFixed64NoTag(j8);
    }

    public abstract void writeRawMessageSetExtension(int i5, ByteString byteString) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i5) throws IOException {
        writeUInt32NoTag(i5);
    }

    @Deprecated
    public final void writeRawVarint64(long j8) throws IOException {
        writeUInt64NoTag(j8);
    }

    public final void writeSFixed32(int i5, int i10) throws IOException {
        writeFixed32(i5, i10);
    }

    public final void writeSFixed32NoTag(int i5) throws IOException {
        writeFixed32NoTag(i5);
    }

    public final void writeSFixed64(int i5, long j8) throws IOException {
        writeFixed64(i5, j8);
    }

    public final void writeSFixed64NoTag(long j8) throws IOException {
        writeFixed64NoTag(j8);
    }

    public final void writeSInt32(int i5, int i10) throws IOException {
        writeUInt32(i5, encodeZigZag32(i10));
    }

    public final void writeSInt32NoTag(int i5) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i5));
    }

    public final void writeSInt64(int i5, long j8) throws IOException {
        writeUInt64(i5, encodeZigZag64(j8));
    }

    public final void writeSInt64NoTag(long j8) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j8));
    }

    public abstract void writeString(int i5, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i5, int i10) throws IOException;

    public abstract void writeUInt32(int i5, int i10) throws IOException;

    public abstract void writeUInt32NoTag(int i5) throws IOException;

    public abstract void writeUInt64(int i5, long j8) throws IOException;

    public abstract void writeUInt64NoTag(long j8) throws IOException;

    private CodedOutputStream() {
    }

    @Deprecated
    public static int computeGroupSize(int i5, MessageLite messageLite, D1 d12) {
        return computeGroupSizeNoTag(messageLite, d12) + (computeTagSize(i5) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite, D1 d12) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(d12);
    }

    public static int computeMessageSize(int i5, MessageLite messageLite, D1 d12) {
        return computeMessageSizeNoTag(messageLite, d12) + computeTagSize(i5);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, D1 d12) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(d12));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i5) {
        return new H(outputStream, i5);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite, D1 d12) throws IOException {
        d12.d(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i5) throws IOException {
        write((byte) i5);
    }

    public final void writeRawBytes(byte[] bArr, int i5, int i10) throws IOException {
        write(bArr, i5, i10);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i5, int i10) {
        return new E(bArr, i5, i10);
    }

    @Deprecated
    public final void writeGroup(int i5, MessageLite messageLite, D1 d12) throws IOException {
        writeTag(i5, 3);
        writeGroupNoTag(messageLite, d12);
        writeTag(i5, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new G(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (d2.f27665d) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i5) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(ByteOutput byteOutput, int i5) {
        if (i5 >= 0) {
            return new F(byteOutput, i5);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
