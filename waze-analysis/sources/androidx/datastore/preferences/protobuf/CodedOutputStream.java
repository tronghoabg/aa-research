package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import androidx.work.WorkInfo;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    Object wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();

    /* compiled from: WazeSource */
    abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        AbstractBufferedEncoder(int i2) {
            super();
            if (i2 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i2, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        final void buffer(byte b2) {
            byte[] bArr = this.buffer;
            int i2 = this.position;
            bArr[i2] = b2;
            this.position = i2 + 1;
            this.totalBytesWritten++;
        }

        final void bufferFixed32NoTag(int i2) {
            int i3 = this.position;
            byte[] bArr = this.buffer;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            bArr[i3 + 3] = (byte) (i2 >> 24);
            this.position = i3 + 4;
            this.totalBytesWritten += 4;
        }

        final void bufferFixed64NoTag(long j2) {
            int i2 = this.position;
            byte[] bArr = this.buffer;
            bArr[i2] = (byte) j2;
            bArr[i2 + 1] = (byte) (j2 >> 8);
            bArr[i2 + 2] = (byte) (j2 >> 16);
            bArr[i2 + 3] = (byte) (j2 >> 24);
            bArr[i2 + 4] = (byte) (j2 >> 32);
            bArr[i2 + 5] = (byte) (j2 >> 40);
            bArr[i2 + 6] = (byte) (j2 >> 48);
            bArr[i2 + 7] = (byte) (j2 >> 56);
            this.position = i2 + 8;
            this.totalBytesWritten += 8;
        }

        final void bufferInt32NoTag(int i2) {
            if (i2 >= 0) {
                bufferUInt32NoTag(i2);
            } else {
                bufferUInt64NoTag(i2);
            }
        }

        final void bufferTag(int i2, int i3) {
            bufferUInt32NoTag(WireFormat.makeTag(i2, i3));
        }

        final void bufferUInt32NoTag(int i2) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j2 = this.position;
                while (true) {
                    int i3 = i2 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    byte[] bArr = this.buffer;
                    if (i3 == 0) {
                        int i4 = this.position;
                        this.position = i4 + 1;
                        UnsafeUtil.putByte(bArr, i4, (byte) i2);
                        this.totalBytesWritten += (int) (this.position - j2);
                        return;
                    }
                    int i5 = this.position;
                    this.position = i5 + 1;
                    UnsafeUtil.putByte(bArr, i5, (byte) (i2 | 128));
                    i2 >>>= 7;
                }
            } else {
                while (true) {
                    int i6 = i2 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    byte[] bArr2 = this.buffer;
                    if (i6 == 0) {
                        int i7 = this.position;
                        this.position = i7 + 1;
                        bArr2[i7] = (byte) i2;
                        this.totalBytesWritten++;
                        return;
                    }
                    int i8 = this.position;
                    this.position = i8 + 1;
                    bArr2[i8] = (byte) (i2 | 128);
                    this.totalBytesWritten++;
                    i2 >>>= 7;
                }
            }
        }

        final void bufferUInt64NoTag(long j2) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j3 = this.position;
                while (true) {
                    long j4 = j2 & (-128);
                    int i2 = (int) j2;
                    byte[] bArr = this.buffer;
                    if (j4 == 0) {
                        int i3 = this.position;
                        this.position = i3 + 1;
                        UnsafeUtil.putByte(bArr, i3, (byte) i2);
                        this.totalBytesWritten += (int) (this.position - j3);
                        return;
                    }
                    int i4 = this.position;
                    this.position = i4 + 1;
                    UnsafeUtil.putByte(bArr, i4, (byte) (i2 | 128));
                    j2 >>>= 7;
                }
            } else {
                while (true) {
                    long j5 = j2 & (-128);
                    int i5 = (int) j2;
                    byte[] bArr2 = this.buffer;
                    if (j5 == 0) {
                        int i6 = this.position;
                        this.position = i6 + 1;
                        bArr2[i6] = (byte) i5;
                        this.totalBytesWritten++;
                        return;
                    }
                    int i7 = this.position;
                    this.position = i7 + 1;
                    bArr2[i7] = (byte) (i5 | 128);
                    this.totalBytesWritten++;
                    j2 >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* compiled from: WazeSource */
    final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        HeapNioEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder, androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.byteBuffer, this.initialPosition + getTotalBytesWritten());
        }
    }

    private CodedOutputStream() {
    }

    public static int computeBoolSize(int i2, boolean z) {
        return computeTagSize(i2) + 1;
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeByteArraySize(int i2, byte[] bArr) {
        return computeTagSize(i2) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i2, ByteBuffer byteBuffer) {
        return computeTagSize(i2) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i2, ByteString byteString) {
        return computeTagSize(i2) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i2, double d2) {
        return computeTagSize(i2) + 8;
    }

    public static int computeDoubleSizeNoTag(double d2) {
        return 8;
    }

    public static int computeEnumSize(int i2, int i3) {
        return computeTagSize(i2) + computeEnumSizeNoTag(i3);
    }

    public static int computeEnumSizeNoTag(int i2) {
        return computeInt32SizeNoTag(i2);
    }

    public static int computeFixed32Size(int i2, int i3) {
        return computeTagSize(i2) + 4;
    }

    public static int computeFixed32SizeNoTag(int i2) {
        return 4;
    }

    public static int computeFixed64Size(int i2, long j2) {
        return computeTagSize(i2) + 8;
    }

    public static int computeFixed64SizeNoTag(long j2) {
        return 8;
    }

    public static int computeFloatSize(int i2, float f2) {
        return computeTagSize(i2) + 4;
    }

    public static int computeFloatSizeNoTag(float f2) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i2, MessageLite messageLite) {
        int iComputeTagSize = computeTagSize(i2);
        return iComputeTagSize + iComputeTagSize + messageLite.getSerializedSize();
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i2, int i3) {
        return computeTagSize(i2) + computeInt32SizeNoTag(i3);
    }

    public static int computeInt32SizeNoTag(int i2) {
        return computeUInt64SizeNoTag(i2);
    }

    public static int computeInt64Size(int i2, long j2) {
        return computeTagSize(i2) + computeInt64SizeNoTag(j2);
    }

    public static int computeInt64SizeNoTag(long j2) {
        return computeUInt64SizeNoTag(j2);
    }

    @Deprecated
    public static int computeLazyFieldMessageSetExtensionSize(int i2, LazyFieldLite lazyFieldLite) {
        return lazyFieldLite.computeMessageSetExtensionSize(i2);
    }

    @Deprecated
    public static int computeLazyFieldSize(int i2, LazyFieldLite lazyFieldLite) {
        return lazyFieldLite.computeSize(i2);
    }

    @Deprecated
    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return lazyFieldLite.computeSizeNoTag();
    }

    static int computeLengthDelimitedFieldSize(int i2) {
        return computeUInt32SizeNoTag(i2) + i2;
    }

    public static int computeMessageSetExtensionSize(int i2, MessageLite messageLite) {
        int iComputeTagSize = computeTagSize(1);
        return iComputeTagSize + iComputeTagSize + computeUInt32Size(2, i2) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i2, MessageLite messageLite) {
        return computeTagSize(i2) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    static int computePreferredBufferSize(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int computeRawMessageSetExtensionSize(int i2, ByteString byteString) {
        int iComputeTagSize = computeTagSize(1);
        return iComputeTagSize + iComputeTagSize + computeUInt32Size(2, i2) + computeBytesSize(3, byteString);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i2) {
        return computeUInt32SizeNoTag(i2);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j2) {
        return computeUInt64SizeNoTag(j2);
    }

    public static int computeSFixed32Size(int i2, int i3) {
        return computeTagSize(i2) + 4;
    }

    public static int computeSFixed32SizeNoTag(int i2) {
        return 4;
    }

    public static int computeSFixed64Size(int i2, long j2) {
        return computeTagSize(i2) + 8;
    }

    public static int computeSFixed64SizeNoTag(long j2) {
        return 8;
    }

    public static int computeSInt32Size(int i2, int i3) {
        return computeTagSize(i2) + computeSInt32SizeNoTag(i3);
    }

    public static int computeSInt32SizeNoTag(int i2) {
        return computeUInt32SizeNoTag(encodeZigZag32(i2));
    }

    public static int computeSInt64Size(int i2, long j2) {
        return computeTagSize(i2) + computeSInt64SizeNoTag(j2);
    }

    public static int computeSInt64SizeNoTag(long j2) {
        return computeUInt64SizeNoTag(encodeZigZag64(j2));
    }

    public static int computeStringSize(int i2, String str) {
        return computeTagSize(i2) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Utf8.encodedLength(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i2) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i2, 0));
    }

    public static int computeUInt32Size(int i2, int i3) {
        return computeTagSize(i2) + computeUInt32SizeNoTag(i3);
    }

    public static int computeUInt32SizeNoTag(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int computeUInt64Size(int i2, long j2) {
        return computeTagSize(i2) + computeUInt64SizeNoTag(j2);
    }

    public static int computeUInt64SizeNoTag(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int encodeZigZag32(int i2) {
        return (i2 >> 31) ^ (i2 + i2);
    }

    public static long encodeZigZag64(long j2) {
        return (j2 >> 63) ^ (j2 + j2);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new HeapNioEncoder(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return UnsafeDirectNioEncoder.isSupported() ? newUnsafeInstance(byteBuffer) : newSafeInstance(byteBuffer);
    }

    static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new SafeDirectNioEncoder(byteBuffer);
    }

    static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new UnsafeDirectNioEncoder(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush();

    public abstract int getTotalBytesWritten();

    final void inefficientWriteStringNoTag(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws OutOfSpaceException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            int length = bytes.length;
            writeUInt32NoTag(length);
            writeLazy(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte b2);

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer);

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i2, int i3);

    public abstract void writeBool(int i2, boolean z);

    public final void writeBoolNoTag(boolean z) {
        write(z ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i2, byte[] bArr);

    public abstract void writeByteArray(int i2, byte[] bArr, int i3, int i4);

    public final void writeByteArrayNoTag(byte[] bArr) {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    abstract void writeByteArrayNoTag(byte[] bArr, int i2, int i3);

    public abstract void writeByteBuffer(int i2, ByteBuffer byteBuffer);

    public abstract void writeBytes(int i2, ByteString byteString);

    public abstract void writeBytesNoTag(ByteString byteString);

    public final void writeDouble(int i2, double d2) {
        writeFixed64(i2, Double.doubleToRawLongBits(d2));
    }

    public final void writeDoubleNoTag(double d2) {
        writeFixed64NoTag(Double.doubleToRawLongBits(d2));
    }

    public final void writeEnum(int i2, int i3) {
        writeInt32(i2, i3);
    }

    public final void writeEnumNoTag(int i2) {
        writeInt32NoTag(i2);
    }

    public abstract void writeFixed32(int i2, int i3);

    public abstract void writeFixed32NoTag(int i2);

    public abstract void writeFixed64(int i2, long j2);

    public abstract void writeFixed64NoTag(long j2);

    public final void writeFloat(int i2, float f2) {
        writeFixed32(i2, Float.floatToRawIntBits(f2));
    }

    public final void writeFloatNoTag(float f2) {
        writeFixed32NoTag(Float.floatToRawIntBits(f2));
    }

    @Deprecated
    public final void writeGroup(int i2, MessageLite messageLite) {
        writeTag(i2, 3);
        writeGroupNoTag(messageLite);
        writeTag(i2, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i2, int i3);

    public abstract void writeInt32NoTag(int i2);

    public final void writeInt64(int i2, long j2) {
        writeUInt64(i2, j2);
    }

    public final void writeInt64NoTag(long j2) {
        writeUInt64NoTag(j2);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer);

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i2, int i3);

    public abstract void writeMessage(int i2, MessageLite messageLite);

    public abstract void writeMessageNoTag(MessageLite messageLite);

    public abstract void writeMessageSetExtension(int i2, MessageLite messageLite);

    public final void writeRawByte(int i2) {
        write((byte) i2);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer);

    public final void writeRawBytes(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i2) {
        writeFixed32NoTag(i2);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j2) {
        writeFixed64NoTag(j2);
    }

    public abstract void writeRawMessageSetExtension(int i2, ByteString byteString);

    @Deprecated
    public final void writeRawVarint32(int i2) {
        writeUInt32NoTag(i2);
    }

    @Deprecated
    public final void writeRawVarint64(long j2) {
        writeUInt64NoTag(j2);
    }

    public final void writeSFixed32(int i2, int i3) {
        writeFixed32(i2, i3);
    }

    public final void writeSFixed32NoTag(int i2) {
        writeFixed32NoTag(i2);
    }

    public final void writeSFixed64(int i2, long j2) {
        writeFixed64(i2, j2);
    }

    public final void writeSFixed64NoTag(long j2) {
        writeFixed64NoTag(j2);
    }

    public final void writeSInt32(int i2, int i3) {
        writeUInt32(i2, encodeZigZag32(i3));
    }

    public final void writeSInt32NoTag(int i2) {
        writeUInt32NoTag(encodeZigZag32(i2));
    }

    public final void writeSInt64(int i2, long j2) {
        writeUInt64(i2, encodeZigZag64(j2));
    }

    public final void writeSInt64NoTag(long j2) {
        writeUInt64NoTag(encodeZigZag64(j2));
    }

    public abstract void writeString(int i2, String str);

    public abstract void writeStringNoTag(String str);

    public abstract void writeTag(int i2, int i3);

    public abstract void writeUInt32(int i2, int i3);

    public abstract void writeUInt32NoTag(int i2);

    public abstract void writeUInt64(int i2, long j2);

    public abstract void writeUInt64NoTag(long j2);

    /* compiled from: WazeSource */
    class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        ArrayEncoder(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i4 = i2 + i3;
            int length = bArr.length;
            if ((i2 | i3 | (length - i4)) < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            this.buffer = bArr;
            this.offset = i2;
            this.position = i2;
            this.limit = i4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(this.position, this.limit, iRemaining, (Throwable) e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i2, boolean z) throws OutOfSpaceException {
            writeTag(i2, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i2, byte[] bArr, int i3, int i4) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeByteArrayNoTag(bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i2, ByteString byteString) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i2, int i3) throws OutOfSpaceException {
            writeTag(i2, 5);
            writeFixed32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i2) throws OutOfSpaceException {
            int i3 = this.position;
            try {
                byte[] bArr = this.buffer;
                bArr[i3] = (byte) i2;
                bArr[i3 + 1] = (byte) (i2 >> 8);
                bArr[i3 + 2] = (byte) (i2 >> 16);
                bArr[i3 + 3] = (byte) (i2 >> 24);
                this.position = i3 + 4;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(i3, this.limit, 4, (Throwable) e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i2, long j2) throws OutOfSpaceException {
            writeTag(i2, 1);
            writeFixed64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j2) throws OutOfSpaceException {
            int i2 = this.position;
            try {
                byte[] bArr = this.buffer;
                bArr[i2] = (byte) j2;
                bArr[i2 + 1] = (byte) (j2 >> 8);
                bArr[i2 + 2] = (byte) (j2 >> 16);
                bArr[i2 + 3] = (byte) (j2 >> 24);
                bArr[i2 + 4] = (byte) (j2 >> 32);
                bArr[i2 + 5] = (byte) (j2 >> 40);
                bArr[i2 + 6] = (byte) (j2 >> 48);
                bArr[i2 + 7] = (byte) (j2 >> 56);
                this.position = i2 + 8;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(i2, this.limit, 8, (Throwable) e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i2, int i3) throws OutOfSpaceException {
            writeTag(i2, 0);
            writeInt32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i2) throws OutOfSpaceException {
            if (i2 >= 0) {
                writeUInt32NoTag(i2);
            } else {
                writeUInt64NoTag(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i2, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i2, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i2, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i2, String str) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws OutOfSpaceException {
            int i2 = this.position;
            try {
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    this.position = Utf8.encode(str, this.buffer, this.position, spaceLeft());
                    return;
                }
                int i3 = i2 + iComputeUInt32SizeNoTag2;
                this.position = i3;
                int iEncode = Utf8.encode(str, this.buffer, i3, spaceLeft());
                this.position = i2;
                writeUInt32NoTag((iEncode - i2) - iComputeUInt32SizeNoTag2);
                this.position = iEncode;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.position = i2;
                inefficientWriteStringNoTag(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i2, int i3) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i2, i3));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i2, int i3) throws OutOfSpaceException {
            writeTag(i2, 0);
            writeUInt32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i2) throws OutOfSpaceException {
            int i3;
            int i4 = this.position;
            while (true) {
                int i5 = i2 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                byte[] bArr = this.buffer;
                if (i5 == 0) {
                    i3 = i4 + 1;
                    bArr[i4] = (byte) i2;
                    this.position = i3;
                    return;
                } else {
                    i3 = i4 + 1;
                    try {
                        bArr[i4] = (byte) (i2 | 128);
                        i2 >>>= 7;
                        i4 = i3;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new OutOfSpaceException(i3, this.limit, 1, (Throwable) e2);
                    }
                }
                throw new OutOfSpaceException(i3, this.limit, 1, (Throwable) e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i2, long j2) throws OutOfSpaceException {
            writeTag(i2, 0);
            writeUInt64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j2) throws OutOfSpaceException {
            byte[] bArr;
            int i2;
            byte[] bArr2;
            int i3 = this.position;
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS || spaceLeft() < 10) {
                while (true) {
                    long j3 = j2 & (-128);
                    bArr = this.buffer;
                    if (j3 == 0) {
                        break;
                    }
                    i2 = i3 + 1;
                    try {
                        bArr[i3] = (byte) (((int) j2) | 128);
                        j2 >>>= 7;
                        i3 = i2;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new OutOfSpaceException(i2, this.limit, 1, (Throwable) e2);
                    }
                    throw new OutOfSpaceException(i2, this.limit, 1, (Throwable) e2);
                }
                i2 = i3 + 1;
                bArr[i3] = (byte) j2;
            } else {
                while (true) {
                    long j4 = j2 & (-128);
                    bArr2 = this.buffer;
                    if (j4 == 0) {
                        break;
                    }
                    UnsafeUtil.putByte(bArr2, i3, (byte) (((int) j2) | 128));
                    j2 >>>= 7;
                    i3++;
                }
                i2 = i3 + 1;
                UnsafeUtil.putByte(bArr2, i3, (byte) j2);
            }
            this.position = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            write(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i2, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i2, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte b2) throws OutOfSpaceException {
            int i2 = this.position;
            try {
                int i3 = i2 + 1;
                try {
                    this.buffer[i2] = b2;
                    this.position = i3;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i2 = i3;
                    throw new OutOfSpaceException(i2, this.limit, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i2, this.buffer, this.position, i3);
                this.position += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(this.position, this.limit, i3, (Throwable) e2);
            }
        }
    }

    /* compiled from: WazeSource */
    final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        OutputStreamEncoder(OutputStream outputStream, int i2) {
            super(i2);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i2) throws IOException {
            if (this.limit - this.position < i2) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i2 = this.limit;
            int i3 = this.position;
            int i4 = i2 - i3;
            if (i4 >= iRemaining) {
                byteBuffer.get(this.buffer, i3, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            byteBuffer.get(this.buffer, i3, i4);
            this.position = this.limit;
            this.totalBytesWritten += i4;
            doFlush();
            while (true) {
                iRemaining -= i4;
                int i5 = this.limit;
                if (iRemaining <= i5) {
                    byteBuffer.get(this.buffer, 0, iRemaining);
                    this.position = iRemaining;
                    this.totalBytesWritten += iRemaining;
                    return;
                } else {
                    byteBuffer.get(this.buffer, 0, i5);
                    this.out.write(this.buffer, 0, this.limit);
                    i4 = this.limit;
                    this.totalBytesWritten += i4;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i2, 0);
            buffer(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i4) throws IOException {
            writeTag(i2, 2);
            writeByteArrayNoTag(bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException {
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException {
            writeTag(i2, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i2, ByteString byteString) throws IOException {
            writeTag(i2, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i2, 5);
            bufferFixed32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i2, 1);
            bufferFixed64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferInt32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) throws IOException {
            if (i2 >= 0) {
                writeUInt32NoTag(i2);
            } else {
                writeUInt64NoTag(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite) throws IOException {
            writeTag(i2, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws IOException {
            writeTag(i2, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iEncodedLength;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(length);
                int i2 = iComputeUInt32SizeNoTag + length;
                int i3 = this.limit;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int iEncode = Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i2 > i3 - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                int i4 = this.position;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i5 = i4 + iComputeUInt32SizeNoTag2;
                        this.position = i5;
                        int iEncode2 = Utf8.encode(str, this.buffer, i5, this.limit - i5);
                        this.position = i4;
                        iEncodedLength = (iEncode2 - i4) - iComputeUInt32SizeNoTag2;
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = iEncode2;
                    } else {
                        iEncodedLength = Utf8.encodedLength(str);
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    }
                    this.totalBytesWritten += iEncodedLength;
                } catch (Utf8.UnpairedSurrogateException e2) {
                    this.totalBytesWritten -= this.position - i4;
                    this.position = i4;
                    throw e2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new OutOfSpaceException(e3);
                }
            } catch (Utf8.UnpairedSurrogateException e4) {
                inefficientWriteStringNoTag(str, e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i2, i3));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferUInt32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferUInt64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) throws IOException {
            write(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) throws IOException {
            writeByteArray(i2, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b2) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.limit;
            int i5 = this.position;
            int i6 = i4 - i5;
            if (i6 >= i3) {
                System.arraycopy(bArr, i2, this.buffer, i5, i3);
                this.position += i3;
                this.totalBytesWritten += i3;
                return;
            }
            System.arraycopy(bArr, i2, this.buffer, i5, i6);
            int i7 = i2 + i6;
            this.position = this.limit;
            this.totalBytesWritten += i6;
            doFlush();
            int i8 = i3 - i6;
            if (i8 <= this.limit) {
                System.arraycopy(bArr, i7, this.buffer, 0, i8);
                this.position = i8;
            } else {
                this.out.write(bArr, i7, i8);
            }
            this.totalBytesWritten += i8;
        }
    }

    /* compiled from: WazeSource */
    final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        SafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) throws OutOfSpaceException {
            try {
                Utf8.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, this.buffer.position());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b2) throws OutOfSpaceException {
            try {
                this.buffer.put(b2);
            } catch (BufferOverflowException e2) {
                ByteBuffer byteBuffer = this.buffer;
                throw new OutOfSpaceException(byteBuffer.position(), byteBuffer.limit(), 1, (Throwable) e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z) throws OutOfSpaceException {
            writeTag(i2, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i4) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeByteArrayNoTag(bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i2, ByteString byteString) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws OutOfSpaceException {
            writeTag(i2, 5);
            writeFixed32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) throws OutOfSpaceException {
            try {
                this.buffer.putInt(i2);
            } catch (BufferOverflowException e2) {
                ByteBuffer byteBuffer = this.buffer;
                throw new OutOfSpaceException(byteBuffer.position(), byteBuffer.limit(), 4, (Throwable) e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws OutOfSpaceException {
            writeTag(i2, 1);
            writeFixed64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) throws OutOfSpaceException {
            try {
                this.buffer.putLong(j2);
            } catch (BufferOverflowException e2) {
                ByteBuffer byteBuffer = this.buffer;
                throw new OutOfSpaceException(byteBuffer.position(), byteBuffer.limit(), 8, (Throwable) e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws OutOfSpaceException {
            writeTag(i2, 0);
            writeInt32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) throws OutOfSpaceException {
            if (i2 >= 0) {
                writeUInt32NoTag(i2);
            } else {
                writeUInt64NoTag(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    encode(str);
                    return;
                }
                int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                Java8Compatibility.position(this.buffer, iPosition2);
                encode(str);
                int iPosition3 = this.buffer.position();
                Java8Compatibility.position(this.buffer, iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                Java8Compatibility.position(this.buffer, iPosition3);
            } catch (Utf8.UnpairedSurrogateException e2) {
                Java8Compatibility.position(this.buffer, iPosition);
                inefficientWriteStringNoTag(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i2, i3));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws OutOfSpaceException {
            writeTag(i2, 0);
            writeUInt32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) throws OutOfSpaceException {
            while (true) {
                int i3 = i2 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                ByteBuffer byteBuffer = this.buffer;
                if (i3 == 0) {
                    byteBuffer.put((byte) i2);
                    return;
                }
                try {
                    byteBuffer.put((byte) (i2 | 128));
                    i2 >>>= 7;
                } catch (BufferOverflowException e2) {
                    throw new OutOfSpaceException(e2);
                }
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws OutOfSpaceException {
            writeTag(i2, 0);
            writeUInt64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) throws OutOfSpaceException {
            while (true) {
                long j3 = (-128) & j2;
                ByteBuffer byteBuffer = this.buffer;
                if (j3 == 0) {
                    byteBuffer.put((byte) j2);
                    return;
                }
                try {
                    byteBuffer.put((byte) (((int) j2) | 128));
                    j2 >>>= 7;
                } catch (BufferOverflowException e2) {
                    throw new OutOfSpaceException(e2);
                }
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            write(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i2, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            try {
                this.buffer.put(bArr, i2, i3);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            } catch (BufferOverflowException e3) {
                throw new OutOfSpaceException(e3);
            }
        }
    }

    /* compiled from: WazeSource */
    final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            long jPosition = byteBuffer.position() + jAddressOffset;
            this.initialPosition = jPosition;
            long jLimit = jAddressOffset + byteBuffer.limit();
            this.limit = jLimit;
            this.oneVarintLimit = jLimit - 10;
            this.position = jPosition;
        }

        private int bufferPos(long j2) {
            return (int) (j2 - this.address);
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long j2) {
            Java8Compatibility.position(this.buffer, bufferPos(j2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, bufferPos(this.position));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = this.limit;
                long j3 = i3;
                long j4 = this.position;
                if (j2 - j3 >= j4) {
                    UnsafeUtil.copyMemory(bArr, i2, j4, j3);
                    this.position += j3;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(this.position, this.limit, i3);
            }
            throw new NullPointerException("value");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z) throws OutOfSpaceException {
            writeTag(i2, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i4) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeByteArrayNoTag(bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i2, ByteString byteString) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws OutOfSpaceException {
            writeTag(i2, 5);
            writeFixed32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) throws OutOfSpaceException {
            try {
                this.buffer.putInt(bufferPos(this.position), i2);
                this.position += 4;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(this.position, this.limit, 4, e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws OutOfSpaceException {
            writeTag(i2, 1);
            writeFixed64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) throws OutOfSpaceException {
            try {
                this.buffer.putLong(bufferPos(this.position), j2);
                this.position += 8;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(this.position, this.limit, 8, e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws OutOfSpaceException {
            writeTag(i2, 0);
            writeInt32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) throws OutOfSpaceException {
            if (i2 >= 0) {
                writeUInt32NoTag(i2);
            } else {
                writeUInt64NoTag(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            long j2 = this.position;
            try {
                int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = Utf8.encodedLength(str);
                    writeUInt32NoTag(iEncodedLength);
                    repositionBuffer(this.position);
                    Utf8.encodeUtf8(str, this.buffer);
                    this.position += iEncodedLength;
                    return;
                }
                int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                Java8Compatibility.position(this.buffer, iBufferPos);
                Utf8.encodeUtf8(str, this.buffer);
                int iPosition = this.buffer.position() - iBufferPos;
                writeUInt32NoTag(iPosition);
                this.position += iPosition;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.position = j2;
                repositionBuffer(j2);
                inefficientWriteStringNoTag(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new OutOfSpaceException(e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i2, i3));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws OutOfSpaceException {
            writeTag(i2, 0);
            writeUInt32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) throws OutOfSpaceException {
            long j2;
            long j3 = this.position;
            if (j3 > this.oneVarintLimit) {
                while (j3 < this.limit) {
                    j2 = j3 + 1;
                    if ((i2 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                        UnsafeUtil.putByte(j3, (byte) i2);
                    } else {
                        UnsafeUtil.putByte(j3, (byte) (i2 | 128));
                        i2 >>>= 7;
                        j3 = j2;
                    }
                }
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j3), Long.valueOf(this.limit), 1));
            }
            while (true) {
                j2 = j3 + 1;
                if ((i2 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                    break;
                }
                UnsafeUtil.putByte(j3, (byte) (i2 | 128));
                i2 >>>= 7;
                j3 = j2;
            }
            UnsafeUtil.putByte(j3, (byte) i2);
            this.position = j2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws OutOfSpaceException {
            writeTag(i2, 0);
            writeUInt64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) throws OutOfSpaceException {
            long j3;
            int i2;
            long j4 = this.position;
            if (j4 <= this.oneVarintLimit) {
                long j5 = j4;
                long j6 = j2;
                while (true) {
                    j3 = j5 + 1;
                    i2 = (int) j6;
                    if ((j6 & (-128)) == 0) {
                        break;
                    }
                    UnsafeUtil.putByte(j5, (byte) (i2 | 128));
                    j6 >>>= 7;
                    j5 = j3;
                }
                UnsafeUtil.putByte(j5, (byte) i2);
            } else {
                long j7 = j4;
                long j8 = j2;
                while (true) {
                    long j9 = this.limit;
                    if (j7 >= j9) {
                        throw new OutOfSpaceException(j7, j9, 1);
                    }
                    int i3 = (int) j8;
                    long j10 = j7 + 1;
                    if ((j8 & (-128)) == 0) {
                        UnsafeUtil.putByte(j7, (byte) i3);
                        j3 = j10;
                        break;
                    } else {
                        UnsafeUtil.putByte(j7, (byte) (i3 | 128));
                        j8 >>>= 7;
                        j7 = j10;
                    }
                }
            }
            this.position = j3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            write(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i2, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                int iRemaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += iRemaining;
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b2) throws OutOfSpaceException {
            long j2 = this.position;
            long j3 = this.limit;
            if (j2 < j3) {
                this.position = 1 + j2;
                UnsafeUtil.putByte(j2, b2);
                return;
            }
            throw new OutOfSpaceException(j2, j3, 1);
        }
    }

    public final void writeRawByte(byte b2) {
        write(b2);
    }

    public final void writeRawBytes(ByteString byteString) {
        byteString.writeTo(this);
    }

    /* compiled from: WazeSource */
    final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        ByteOutputEncoder(ByteOutput byteOutput, int i2) {
            super(i2);
            if (byteOutput == null) {
                throw new NullPointerException("out");
            }
            this.out = byteOutput;
        }

        private void doFlush() {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i2) {
            if (this.limit - this.position < i2) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            flush();
            ByteOutput byteOutput = this.out;
            int iRemaining = byteBuffer.remaining();
            byteOutput.write(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z) {
            flushIfNotAvailable(11);
            bufferTag(i2, 0);
            buffer(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i4) {
            writeTag(i2, 2);
            writeByteArrayNoTag(bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) {
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) {
            writeTag(i2, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i2, ByteString byteString) {
            writeTag(i2, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) {
            flushIfNotAvailable(14);
            bufferTag(i2, 5);
            bufferFixed32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) {
            flushIfNotAvailable(18);
            bufferTag(i2, 1);
            bufferFixed64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferInt32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) {
            if (i2 >= 0) {
                writeUInt32NoTag(i2);
            } else {
                writeUInt64NoTag(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            flush();
            ByteOutput byteOutput = this.out;
            int iRemaining = byteBuffer.remaining();
            byteOutput.writeLazy(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i2, MessageLite messageLite) {
            writeTag(i2, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws OutOfSpaceException {
            writeTag(i2, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = computeUInt32SizeNoTag(length);
            int i2 = iComputeUInt32SizeNoTag + length;
            int i3 = this.limit;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iEncode = Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i2 > i3 - this.position) {
                doFlush();
            }
            int i4 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = Utf8.encodedLength(str);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    this.totalBytesWritten += iEncodedLength;
                    return;
                }
                int i5 = i4 + iComputeUInt32SizeNoTag2;
                this.position = i5;
                int iEncode2 = Utf8.encode(str, this.buffer, i5, this.limit - i5);
                this.position = i4;
                int i6 = (iEncode2 - i4) - iComputeUInt32SizeNoTag2;
                bufferUInt32NoTag(i6);
                this.position = iEncode2;
                this.totalBytesWritten += i6;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.totalBytesWritten -= this.position - i4;
                this.position = i4;
                inefficientWriteStringNoTag(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) {
            writeUInt32NoTag(WireFormat.makeTag(i2, i3));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferUInt32NoTag(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferUInt64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) {
            writeByteArray(i2, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b2) {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i2, int i3) {
            flush();
            this.out.writeLazy(bArr, i2, i3);
            this.totalBytesWritten += i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i2, int i3) {
            flush();
            this.out.write(bArr, i2, i3);
            this.totalBytesWritten += i3;
        }
    }

    public final void writeRawBytes(byte[] bArr, int i2, int i3) {
        write(bArr, i2, i3);
    }

    /* compiled from: WazeSource */
    public class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException(long j2, long j3, int i2, Throwable th) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2)), th);
        }

        OutOfSpaceException(int i2, int i3, int i4) {
            this(i2, i3, i4, (Throwable) null);
        }

        OutOfSpaceException(int i2, int i3, int i4, Throwable th) {
            this(i2, i3, i4, th);
        }

        OutOfSpaceException(long j2, long j3, int i2) {
            this(j2, j3, i2, (Throwable) null);
        }

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)));
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
        }

        OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i2) {
        return new OutputStreamEncoder(outputStream, i2);
    }

    static CodedOutputStream newInstance(ByteOutput byteOutput, int i2) {
        if (i2 >= 0) {
            return new ByteOutputEncoder(byteOutput, i2);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i2) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i2, int i3) {
        return new ArrayEncoder(bArr, i2, i3);
    }
}
