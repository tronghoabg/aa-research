package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lf {
    public defpackage.lr a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public lf() {
        d();
    }

    public final void a() {
        boolean z = this.d;
        defpackage.lr lrVar = this.a;
        this.c = z ? lrVar.f() : lrVar.j();
    }

    public final void b(android.view.View view, int i) {
        boolean z = this.d;
        defpackage.lr lrVar = this.a;
        if (z) {
            this.c = lrVar.a(view) + this.a.o();
        } else {
            this.c = lrVar.d(view);
        }
        this.b = i;
    }

    public final void c(android.view.View view, int i) {
        int iO = this.a.o();
        if (iO >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        boolean z = this.d;
        defpackage.lr lrVar = this.a;
        if (z) {
            int iF = (lrVar.f() - iO) - this.a.a(view);
            this.c = this.a.f() - iF;
            if (iF > 0) {
                int iB = this.c - this.a.b(view);
                int iJ = this.a.j();
                int iMin = iB - (iJ + java.lang.Math.min(this.a.d(view) - iJ, 0));
                if (iMin < 0) {
                    this.c += java.lang.Math.min(iF, -iMin);
                    return;
                }
                return;
            }
            return;
        }
        int iD = lrVar.d(view);
        int iJ2 = iD - this.a.j();
        this.c = iD;
        if (iJ2 > 0) {
            int iF2 = (this.a.f() - java.lang.Math.min(0, (this.a.f() - iO) - this.a.a(view))) - (iD + this.a.b(view));
            if (iF2 < 0) {
                this.c -= java.lang.Math.min(iJ2, -iF2);
            }
        }
    }

    public final void d() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final java.lang.String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
