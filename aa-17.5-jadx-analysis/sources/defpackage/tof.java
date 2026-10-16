package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class tof {
    public static final toq[] a = new toq[0];

    public abstract int b(abms abmsVar) throws IOException;

    protected int c(abms abmsVar, int i) throws IOException {
        int iB = b(abmsVar);
        if (i <= iB) {
            return i == 0 ? iB : i;
        }
        throw new IOException("Buffer too small for the given number of vertices");
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

    public final toq g(abms abmsVar, int i) throws IOException {
        return new toq(n(abmsVar, i), 0, 0, 0);
    }

    public abstract void h(abms abmsVar, int i, float[] fArr);

    public void i(abms abmsVar, too tooVar) throws IOException {
        int[] iArrN = n(abmsVar, 1);
        if (iArrN.length < 2) {
            throw new IOException("Too few vertices for getPoint");
        }
        tooVar.r(iArrN[0], iArrN[1]);
    }

    public abstract void j(abms abmsVar, int i, int[] iArr) throws IOException;

    public void k(abms abmsVar, int i, int[] iArr) throws IOException {
        j(abmsVar, i, iArr);
    }

    public boolean l() {
        return true;
    }

    public final float[] m(abms abmsVar, int i) throws IOException {
        int iC = c(abmsVar, i);
        float[] fArr = new float[iC + iC];
        h(abmsVar, 0, fArr);
        return fArr;
    }

    public int[] n(abms abmsVar, int i) throws IOException {
        int iC = c(abmsVar, i);
        int[] iArr = new int[iC + iC];
        j(abmsVar, 0, iArr);
        return iArr;
    }

    public final int[] o(abms abmsVar, int i) throws IOException {
        int iC = c(abmsVar, i);
        int[] iArr = new int[iC + iC];
        k(abmsVar, 0, iArr);
        return iArr;
    }
}
