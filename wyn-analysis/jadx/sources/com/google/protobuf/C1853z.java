package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1853z extends CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f27810a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27811b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27812c;

    /* renamed from: d, reason: collision with root package name */
    public long f27813d;

    /* renamed from: e, reason: collision with root package name */
    public long f27814e;

    /* renamed from: f, reason: collision with root package name */
    public long f27815f;

    /* renamed from: g, reason: collision with root package name */
    public int f27816g;

    /* renamed from: h, reason: collision with root package name */
    public int f27817h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27818i;

    /* renamed from: j, reason: collision with root package name */
    public int f27819j;

    public C1853z(ByteBuffer byteBuffer, boolean z2) {
        super();
        this.f27819j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f27810a = byteBuffer;
        long jB = d2.b(byteBuffer);
        this.f27812c = jB;
        this.f27813d = byteBuffer.limit() + jB;
        long jPosition = jB + byteBuffer.position();
        this.f27814e = jPosition;
        this.f27815f = jPosition;
        this.f27811b = z2;
    }

    public final void a() {
        long j8 = this.f27813d + this.f27816g;
        this.f27813d = j8;
        int i5 = (int) (j8 - this.f27815f);
        int i10 = this.f27819j;
        if (i5 <= i10) {
            this.f27816g = 0;
            return;
        }
        int i11 = i5 - i10;
        this.f27816g = i11;
        this.f27813d = j8 - i11;
    }

    public final int b() {
        return (int) (this.f27813d - this.f27814e);
    }

    public final ByteBuffer c(long j8, long j10) {
        ByteBuffer byteBuffer = this.f27810a;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        long j11 = this.f27812c;
        try {
            try {
                byteBuffer.position((int) (j8 - j11));
                byteBuffer.limit((int) (j10 - j11));
                return byteBuffer.slice();
            } catch (IllegalArgumentException e7) {
                InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                invalidProtocolBufferExceptionTruncatedMessage.initCause(e7);
                throw invalidProtocolBufferExceptionTruncatedMessage;
            }
        } finally {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i5) throws InvalidProtocolBufferException {
        if (this.f27817h != i5) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z2) {
        this.f27818i = z2;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i5 = this.f27819j;
        if (i5 == Integer.MAX_VALUE) {
            return -1;
        }
        return i5 - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f27817h;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return (int) (this.f27814e - this.f27815f);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.f27814e == this.f27813d;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i5) {
        this.f27819j = i5;
        a();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i5) throws InvalidProtocolBufferException {
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i5;
        int i10 = this.f27819j;
        if (totalBytesRead > i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f27819j = totalBytesRead;
        a();
        return i10;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean readBool() {
        return readRawVarint64() != 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readByteArray() {
        return readRawBytes(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 <= 0 || rawVarint32 > b()) {
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (this.f27811b || !this.f27818i) {
            byte[] bArr = new byte[rawVarint32];
            long j8 = rawVarint32;
            d2.f(this.f27814e, bArr, 0L, j8);
            this.f27814e += j8;
            return ByteBuffer.wrap(bArr);
        }
        long j10 = this.f27814e;
        long j11 = rawVarint32;
        ByteBuffer byteBufferC = c(j10, j10 + j11);
        this.f27814e += j11;
        return byteBufferC;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 <= 0 || rawVarint32 > b()) {
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (this.f27811b && this.f27818i) {
            long j8 = this.f27814e;
            long j10 = rawVarint32;
            ByteBuffer byteBufferC = c(j8, j8 + j10);
            this.f27814e += j10;
            return ByteString.wrap(byteBufferC);
        }
        byte[] bArr = new byte[rawVarint32];
        long j11 = rawVarint32;
        d2.f(this.f27814e, bArr, 0L, j11);
        this.f27814e += j11;
        return ByteString.wrap(bArr);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readEnum() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readGroup(int i5, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        checkRecursionLimit();
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i5, 4));
        this.recursionDepth--;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        popLimit(iPushLimit);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte readRawByte() throws InvalidProtocolBufferException {
        long j8 = this.f27814e;
        if (j8 == this.f27813d) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f27814e = 1 + j8;
        return d2.f27664c.f(j8);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i5) throws InvalidProtocolBufferException {
        if (i5 < 0 || i5 > b()) {
            if (i5 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArr = new byte[i5];
        long j8 = this.f27814e;
        long j10 = i5;
        c(j8, j8 + j10).get(bArr);
        this.f27814e += j10;
        return bArr;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() throws InvalidProtocolBufferException {
        long j8 = this.f27814e;
        if (this.f27813d - j8 < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f27814e = 4 + j8;
        c2 c2Var = d2.f27664c;
        return ((c2Var.f(j8 + 3) & ForkServer.ERROR) << 24) | (c2Var.f(j8) & ForkServer.ERROR) | ((c2Var.f(1 + j8) & ForkServer.ERROR) << 8) | ((c2Var.f(2 + j8) & ForkServer.ERROR) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() throws InvalidProtocolBufferException {
        long j8 = this.f27814e;
        if (this.f27813d - j8 < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f27814e = 8 + j8;
        c2 c2Var = d2.f27664c;
        return ((c2Var.f(j8 + 7) & 255) << 56) | (c2Var.f(j8) & 255) | ((c2Var.f(1 + j8) & 255) << 8) | ((c2Var.f(2 + j8) & 255) << 16) | ((c2Var.f(3 + j8) & 255) << 24) | ((c2Var.f(4 + j8) & 255) << 32) | ((c2Var.f(5 + j8) & 255) << 40) | ((c2Var.f(6 + j8) & 255) << 48);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i5;
        long j8 = this.f27814e;
        if (this.f27813d != j8) {
            long j10 = 1 + j8;
            c2 c2Var = d2.f27664c;
            byte bF = c2Var.f(j8);
            if (bF >= 0) {
                this.f27814e = j10;
                return bF;
            }
            if (this.f27813d - j10 >= 9) {
                long j11 = 2 + j8;
                int iF = (c2Var.f(j10) << 7) ^ bF;
                if (iF < 0) {
                    i5 = iF ^ (-128);
                } else {
                    long j12 = 3 + j8;
                    int iF2 = iF ^ (c2Var.f(j11) << 14);
                    if (iF2 >= 0) {
                        i5 = iF2 ^ 16256;
                    } else {
                        long j13 = 4 + j8;
                        int iF3 = iF2 ^ (c2Var.f(j12) << 21);
                        if (iF3 < 0) {
                            i5 = (-2080896) ^ iF3;
                        } else {
                            j12 = 5 + j8;
                            byte bF2 = c2Var.f(j13);
                            int i10 = (iF3 ^ (bF2 << 28)) ^ 266354560;
                            if (bF2 < 0) {
                                j13 = 6 + j8;
                                if (c2Var.f(j12) < 0) {
                                    j12 = 7 + j8;
                                    if (c2Var.f(j13) < 0) {
                                        j13 = 8 + j8;
                                        if (c2Var.f(j12) < 0) {
                                            long j14 = 9 + j8;
                                            if (c2Var.f(j13) < 0) {
                                                long j15 = j8 + 10;
                                                if (c2Var.f(j14) >= 0) {
                                                    j11 = j15;
                                                    i5 = i10;
                                                }
                                            } else {
                                                i5 = i10;
                                                j11 = j14;
                                            }
                                        }
                                    }
                                }
                                i5 = i10;
                            }
                            i5 = i10;
                        }
                        j11 = j13;
                    }
                    j11 = j12;
                }
                this.f27814e = j11;
                return i5;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64() {
        long j8;
        long j10;
        long j11;
        long j12 = this.f27814e;
        if (this.f27813d != j12) {
            long j13 = 1 + j12;
            c2 c2Var = d2.f27664c;
            byte bF = c2Var.f(j12);
            if (bF >= 0) {
                this.f27814e = j13;
                return bF;
            }
            if (this.f27813d - j13 >= 9) {
                long j14 = 2 + j12;
                int iF = (c2Var.f(j13) << 7) ^ bF;
                if (iF < 0) {
                    j8 = iF ^ (-128);
                } else {
                    long j15 = 3 + j12;
                    int iF2 = iF ^ (c2Var.f(j14) << 14);
                    if (iF2 >= 0) {
                        j8 = iF2 ^ 16256;
                    } else {
                        long j16 = 4 + j12;
                        int iF3 = iF2 ^ (c2Var.f(j15) << 21);
                        if (iF3 < 0) {
                            j8 = (-2080896) ^ iF3;
                            j14 = j16;
                        } else {
                            j15 = 5 + j12;
                            long jF = iF3 ^ (c2Var.f(j16) << 28);
                            if (jF >= 0) {
                                j11 = 266354560;
                            } else {
                                long j17 = 6 + j12;
                                long jF2 = jF ^ (c2Var.f(j15) << 35);
                                if (jF2 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = 7 + j12;
                                    jF = jF2 ^ (c2Var.f(j17) << 42);
                                    if (jF >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j17 = 8 + j12;
                                        jF2 = jF ^ (c2Var.f(j15) << 49);
                                        if (jF2 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            long j18 = 9 + j12;
                                            long jF3 = (jF2 ^ (c2Var.f(j17) << 56)) ^ 71499008037633920L;
                                            if (jF3 < 0) {
                                                long j19 = j12 + 10;
                                                if (c2Var.f(j18) >= 0) {
                                                    j14 = j19;
                                                    j8 = jF3;
                                                }
                                            } else {
                                                j8 = jF3;
                                                j14 = j18;
                                            }
                                        }
                                    }
                                }
                                j8 = j10 ^ jF2;
                                j14 = j17;
                            }
                            j8 = j11 ^ jF;
                        }
                    }
                    j14 = j15;
                }
                this.f27814e = j14;
                return j8;
            }
        }
        return readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
        long j8 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j8 |= (r3 & 127) << i5;
            if ((readRawByte() & 128) == 0) {
                return j8;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readSFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readSInt32() {
        return CodedInputStream.decodeZigZag32(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSInt64() {
        return CodedInputStream.decodeZigZag64(readRawVarint64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readString() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 <= 0 || rawVarint32 > b()) {
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = new byte[rawVarint32];
        long j8 = rawVarint32;
        d2.f(this.f27814e, bArr, 0L, j8);
        String str = new String(bArr, Internal.UTF_8);
        this.f27814e += j8;
        return str;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0 && rawVarint32 <= b()) {
            String strC = f2.c(this.f27810a, (int) (this.f27814e - this.f27812c), rawVarint32);
            this.f27814e += rawVarint32;
            return strC;
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readTag() throws InvalidProtocolBufferException {
        if (isAtEnd()) {
            this.f27817h = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f27817h = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f27817h;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readUInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readUInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readUnknownGroup(int i5, MessageLite.Builder builder) throws IOException {
        readGroup(i5, builder, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void resetSizeCounter() {
        this.f27815f = this.f27814e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i5) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i5);
        int i10 = 0;
        if (tagWireType == 0) {
            if (b() < 10) {
                while (i10 < 10) {
                    if (readRawByte() < 0) {
                        i10++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i10 < 10) {
                long j8 = this.f27814e;
                this.f27814e = 1 + j8;
                if (d2.f27664c.f(j8) < 0) {
                    i10++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
            return true;
        }
        if (tagWireType == 1) {
            skipRawBytes(8);
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i5), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        skipRawBytes(4);
        return true;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void skipRawBytes(int i5) throws InvalidProtocolBufferException {
        if (i5 >= 0 && i5 <= b()) {
            this.f27814e += i5;
        } else {
            if (i5 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readGroup(int i5, Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        checkRecursionLimit();
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i5, 4));
        this.recursionDepth--;
        return messageLite;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(iPushLimit);
            return messageLite;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i5, CodedOutputStream codedOutputStream) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i5);
        if (tagWireType == 0) {
            long rawVarint64 = readRawVarint64();
            codedOutputStream.writeUInt32NoTag(i5);
            codedOutputStream.writeUInt64NoTag(rawVarint64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeUInt32NoTag(i5);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ByteString bytes = readBytes();
            codedOutputStream.writeUInt32NoTag(i5);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            codedOutputStream.writeUInt32NoTag(i5);
            skipMessage(codedOutputStream);
            int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i5), 4);
            checkLastTagWas(iMakeTag);
            codedOutputStream.writeUInt32NoTag(iMakeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int rawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeUInt32NoTag(i5);
            codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
}
