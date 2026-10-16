package android.support.v7.widget;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class dc {

    /* renamed from: a, reason: collision with root package name */
    dv f1320a;

    /* renamed from: b, reason: collision with root package name */
    int f1321b;

    /* renamed from: c, reason: collision with root package name */
    int f1322c;

    /* renamed from: d, reason: collision with root package name */
    boolean f1323d;

    /* renamed from: e, reason: collision with root package name */
    boolean f1324e;

    dc() {
        d();
    }

    final void a() {
        boolean z = this.f1323d;
        dv dvVar = this.f1320a;
        this.f1322c = z ? dvVar.f() : dvVar.j();
    }

    public final void b(View view, int i2) {
        boolean z = this.f1323d;
        dv dvVar = this.f1320a;
        if (z) {
            this.f1322c = dvVar.a(view) + this.f1320a.o();
        } else {
            this.f1322c = dvVar.d(view);
        }
        this.f1321b = i2;
    }

    public final void c(View view, int i2) {
        int iO = this.f1320a.o();
        if (iO >= 0) {
            b(view, i2);
            return;
        }
        this.f1321b = i2;
        boolean z = this.f1323d;
        dv dvVar = this.f1320a;
        if (z) {
            int iF = (dvVar.f() - iO) - this.f1320a.a(view);
            this.f1322c = this.f1320a.f() - iF;
            if (iF > 0) {
                int iB = this.f1322c - this.f1320a.b(view);
                int iJ = this.f1320a.j();
                int iMin = iB - (iJ + Math.min(this.f1320a.d(view) - iJ, 0));
                if (iMin < 0) {
                    this.f1322c += Math.min(iF, -iMin);
                    return;
                }
                return;
            }
            return;
        }
        int iD = dvVar.d(view);
        int iJ2 = iD - this.f1320a.j();
        this.f1322c = iD;
        if (iJ2 > 0) {
            int iF2 = (this.f1320a.f() - Math.min(0, (this.f1320a.f() - iO) - this.f1320a.a(view))) - (iD + this.f1320a.b(view));
            if (iF2 < 0) {
                this.f1322c -= Math.min(iJ2, -iF2);
            }
        }
    }

    final void d() {
        this.f1321b = -1;
        this.f1322c = Integer.MIN_VALUE;
        this.f1323d = false;
        this.f1324e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f1321b + ", mCoordinate=" + this.f1322c + ", mLayoutFromEnd=" + this.f1323d + ", mValid=" + this.f1324e + '}';
    }
}
