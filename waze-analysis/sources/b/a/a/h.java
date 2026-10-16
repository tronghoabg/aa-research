package b.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final double[] f1698a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1699b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1700c;

    h(int i2) {
        this.f1698a = new double[i2 + i2];
        this.f1699b = i2;
        this.f1700c = 0;
    }

    private final int y(int i2) {
        return i2 + i2 + this.f1700c + 1;
    }

    private final int z(int i2) {
        return i2 + i2 + this.f1700c;
    }

    final double a(int i2) {
        return this.f1698a[i2 + i2 + this.f1700c + 1];
    }

    final double b(int i2, int i3) {
        return this.f1698a[i2 + i2 + i3];
    }

    final double c(int i2) {
        return this.f1698a[i2 + i2 + this.f1700c];
    }

    final void e(int i2, i iVar) {
        double[] dArr = this.f1698a;
        int iZ = z(i2);
        dArr[iZ] = dArr[iZ] + iVar.f1701a;
        int iY = y(i2);
        dArr[iY] = dArr[iY] + iVar.f1702b;
    }

    final void f(int i2, h hVar, int i3, i iVar) {
        double[] dArr = this.f1698a;
        iVar.f1701a = dArr[z(i2)] + hVar.c(i3);
        iVar.f1702b = dArr[y(i2)] + hVar.a(i3);
    }

    final void g(int i2, h hVar, int i3, i iVar) {
        double[] dArr = this.f1698a;
        iVar.f1701a = dArr[z(i2)] - hVar.a(i3);
        iVar.f1702b = dArr[y(i2)] + hVar.c(i3);
    }

    final void h(h hVar) {
        int i2 = hVar.f1700c;
        double[] dArr = hVar.f1698a;
        int i3 = this.f1700c;
        int i4 = i3;
        while (true) {
            int i5 = this.f1699b + i3;
            if (i4 >= i5 + i5) {
                return;
            }
            double[] dArr2 = this.f1698a;
            int i6 = i4 + 1;
            double d2 = dArr2[i4];
            double d3 = dArr2[i6];
            int i7 = i2 + 1;
            dArr2[i4] = (dArr[i2] * d2) + (dArr[i7] * d3);
            dArr2[i6] = ((-d2) * dArr[i7]) + (d3 * dArr[i2]);
            i2 += 2;
            i4 += 2;
        }
    }

    final void i(h hVar) {
        int i2 = this.f1700c;
        int i3 = hVar.f1700c;
        double[] dArr = hVar.f1698a;
        int i4 = i2;
        while (true) {
            int i5 = this.f1699b + i2;
            if (i4 >= i5 + i5) {
                return;
            }
            double[] dArr2 = this.f1698a;
            double d2 = dArr2[i4];
            dArr2[i4] = dArr[i3] * d2;
            dArr2[i4 + 1] = d2 * dArr[i3 + 1];
            i3 += 2;
            i4 += 2;
        }
    }

    final void j(int i2, i iVar) {
        double[] dArr = this.f1698a;
        iVar.f1701a = dArr[z(i2)];
        iVar.f1702b = dArr[y(i2)];
    }

    final void k(int i2, double d2) {
        this.f1698a[i2 + i2 + this.f1700c + 1] = d2;
    }

    final void l(int i2, i iVar) {
        double[] dArr = this.f1698a;
        int iZ = z(i2);
        int iY = y(i2);
        double d2 = dArr[iZ];
        double d3 = dArr[iY];
        double d4 = iVar.f1701a;
        double d5 = iVar.f1702b;
        dArr[iZ] = (d2 * d4) + ((-d3) * d5);
        dArr[iY] = (d2 * d5) + (d3 * d4);
    }

    final void m(int i2, i iVar) {
        double[] dArr = this.f1698a;
        int iZ = z(i2);
        int iY = y(i2);
        double d2 = dArr[iZ];
        double d3 = -dArr[iY];
        double d4 = iVar.f1702b;
        double d5 = iVar.f1701a;
        dArr[iZ] = ((-d2) * d4) + (d3 * d5);
        dArr[iY] = (d2 * d5) + (d3 * d4);
    }

    final void n(int i2, i iVar) {
        double[] dArr = this.f1698a;
        int iZ = z(i2);
        int iY = y(i2);
        double d2 = dArr[iZ];
        double d3 = dArr[iY];
        double d4 = iVar.f1701a;
        double d5 = iVar.f1702b;
        dArr[iZ] = (d2 * d4) + (d3 * d5);
        dArr[iY] = ((-d2) * d5) + (d3 * d4);
    }

    final void o(int i2, i iVar, i iVar2) {
        double[] dArr = this.f1698a;
        double d2 = dArr[z(i2)];
        double d3 = dArr[y(i2)];
        double d4 = iVar.f1701a;
        double d5 = iVar.f1702b;
        iVar2.f1701a = (d4 * d2) + (d3 * d5);
        iVar2.f1702b = ((-d2) * d5) + (d3 * iVar.f1701a);
    }

    final void p(int i2, i iVar) {
        double[] dArr = this.f1698a;
        int iZ = z(i2);
        int iY = y(i2);
        double d2 = dArr[iZ];
        double d3 = dArr[iY];
        double d4 = -d2;
        double d5 = iVar.f1702b;
        double d6 = iVar.f1701a;
        dArr[iZ] = (d4 * d5) + (d3 * d6);
        dArr[iY] = (d4 * d6) + ((-d3) * d5);
    }

    final void q(int i2, i iVar, i iVar2) {
        double[] dArr = this.f1698a;
        double d2 = dArr[z(i2)];
        double d3 = dArr[y(i2)];
        double d4 = iVar.f1701a;
        double d5 = iVar.f1702b;
        iVar2.f1701a = (d4 * d2) + ((-d3) * d5);
        iVar2.f1702b = (d2 * d5) + (d3 * iVar.f1701a);
    }

    final void r(h hVar) {
        h hVar2 = this;
        h hVar3 = hVar;
        int i2 = hVar3.f1700c;
        int i3 = hVar2.f1700c;
        int i4 = i3;
        while (true) {
            int i5 = hVar2.f1699b + i3;
            if (i4 >= i5 + i5) {
                return;
            }
            double[] dArr = hVar3.f1698a;
            double[] dArr2 = hVar2.f1698a;
            int i6 = i4 + 1;
            double d2 = dArr2[i4];
            double d3 = dArr2[i6];
            double d4 = dArr[i2];
            double d5 = dArr[i2 + 1];
            dArr2[i4] = (d2 * d4) + ((-d3) * d5);
            dArr2[i6] = (d2 * d5) + (d3 * d4);
            i2 += 2;
            i4 += 2;
            hVar2 = this;
            hVar3 = hVar;
        }
    }

    final void s(int i2, double d2) {
        this.f1698a[i2 + i2 + this.f1700c] = d2;
    }

    final void t(int i2, double d2, double d3) {
        double[] dArr = this.f1698a;
        int iZ = z(i2);
        dArr[iZ] = d2;
        dArr[iZ + 1] = d3;
    }

    final void u() {
        int i2 = this.f1700c;
        int i3 = i2;
        while (true) {
            int i4 = this.f1699b + i2;
            if (i3 >= i4 + i4) {
                return;
            }
            double[] dArr = this.f1698a;
            int i5 = i3 + 1;
            double d2 = dArr[i3];
            double d3 = dArr[i5];
            dArr[i3] = (d2 * d2) + ((-d3) * d3);
            dArr[i5] = (d2 + d2) * d3;
            i3 += 2;
        }
    }

    final void v(int i2, h hVar, int i3, i iVar) {
        double[] dArr = this.f1698a;
        iVar.f1701a = dArr[z(i2)] - hVar.c(i3);
        iVar.f1702b = dArr[y(i2)] - hVar.a(i3);
    }

    final void w(int i2, h hVar, int i3, i iVar) {
        double[] dArr = this.f1698a;
        iVar.f1701a = dArr[z(i2)] + hVar.a(i3);
        iVar.f1702b = dArr[y(i2)] - hVar.c(i3);
    }

    final void x(int i2, int i3) {
        double[] dArr = this.f1698a;
        int iZ = z(i2);
        int iY = y(i2);
        double d2 = dArr[iZ];
        double d3 = dArr[iY];
        long j2 = i3;
        dArr[iZ] = e.a(d2, j2);
        dArr[iY] = e.a(d3, j2);
    }

    h(h hVar, int i2, int i3) {
        this.f1699b = i3 - i2;
        this.f1698a = hVar.f1698a;
        this.f1700c = i2 + i2;
    }
}
