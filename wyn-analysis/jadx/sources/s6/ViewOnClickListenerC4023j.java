package s6;

import A7.B0;
import E5.C0446d0;
import E5.C0450f0;
import E5.C0464n;
import E5.C0465o;
import E5.C0474y;
import E5.L0;
import E5.r0;
import E5.s0;
import E5.t0;
import E5.u0;
import E5.v0;
import E5.w0;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import h6.C2784c;
import java.util.List;
import u6.C4260e;

/* renamed from: s6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC4023j implements u0, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f45185a;

    public ViewOnClickListenerC4023j(t tVar) {
        this.f45185a = tVar;
    }

    @Override // E5.u0
    public final /* synthetic */ void B() {
    }

    @Override // E5.u0
    public final /* synthetic */ void E(C0446d0 c0446d0, int i5) {
    }

    @Override // E5.u0
    public final /* synthetic */ void F(C2784c c2784c) {
    }

    @Override // E5.u0
    public final /* synthetic */ void G(C0465o c0465o) {
    }

    @Override // E5.u0
    public final /* synthetic */ void I(C0450f0 c0450f0) {
    }

    @Override // E5.u0
    public final /* synthetic */ void a(int i5) {
    }

    @Override // E5.u0
    public final /* synthetic */ void b(int i5) {
    }

    @Override // E5.u0
    public final /* synthetic */ void c(boolean z2) {
    }

    @Override // E5.u0
    public final /* synthetic */ void d(int i5) {
    }

    @Override // E5.u0
    public final /* synthetic */ void e(boolean z2) {
    }

    @Override // E5.u0
    public final /* synthetic */ void f(List list) {
    }

    @Override // E5.u0
    public final /* synthetic */ void g(int i5, int i10) {
    }

    @Override // E5.u0
    public final /* synthetic */ void h(boolean z2) {
    }

    @Override // E5.u0
    public final /* synthetic */ void i(int i5, boolean z2) {
    }

    @Override // E5.u0
    public final /* synthetic */ void j(float f10) {
    }

    @Override // E5.u0
    public final /* synthetic */ void k(int i5) {
    }

    @Override // E5.u0
    public final /* synthetic */ void l(int i5, boolean z2) {
    }

    @Override // E5.u0
    public final /* synthetic */ void m(boolean z2) {
    }

    @Override // E5.u0
    public final void n(t0 t0Var) {
        boolean zA = t0Var.a(4, 5);
        t tVar = this.f45185a;
        if (zA) {
            tVar.l();
        }
        if (t0Var.a(4, 5, 7)) {
            tVar.n();
        }
        C4260e c4260e = t0Var.f3543a;
        if (c4260e.f46677a.get(8)) {
            tVar.o();
        }
        if (c4260e.f46677a.get(9)) {
            tVar.q();
        }
        if (t0Var.a(8, 9, 11, 0, 16, 17, 13)) {
            tVar.k();
        }
        if (t0Var.a(11, 0)) {
            tVar.r();
        }
        if (c4260e.f46677a.get(12)) {
            tVar.m();
        }
        if (c4260e.f46677a.get(2)) {
            tVar.s();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        t tVar = this.f45185a;
        w0 w0Var = tVar.f45241h0;
        if (w0Var == null) {
            return;
        }
        y yVar = tVar.f45226a;
        yVar.g();
        if (tVar.f45251n == view) {
            ((B0) w0Var).P();
            return;
        }
        if (tVar.f45249m == view) {
            ((B0) w0Var).R();
            return;
        }
        if (tVar.f45255p == view) {
            if (((E5.I) w0Var).t0() != 4) {
                B0 b02 = (B0) w0Var;
                E5.I i5 = (E5.I) b02;
                i5.Q0();
                b02.Q(i5.f3102v);
                return;
            }
            return;
        }
        if (tVar.f45257q == view) {
            B0 b03 = (B0) w0Var;
            E5.I i10 = (E5.I) b03;
            i10.Q0();
            b03.Q(-i10.f3101u);
            return;
        }
        if (tVar.f45253o == view) {
            E5.I i11 = (E5.I) w0Var;
            int iT0 = i11.t0();
            if (iT0 != 1 && iT0 != 4 && i11.s0()) {
                i11.I0(false);
                return;
            }
            int iT02 = i11.t0();
            if (iT02 == 1) {
                i11.B0();
            } else if (iT02 == 4) {
                int iL0 = i11.l0();
                i11.Q0();
                i11.E0(-9223372036854775807L, iL0, false);
            }
            i11.I0(true);
            return;
        }
        if (tVar.f45263t == view) {
            E5.I i12 = (E5.I) w0Var;
            i12.Q0();
            int i13 = i12.f3051F;
            int i14 = tVar.f45258q0;
            for (int i15 = 1; i15 <= 2; i15++) {
                int i16 = (i13 + i15) % 3;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 != 2 || (i14 & 2) == 0) {
                        }
                    } else if ((i14 & 1) == 0) {
                    }
                }
                i13 = i16;
            }
            i12.J0(i13);
            return;
        }
        if (tVar.f45265u == view) {
            E5.I i17 = (E5.I) w0Var;
            i17.Q0();
            boolean z2 = !i17.f3052G;
            i17.Q0();
            if (i17.f3052G != z2) {
                i17.f3052G = z2;
                u6.s sVar = i17.k.f3170h;
                sVar.getClass();
                u6.r rVarB = u6.s.b();
                rVarB.f46714a = sVar.f46716a.obtainMessage(12, z2 ? 1 : 0, 0);
                rVarB.b();
                C0474y c0474y = new C0474y(z2, 0);
                K8.H h10 = i17.f3091l;
                h10.o(9, c0474y);
                i17.M0();
                h10.m();
                return;
            }
            return;
        }
        View view2 = tVar.f45272z;
        if (view2 == view) {
            yVar.f();
            tVar.d(tVar.f45236f, view2);
            return;
        }
        View view3 = tVar.f45204A;
        if (view3 == view) {
            yVar.f();
            tVar.d(tVar.f45238g, view3);
            return;
        }
        View view4 = tVar.f45205B;
        if (view4 == view) {
            yVar.f();
            tVar.d(tVar.f45242i, view4);
            return;
        }
        ImageView imageView = tVar.f45268w;
        if (imageView == view) {
            yVar.f();
            tVar.d(tVar.f45240h, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        t tVar = this.f45185a;
        if (tVar.f45269w0) {
            tVar.f45226a.g();
        }
    }

    @Override // E5.u0
    public final /* synthetic */ void p(v0 v0Var, v0 v0Var2, int i5) {
    }

    @Override // E5.u0
    public final /* synthetic */ void q(s0 s0Var) {
    }

    @Override // E5.u0
    public final /* synthetic */ void r(r0 r0Var) {
    }

    @Override // E5.u0
    public final /* synthetic */ void s(C0464n c0464n) {
    }

    @Override // E5.u0
    public final /* synthetic */ void t(int i5, boolean z2) {
    }

    @Override // E5.u0
    public final /* synthetic */ void u(L0 l02) {
    }

    @Override // E5.u0
    public final /* synthetic */ void v(r6.r rVar) {
    }

    @Override // E5.u0
    public final /* synthetic */ void w() {
    }

    @Override // E5.u0
    public final /* synthetic */ void x(v6.o oVar) {
    }

    @Override // E5.u0
    public final /* synthetic */ void y(C0465o c0465o) {
    }

    @Override // E5.u0
    public final /* synthetic */ void z(W5.c cVar) {
    }
}
