package defpackage;

import android.hardware.display.VirtualDisplay;

/* loaded from: classes2.dex */
final class qm implements epf {
    final /* synthetic */ qr a;
    final /* synthetic */ qn b;

    public qm(qn qnVar, qr qrVar) {
        this.b = qnVar;
        this.a = qrVar;
    }

    @Override // defpackage.epf
    public final void fw(eqa eqaVar) {
        this.a.d();
        qn qnVar = this.b;
        VirtualDisplay virtualDisplay = qnVar.c;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            qnVar.c = null;
        }
        eqaVar.getLifecycle().d(this);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fL(eqa eqaVar) {
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
