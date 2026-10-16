package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class jsa implements epf {
    final /* synthetic */ geu a;
    final /* synthetic */ jsb b;

    public jsa(jsb jsbVar, geu geuVar) {
        this.a = geuVar;
        this.b = jsbVar;
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        jsb jsbVar = this.b;
        AtomicInteger atomicInteger = jsbVar.e;
        int andSet = jsbVar.d.getAndSet(0);
        int andSet2 = atomicInteger.getAndSet(0);
        if (andSet > 0) {
            jsbVar.e(yzy.rW, andSet);
        }
        if (andSet2 > 0) {
            jsbVar.e(yzy.rV, andSet2);
        }
    }

    @Override // defpackage.epf
    public final void fw(eqa eqaVar) {
        geu geuVar = this.a;
        geuVar.B().c(this, 13);
        geuVar.B().c(this, 7);
        geuVar.B().c(this, 8);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }
}
