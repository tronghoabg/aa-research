package android.support.v7.widget;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class gp {

    /* renamed from: a, reason: collision with root package name */
    final go f1581a;

    /* renamed from: b, reason: collision with root package name */
    final gn f1582b = new gn();

    gp(go goVar) {
        this.f1581a = goVar;
    }

    final View a(int i2, int i3, int i4, int i5) {
        go goVar = this.f1581a;
        int iD = goVar.d();
        int iC = goVar.c();
        View view = null;
        int i6 = i2;
        while (i6 != i3) {
            View viewE = goVar.e(i6);
            int iB = goVar.b(viewE);
            int iA = goVar.a(viewE);
            gn gnVar = this.f1582b;
            gnVar.c(iD, iC, iB, iA);
            gnVar.b();
            gnVar.a(i4);
            if (gnVar.d()) {
                return viewE;
            }
            gnVar.b();
            gnVar.a(i5);
            int i7 = 1;
            if (true == gnVar.d()) {
                view = viewE;
            }
            if (i3 <= i2) {
                i7 = -1;
            }
            i6 += i7;
        }
        return view;
    }

    final boolean b(View view) {
        gn gnVar = this.f1582b;
        go goVar = this.f1581a;
        gnVar.c(goVar.d(), goVar.c(), goVar.b(view), goVar.a(view));
        gnVar.b();
        gnVar.a(24579);
        return gnVar.d();
    }
}
