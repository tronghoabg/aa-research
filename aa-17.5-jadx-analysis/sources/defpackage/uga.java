package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class uga implements tux {
    public final View a;
    public tmo b;
    private final tuy c;
    private final tuz d;
    private final twq e;
    private final usy f;

    public uga(uts utsVar, usy usyVar, twq twqVar, tuy tuyVar, tuz tuzVar, boolean z) {
        View viewA = utsVar.a();
        this.a = viewA;
        this.f = usyVar;
        this.e = twqVar;
        this.c = tuyVar;
        this.d = tuzVar;
        tvc tvcVar = new tvc(tuyVar, utsVar.a());
        if (z) {
            return;
        }
        viewA.setClickable(true);
        utsVar.g(new ura(this, tvcVar, 1));
    }

    private final too p(float f, float f2) {
        too tooVarI = tsw.i(new usy(this.f), f, f2, new float[8]);
        tooVarI.getClass();
        return tooVarI;
    }

    @Override // defpackage.tux
    public final int a() {
        return this.a.getHeight();
    }

    @Override // defpackage.tux
    public final int b() {
        return this.a.getWidth();
    }

    @Override // defpackage.tux
    public final void c() {
        tmo tmoVar = this.b;
        if (tmoVar != null) {
            tmoVar.h(this.d);
        }
    }

    @Override // defpackage.tux
    public final void d() {
        tmo tmoVar = this.b;
        if (tmoVar != null) {
            tmoVar.h(this.d);
        }
    }

    @Override // defpackage.tux
    public final void e(float f, float f2) {
        tmo tmoVar = this.b;
        if (tmoVar != null) {
            tmoVar.a(this.e, tmo.p(p(f, f2)), this.d);
        }
    }

    @Override // defpackage.tux
    public final void f() {
        tmo tmoVar = this.b;
        if (tmoVar != null) {
            tmoVar.f();
        }
    }

    @Override // defpackage.tux
    public final void g(float f, float f2) {
        tmo tmoVar = this.b;
        if (tmoVar != null) {
            tmoVar.b(this.e, tmo.p(p(f, f2)), this.d);
        }
    }

    @Override // defpackage.tux
    public final void h() {
        tmo tmoVar = this.b;
        if (tmoVar != null) {
            tmoVar.h(this.d);
        }
    }

    @Override // defpackage.tux
    public final void i(float f, float f2) {
        tmo tmoVar = this.b;
        if (tmoVar != null) {
            tmo.p(p(f, f2));
            tmoVar.c(this.d);
        }
    }

    @Override // defpackage.tux
    public final void j(float f, float f2) {
        tmo tmoVar = this.b;
        if (tmoVar != null) {
            tmo.p(p(f, f2));
            tmoVar.d(this.d);
        }
    }

    @Override // defpackage.tux
    public final void l() {
        tmo tmoVar = this.b;
        if (tmoVar != null) {
            tmoVar.e(this.d);
        }
    }

    @Override // defpackage.tux
    public final void n(float f, boolean z) {
        tmo tmoVar = this.b;
        if (tmoVar != null) {
            tmoVar.g(f, z, this.d);
        }
    }

    public final tvi o() {
        return this.c.x();
    }

    @Override // defpackage.tux
    public final void k() {
    }

    @Override // defpackage.tux
    public final void m() {
    }
}
