package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class D extends CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f27536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27537b;

    /* renamed from: c, reason: collision with root package name */
    public int f27538c;

    /* renamed from: d, reason: collision with root package name */
    public int f27539d;

    public D(int i5) {
        super();
        if (i5 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i5, 20)];
        this.f27536a = bArr;
        this.f27537b = bArr.length;
    }

    public final void a(byte b5) {
        int i5 = this.f27538c;
        this.f27538c = i5 + 1;
        this.f27536a[i5] = b5;
        this.f27539d++;
    }

    public final void b(int i5) {
        int i10 = this.f27538c;
        int i11 = i10 + 1;
        this.f27538c = i11;
        byte[] bArr = this.f27536a;
        bArr[i10] = (byte) (i5 & 255);
        int i12 = i10 + 2;
        this.f27538c = i12;
        bArr[i11] = (byte) ((i5 >> 8) & 255);
        int i13 = i10 + 3;
        this.f27538c = i13;
        bArr[i12] = (byte) ((i5 >> 16) & 255);
        this.f27538c = i10 + 4;
        bArr[i13] = (byte) ((i5 >> 24) & 255);
        this.f27539d += 4;
    }

    public final void c(long j8) {
        int i5 = this.f27538c;
        int i10 = i5 + 1;
        this.f27538c = i10;
        byte[] bArr = this.f27536a;
        bArr[i5] = (byte) (j8 & 255);
        int i11 = i5 + 2;
        this.f27538c = i11;
        bArr[i10] = (byte) ((j8 >> 8) & 255);
        int i12 = i5 + 3;
        this.f27538c = i12;
        bArr[i11] = (byte) ((j8 >> 16) & 255);
        int i13 = i5 + 4;
        this.f27538c = i13;
        bArr[i12] = (byte) (255 & (j8 >> 24));
        int i14 = i5 + 5;
        this.f27538c = i14;
        bArr[i13] = (byte) (((int) (j8 >> 32)) & 255);
        int i15 = i5 + 6;
        this.f27538c = i15;
        bArr[i14] = (byte) (((int) (j8 >> 40)) & 255);
        int i16 = i5 + 7;
        this.f27538c = i16;
        bArr[i15] = (byte) (((int) (j8 >> 48)) & 255);
        this.f27538c = i5 + 8;
        bArr[i16] = (byte) (((int) (j8 >> 56)) & 255);
        this.f27539d += 8;
    }

    public final void d(int i5, int i10) {
        e(WireFormat.makeTag(i5, i10));
    }

    public final void e(int i5) {
        boolean z2 = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f27536a;
        if (!z2) {
            while ((i5 & (-128)) != 0) {
                int i10 = this.f27538c;
                this.f27538c = i10 + 1;
                bArr[i10] = (byte) ((i5 & 127) | 128);
                this.f27539d++;
                i5 >>>= 7;
            }
            int i11 = this.f27538c;
            this.f27538c = i11 + 1;
            bArr[i11] = (byte) i5;
            this.f27539d++;
            return;
        }
        long j8 = this.f27538c;
        while ((i5 & (-128)) != 0) {
            int i12 = this.f27538c;
            this.f27538c = i12 + 1;
            d2.l(bArr, i12, (byte) ((i5 & 127) | 128));
            i5 >>>= 7;
        }
        int i13 = this.f27538c;
        this.f27538c = i13 + 1;
        d2.l(bArr, i13, (byte) i5);
        this.f27539d += (int) (this.f27538c - j8);
    }

    public final void f(long j8) {
        boolean z2 = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f27536a;
        if (!z2) {
            while ((j8 & (-128)) != 0) {
                int i5 = this.f27538c;
                this.f27538c = i5 + 1;
                bArr[i5] = (byte) ((((int) j8) & 127) | 128);
                this.f27539d++;
                j8 >>>= 7;
            }
            int i10 = this.f27538c;
            this.f27538c = i10 + 1;
            bArr[i10] = (byte) j8;
            this.f27539d++;
            return;
        }
        long j10 = this.f27538c;
        while ((j8 & (-128)) != 0) {
            int i11 = this.f27538c;
            this.f27538c = i11 + 1;
            d2.l(bArr, i11, (byte) ((((int) j8) & 127) | 128));
            j8 >>>= 7;
        }
        int i12 = this.f27538c;
        this.f27538c = i12 + 1;
        d2.l(bArr, i12, (byte) j8);
        this.f27539d += (int) (this.f27538c - j10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f27539d;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(byte[] bArr, int i5, int i10) {
        write(bArr, i5, i10);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(ByteBuffer byteBuffer) {
        write(byteBuffer);
    }
}
