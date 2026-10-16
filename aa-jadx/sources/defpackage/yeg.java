package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yeg extends defpackage.yed {
    transient long[] g;
    private transient int h;
    private transient int i;

    public yeg() {
        super(3);
    }

    private final void A(int i, long j) {
        C()[i] = j;
    }

    private final void B(int i, int i2) {
        if (i == -2) {
            this.h = i2;
            i = -2;
        } else {
            A(i, (z(i) & (-4294967296L)) | (((long) (i2 + 1)) & 4294967295L));
        }
        if (i2 == -2) {
            this.i = i;
        } else {
            A(i2, (4294967295L & z(i2)) | (((long) (i + 1)) << 32));
        }
    }

    private final long[] C() {
        long[] jArr = this.g;
        jArr.getClass();
        return jArr;
    }

    private final int y(int i) {
        return ((int) (z(i) >>> 32)) - 1;
    }

    private final long z(int i) {
        return C()[i];
    }

    @Override // defpackage.yed
    public final int a(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // defpackage.yed
    public final int b() {
        int iB = super.b();
        this.g = new long[iB];
        return iB;
    }

    @Override // defpackage.yed
    public final int c() {
        return this.h;
    }

    @Override // defpackage.yed, java.util.Map
    public final void clear() {
        if (u()) {
            return;
        }
        this.h = -2;
        this.i = -2;
        long[] jArr = this.g;
        if (jArr != null) {
            java.util.Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // defpackage.yed
    public final int d(int i) {
        return ((int) z(i)) - 1;
    }

    @Override // defpackage.yed
    public final java.util.Map l() {
        java.util.Map mapL = super.l();
        this.g = null;
        return mapL;
    }

    @Override // defpackage.yed
    public final java.util.Map m(int i) {
        return new java.util.LinkedHashMap(i, 1.0f, false);
    }

    @Override // defpackage.yed
    public final void p(int i) {
        super.p(i);
        this.h = -2;
        this.i = -2;
    }

    @Override // defpackage.yed
    public final void q(int i, java.lang.Object obj, java.lang.Object obj2, int i2, int i3) {
        super.q(i, obj, obj2, i2, i3);
        B(this.i, i);
        B(i, -2);
    }

    @Override // defpackage.yed
    public final void r(int i, int i2) {
        int size = size() - 1;
        super.r(i, i2);
        B(y(i), d(i));
        if (i < size) {
            B(y(size), i);
            B(i, d(size));
        }
        A(size, 0L);
    }

    @Override // defpackage.yed
    public final void s(int i) {
        super.s(i);
        this.g = java.util.Arrays.copyOf(C(), i);
    }
}
