package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f19035a;

    /* renamed from: b, reason: collision with root package name */
    public final T2.a f19036b;

    public x0(w0 w0Var) {
        this.f19035a = w0Var;
        T2.a aVar = new T2.a();
        aVar.f11365a = 0;
        this.f19036b = aVar;
    }

    public final View a(int i5, int i10, int i11, int i12) {
        w0 w0Var = this.f19035a;
        int iB = w0Var.b();
        int iC = w0Var.c();
        int i13 = i10 > i5 ? 1 : -1;
        View view = null;
        while (i5 != i10) {
            View viewD = w0Var.d(i5);
            int iA = w0Var.a(viewD);
            int iE = w0Var.e(viewD);
            T2.a aVar = this.f19036b;
            aVar.f11366b = iB;
            aVar.f11367c = iC;
            aVar.f11368d = iA;
            aVar.f11369e = iE;
            if (i11 != 0) {
                aVar.f11365a = i11;
                if (aVar.a()) {
                    return viewD;
                }
            }
            if (i12 != 0) {
                aVar.f11365a = i12;
                if (aVar.a()) {
                    view = viewD;
                }
            }
            i5 += i13;
        }
        return view;
    }

    public final boolean b(View view) {
        w0 w0Var = this.f19035a;
        int iB = w0Var.b();
        int iC = w0Var.c();
        int iA = w0Var.a(view);
        int iE = w0Var.e(view);
        T2.a aVar = this.f19036b;
        aVar.f11366b = iB;
        aVar.f11367c = iC;
        aVar.f11368d = iA;
        aVar.f11369e = iE;
        aVar.f11365a = 24579;
        return aVar.a();
    }
}
