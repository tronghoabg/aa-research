package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1844w extends CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f27757a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27758b;

    /* renamed from: c, reason: collision with root package name */
    public int f27759c;

    /* renamed from: d, reason: collision with root package name */
    public int f27760d;

    /* renamed from: e, reason: collision with root package name */
    public int f27761e;

    /* renamed from: f, reason: collision with root package name */
    public int f27762f;

    /* renamed from: g, reason: collision with root package name */
    public int f27763g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27764h;

    /* renamed from: i, reason: collision with root package name */
    public int f27765i;

    public C1844w(byte[] bArr, int i5, int i10, boolean z2) {
        super();
        this.f27765i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f27757a = bArr;
        this.f27759c = i10 + i5;
        this.f27761e = i5;
        this.f27762f = i5;
        this.f27758b = z2;
    }

    public final void a() {
        int i5 = this.f27759c + this.f27760d;
        this.f27759c = i5;
        int i10 = i5 - this.f27762f;
        int i11 = this.f27765i;
        if (i10 <= i11) {
            this.f27760d = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f27760d = i12;
        this.f27759c = i5 - i12;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i5) throws InvalidProtocolBufferException {
        if (this.f27763g != i5) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z2) {
        this.f27764h = z2;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i5 = this.f27765i;
        if (i5 == Integer.MAX_VALUE) {
            return -1;
        }
        return i5 - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f27763g;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return this.f27761e - this.f27762f;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.f27761e == this.f27759c;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i5) {
        this.f27765i = i5;
        a();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i5) {
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i5;
        if (totalBytesRead < 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        int i10 = this.f27765i;
        if (totalBytesRead > i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f27765i = totalBytesRead;
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
        if (rawVarint32 > 0) {
            int i5 = this.f27759c;
            int i10 = this.f27761e;
            if (rawVarint32 <= i5 - i10) {
                boolean z2 = this.f27758b;
                byte[] bArr = this.f27757a;
                ByteBuffer byteBufferWrap = (z2 || !this.f27764h) ? ByteBuffer.wrap(Arrays.copyOfRange(bArr, i10, i10 + rawVarint32)) : ByteBuffer.wrap(bArr, i10, rawVarint32).slice();
                this.f27761e += rawVarint32;
                return byteBufferWrap;
            }
        }
        if (rawVarint32 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i5 = this.f27759c;
            int i10 = this.f27761e;
            if (rawVarint32 <= i5 - i10) {
                boolean z2 = this.f27758b;
                byte[] bArr = this.f27757a;
                ByteString byteStringWrap = (z2 && this.f27764h) ? ByteString.wrap(bArr, i10, rawVarint32) : ByteString.copyFrom(bArr, i10, rawVarint32);
                this.f27761e += rawVarint32;
                return byteStringWrap;
            }
        }
        return rawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(rawVarint32));
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
        int i5 = this.f27761e;
        if (i5 == this.f27759c) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f27761e = i5 + 1;
        return this.f27757a[i5];
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i5) throws InvalidProtocolBufferException {
        if (i5 > 0) {
            int i10 = this.f27759c;
            int i11 = this.f27761e;
            if (i5 <= i10 - i11) {
                int i12 = i5 + i11;
                this.f27761e = i12;
                return Arrays.copyOfRange(this.f27757a, i11, i12);
            }
        }
        if (i5 > 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i5 == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() throws InvalidProtocolBufferException {
        int i5 = this.f27761e;
        if (this.f27759c - i5 < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f27761e = i5 + 4;
        byte[] bArr = this.f27757a;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (bArr[i5] & ForkServer.ERROR) | ((bArr[i5 + 1] & ForkServer.ERROR) << 8) | ((bArr[i5 + 2] & ForkServer.ERROR) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() throws InvalidProtocolBufferException {
        int i5 = this.f27761e;
        if (this.f27759c - i5 < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f27761e = i5 + 8;
        byte[] bArr = this.f27757a;
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i5;
        int i10 = this.f27761e;
        int i11 = this.f27759c;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f27757a;
            byte b5 = bArr[i10];
            if (b5 >= 0) {
                this.f27761e = i12;
                return b5;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b5;
                if (i14 < 0) {
                    i5 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i5 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i5 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i5 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i5 = i19;
                            }
                            i5 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f27761e = i13;
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
        long j12;
        int i5 = this.f27761e;
        int i10 = this.f27759c;
        if (i10 != i5) {
            int i11 = i5 + 1;
            byte[] bArr = this.f27757a;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.f27761e = i11;
                return b5;
            }
            if (i10 - i11 >= 9) {
                int i12 = i5 + 2;
                int i13 = (bArr[i11] << 7) ^ b5;
                if (i13 < 0) {
                    j8 = i13 ^ (-128);
                } else {
                    int i14 = i5 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j8 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i5 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j12 = (-2080896) ^ i17;
                        } else {
                            long j13 = i17;
                            i12 = i5 + 5;
                            long j14 = j13 ^ (bArr[i16] << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i16 = i5 + 6;
                                long j15 = j14 ^ (bArr[i12] << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i12 = i5 + 7;
                                    j14 = j15 ^ (bArr[i16] << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i16 = i5 + 8;
                                        j15 = j14 ^ (bArr[i12] << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i12 = i5 + 9;
                                            long j16 = (j15 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i18 = i5 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j8 = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j8 = j11 ^ j14;
                        }
                        i12 = i16;
                        j8 = j12;
                    }
                }
                this.f27761e = i12;
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
        if (rawVarint32 > 0) {
            int i5 = this.f27759c;
            int i10 = this.f27761e;
            if (rawVarint32 <= i5 - i10) {
                String str = new String(this.f27757a, i10, rawVarint32, Internal.UTF_8);
                this.f27761e += rawVarint32;
                return str;
            }
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > 0) {
            int i5 = this.f27759c;
            int i10 = this.f27761e;
            if (rawVarint32 <= i5 - i10) {
                String strB = f2.f27676a.b(i10, rawVarint32, this.f27757a);
                this.f27761e += rawVarint32;
                return strB;
            }
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
            this.f27763g = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f27763g = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f27763g;
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
        this.f27762f = this.f27761e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i5) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i5);
        int i10 = 0;
        if (tagWireType == 0) {
            if (this.f27759c - this.f27761e < 10) {
                while (i10 < 10) {
                    if (readRawByte() < 0) {
                        i10++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i10 < 10) {
                int i11 = this.f27761e;
                this.f27761e = i11 + 1;
                if (this.f27757a[i11] < 0) {
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
        if (i5 >= 0) {
            int i10 = this.f27759c;
            int i11 = this.f27761e;
            if (i5 <= i10 - i11) {
                this.f27761e = i11 + i5;
                return;
            }
        }
        if (i5 >= 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
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
