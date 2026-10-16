package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tpd {
    public static final defpackage.tpo[] a = new defpackage.tpo[0];

    public abstract int b(defpackage.abnv abnvVar) throws java.io.IOException;

    protected int c(defpackage.abnv abnvVar, int i) throws java.io.IOException {
        int iB = b(abnvVar);
        if (i <= iB) {
            return i == 0 ? iB : i;
        }
        throw new java.io.IOException("Buffer too small for the given number of vertices");
    }

    public int d() {
        return 0;
    }

    public int e() {
        return 0;
    }

    public int f() {
        return 0;
    }

    public final defpackage.tpo g(defpackage.abnv abnvVar, int i) throws java.io.IOException {
        return new defpackage.tpo(n(abnvVar, i), 0, 0, 0);
    }

    public abstract void h(defpackage.abnv abnvVar, int i, float[] fArr);

    public void i(defpackage.abnv abnvVar, defpackage.tpm tpmVar) throws java.io.IOException {
        int[] iArrN = n(abnvVar, 1);
        if (iArrN.length < 2) {
            throw new java.io.IOException("Too few vertices for getPoint");
        }
        tpmVar.r(iArrN[0], iArrN[1]);
    }

    public abstract void j(defpackage.abnv abnvVar, int i, int[] iArr) throws java.io.IOException;

    public void k(defpackage.abnv abnvVar, int i, int[] iArr) throws java.io.IOException {
        j(abnvVar, i, iArr);
    }

    public boolean l() {
        return true;
    }

    public final float[] m(defpackage.abnv abnvVar, int i) throws java.io.IOException {
        int iC = c(abnvVar, i);
        float[] fArr = new float[iC + iC];
        h(abnvVar, 0, fArr);
        return fArr;
    }

    public int[] n(defpackage.abnv abnvVar, int i) throws java.io.IOException {
        int iC = c(abnvVar, i);
        int[] iArr = new int[iC + iC];
        j(abnvVar, 0, iArr);
        return iArr;
    }

    public final int[] o(defpackage.abnv abnvVar, int i) throws java.io.IOException {
        int iC = c(abnvVar, i);
        int[] iArr = new int[iC + iC];
        k(abnvVar, 0, iArr);
        return iArr;
    }
}
