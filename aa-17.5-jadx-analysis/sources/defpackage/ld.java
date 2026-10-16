package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class ld {
    public lq a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public ld() {
        d();
    }

    public final void a() {
        boolean z = this.d;
        lq lqVar = this.a;
        this.c = z ? lqVar.f() : lqVar.j();
    }

    public final void b(View view, int i) {
        boolean z = this.d;
        lq lqVar = this.a;
        if (z) {
            this.c = lqVar.a(view) + this.a.o();
        } else {
            this.c = lqVar.d(view);
        }
        this.b = i;
    }

    public final void c(View view, int i) {
        int iO = this.a.o();
        if (iO >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        boolean z = this.d;
        lq lqVar = this.a;
        if (z) {
            int iF = (lqVar.f() - iO) - this.a.a(view);
            this.c = this.a.f() - iF;
            if (iF > 0) {
                int iB = this.c - this.a.b(view);
                int iJ = this.a.j();
                int iMin = iB - (iJ + Math.min(this.a.d(view) - iJ, 0));
                if (iMin < 0) {
                    this.c += Math.min(iF, -iMin);
                    return;
                }
                return;
            }
            return;
        }
        int iD = lqVar.d(view);
        int iJ2 = iD - this.a.j();
        this.c = iD;
        if (iJ2 > 0) {
            int iF2 = (this.a.f() - Math.min(0, (this.a.f() - iO) - this.a.a(view))) - (iD + this.a.b(view));
            if (iF2 < 0) {
                this.c -= Math.min(iJ2, -iF2);
            }
        }
    }

    public final void d() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
