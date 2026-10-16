package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ipr {
    public long a = 0;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public final ByteBuffer h;

    public ipr(int i, jdh jdhVar) {
        ByteBuffer byteBufferA = jdhVar.a(i + 10);
        byteBufferA.putShort((short) 0);
        byteBufferA.position(10);
        this.h = byteBufferA;
    }

    public final int a() {
        return this.h.arrayOffset() + 10;
    }

    public final int b() {
        return this.h.limit() - 10;
    }

    public final long c() {
        return this.g - this.b;
    }

    public final long d() {
        return this.c - this.b;
    }

    public final long e() {
        return this.f - this.e;
    }

    public final long f() {
        return this.e - this.d;
    }

    public final long g() {
        return this.d - this.c;
    }

    public final long h() {
        return this.g - this.f;
    }

    public final long i() {
        return this.g - this.d;
    }
}
