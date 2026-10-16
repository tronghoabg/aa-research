package defpackage;

import com.google.android.apps.auto.components.drawer.AlphaJumpFab;

/* loaded from: classes2.dex */
public final class lay extends lat {
    public static final yph g = yph.c("GH.AlphaJumpControllFab");
    public final law h;
    public lax i;
    private int j;
    private boolean k;

    public lay(law lawVar, oht ohtVar) {
        super(lawVar, ohtVar);
        this.j = 8;
        this.i = new lav();
        this.h = lawVar;
    }

    private final void i() {
        this.h.f().setVisibility(this.k ? 8 : this.j);
    }

    public final void e() {
        ((ype) g.l().ai((char) 3717)).u("enableAlphaJump");
        kyl kylVar = new kyl(this, 6);
        law lawVar = this.h;
        lawVar.g(kylVar);
        AlphaJumpFab alphaJumpFabF = lawVar.f();
        alphaJumpFabF.a.a("A");
        g(0);
        alphaJumpFabF.setOnClickListener(new kep(this, 7));
        ((ype) lat.a.l().ai((char) 3710)).u("enableAlphaJump");
        this.b.a().f = new ajmd(this);
        super.c(yzy.bx, null);
    }

    public final void f(boolean z) {
        this.k = z;
        i();
    }

    public final void g(int i) {
        this.j = i;
        i();
    }

    public final void h() {
        law lawVar = this.h;
        AlphaJumpFab alphaJumpFabF = lawVar.f();
        alphaJumpFabF.a.a(this.i.a(lawVar.e()));
    }
}
