package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahpc {
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final java.io.InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private defpackage.ahpb refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    private ahpc(defpackage.ahqe ahqeVar) {
        this.enableAliasing = false;
        this.currentLimit = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = ahqeVar.bytes;
        int offsetIntoBytes = ahqeVar.getOffsetIntoBytes();
        this.bufferPos = offsetIntoBytes;
        this.bufferSize = offsetIntoBytes + ahqeVar.size();
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

    private void ensureAvailable(int i) throws java.io.IOException {
        if (this.bufferSize - this.bufferPos < i) {
            refillBuffer(i);
        }
    }

    static defpackage.ahpc newInstance(defpackage.ahqe ahqeVar) {
        defpackage.ahpc ahpcVar = new defpackage.ahpc(ahqeVar);
        try {
            ahpcVar.pushLimit(ahqeVar.size());
            return ahpcVar;
        } catch (defpackage.ahpu e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    private byte[] readRawBytesSlowPath(int i) throws java.io.IOException {
        if (i <= 0) {
            if (i == 0) {
                return defpackage.ahpt.EMPTY_BYTE_ARRAY;
            }
            throw defpackage.ahpu.negativeSize();
        }
        int i2 = this.totalBytesRetired;
        int i3 = this.bufferPos;
        int i4 = this.currentLimit;
        if (i2 + i3 + i > i4) {
            skipRawBytes((i4 - i2) - i3);
            throw defpackage.ahpu.truncatedMessage();
        }
        if (i < 4096) {
            byte[] bArr = new byte[i];
            int i5 = this.bufferSize - i3;
            java.lang.System.arraycopy(this.buffer, i3, bArr, 0, i5);
            this.bufferPos = this.bufferSize;
            int i6 = i - i5;
            ensureAvailable(i6);
            java.lang.System.arraycopy(this.buffer, 0, bArr, i5, i6);
            this.bufferPos = i6;
            return bArr;
        }
        int i7 = this.bufferSize;
        this.totalBytesRetired = i2 + i7;
        this.bufferPos = 0;
        this.bufferSize = 0;
        int i8 = i7 - i3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i9 = i - i8;
        while (i9 > 0) {
            int iMin = java.lang.Math.min(i9, 4096);
            byte[] bArr2 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                java.io.InputStream inputStream = this.input;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr2, i10, iMin - i10);
                if (i11 == -1) {
                    throw defpackage.ahpu.truncatedMessage();
                }
                this.totalBytesRetired += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        java.lang.System.arraycopy(this.buffer, i3, bArr3, 0, i8);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            byte[] bArr4 = (byte[]) arrayList.get(i12);
            int length = bArr4.length;
            java.lang.System.arraycopy(bArr4, 0, bArr3, i8, length);
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

    private void refillBuffer(int i) throws java.io.IOException {
        if (!tryRefillBuffer(i)) {
            throw defpackage.ahpu.truncatedMessage();
        }
    }

    private void skipRawBytesSlowPath(int i) throws java.io.IOException {
        if (i < 0) {
            throw defpackage.ahpu.negativeSize();
        }
        int i2 = this.totalBytesRetired;
        int i3 = this.bufferPos;
        int i4 = this.currentLimit;
        if (i2 + i3 + i > i4) {
            skipRawBytes((i4 - i2) - i3);
            throw defpackage.ahpu.truncatedMessage();
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

    private boolean tryRefillBuffer(int i) throws java.io.IOException {
        int i2 = this.bufferPos;
        if (i2 + i <= this.bufferSize) {
            throw new java.lang.IllegalStateException(defpackage.a.bm(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        if (this.totalBytesRetired + i2 + i > this.currentLimit) {
            return false;
        }
        defpackage.ahpb ahpbVar = this.refillCallback;
        if (ahpbVar != null) {
            ahpbVar.onRefill();
        }
        if (this.input != null) {
            int i3 = this.bufferPos;
            if (i3 > 0) {
                int i4 = this.bufferSize;
                if (i4 > i3) {
                    byte[] bArr = this.buffer;
                    java.lang.System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                }
                this.totalBytesRetired += i3;
                this.bufferSize -= i3;
                this.bufferPos = 0;
            }
            java.io.InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i5 = this.bufferSize;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.buffer.length) {
                throw new java.lang.IllegalStateException(defpackage.a.bm(i6, "InputStream#read(byte[]) returned invalid result: ", "\nThe InputStream implementation is buggy."));
            }
            if (i6 > 0) {
                this.bufferSize += i6;
                if ((this.totalBytesRetired + i) - this.sizeLimit > 0) {
                    throw defpackage.ahpu.sizeLimitExceeded();
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

    public void checkLastTagWas(int i) throws defpackage.ahpu {
        if (this.lastTag != i) {
            throw defpackage.ahpu.invalidEndTag();
        }
    }

    public void checkRecursionLimit() throws defpackage.ahpu {
        if (this.recursionDepth >= this.recursionLimit) {
            throw defpackage.ahpu.recursionLimitExceeded();
        }
    }

    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() throws java.io.IOException {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i) throws defpackage.ahpu {
        if (i < 0) {
            throw defpackage.ahpu.negativeSize();
        }
        int i2 = this.totalBytesRetired + this.bufferPos;
        int i3 = this.currentLimit;
        int i4 = i + i2;
        if (i4 > i3) {
            throw defpackage.ahpu.truncatedMessage();
        }
        this.currentLimit = i4;
        recomputeBufferSizeAfterLimit();
        return i3;
    }

    public boolean readBool() throws java.io.IOException {
        return readRawVarint64() != 0;
    }

    public defpackage.ahpa readBytes() throws java.io.IOException {
        int rawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? defpackage.ahpa.EMPTY : new defpackage.ahqe(readRawBytesSlowPath(rawVarint32));
        }
        defpackage.ahpa ahoxVar = (this.bufferIsImmutable && this.enableAliasing) ? new defpackage.ahox(this.buffer, this.bufferPos, rawVarint32) : defpackage.ahpa.copyFrom(this.buffer, i2, rawVarint32);
        this.bufferPos += rawVarint32;
        return ahoxVar;
    }

    public double readDouble() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws java.io.IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws java.io.IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws java.io.IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i, defpackage.ahqf ahqfVar, defpackage.ahpg ahpgVar) throws java.io.IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        ahqfVar.mergeFrom(this, ahpgVar);
        checkLastTagWas(defpackage.ahrk.makeTag(i, 4));
        this.recursionDepth--;
    }

    public int readInt32() throws java.io.IOException {
        return readRawVarint32();
    }

    public long readInt64() throws java.io.IOException {
        return readRawVarint64();
    }

    public <T extends defpackage.ahqg> T readMessage(defpackage.ahqi<T> ahqiVar, defpackage.ahpg ahpgVar) throws java.io.IOException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        T partialFrom = ahqiVar.parsePartialFrom(this, ahpgVar);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
        return partialFrom;
    }

    public byte readRawByte() throws java.io.IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i = this.bufferPos;
        this.bufferPos = i + 1;
        return bArr[i];
    }

    public int readRawLittleEndian32() throws java.io.IOException {
        int i = this.bufferPos;
        if (this.bufferSize - i < 4) {
            refillBuffer(4);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public long readRawLittleEndian64() throws java.io.IOException {
        int i = this.bufferPos;
        if (this.bufferSize - i < 8) {
            refillBuffer(8);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public int readRawVarint32() throws java.io.IOException {
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
                        int i10 = i8 ^ (bArr[i7] << 21);
                        long j3 = i10;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (int) (((long) (i10 ^ (b2 << 28))) ^ 266354560);
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
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
            r10 = this;
            int r0 = r10.bufferPos
            int r1 = r10.bufferSize
            if (r1 != r0) goto L8
            goto Lb7
        L8:
            byte[] r2 = r10.buffer
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L14
            r10.bufferPos = r3
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r3
            r5 = 9
            if (r1 < r5) goto Lb7
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            long r3 = (long) r3
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2c
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r3 = r3 ^ r5
            goto Lb4
        L2c:
            int r7 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L3e
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3a:
            long r3 = r3 ^ r0
        L3b:
            r1 = r7
            goto Lb4
        L3e:
            int r1 = r0 + 4
            r7 = r2[r7]
            int r7 = r7 << 21
            long r7 = (long) r7
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4e
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4e:
            int r7 = r0 + 5
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L5f
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3a
        L5f:
            int r1 = r0 + 6
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 35
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L72
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L29
        L72:
            int r7 = r0 + 7
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L85
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3a
        L85:
            int r1 = r0 + 8
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 49
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L98
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L29
        L98:
            int r7 = r0 + 9
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L3b
            int r1 = r0 + 10
            r0 = r2[r7]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto Lb7
        Lb4:
            r10.bufferPos = r1
            return r3
        Lb7:
            long r0 = r10.readRawVarint64SlowPath()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpc.readRawVarint64():long");
    }

    public long readRawVarint64SlowPath() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte rawByte = readRawByte();
            j |= ((long) (rawByte & 127)) << i;
            if ((rawByte & 128) == 0) {
                return j;
            }
        }
        throw defpackage.ahpu.malformedVarint();
    }

    public int readSFixed32() throws java.io.IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws java.io.IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws java.io.IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws java.io.IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public java.lang.String readString() throws java.io.IOException {
        int rawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? "" : new java.lang.String(readRawBytesSlowPath(rawVarint32), com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        }
        java.lang.String str = new java.lang.String(this.buffer, i2, rawVarint32, com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        this.bufferPos = i2 + rawVarint32;
        return str;
    }

    public java.lang.String readStringRequireUtf8() throws java.io.IOException {
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
        if (defpackage.ahrc.isValidUtf8(rawBytesSlowPath, i, i + rawVarint32)) {
            return new java.lang.String(rawBytesSlowPath, i, rawVarint32, com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        }
        throw defpackage.ahpu.invalidUtf8();
    }

    public int readTag() throws java.io.IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (defpackage.ahrk.getTagFieldNumber(rawVarint32) != 0) {
            return rawVarint32;
        }
        throw defpackage.ahpu.invalidTag();
    }

    public int readUInt32() throws java.io.IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws java.io.IOException {
        return readRawVarint64();
    }

    public boolean skipField(int i, defpackage.ahpe ahpeVar) throws java.io.IOException {
        int tagWireType = defpackage.ahrk.getTagWireType(i);
        if (tagWireType == 0) {
            long int64 = readInt64();
            ahpeVar.writeRawVarint32(i);
            ahpeVar.writeUInt64NoTag(int64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            ahpeVar.writeRawVarint32(i);
            ahpeVar.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            defpackage.ahpa bytes = readBytes();
            ahpeVar.writeRawVarint32(i);
            ahpeVar.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            ahpeVar.writeRawVarint32(i);
            skipMessage(ahpeVar);
            int iMakeTag = defpackage.ahrk.makeTag(defpackage.ahrk.getTagFieldNumber(i), 4);
            checkLastTagWas(iMakeTag);
            ahpeVar.writeRawVarint32(iMakeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw defpackage.ahpu.invalidWireType();
        }
        int rawLittleEndian32 = readRawLittleEndian32();
        ahpeVar.writeRawVarint32(i);
        ahpeVar.writeFixed32NoTag(rawLittleEndian32);
        return true;
    }

    public void skipMessage(defpackage.ahpe ahpeVar) throws java.io.IOException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag, ahpeVar);
            this.recursionDepth--;
        } while (zSkipField);
    }

    public void skipRawBytes(int i) throws java.io.IOException {
        int i2 = this.bufferSize;
        int i3 = this.bufferPos;
        if (i > i2 - i3 || i < 0) {
            skipRawBytesSlowPath(i);
        } else {
            this.bufferPos = i3 + i;
        }
    }

    public static defpackage.ahpc newInstance(java.io.InputStream inputStream) {
        return new defpackage.ahpc(inputStream);
    }

    public void readMessage(defpackage.ahqf ahqfVar, defpackage.ahpg ahpgVar) throws java.io.IOException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        ahqfVar.mergeFrom(this, ahpgVar);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
    }

    private ahpc(java.io.InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
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

    public static int readRawVarint32(int i, java.io.InputStream inputStream) throws java.io.IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw defpackage.ahpu.truncatedMessage();
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
                throw defpackage.ahpu.truncatedMessage();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw defpackage.ahpu.malformedVarint();
    }
}
