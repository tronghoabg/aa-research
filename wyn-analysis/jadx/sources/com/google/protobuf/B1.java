package com.google.protobuf;

import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
public final class B1 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public A1 f27522a;

    /* renamed from: b, reason: collision with root package name */
    public r f27523b;

    /* renamed from: c, reason: collision with root package name */
    public int f27524c;

    /* renamed from: d, reason: collision with root package name */
    public int f27525d;

    /* renamed from: e, reason: collision with root package name */
    public int f27526e;

    /* renamed from: f, reason: collision with root package name */
    public int f27527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1 f27528g;

    public B1(C1 c12) {
        this.f27528g = c12;
        A1 a12 = new A1(c12);
        this.f27522a = a12;
        r rVarA = a12.a();
        this.f27523b = rVarA;
        this.f27524c = rVarA.size();
        this.f27525d = 0;
        this.f27526e = 0;
    }

    public final void a() {
        if (this.f27523b != null) {
            int i5 = this.f27525d;
            int i10 = this.f27524c;
            if (i5 == i10) {
                this.f27526e += i10;
                this.f27525d = 0;
                if (!this.f27522a.hasNext()) {
                    this.f27523b = null;
                    this.f27524c = 0;
                } else {
                    r rVarA = this.f27522a.a();
                    this.f27523b = rVarA;
                    this.f27524c = rVarA.size();
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f27528g.f27531a - (this.f27526e + this.f27525d);
    }

    public final int b(byte[] bArr, int i5, int i10) {
        int i11 = i10;
        while (i11 > 0) {
            a();
            if (this.f27523b == null) {
                break;
            }
            int iMin = Math.min(this.f27524c - this.f27525d, i11);
            if (bArr != null) {
                this.f27523b.copyTo(bArr, this.f27525d, i5, iMin);
                i5 += iMin;
            }
            this.f27525d += iMin;
            i11 -= iMin;
        }
        return i10 - i11;
    }

    @Override // java.io.InputStream
    public final void mark(int i5) {
        this.f27527f = this.f27526e + this.f27525d;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) {
        bArr.getClass();
        if (i5 < 0 || i10 < 0 || i10 > bArr.length - i5) {
            throw new IndexOutOfBoundsException();
        }
        int iB = b(bArr, i5, i10);
        if (iB != 0) {
            return iB;
        }
        if (i10 <= 0) {
            if (this.f27528g.f27531a - (this.f27526e + this.f27525d) != 0) {
                return iB;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        A1 a12 = new A1(this.f27528g);
        this.f27522a = a12;
        r rVarA = a12.a();
        this.f27523b = rVarA;
        this.f27524c = rVarA.size();
        this.f27525d = 0;
        this.f27526e = 0;
        b(null, 0, this.f27527f);
    }

    @Override // java.io.InputStream
    public final long skip(long j8) {
        if (j8 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j8 > 2147483647L) {
            j8 = 2147483647L;
        }
        return b(null, 0, (int) j8);
    }

    @Override // java.io.InputStream
    public final int read() {
        a();
        r rVar = this.f27523b;
        if (rVar == null) {
            return -1;
        }
        int i5 = this.f27525d;
        this.f27525d = i5 + 1;
        return rVar.byteAt(i5) & ForkServer.ERROR;
    }
}
