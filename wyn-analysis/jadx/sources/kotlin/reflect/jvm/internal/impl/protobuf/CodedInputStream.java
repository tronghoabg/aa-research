package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes5.dex */
public final class CodedInputStream {
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    public interface RefillCallback {
        void onRefill();
    }

    private CodedInputStream(InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = f.API_PRIORITY_OTHER;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    public static int decodeZigZag32(int i5) {
        return (-(i5 & 1)) ^ (i5 >>> 1);
    }

    public static long decodeZigZag64(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    private void ensureAvailable(int i5) throws IOException {
        if (this.bufferSize - this.bufferPos < i5) {
            refillBuffer(i5);
        }
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    private byte[] readRawBytesSlowPath(int i5) throws IOException {
        if (i5 <= 0) {
            if (i5 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i10 = this.totalBytesRetired;
        int i11 = this.bufferPos;
        int i12 = i10 + i11 + i5;
        int i13 = this.currentLimit;
        if (i12 > i13) {
            skipRawBytes((i13 - i10) - i11);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i5 < 4096) {
            byte[] bArr = new byte[i5];
            int i14 = this.bufferSize - i11;
            System.arraycopy(this.buffer, i11, bArr, 0, i14);
            this.bufferPos = this.bufferSize;
            int i15 = i5 - i14;
            ensureAvailable(i15);
            System.arraycopy(this.buffer, 0, bArr, i14, i15);
            this.bufferPos = i15;
            return bArr;
        }
        int i16 = this.bufferSize;
        this.totalBytesRetired = i10 + i16;
        this.bufferPos = 0;
        this.bufferSize = 0;
        int length = i16 - i11;
        int i17 = i5 - length;
        ArrayList arrayList = new ArrayList();
        while (i17 > 0) {
            int iMin = Math.min(i17, 4096);
            byte[] bArr2 = new byte[iMin];
            int i18 = 0;
            while (i18 < iMin) {
                InputStream inputStream = this.input;
                int i19 = inputStream == null ? -1 : inputStream.read(bArr2, i18, iMin - i18);
                if (i19 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i19;
                i18 += i19;
            }
            i17 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i5];
        System.arraycopy(this.buffer, i11, bArr3, 0, length);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr4 = (byte[]) it.next();
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    private void recomputeBufferSizeAfterLimit() {
        int i5 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i5;
        int i10 = this.totalBytesRetired + i5;
        int i11 = this.currentLimit;
        if (i10 <= i11) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i12 = i10 - i11;
        this.bufferSizeAfterLimit = i12;
        this.bufferSize = i5 - i12;
    }

    private void refillBuffer(int i5) throws IOException {
        if (!tryRefillBuffer(i5)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void skipRawBytesSlowPath(int i5) throws IOException {
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i10 = this.totalBytesRetired;
        int i11 = this.bufferPos;
        int i12 = i10 + i11 + i5;
        int i13 = this.currentLimit;
        if (i12 > i13) {
            skipRawBytes((i13 - i10) - i11);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i14 = this.bufferSize;
        int i15 = i14 - i11;
        this.bufferPos = i14;
        refillBuffer(1);
        while (true) {
            int i16 = i5 - i15;
            int i17 = this.bufferSize;
            if (i16 <= i17) {
                this.bufferPos = i16;
                return;
            } else {
                i15 += i17;
                this.bufferPos = i17;
                refillBuffer(1);
            }
        }
    }

    private boolean tryRefillBuffer(int i5) throws IOException {
        int i10 = this.bufferPos;
        if (i10 + i5 <= this.bufferSize) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i5);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.totalBytesRetired + i10 + i5 > this.currentLimit) {
            return false;
        }
        RefillCallback refillCallback = this.refillCallback;
        if (refillCallback != null) {
            refillCallback.onRefill();
        }
        if (this.input != null) {
            int i11 = this.bufferPos;
            if (i11 > 0) {
                int i12 = this.bufferSize;
                if (i12 > i11) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i11, bArr, 0, i12 - i11);
                }
                this.totalBytesRetired += i11;
                this.bufferSize -= i11;
                this.bufferPos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i13 = this.bufferSize;
            int i14 = inputStream.read(bArr2, i13, bArr2.length - i13);
            if (i14 == 0 || i14 < -1 || i14 > this.buffer.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i14);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i14 > 0) {
                this.bufferSize += i14;
                if ((this.totalBytesRetired + i5) - this.sizeLimit > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                recomputeBufferSizeAfterLimit();
                if (this.bufferSize >= i5) {
                    return true;
                }
                return tryRefillBuffer(i5);
            }
        }
        return false;
    }

    public void checkLastTagWas(int i5) throws InvalidProtocolBufferException {
        if (this.lastTag != i5) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i5 = this.currentLimit;
        if (i5 == Integer.MAX_VALUE) {
            return -1;
        }
        return i5 - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() throws IOException {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public void popLimit(int i5) {
        this.currentLimit = i5;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i5) throws InvalidProtocolBufferException {
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i10 = this.totalBytesRetired + this.bufferPos + i5;
        int i11 = this.currentLimit;
        if (i10 > i11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.currentLimit = i10;
        recomputeBufferSizeAfterLimit();
        return i11;
    }

    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    public ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i5 = this.bufferSize;
        int i10 = this.bufferPos;
        if (rawVarint32 > i5 - i10 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? ByteString.EMPTY : new LiteralByteString(readRawBytesSlowPath(rawVarint32));
        }
        ByteString boundedByteString = (this.bufferIsImmutable && this.enableAliasing) ? new BoundedByteString(this.buffer, this.bufferPos, rawVarint32) : ByteString.copyFrom(this.buffer, i10, rawVarint32);
        this.bufferPos += rawVarint32;
        return boundedByteString;
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i5, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i10 = this.recursionDepth;
        if (i10 >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.recursionDepth = i10 + 1;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i5, 4));
        this.recursionDepth--;
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
    }

    public byte readRawByte() throws IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i5 = this.bufferPos;
        this.bufferPos = i5 + 1;
        return bArr[i5];
    }

    public int readRawLittleEndian32() throws IOException {
        int i5 = this.bufferPos;
        if (this.bufferSize - i5 < 4) {
            refillBuffer(4);
            i5 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i5 + 4;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (bArr[i5] & ForkServer.ERROR) | ((bArr[i5 + 1] & ForkServer.ERROR) << 8) | ((bArr[i5 + 2] & ForkServer.ERROR) << 16);
    }

    public long readRawLittleEndian64() throws IOException {
        int i5 = this.bufferPos;
        if (this.bufferSize - i5 < 8) {
            refillBuffer(8);
            i5 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i5 + 8;
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    public int readRawVarint32() throws IOException {
        int i5;
        int i10 = this.bufferPos;
        int i11 = this.bufferSize;
        if (i11 != i10) {
            byte[] bArr = this.buffer;
            int i12 = i10 + 1;
            byte b5 = bArr[i10];
            if (b5 >= 0) {
                this.bufferPos = i12;
                return b5;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b5;
                long j8 = i14;
                if (j8 < 0) {
                    i5 = (int) ((-128) ^ j8);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    long j10 = i16;
                    if (j10 >= 0) {
                        i5 = (int) (16256 ^ j10);
                    } else {
                        int i17 = i10 + 4;
                        long j11 = i16 ^ (bArr[i15] << 21);
                        if (j11 < 0) {
                            i5 = (int) ((-2080896) ^ j11);
                        } else {
                            i15 = i10 + 5;
                            int i18 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
                            if (bArr[i17] < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i19;
                                                    i5 = i18;
                                                }
                                            }
                                        }
                                    }
                                }
                                i5 = i18;
                            }
                            i5 = i18;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.bufferPos = i13;
                return i5;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r2[r7] < 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readRawVarint64() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint64():long");
    }

    public long readRawVarint64SlowPath() throws IOException {
        long j8 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j8 |= (r3 & 127) << i5;
            if ((readRawByte() & 128) == 0) {
                return j8;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i5 = this.bufferSize;
        int i10 = this.bufferPos;
        if (rawVarint32 > i5 - i10 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? "" : new String(readRawBytesSlowPath(rawVarint32), "UTF-8");
        }
        String str = new String(this.buffer, i10, rawVarint32, "UTF-8");
        this.bufferPos += rawVarint32;
        return str;
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] rawBytesSlowPath;
        int rawVarint32 = readRawVarint32();
        int i5 = this.bufferPos;
        if (rawVarint32 <= this.bufferSize - i5 && rawVarint32 > 0) {
            rawBytesSlowPath = this.buffer;
            this.bufferPos = i5 + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            rawBytesSlowPath = readRawBytesSlowPath(rawVarint32);
            i5 = 0;
        }
        if (Utf8.isValidUtf8(rawBytesSlowPath, i5, i5 + rawVarint32)) {
            return new String(rawBytesSlowPath, i5, rawVarint32, "UTF-8");
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public boolean skipField(int i5, CodedOutputStream codedOutputStream) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i5);
        if (tagWireType == 0) {
            long int64 = readInt64();
            codedOutputStream.writeRawVarint32(i5);
            codedOutputStream.writeUInt64NoTag(int64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i5);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ByteString bytes = readBytes();
            codedOutputStream.writeRawVarint32(i5);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            codedOutputStream.writeRawVarint32(i5);
            skipMessage(codedOutputStream);
            int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i5), 4);
            checkLastTagWas(iMakeTag);
            codedOutputStream.writeRawVarint32(iMakeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int rawLittleEndian32 = readRawLittleEndian32();
        codedOutputStream.writeRawVarint32(i5);
        codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
        return true;
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag, codedOutputStream));
    }

    public void skipRawBytes(int i5) throws IOException {
        int i10 = this.bufferSize;
        int i11 = this.bufferPos;
        if (i5 > i10 - i11 || i5 < 0) {
            skipRawBytesSlowPath(i5);
        } else {
            this.bufferPos = i11 + i5;
        }
    }

    public static CodedInputStream newInstance(LiteralByteString literalByteString) {
        CodedInputStream codedInputStream = new CodedInputStream(literalByteString);
        try {
            codedInputStream.pushLimit(literalByteString.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
            return partialFrom;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    private CodedInputStream(LiteralByteString literalByteString) {
        this.enableAliasing = false;
        this.currentLimit = f.API_PRIORITY_OTHER;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = literalByteString.bytes;
        int offsetIntoBytes = literalByteString.getOffsetIntoBytes();
        this.bufferPos = offsetIntoBytes;
        this.bufferSize = offsetIntoBytes + literalByteString.size();
        this.totalBytesRetired = -this.bufferPos;
        this.input = null;
        this.bufferIsImmutable = true;
    }

    public static int readRawVarint32(int i5, InputStream inputStream) throws IOException {
        if ((i5 & 128) == 0) {
            return i5;
        }
        int i10 = i5 & 127;
        int i11 = 7;
        while (i11 < 32) {
            int i12 = inputStream.read();
            if (i12 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i10 |= (i12 & 127) << i11;
            if ((i12 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        while (i11 < 64) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i13 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }
}
