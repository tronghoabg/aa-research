package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public abstract class xfo extends qqh {
    public static final yph a = yph.c("GH.GhStartOfDriveTrampo");
    private xfn b;

    @Override // defpackage.qqh
    public final void G() {
        ((ype) a.l().ai((char) 10249)).u("onDestroy");
        lbh.d().d(this.b.b);
    }

    @Override // defpackage.qqh
    public final void a(Bundle bundle) {
        ((ype) a.l().ai((char) 10248)).u("onCreate");
        F();
        xfn xfnVarF = f();
        this.b = xfnVarF;
        xfnVarF.b = new xfm(xfnVarF);
        lbh.d().gL(xfnVarF.b, true);
    }

    protected abstract xfn f();

    @Override // defpackage.qqh
    public final void h() {
        ((ype) a.l().ai((char) 10250)).u("onStart");
        xfn xfnVar = this.b;
        xfnVar.a = true;
        xfnVar.a();
    }

    @Override // defpackage.qqh
    public final void j() {
        ((ype) a.l().ai((char) 10251)).u("onStop");
        this.b.a = false;
    }
}
