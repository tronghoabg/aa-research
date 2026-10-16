package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
public final class Q0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f27606a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f27607b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27608c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f27609d;

    /* renamed from: e, reason: collision with root package name */
    public int f27610e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27611f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f27612g;

    /* renamed from: h, reason: collision with root package name */
    public int f27613h;

    /* renamed from: i, reason: collision with root package name */
    public long f27614i;

    public Q0(Iterable iterable) {
        this.f27606a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f27608c++;
        }
        this.f27609d = -1;
        if (a()) {
            return;
        }
        this.f27607b = Internal.EMPTY_BYTE_BUFFER;
        this.f27609d = 0;
        this.f27610e = 0;
        this.f27614i = 0L;
    }

    public final boolean a() {
        this.f27609d++;
        Iterator it = this.f27606a;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f27607b = byteBuffer;
        this.f27610e = byteBuffer.position();
        if (this.f27607b.hasArray()) {
            this.f27611f = true;
            this.f27612g = this.f27607b.array();
            this.f27613h = this.f27607b.arrayOffset();
        } else {
            this.f27611f = false;
            this.f27614i = d2.b(this.f27607b);
            this.f27612g = null;
        }
        return true;
    }

    public final void b(int i5) {
        int i10 = this.f27610e + i5;
        this.f27610e = i10;
        if (i10 == this.f27607b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f27609d == this.f27608c) {
            return -1;
        }
        if (this.f27611f) {
            int i5 = this.f27612g[this.f27610e + this.f27613h] & ForkServer.ERROR;
            b(1);
            return i5;
        }
        int iF = d2.f27664c.f(this.f27610e + this.f27614i) & ForkServer.ERROR;
        b(1);
        return iF;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) {
        if (this.f27609d == this.f27608c) {
            return -1;
        }
        int iLimit = this.f27607b.limit();
        int i11 = this.f27610e;
        int i12 = iLimit - i11;
        if (i10 > i12) {
            i10 = i12;
        }
        if (this.f27611f) {
            System.arraycopy(this.f27612g, i11 + this.f27613h, bArr, i5, i10);
            b(i10);
            return i10;
        }
        int iPosition = this.f27607b.position();
        this.f27607b.position(this.f27610e);
        this.f27607b.get(bArr, i5, i10);
        this.f27607b.position(iPosition);
        b(i10);
        return i10;
    }
}
