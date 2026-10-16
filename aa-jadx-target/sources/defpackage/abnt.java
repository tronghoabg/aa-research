package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abnt extends defpackage.abns {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;

    public abnt(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.abnv
    public final byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.abnv
    public final byte b(int i) {
        return this.a[i];
    }

    @Override // defpackage.abnv
    protected final int c(int i, int i2, int i3) {
        return defpackage.abpk.a(i, this.a, i2, i3);
    }

    @Override // defpackage.abnv
    public final int d() {
        return this.a.length;
    }

    @Override // defpackage.abnv
    public final defpackage.abnv e(int i, int i2) {
        int iE = defpackage.a.E(i, i2, d());
        return iE == 0 ? defpackage.abnv.d : new abnq(this.a, i, iE);
    }

    @Override // defpackage.abnv
    public final defpackage.abnv f(int i, int i2) {
        int iE = defpackage.a.E(i, i2, d());
        return iE == 0 ? defpackage.abnv.d : new abnq(this.a, i, iE);
    }

    @Override // defpackage.abnv
    public final defpackage.abny g() {
        return defpackage.abny.N(this.a, 0, d());
    }

    @Override // defpackage.abnv
    public final java.io.InputStream h() {
        return new java.io.ByteArrayInputStream(this.a, 0, d());
    }

    @Override // defpackage.abnv
    protected final java.lang.String i(java.nio.charset.Charset charset) {
        return new java.lang.String(this.a, charset);
    }

    @Override // defpackage.abnv
    public final java.nio.ByteBuffer j() {
        return java.nio.ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }

    @Override // defpackage.abnv
    protected final void k(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.abnv
    public final void l(defpackage.abnn abnnVar) throws java.io.IOException {
        abnnVar.a(this.a, 0, d());
    }

    @Override // defpackage.abnv
    public final void m(java.io.OutputStream outputStream) throws java.io.IOException {
        outputStream.write(D());
    }

    @Override // defpackage.abnv
    protected final boolean n(defpackage.abnv abnvVar) {
        if (abnvVar instanceof defpackage.abnt) {
            return java.util.Arrays.equals(this.a, ((defpackage.abnt) abnvVar).a);
        }
        return abnvVar instanceof abnq ? o(abnvVar, 0, d()) : abnvVar.n(this);
    }

    @Override // defpackage.abns
    public final boolean o(defpackage.abnv abnvVar, int i, int i2) {
        if (i2 > abnvVar.d()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + i2 + d());
        }
        int i3 = i + i2;
        if (i3 <= abnvVar.d()) {
            if (abnvVar instanceof defpackage.abnt) {
                return defpackage.abnv.C(this.a, 0, ((defpackage.abnt) abnvVar).a, i, i2);
            }
            if (!(abnvVar instanceof abnq)) {
                return abnvVar.f(i, i3).equals(f(0, i2));
            }
            abnq abnqVar = (abnq) abnvVar;
            byte[] bArr = this.a;
            int i4 = abnq.c;
            return defpackage.abnv.C(bArr, 0, abnqVar.a, abnqVar.b + i, i2);
        }
        throw new java.lang.IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + abnvVar.d());
    }
}
