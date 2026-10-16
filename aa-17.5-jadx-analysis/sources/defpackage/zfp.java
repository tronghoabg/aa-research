package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zfp extends zfe {
    public zfo b;

    public zfp(yfg yfgVar, boolean z, Executor executor, zfj zfjVar) {
        super(yfgVar, z, false);
        this.b = new zfm(this, zfjVar, executor);
        u();
    }

    @Override // defpackage.zfe
    public final void g() {
        zfo zfoVar = this.b;
        if (zfoVar != null) {
            zfoVar.f();
        }
    }

    @Override // defpackage.zeu
    protected final void l() {
        zfo zfoVar = this.b;
        if (zfoVar != null) {
            zfoVar.h();
        }
    }

    @Override // defpackage.zfe
    public final void w(int i) {
        super.w(i);
        if (i == 1) {
            this.b = null;
        }
    }

    public zfp(yfg yfgVar, boolean z, Executor executor, Callable callable) {
        super(yfgVar, z, false);
        this.b = new zfn(this, callable, executor);
        u();
    }

    @Override // defpackage.zfe
    public final void e(int i, Object obj) {
    }
}
