package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class abnv implements java.lang.Iterable, java.io.Serializable {
    public static final defpackage.abnv d = new defpackage.abnt(defpackage.abpk.a);
    private static final long serialVersionUID = 1;
    private int a = 0;

    public static boolean C(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        defpackage.a.E(i, i4, bArr.length);
        defpackage.a.E(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static defpackage.abnv E(byte[] bArr, int i, int i2) throws defpackage.abpp {
        if (i2 == 0) {
            return d;
        }
        defpackage.a.E(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new defpackage.abnt(bArr2);
    }

    static defpackage.abnv F(byte[] bArr) throws defpackage.abpp {
        return bArr.length == 0 ? d : new defpackage.abnt(bArr);
    }

    private static defpackage.abnv o(java.util.Iterator it, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.ROOT, "length (%s) must be >= 1", java.lang.Integer.valueOf(i)));
        }
        if (i == 1) {
            return (defpackage.abnv) it.next();
        }
        int i2 = i >>> 1;
        return o(it, i2).s(o(it, i - i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.abnv t(java.lang.Iterable iterable) {
        int size;
        if (iterable instanceof java.util.Collection) {
            size = iterable.size();
        } else {
            java.util.Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? d : o(iterable.iterator(), size);
    }

    public static defpackage.abnv u(java.nio.ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return d;
        }
        defpackage.a.E(0, iRemaining, byteBuffer.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        return new defpackage.abnt(bArr);
    }

    public static defpackage.abnv v(byte[] bArr) {
        try {
            return E(bArr, 0, bArr.length);
        } catch (defpackage.abpp e) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static defpackage.abnv w(byte[] bArr, int i, int i2) {
        try {
            return E(bArr, i, i2);
        } catch (defpackage.abpp e) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static defpackage.abnv y(byte[] bArr) {
        try {
            return F(bArr);
        } catch (defpackage.abpp e) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @java.lang.Deprecated
    public final void A(byte[] bArr, int i, int i2, int i3) {
        defpackage.a.E(i, i + i3, d());
        defpackage.a.E(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            k(bArr, i, i2, i3);
        }
    }

    public final boolean B() {
        return d() == 0;
    }

    public final byte[] D() {
        int iD = d();
        if (iD == 0) {
            return defpackage.abpk.a;
        }
        byte[] bArr = new byte[iD];
        k(bArr, 0, 0, iD);
        return bArr;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    protected abstract int c(int i, int i2, int i3);

    public abstract int d();

    public abstract defpackage.abnv e(int i, int i2);

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.abnv)) {
            return false;
        }
        defpackage.abnv abnvVar = (defpackage.abnv) obj;
        int iD = d();
        if (iD != abnvVar.d()) {
            return false;
        }
        if (iD == 0) {
            return true;
        }
        int i = this.a;
        int i2 = abnvVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return n(abnvVar);
        }
        return false;
    }

    public abstract defpackage.abnv f(int i, int i2);

    public abstract defpackage.abny g();

    public abstract java.io.InputStream h();

    public final int hashCode() {
        int iC = this.a;
        if (iC == 0) {
            int iD = d();
            iC = c(iD, 0, iD);
            if (iC == 0) {
                iC = 1;
            }
            this.a = iC;
        }
        return iC;
    }

    protected abstract java.lang.String i(java.nio.charset.Charset charset);

    public abstract java.nio.ByteBuffer j();

    protected abstract void k(byte[] bArr, int i, int i2, int i3);

    public abstract void l(defpackage.abnn abnnVar) throws java.io.IOException;

    public abstract void m(java.io.OutputStream outputStream) throws java.io.IOException;

    protected abstract boolean n(defpackage.abnv abnvVar);

    protected abstract int p();

    public abstract boolean q();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public abnr iterator() {
        return new abno(this);
    }

    public final defpackage.abnv s(defpackage.abnv abnvVar) {
        if (Integer.MAX_VALUE - d() < abnvVar.d()) {
            throw new java.lang.IllegalArgumentException("ByteString would be too long: " + d() + "+" + abnvVar.d());
        }
        int[] iArr = abqm.a;
        if (abnvVar.d() != 0) {
            if (d() == 0) {
                return abnvVar;
            }
            int iD = d() + abnvVar.d();
            if (iD < 128) {
                return abqm.G(this, abnvVar);
            }
            if (this instanceof abqm) {
                abqm abqmVar = (abqm) this;
                defpackage.abnv abnvVar2 = abqmVar.e;
                if (abnvVar2.d() + abnvVar.d() < 128) {
                    return new abqm(abqmVar.c, abqm.G(abnvVar2, abnvVar));
                }
                defpackage.abnv abnvVar3 = abqmVar.c;
                if (abnvVar3.p() > abnvVar2.p() && abqmVar.f > abnvVar.p()) {
                    return new abqm(abnvVar3, new abqm(abnvVar2, abnvVar));
                }
            }
            if (iD >= abqm.o(java.lang.Math.max(p(), abnvVar.p()) + 1)) {
                return new abqm(this, abnvVar);
            }
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            defpackage.acmh.E(this, arrayDeque);
            defpackage.acmh.E(abnvVar, arrayDeque);
            this = (defpackage.abnv) arrayDeque.pop();
            while (!arrayDeque.isEmpty()) {
                this = new abqm((defpackage.abnv) arrayDeque.pop(), this);
            }
        }
        return this;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(d()), d() <= 50 ? abqu.a(this) : abqu.a(f(0, 47)).concat("..."));
    }

    public final defpackage.abnv x(int i) {
        return e(i, d());
    }

    public final java.lang.String z(java.nio.charset.Charset charset) {
        return B() ? "" : i(charset);
    }
}
