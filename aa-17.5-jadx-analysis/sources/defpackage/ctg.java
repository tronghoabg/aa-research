package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ctg implements ctq {
    final /* synthetic */ ctl a;
    final /* synthetic */ int b;
    final /* synthetic */ ctq c;
    private final /* synthetic */ ctq d;

    public ctg(ctq ctqVar, ctl ctlVar, int i, ctq ctqVar2) {
        this.a = ctlVar;
        this.b = i;
        this.c = ctqVar2;
        this.d = ctqVar;
    }

    @Override // defpackage.ctq
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.ctq
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.ctq
    public final Map f() {
        return this.d.f();
    }

    @Override // defpackage.ctq
    public final afec g() {
        return this.d.g();
    }

    @Override // defpackage.ctq
    public final void h() {
        ctl ctlVar = this.a;
        ctlVar.d = this.b;
        this.c.h();
        if (ctlVar.a.j == null) {
            ctlVar.h(ctlVar.d);
        }
    }

    @Override // defpackage.ctq
    public final void i() {
        this.d.i();
    }

    @Override // defpackage.ctq
    public final void j() {
        this.d.j();
    }
}
