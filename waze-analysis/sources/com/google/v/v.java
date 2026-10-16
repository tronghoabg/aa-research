package com.google.v;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class v implements Iterable<Byte>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final v f13054a = new u(ep.f12912a);
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f13055b = 0;

    v() {
    }

    static int p(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static v q(byte[] bArr) {
        return r(bArr, 0, bArr.length);
    }

    public static v r(byte[] bArr, int i2, int i3) {
        try {
            return y(bArr, i2, i3);
        } catch (eu e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    public static v s(String str) {
        return str.isEmpty() ? f13054a : new u(str.getBytes(StandardCharsets.UTF_8));
    }

    static v t(byte[] bArr) {
        try {
            return z(bArr);
        } catch (eu e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    static /* bridge */ /* synthetic */ boolean v(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = i2 + i4;
        p(i2, i5, bArr.length);
        p(i3, i4 + i3, bArr2.length);
        while (i2 < i5) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    static v y(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return f13054a;
        }
        p(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new u(bArr2);
    }

    static v z(byte[] bArr) {
        return bArr.length == 0 ? f13054a : new u(bArr);
    }

    abstract byte a(int i2);

    public abstract int c();

    public abstract v d(int i2, int i3);

    public abstract v e(int i2, int i3);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        int iC = c();
        if (iC != vVar.c()) {
            return false;
        }
        if (iC == 0) {
            return true;
        }
        int i2 = this.f13055b;
        int i3 = vVar.f13055b;
        if (i2 == 0 || i3 == 0 || i2 == i3) {
            return k(vVar);
        }
        return false;
    }

    public abstract z f();

    public abstract InputStream g();

    protected abstract String h(Charset charset);

    public final int hashCode() {
        int iO = this.f13055b;
        if (iO == 0) {
            int iC = c();
            iO = o(iC, iC);
            if (iO == 0) {
                iO = 1;
            }
            this.f13055b = iO;
        }
        return iO;
    }

    public abstract ByteBuffer i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new r(this);
    }

    abstract void j(q qVar);

    protected abstract boolean k(v vVar);

    public abstract boolean l();

    protected abstract void n(byte[] bArr, int i2);

    protected abstract int o(int i2, int i3);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c()), c() <= 50 ? dc.g(this) : dc.g(e(0, 47)).concat("..."));
    }

    public final String u() {
        return w() ? "" : h(StandardCharsets.UTF_8);
    }

    public final boolean w() {
        return c() == 0;
    }

    public final byte[] x() {
        int iC = c();
        if (iC == 0) {
            return ep.f12912a;
        }
        byte[] bArr = new byte[iC];
        n(bArr, iC);
        return bArr;
    }
}
