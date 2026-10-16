package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1847x extends CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f27773a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f27774b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f27775c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27776d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27777e;

    /* renamed from: f, reason: collision with root package name */
    public int f27778f;

    /* renamed from: g, reason: collision with root package name */
    public int f27779g;

    /* renamed from: h, reason: collision with root package name */
    public int f27780h;

    /* renamed from: i, reason: collision with root package name */
    public int f27781i;

    /* renamed from: j, reason: collision with root package name */
    public int f27782j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public long f27783l;

    /* renamed from: m, reason: collision with root package name */
    public long f27784m;

    /* renamed from: n, reason: collision with root package name */
    public long f27785n;

    /* renamed from: o, reason: collision with root package name */
    public long f27786o;

    public C1847x(Iterable iterable, int i5, boolean z2) {
        super();
        this.f27780h = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f27778f = i5;
        this.f27773a = iterable;
        this.f27774b = iterable.iterator();
        this.f27776d = z2;
        this.f27782j = 0;
        this.k = 0;
        if (i5 != 0) {
            g();
            return;
        }
        this.f27775c = Internal.EMPTY_BYTE_BUFFER;
        this.f27783l = 0L;
        this.f27784m = 0L;
        this.f27786o = 0L;
        this.f27785n = 0L;
    }

    public final long a() {
        return this.f27786o - this.f27783l;
    }

    public final void b() throws InvalidProtocolBufferException {
        if (!this.f27774b.hasNext()) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        g();
    }

    public final void c(int i5, byte[] bArr) throws InvalidProtocolBufferException {
        if (i5 < 0 || i5 > e()) {
            if (i5 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 != 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            return;
        }
        int i10 = i5;
        while (i10 > 0) {
            if (a() == 0) {
                b();
            }
            int iMin = Math.min(i10, (int) a());
            long j8 = iMin;
            d2.f(this.f27783l, bArr, i5 - i10, j8);
            i10 -= iMin;
            this.f27783l += j8;
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i5) throws InvalidProtocolBufferException {
        if (this.f27781i != i5) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final void d() {
        int i5 = this.f27778f + this.f27779g;
        this.f27778f = i5;
        int i10 = i5 - this.k;
        int i11 = this.f27780h;
        if (i10 <= i11) {
            this.f27779g = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f27779g = i12;
        this.f27778f = i5 - i12;
    }

    public final int e() {
        return (int) (((this.f27778f - this.f27782j) - this.f27783l) + this.f27784m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z2) {
        this.f27777e = z2;
    }

    public final ByteBuffer f(int i5, int i10) {
        int iPosition = this.f27775c.position();
        int iLimit = this.f27775c.limit();
        ByteBuffer byteBuffer = this.f27775c;
        try {
            try {
                byteBuffer.position(i5);
                byteBuffer.limit(i10);
                return this.f27775c.slice();
            } catch (IllegalArgumentException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } finally {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
        }
    }

    public final void g() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f27774b.next();
        this.f27775c = byteBuffer;
        this.f27782j += (int) (this.f27783l - this.f27784m);
        long jPosition = byteBuffer.position();
        this.f27783l = jPosition;
        this.f27784m = jPosition;
        this.f27786o = this.f27775c.limit();
        long jB = d2.b(this.f27775c);
        this.f27785n = jB;
        this.f27783l += jB;
        this.f27784m += jB;
        this.f27786o += jB;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i5 = this.f27780h;
        if (i5 == Integer.MAX_VALUE) {
            return -1;
        }
        return i5 - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f27781i;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return (int) (((this.f27782j - this.k) + this.f27783l) - this.f27784m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        return (((long) this.f27782j) + this.f27783l) - this.f27784m == ((long) this.f27778f);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i5) {
        this.f27780h = i5;
        d();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i5) throws InvalidProtocolBufferException {
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i5;
        int i10 = this.f27780h;
        if (totalBytesRead > i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f27780h = totalBytesRead;
        d();
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
            long j8 = rawVarint32;
            if (j8 <= a()) {
                if (this.f27776d || !this.f27777e) {
                    byte[] bArr = new byte[rawVarint32];
                    d2.f(this.f27783l, bArr, 0L, j8);
                    this.f27783l += j8;
                    return ByteBuffer.wrap(bArr);
                }
                long j10 = this.f27783l + j8;
                this.f27783l = j10;
                long j11 = j10 - this.f27785n;
                return f((int) (j11 - j8), (int) j11);
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= e()) {
            byte[] bArr2 = new byte[rawVarint32];
            c(rawVarint32, bArr2);
            return ByteBuffer.wrap(bArr2);
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
    public final ByteString readBytes() throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        boolean z2 = this.f27776d;
        if (rawVarint32 > 0) {
            long j8 = rawVarint32;
            long j10 = this.f27786o;
            long j11 = this.f27783l;
            if (j8 <= j10 - j11) {
                if (z2 && this.f27777e) {
                    int i5 = (int) (j11 - this.f27785n);
                    ByteString byteStringWrap = ByteString.wrap(f(i5, rawVarint32 + i5));
                    this.f27783l += j8;
                    return byteStringWrap;
                }
                byte[] bArr = new byte[rawVarint32];
                d2.f(j11, bArr, 0L, j8);
                this.f27783l += j8;
                return ByteString.wrap(bArr);
            }
        }
        if (rawVarint32 <= 0 || rawVarint32 > e()) {
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (!z2 || !this.f27777e) {
            byte[] bArr2 = new byte[rawVarint32];
            c(rawVarint32, bArr2);
            return ByteString.wrap(bArr2);
        }
        ArrayList arrayList = new ArrayList();
        while (rawVarint32 > 0) {
            if (a() == 0) {
                b();
            }
            int iMin = Math.min(rawVarint32, (int) a());
            int i10 = (int) (this.f27783l - this.f27785n);
            arrayList.add(ByteString.wrap(f(i10, i10 + iMin)));
            rawVarint32 -= iMin;
            this.f27783l += iMin;
        }
        return ByteString.copyFrom(arrayList);
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
        if (a() == 0) {
            b();
        }
        long j8 = this.f27783l;
        this.f27783l = 1 + j8;
        return d2.f27664c.f(j8);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i5) throws InvalidProtocolBufferException {
        if (i5 >= 0) {
            long j8 = i5;
            if (j8 <= a()) {
                byte[] bArr = new byte[i5];
                d2.f(this.f27783l, bArr, 0L, j8);
                this.f27783l += j8;
                return bArr;
            }
        }
        if (i5 >= 0 && i5 <= e()) {
            byte[] bArr2 = new byte[i5];
            c(i5, bArr2);
            return bArr2;
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
    public final int readRawLittleEndian32() {
        if (a() < 4) {
            return (readRawByte() & ForkServer.ERROR) | ((readRawByte() & ForkServer.ERROR) << 8) | ((readRawByte() & ForkServer.ERROR) << 16) | ((readRawByte() & ForkServer.ERROR) << 24);
        }
        long j8 = this.f27783l;
        this.f27783l = 4 + j8;
        c2 c2Var = d2.f27664c;
        return ((c2Var.f(j8 + 3) & ForkServer.ERROR) << 24) | (c2Var.f(j8) & ForkServer.ERROR) | ((c2Var.f(1 + j8) & ForkServer.ERROR) << 8) | ((c2Var.f(2 + j8) & ForkServer.ERROR) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        if (a() < 8) {
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
        }
        this.f27783l = 8 + this.f27783l;
        c2 c2Var = d2.f27664c;
        return (c2Var.f(r13) & 255) | ((c2Var.f(r13 + 1) & 255) << 8) | ((c2Var.f(r13 + 2) & 255) << 16) | ((c2Var.f(3 + r13) & 255) << 24) | ((c2Var.f(4 + r13) & 255) << 32) | ((c2Var.f(5 + r13) & 255) << 40) | ((c2Var.f(6 + r13) & 255) << 48) | ((c2Var.f(r13 + 7) & 255) << 56);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i5;
        long j8 = this.f27783l;
        if (this.f27786o != j8) {
            long j10 = j8 + 1;
            c2 c2Var = d2.f27664c;
            byte bF = c2Var.f(j8);
            if (bF >= 0) {
                this.f27783l++;
                return bF;
            }
            if (this.f27786o - this.f27783l >= 10) {
                long j11 = 2 + j8;
                int iF = (c2Var.f(j10) << 7) ^ bF;
                if (iF < 0) {
                    i5 = iF ^ (-128);
                } else {
                    long j12 = 3 + j8;
                    int iF2 = (c2Var.f(j11) << 14) ^ iF;
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
                                            j12 = 9 + j8;
                                            if (c2Var.f(j13) < 0) {
                                                long j14 = j8 + 10;
                                                if (c2Var.f(j12) >= 0) {
                                                    i5 = i10;
                                                    j11 = j14;
                                                }
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
                this.f27783l = j11;
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
        long j12 = this.f27783l;
        if (this.f27786o != j12) {
            long j13 = j12 + 1;
            c2 c2Var = d2.f27664c;
            byte bF = c2Var.f(j12);
            if (bF >= 0) {
                this.f27783l++;
                return bF;
            }
            if (this.f27786o - this.f27783l >= 10) {
                long j14 = 2 + j12;
                int iF = (c2Var.f(j13) << 7) ^ bF;
                if (iF < 0) {
                    j8 = iF ^ (-128);
                } else {
                    long j15 = 3 + j12;
                    int iF2 = (c2Var.f(j14) << 14) ^ iF;
                    if (iF2 >= 0) {
                        j8 = iF2 ^ 16256;
                    } else {
                        long j16 = 4 + j12;
                        int iF3 = iF2 ^ (c2Var.f(j15) << 21);
                        if (iF3 < 0) {
                            j8 = (-2080896) ^ iF3;
                            j14 = j16;
                        } else {
                            long j17 = 5 + j12;
                            long jF = (c2Var.f(j16) << 28) ^ iF3;
                            if (jF >= 0) {
                                j11 = 266354560;
                            } else {
                                j15 = 6 + j12;
                                long jF2 = jF ^ (c2Var.f(j17) << 35);
                                if (jF2 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j17 = 7 + j12;
                                    jF = jF2 ^ (c2Var.f(j15) << 42);
                                    if (jF >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j15 = 8 + j12;
                                        jF2 = jF ^ (c2Var.f(j17) << 49);
                                        if (jF2 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j17 = 9 + j12;
                                            long jF3 = (jF2 ^ (c2Var.f(j15) << 56)) ^ 71499008037633920L;
                                            if (jF3 < 0) {
                                                long j18 = j12 + 10;
                                                if (c2Var.f(j17) >= 0) {
                                                    j14 = j18;
                                                    j8 = jF3;
                                                }
                                            } else {
                                                j8 = jF3;
                                                j14 = j17;
                                            }
                                        }
                                    }
                                }
                                j8 = j10 ^ jF2;
                            }
                            j8 = j11 ^ jF;
                            j14 = j17;
                        }
                    }
                    j14 = j15;
                }
                this.f27783l = j14;
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
            long j8 = rawVarint32;
            long j10 = this.f27786o;
            long j11 = this.f27783l;
            if (j8 <= j10 - j11) {
                byte[] bArr = new byte[rawVarint32];
                d2.f(j11, bArr, 0L, j8);
                String str = new String(bArr, Internal.UTF_8);
                this.f27783l += j8;
                return str;
            }
        }
        if (rawVarint32 > 0 && rawVarint32 <= e()) {
            byte[] bArr2 = new byte[rawVarint32];
            c(rawVarint32, bArr2);
            return new String(bArr2, Internal.UTF_8);
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
            long j8 = rawVarint32;
            long j10 = this.f27786o;
            long j11 = this.f27783l;
            if (j8 <= j10 - j11) {
                String strC = f2.c(this.f27775c, (int) (j11 - this.f27784m), rawVarint32);
                this.f27783l += j8;
                return strC;
            }
        }
        if (rawVarint32 >= 0 && rawVarint32 <= e()) {
            byte[] bArr = new byte[rawVarint32];
            c(rawVarint32, bArr);
            return f2.f27676a.b(0, rawVarint32, bArr);
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
            this.f27781i = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f27781i = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f27781i;
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
        this.k = (int) ((this.f27782j + this.f27783l) - this.f27784m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i5) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i5);
        if (tagWireType == 0) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
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
        if (i5 < 0 || i5 > ((this.f27778f - this.f27782j) - this.f27783l) + this.f27784m) {
            if (i5 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        while (i5 > 0) {
            if (a() == 0) {
                b();
            }
            int iMin = Math.min(i5, (int) a());
            i5 -= iMin;
            this.f27783l += iMin;
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
