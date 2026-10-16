package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ahoc {
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
    private ahob refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    private ahoc(ahpe ahpeVar) {
        this.enableAliasing = false;
        this.currentLimit = Alert.DURATION_SHOW_INDEFINITELY;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = ahpeVar.bytes;
        int offsetIntoBytes = ahpeVar.getOffsetIntoBytes();
        this.bufferPos = offsetIntoBytes;
        this.bufferSize = offsetIntoBytes + ahpeVar.size();
        this.totalBytesRetired = -this.bufferPos;
        this.input = null;
        this.bufferIsImmutable = true;
    }

    public static int decodeZigZag32(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long decodeZigZag64(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    private void ensureAvailable(int i) throws IOException {
        if (this.bufferSize - this.bufferPos < i) {
            refillBuffer(i);
        }
    }

    static ahoc newInstance(ahpe ahpeVar) {
        ahoc ahocVar = new ahoc(ahpeVar);
        try {
            ahocVar.pushLimit(ahpeVar.size());
            return ahocVar;
        } catch (ahou e) {
            throw new IllegalArgumentException(e);
        }
    }

    private byte[] readRawBytesSlowPath(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return ahot.EMPTY_BYTE_ARRAY;
            }
            throw ahou.negativeSize();
        }
        int i2 = this.totalBytesRetired;
        int i3 = this.bufferPos;
        int i4 = this.currentLimit;
        if (i2 + i3 + i > i4) {
            skipRawBytes((i4 - i2) - i3);
            throw ahou.truncatedMessage();
        }
        if (i < 4096) {
            byte[] bArr = new byte[i];
            int i5 = this.bufferSize - i3;
            System.arraycopy(this.buffer, i3, bArr, 0, i5);
            this.bufferPos = this.bufferSize;
            int i6 = i - i5;
            ensureAvailable(i6);
            System.arraycopy(this.buffer, 0, bArr, i5, i6);
            this.bufferPos = i6;
            return bArr;
        }
        int i7 = this.bufferSize;
        this.totalBytesRetired = i2 + i7;
        this.bufferPos = 0;
        this.bufferSize = 0;
        int i8 = i7 - i3;
        ArrayList arrayList = new ArrayList();
        int i9 = i - i8;
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr2 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                InputStream inputStream = this.input;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr2, i10, iMin - i10);
                if (i11 == -1) {
                    throw ahou.truncatedMessage();
                }
                this.totalBytesRetired += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(this.buffer, i3, bArr3, 0, i8);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            byte[] bArr4 = (byte[]) arrayList.get(i12);
            int length = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i8, length);
            i8 += length;
        }
        return bArr3;
    }

    private void recomputeBufferSizeAfterLimit() {
        int i = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i;
        int i2 = this.totalBytesRetired + i;
        int i3 = this.currentLimit;
        if (i2 <= i3) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i4 = i2 - i3;
        this.bufferSizeAfterLimit = i4;
        this.bufferSize = i - i4;
    }

    private void refillBuffer(int i) throws IOException {
        if (!tryRefillBuffer(i)) {
            throw ahou.truncatedMessage();
        }
    }

    private void skipRawBytesSlowPath(int i) throws IOException {
        if (i < 0) {
            throw ahou.negativeSize();
        }
        int i2 = this.totalBytesRetired;
        int i3 = this.bufferPos;
        int i4 = this.currentLimit;
        if (i2 + i3 + i > i4) {
            skipRawBytes((i4 - i2) - i3);
            throw ahou.truncatedMessage();
        }
        int i5 = this.bufferSize;
        int i6 = i5 - i3;
        this.bufferPos = i5;
        refillBuffer(1);
        while (true) {
            int i7 = i - i6;
            int i8 = this.bufferSize;
            if (i7 <= i8) {
                this.bufferPos = i7;
                return;
            } else {
                i6 += i8;
                this.bufferPos = i8;
                refillBuffer(1);
            }
        }
    }

    private boolean tryRefillBuffer(int i) throws IOException {
        int i2 = this.bufferPos;
        if (i2 + i <= this.bufferSize) {
            throw new IllegalStateException(a.bn(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        if (this.totalBytesRetired + i2 + i > this.currentLimit) {
            return false;
        }
        ahob ahobVar = this.refillCallback;
        if (ahobVar != null) {
            ahobVar.onRefill();
        }
        if (this.input != null) {
            int i3 = this.bufferPos;
            if (i3 > 0) {
                int i4 = this.bufferSize;
                if (i4 > i3) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                }
                this.totalBytesRetired += i3;
                this.bufferSize -= i3;
                this.bufferPos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i5 = this.bufferSize;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.buffer.length) {
                throw new IllegalStateException(a.bn(i6, "InputStream#read(byte[]) returned invalid result: ", "\nThe InputStream implementation is buggy."));
            }
            if (i6 > 0) {
                this.bufferSize += i6;
                if ((this.totalBytesRetired + i) - this.sizeLimit > 0) {
                    throw ahou.sizeLimitExceeded();
                }
                recomputeBufferSizeAfterLimit();
                if (this.bufferSize >= i) {
                    return true;
                }
                return tryRefillBuffer(i);
            }
        }
        return false;
    }

    public void checkLastTagWas(int i) throws ahou {
        if (this.lastTag != i) {
            throw ahou.invalidEndTag();
        }
    }

    public void checkRecursionLimit() throws ahou {
        if (this.recursionDepth >= this.recursionLimit) {
            throw ahou.recursionLimitExceeded();
        }
    }

    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() throws IOException {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i) throws ahou {
        if (i < 0) {
            throw ahou.negativeSize();
        }
        int i2 = this.totalBytesRetired + this.bufferPos;
        int i3 = this.currentLimit;
        int i4 = i + i2;
        if (i4 > i3) {
            throw ahou.truncatedMessage();
        }
        this.currentLimit = i4;
        recomputeBufferSizeAfterLimit();
        return i3;
    }

    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    public ahoa readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? ahoa.EMPTY : new ahpe(readRawBytesSlowPath(rawVarint32));
        }
        ahoa ahnxVar = (this.bufferIsImmutable && this.enableAliasing) ? new ahnx(this.buffer, this.bufferPos, rawVarint32) : ahoa.copyFrom(this.buffer, i2, rawVarint32);
        this.bufferPos += rawVarint32;
        return ahnxVar;
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

    public void readGroup(int i, ahpf ahpfVar, ahog ahogVar) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        ahpfVar.mergeFrom(this, ahogVar);
        checkLastTagWas(ahqk.makeTag(i, 4));
        this.recursionDepth--;
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public <T extends ahpg> T readMessage(ahpi<T> ahpiVar, ahog ahogVar) throws IOException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        T partialFrom = ahpiVar.parsePartialFrom(this, ahogVar);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
        return partialFrom;
    }

    public byte readRawByte() throws IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i = this.bufferPos;
        this.bufferPos = i + 1;
        return bArr[i];
    }

    public int readRawLittleEndian32() throws IOException {
        int i = this.bufferPos;
        if (this.bufferSize - i < 4) {
            refillBuffer(4);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public long readRawLittleEndian64() throws IOException {
        int i = this.bufferPos;
        if (this.bufferSize - i < 8) {
            refillBuffer(8);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    public int readRawVarint32() throws IOException {
        int i;
        int i2 = this.bufferPos;
        int i3 = this.bufferSize;
        if (i3 != i2) {
            byte[] bArr = this.buffer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.bufferPos = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        long j3 = i8 ^ (bArr[i7] << 21);
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            int i10 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
                            if (bArr[i9] < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i11 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i11;
                                                    i = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i10;
                            }
                            i = i10;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.bufferPos = i5;
                return i;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        if (r2[r7] >= 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readRawVarint64() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahoc.readRawVarint64():long");
    }

    public long readRawVarint64SlowPath() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((readRawByte() & 128) == 0) {
                return j;
            }
        }
        throw ahou.malformedVarint();
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
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? "" : new String(readRawBytesSlowPath(rawVarint32), CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        }
        String str = new String(this.buffer, i2, rawVarint32, CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        this.bufferPos = i2 + rawVarint32;
        return str;
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] rawBytesSlowPath;
        int rawVarint32 = readRawVarint32();
        int i = this.bufferPos;
        if (rawVarint32 <= this.bufferSize - i && rawVarint32 > 0) {
            rawBytesSlowPath = this.buffer;
            this.bufferPos = i + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            rawBytesSlowPath = readRawBytesSlowPath(rawVarint32);
            i = 0;
        }
        if (ahqc.isValidUtf8(rawBytesSlowPath, i, i + rawVarint32)) {
            return new String(rawBytesSlowPath, i, rawVarint32, CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        }
        throw ahou.invalidUtf8();
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (ahqk.getTagFieldNumber(rawVarint32) != 0) {
            return rawVarint32;
        }
        throw ahou.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public boolean skipField(int i, ahoe ahoeVar) throws IOException {
        int tagWireType = ahqk.getTagWireType(i);
        if (tagWireType == 0) {
            long int64 = readInt64();
            ahoeVar.writeRawVarint32(i);
            ahoeVar.writeUInt64NoTag(int64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            ahoeVar.writeRawVarint32(i);
            ahoeVar.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ahoa bytes = readBytes();
            ahoeVar.writeRawVarint32(i);
            ahoeVar.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            ahoeVar.writeRawVarint32(i);
            skipMessage(ahoeVar);
            int iMakeTag = ahqk.makeTag(ahqk.getTagFieldNumber(i), 4);
            checkLastTagWas(iMakeTag);
            ahoeVar.writeRawVarint32(iMakeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw ahou.invalidWireType();
        }
        int rawLittleEndian32 = readRawLittleEndian32();
        ahoeVar.writeRawVarint32(i);
        ahoeVar.writeFixed32NoTag(rawLittleEndian32);
        return true;
    }

    public void skipMessage(ahoe ahoeVar) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            this.recursionDepth--;
        } while (skipField(tag, ahoeVar));
    }

    public void skipRawBytes(int i) throws IOException {
        int i2 = this.bufferSize;
        int i3 = this.bufferPos;
        if (i > i2 - i3 || i < 0) {
            skipRawBytesSlowPath(i);
        } else {
            this.bufferPos = i3 + i;
        }
    }

    public static ahoc newInstance(InputStream inputStream) {
        return new ahoc(inputStream);
    }

    public void readMessage(ahpf ahpfVar, ahog ahogVar) throws IOException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        ahpfVar.mergeFrom(this, ahogVar);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
    }

    private ahoc(InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = Alert.DURATION_SHOW_INDEFINITELY;
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

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw ahou.truncatedMessage();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw ahou.truncatedMessage();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw ahou.malformedVarint();
    }
}
