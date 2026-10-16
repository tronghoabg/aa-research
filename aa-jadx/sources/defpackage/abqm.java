package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abqm extends defpackage.abnv {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY};
    private static final long serialVersionUID = 1;
    public final int b;
    public final defpackage.abnv c;
    public final defpackage.abnv e;
    public final int f;
    private final int g;

    public abqm(defpackage.abnv abnvVar, defpackage.abnv abnvVar2) {
        this.c = abnvVar;
        this.e = abnvVar2;
        int iD = abnvVar.d();
        this.g = iD;
        this.b = iD + abnvVar2.d();
        this.f = java.lang.Math.max(abnvVar.p(), abnvVar2.p()) + 1;
    }

    public static defpackage.abnv G(defpackage.abnv abnvVar, defpackage.abnv abnvVar2) {
        int iD = abnvVar.d();
        int iD2 = abnvVar2.d();
        byte[] bArr = new byte[iD + iD2];
        abnvVar.A(bArr, 0, 0, iD);
        abnvVar2.A(bArr, 0, iD, iD2);
        return defpackage.abnv.y(bArr);
    }

    public static int o(int i) {
        int[] iArr = a;
        int length = iArr.length;
        return i >= 47 ? androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY : iArr[i];
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
        throw new java.io.InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.abnv
    public final byte a(int i) {
        defpackage.a.F(i, this.b);
        return b(i);
    }

    @Override // defpackage.abnv
    public final byte b(int i) {
        int i2 = this.g;
        return i < i2 ? this.c.b(i) : this.e.b(i - i2);
    }

    @Override // defpackage.abnv
    protected final int c(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.g;
        if (i4 <= i5) {
            return this.c.c(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.e.c(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.e.c(this.c.c(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.abnv
    public final int d() {
        return this.b;
    }

    @Override // defpackage.abnv
    public final defpackage.abnv e(int i, int i2) {
        return f(i, i2);
    }

    @Override // defpackage.abnv
    public final defpackage.abnv f(int i, int i2) {
        int i3 = this.b;
        int iE = defpackage.a.E(i, i2, i3);
        if (iE == 0) {
            return defpackage.abnv.d;
        }
        if (iE == i3) {
            return this;
        }
        int i4 = this.g;
        if (i2 <= i4) {
            return this.c.e(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.e.e(i - i4, i5);
        }
        return new defpackage.abqm(this.c.x(i), this.e.e(0, i5));
    }

    @Override // defpackage.abnv
    public final defpackage.abny g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.abqk abqkVar = new defpackage.abqk(this);
        while (abqkVar.hasNext()) {
            arrayList.add(abqkVar.next().j());
        }
        int i = defpackage.abny.l;
        return defpackage.abny.L(new defpackage.abpq(arrayList));
    }

    @Override // defpackage.abnv
    public final java.io.InputStream h() {
        return new defpackage.abql(this);
    }

    @Override // defpackage.abnv
    protected final java.lang.String i(java.nio.charset.Charset charset) {
        return new java.lang.String(D(), charset);
    }

    @Override // defpackage.abnv, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new defpackage.abqj(this);
    }

    @Override // defpackage.abnv
    public final java.nio.ByteBuffer j() {
        return java.nio.ByteBuffer.wrap(D()).asReadOnlyBuffer();
    }

    @Override // defpackage.abnv
    protected final void k(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.g;
        if (i4 <= i5) {
            this.c.k(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.e.k(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.c.k(bArr, i, i2, i6);
            this.e.k(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.abnv
    public final void l(defpackage.abnn abnnVar) throws java.io.IOException {
        this.c.l(abnnVar);
        this.e.l(abnnVar);
    }

    @Override // defpackage.abnv
    public final void m(java.io.OutputStream outputStream) throws java.io.IOException {
        this.c.m(outputStream);
        this.e.m(outputStream);
    }

    @Override // defpackage.abnv
    public final boolean n(defpackage.abnv abnvVar) {
        defpackage.abns abnsVarA;
        defpackage.abqk abqkVar = new defpackage.abqk(this);
        defpackage.abns abnsVarA2 = abqkVar.next();
        defpackage.abqk abqkVar2 = new defpackage.abqk(abnvVar);
        defpackage.abns abnsVarA3 = abqkVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iD = abnsVarA2.d() - i;
            int iD2 = abnsVarA3.d() - i2;
            int iMin = java.lang.Math.min(iD, iD2);
            if (!(i == 0 ? abnsVarA2.o(abnsVarA3, i2, iMin) : abnsVarA3.o(abnsVarA2, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.b;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (iMin == iD) {
                abnsVarA = abqkVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iD2) {
                abnsVarA2 = abnsVarA2;
                abnsVarA2 = abnsVarA;
                abnsVarA3 = abqkVar2.next();
                i2 = 0;
            } else {
                abnsVarA2 = abnsVarA2;
                abnsVarA2 = abnsVarA;
                i2 += iMin;
            }
        }
    }

    @Override // defpackage.abnv
    protected final int p() {
        return this.f;
    }

    @Override // defpackage.abnv
    public final boolean q() {
        return this.b >= o(this.f);
    }

    @Override // defpackage.abnv
    /* JADX INFO: renamed from: r */
    public final defpackage.abnr iterator() {
        return new defpackage.abqj(this);
    }

    java.lang.Object writeReplace() {
        return defpackage.abnv.y(D());
    }
}
