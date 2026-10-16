package com.google.protobuf;

import A7.AbstractC0279p0;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1850y extends CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f27792a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f27793b;

    /* renamed from: c, reason: collision with root package name */
    public int f27794c;

    /* renamed from: d, reason: collision with root package name */
    public int f27795d;

    /* renamed from: e, reason: collision with root package name */
    public int f27796e;

    /* renamed from: f, reason: collision with root package name */
    public int f27797f;

    /* renamed from: g, reason: collision with root package name */
    public int f27798g;

    /* renamed from: h, reason: collision with root package name */
    public int f27799h;

    public C1850y(InputStream inputStream, int i5) {
        super();
        this.f27799h = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        Internal.checkNotNull(inputStream, "input");
        this.f27792a = inputStream;
        this.f27793b = new byte[i5];
        this.f27794c = 0;
        this.f27796e = 0;
        this.f27798g = 0;
    }

    public final byte[] a(int i5, boolean z2) throws IOException {
        byte[] bArrB = b(i5);
        if (bArrB != null) {
            return z2 ? (byte[]) bArrB.clone() : bArrB;
        }
        int i10 = this.f27796e;
        int i11 = this.f27794c;
        int length = i11 - i10;
        this.f27798g += i11;
        this.f27796e = 0;
        this.f27794c = 0;
        ArrayList arrayListC = c(i5 - length);
        byte[] bArr = new byte[i5];
        System.arraycopy(this.f27793b, i10, bArr, 0, length);
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] b(int i5) throws IOException {
        if (i5 == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i10 = this.f27798g;
        int i11 = this.f27796e;
        int i12 = i10 + i11 + i5;
        if (i12 - this.sizeLimit > 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i13 = this.f27799h;
        if (i12 > i13) {
            skipRawBytes((i13 - i10) - i11);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i14 = this.f27794c - i11;
        int i15 = i5 - i14;
        InputStream inputStream = this.f27792a;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e7) {
                e7.setThrownFromInputStream();
                throw e7;
            }
        }
        byte[] bArr = new byte[i5];
        System.arraycopy(this.f27793b, this.f27796e, bArr, 0, i14);
        this.f27798g += this.f27794c;
        this.f27796e = 0;
        this.f27794c = 0;
        while (i14 < i5) {
            try {
                int i16 = inputStream.read(bArr, i14, i5 - i14);
                if (i16 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f27798g += i16;
                i14 += i16;
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList c(int i5) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i5 > 0) {
            int iMin = Math.min(i5, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f27792a.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f27798g += i11;
                i10 += i11;
            }
            i5 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i5) throws InvalidProtocolBufferException {
        if (this.f27797f != i5) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final void d() {
        int i5 = this.f27794c + this.f27795d;
        this.f27794c = i5;
        int i10 = this.f27798g + i5;
        int i11 = this.f27799h;
        if (i10 <= i11) {
            this.f27795d = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f27795d = i12;
        this.f27794c = i5 - i12;
    }

    public final void e(int i5) throws InvalidProtocolBufferException {
        if (f(i5)) {
            return;
        }
        if (i5 <= (this.sizeLimit - this.f27798g) - this.f27796e) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.sizeLimitExceeded();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z2) {
    }

    public final boolean f(int i5) throws IOException {
        int i10 = this.f27796e;
        int i11 = i10 + i5;
        int i12 = this.f27794c;
        if (i11 <= i12) {
            throw new IllegalStateException(AbstractC0279p0.i(i5, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.sizeLimit;
        int i14 = this.f27798g;
        if (i5 <= (i13 - i14) - i10 && i14 + i10 + i5 <= this.f27799h) {
            byte[] bArr = this.f27793b;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f27798g += i10;
                this.f27794c -= i10;
                this.f27796e = 0;
            }
            int i15 = this.f27794c;
            int iMin = Math.min(bArr.length - i15, (this.sizeLimit - this.f27798g) - i15);
            InputStream inputStream = this.f27792a;
            try {
                int i16 = inputStream.read(bArr, i15, iMin);
                if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
                }
                if (i16 > 0) {
                    this.f27794c += i16;
                    d();
                    if (this.f27794c >= i5) {
                        return true;
                    }
                    return f(i5);
                }
            } catch (InvalidProtocolBufferException e7) {
                e7.setThrownFromInputStream();
                throw e7;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i5 = this.f27799h;
        if (i5 == Integer.MAX_VALUE) {
            return -1;
        }
        return i5 - (this.f27798g + this.f27796e);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f27797f;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return this.f27798g + this.f27796e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return this.f27796e == this.f27794c && !f(1);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i5) {
        this.f27799h = i5;
        d();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i5) throws InvalidProtocolBufferException {
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i10 = this.f27798g + this.f27796e + i5;
        int i11 = this.f27799h;
        if (i10 > i11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f27799h = i10;
        d();
        return i11;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean readBool() {
        return readRawVarint64() != 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readByteArray() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        int i5 = this.f27794c;
        int i10 = this.f27796e;
        if (rawVarint32 > i5 - i10 || rawVarint32 <= 0) {
            if (rawVarint32 >= 0) {
                return a(rawVarint32, false);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f27793b, i10, i10 + rawVarint32);
        this.f27796e += rawVarint32;
        return bArrCopyOfRange;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        int i5 = this.f27794c;
        int i10 = this.f27796e;
        if (rawVarint32 <= i5 - i10 && rawVarint32 > 0) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f27793b, i10, i10 + rawVarint32));
            this.f27796e += rawVarint32;
            return byteBufferWrap;
        }
        if (rawVarint32 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (rawVarint32 >= 0) {
            return ByteBuffer.wrap(a(rawVarint32, true));
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i5 = this.f27794c;
        int i10 = this.f27796e;
        int i11 = i5 - i10;
        byte[] bArr = this.f27793b;
        if (rawVarint32 <= i11 && rawVarint32 > 0) {
            ByteString byteStringCopyFrom = ByteString.copyFrom(bArr, i10, rawVarint32);
            this.f27796e += rawVarint32;
            return byteStringCopyFrom;
        }
        if (rawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        byte[] bArrB = b(rawVarint32);
        if (bArrB != null) {
            return ByteString.copyFrom(bArrB);
        }
        int i12 = this.f27796e;
        int i13 = this.f27794c;
        int length = i13 - i12;
        this.f27798g += i13;
        this.f27796e = 0;
        this.f27794c = 0;
        ArrayList arrayListC = c(rawVarint32 - length);
        byte[] bArr2 = new byte[rawVarint32];
        System.arraycopy(bArr, i12, bArr2, 0, length);
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        return ByteString.wrap(bArr2);
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
        if (this.f27796e == this.f27794c) {
            e(1);
        }
        int i5 = this.f27796e;
        this.f27796e = i5 + 1;
        return this.f27793b[i5];
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i5) {
        int i10 = this.f27796e;
        if (i5 > this.f27794c - i10 || i5 <= 0) {
            return a(i5, false);
        }
        int i11 = i5 + i10;
        this.f27796e = i11;
        return Arrays.copyOfRange(this.f27793b, i10, i11);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() throws InvalidProtocolBufferException {
        int i5 = this.f27796e;
        if (this.f27794c - i5 < 4) {
            e(4);
            i5 = this.f27796e;
        }
        this.f27796e = i5 + 4;
        byte[] bArr = this.f27793b;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (bArr[i5] & ForkServer.ERROR) | ((bArr[i5 + 1] & ForkServer.ERROR) << 8) | ((bArr[i5 + 2] & ForkServer.ERROR) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() throws InvalidProtocolBufferException {
        int i5 = this.f27796e;
        if (this.f27794c - i5 < 8) {
            e(8);
            i5 = this.f27796e;
        }
        this.f27796e = i5 + 8;
        byte[] bArr = this.f27793b;
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i5;
        int i10 = this.f27796e;
        int i11 = this.f27794c;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f27793b;
            byte b5 = bArr[i10];
            if (b5 >= 0) {
                this.f27796e = i12;
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
                this.f27796e = i13;
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
        int i5 = this.f27796e;
        int i10 = this.f27794c;
        if (i10 != i5) {
            int i11 = i5 + 1;
            byte[] bArr = this.f27793b;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.f27796e = i11;
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
                this.f27796e = i12;
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
        byte[] bArr = this.f27793b;
        if (rawVarint32 > 0) {
            int i5 = this.f27794c;
            int i10 = this.f27796e;
            if (rawVarint32 <= i5 - i10) {
                String str = new String(bArr, i10, rawVarint32, Internal.UTF_8);
                this.f27796e += rawVarint32;
                return str;
            }
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (rawVarint32 > this.f27794c) {
            return new String(a(rawVarint32, false), Internal.UTF_8);
        }
        e(rawVarint32);
        String str2 = new String(bArr, this.f27796e, rawVarint32, Internal.UTF_8);
        this.f27796e += rawVarint32;
        return str2;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i5 = this.f27796e;
        int i10 = this.f27794c;
        int i11 = i10 - i5;
        byte[] bArrA = this.f27793b;
        if (rawVarint32 <= i11 && rawVarint32 > 0) {
            this.f27796e = i5 + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            i5 = 0;
            if (rawVarint32 <= i10) {
                e(rawVarint32);
                this.f27796e = rawVarint32;
            } else {
                bArrA = a(rawVarint32, false);
            }
        }
        return f2.f27676a.b(i5, rawVarint32, bArrA);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readTag() throws InvalidProtocolBufferException {
        if (isAtEnd()) {
            this.f27797f = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f27797f = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f27797f;
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
        this.f27798g = -this.f27796e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i5) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i5);
        int i10 = 0;
        if (tagWireType == 0) {
            if (this.f27794c - this.f27796e < 10) {
                while (i10 < 10) {
                    if (readRawByte() < 0) {
                        i10++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i10 < 10) {
                int i11 = this.f27796e;
                this.f27796e = i11 + 1;
                if (this.f27793b[i11] < 0) {
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
        int i10 = this.f27794c;
        int i11 = this.f27796e;
        if (i5 <= i10 - i11 && i5 >= 0) {
            this.f27796e = i11 + i5;
            return;
        }
        InputStream inputStream = this.f27792a;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i12 = this.f27798g;
        int i13 = i12 + i11;
        int i14 = i13 + i5;
        int i15 = this.f27799h;
        if (i14 > i15) {
            skipRawBytes((i15 - i12) - i11);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f27798g = i13;
        int i16 = i10 - i11;
        this.f27794c = 0;
        this.f27796e = 0;
        while (i16 < i5) {
            long j8 = i5 - i16;
            try {
                try {
                    long jSkip = inputStream.skip(j8);
                    if (jSkip < 0 || jSkip > j8) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i16 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e7) {
                    e7.setThrownFromInputStream();
                    throw e7;
                }
            } catch (Throwable th) {
                this.f27798g += i16;
                d();
                throw th;
            }
        }
        this.f27798g += i16;
        d();
        if (i16 >= i5) {
            return;
        }
        int i17 = this.f27794c;
        int i18 = i17 - this.f27796e;
        this.f27796e = i17;
        e(1);
        while (true) {
            int i19 = i5 - i18;
            int i20 = this.f27794c;
            if (i19 <= i20) {
                this.f27796e = i19;
                return;
            } else {
                i18 += i20;
                this.f27796e = i20;
                e(1);
            }
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
