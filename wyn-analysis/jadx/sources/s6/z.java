package s6;

import E5.C0446d0;
import E5.C0450f0;
import E5.C0464n;
import E5.C0465o;
import E5.H0;
import E5.J0;
import E5.L0;
import E5.q0;
import E5.r0;
import E5.s0;
import E5.t0;
import E5.u0;
import E5.v0;
import E5.w0;
import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import h6.C2784c;
import java.util.List;

/* loaded from: classes3.dex */
public final class z implements u0, View.OnLayoutChangeListener, View.OnClickListener, s, InterfaceC4024k {

    /* renamed from: a, reason: collision with root package name */
    public final H0 f45310a = new H0();

    /* renamed from: b, reason: collision with root package name */
    public Object f45311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f45312c;

    public z(C c10) {
        this.f45312c = c10;
    }

    @Override // E5.u0
    public final /* synthetic */ void B() {
    }

    @Override // E5.u0
    public final /* synthetic */ void E(C0446d0 c0446d0, int i5) {
    }

    @Override // E5.u0
    public final void F(C2784c c2784c) {
        SubtitleView subtitleView = this.f45312c.f45059g;
        if (subtitleView != null) {
            subtitleView.setCues(c2784c.f36185a);
        }
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
    public final void b(int i5) {
        C c10 = this.f45312c;
        c10.i();
        c10.k();
        if (!c10.b() || !c10.f45074w) {
            c10.c(false);
            return;
        }
        t tVar = c10.f45062j;
        if (tVar != null) {
            tVar.f();
        }
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
    public final void i(int i5, boolean z2) {
        C c10 = this.f45312c;
        c10.i();
        if (!c10.b() || !c10.f45074w) {
            c10.c(false);
            return;
        }
        t tVar = c10.f45062j;
        if (tVar != null) {
            tVar.f();
        }
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
    public final /* synthetic */ void n(t0 t0Var) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f45312c.g();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        C.a((TextureView) view, this.f45312c.f45076y);
    }

    @Override // E5.u0
    public final void p(v0 v0Var, v0 v0Var2, int i5) {
        t tVar;
        C c10 = this.f45312c;
        if (c10.b() && c10.f45074w && (tVar = c10.f45062j) != null) {
            tVar.f();
        }
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
    public final void u(L0 l02) {
        int iB;
        C c10 = this.f45312c;
        w0 w0Var = c10.f45064m;
        w0Var.getClass();
        E5.I i5 = (E5.I) w0Var;
        J0 j0O0 = i5.o0();
        if (j0O0.p()) {
            this.f45311b = null;
        } else {
            boolean zIsEmpty = i5.p0().f3139a.isEmpty();
            H0 h02 = this.f45310a;
            if (zIsEmpty) {
                Object obj = this.f45311b;
                if (obj != null) {
                    int iB2 = j0O0.b(obj);
                    if (iB2 != -1) {
                        if (i5.l0() == j0O0.f(iB2, h02, false).f3041c) {
                            return;
                        }
                    }
                    this.f45311b = null;
                }
            } else {
                i5.Q0();
                if (i5.f3089j0.f3499a.p()) {
                    iB = 0;
                } else {
                    q0 q0Var = i5.f3089j0;
                    iB = q0Var.f3499a.b(q0Var.f3500b.f35112a);
                }
                this.f45311b = j0O0.f(iB, h02, true).f3040b;
            }
        }
        c10.l(false);
    }

    @Override // E5.u0
    public final /* synthetic */ void v(r6.r rVar) {
    }

    @Override // E5.u0
    public final void w() {
        View view = this.f45312c.f45055c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // E5.u0
    public final void x(v6.o oVar) {
        this.f45312c.h();
    }

    @Override // E5.u0
    public final /* synthetic */ void y(C0465o c0465o) {
    }

    @Override // E5.u0
    public final /* synthetic */ void z(W5.c cVar) {
    }
}
