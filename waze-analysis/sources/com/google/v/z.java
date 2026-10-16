package com.google.v;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class z {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13068f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static volatile int f13069g = 100;

    /* renamed from: a, reason: collision with root package name */
    int f13070a;

    /* renamed from: b, reason: collision with root package name */
    int f13071b;

    /* renamed from: c, reason: collision with root package name */
    final int f13072c = f13069g;

    /* renamed from: d, reason: collision with root package name */
    int f13073d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    Object f13074e;

    private z() {
    }

    public static int O(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static int P(int i2, InputStream inputStream) throws IOException {
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i4 = 7;
        while (i4 < 32) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i3 |= (i5 & 127) << i4;
            if ((i5 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        while (i4 < 64) {
            int i6 = inputStream.read();
            if (i6 == -1) {
                throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i6 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        throw new eu("CodedInputStream encountered a malformed varint.");
    }

    public static long Q(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }

    public static z R(byte[] bArr) {
        return S(bArr, 0, 0);
    }

    public static z S(byte[] bArr, int i2, int i3) {
        return Z(bArr, i2, i3);
    }

    static /* bridge */ /* synthetic */ void T(byte[] bArr, int i2, int i3) {
        if ((bArr.length - i2) - i3 < 0 || (i2 | i3) < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static z X(InputStream inputStream) {
        return inputStream == null ? R(ep.f12912a) : new y(inputStream);
    }

    static z Z(byte[] bArr, int i2, int i3) {
        x xVar = new x(bArr, i2, i3);
        try {
            xVar.f(i3);
            return xVar;
        } catch (eu e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract long A();

    public abstract v B();

    public abstract String C();

    public abstract String D();

    public abstract void E(int i2);

    public abstract void F(int i2);

    public abstract void G(int i2, fh fhVar, de deVar);

    public abstract void H(fh fhVar, de deVar);

    public abstract void I(int i2);

    public abstract boolean J();

    public abstract boolean K();

    public abstract boolean L(int i2);

    public abstract byte[] M();

    public final void U() throws eu {
        if (this.f13070a + this.f13071b >= this.f13072c) {
            throw new eu("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void V() {
        if (this.f13071b == 0) {
            E(0);
        }
    }

    public final void W() throws eu {
        int iQ;
        do {
            iQ = q();
            if (iQ == 0) {
                return;
            }
            U();
            this.f13071b++;
            this.f13071b--;
        } while (L(iQ));
    }

    public final void Y() {
        this.f13073d = Integer.MAX_VALUE;
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e();

    public abstract int f(int i2);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int k();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s(byte[] bArr, int i2, int i3);

    public abstract long t();

    public abstract long u();

    public abstract long w();

    public abstract long y();

    public abstract long z();

    /* synthetic */ z(byte[] bArr) {
    }
}
