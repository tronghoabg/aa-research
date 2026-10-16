package defpackage;

/* loaded from: classes2.dex */
final class sfy implements epf {
    final /* synthetic */ sga a;

    public sfy(sga sgaVar) {
        this.a = sgaVar;
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        ypf ypfVar = sga.a;
        ypfVar.l().ai(8882).u("SetupController::onStop");
        if (adai.c()) {
            sga sgaVar = this.a;
            if (sgaVar.e == 4) {
                ypfVar.f().ai(8883).u("Recording dismiss");
                sgaVar.g.L(yzz.FRX_PRESETUP_GENERAL, yzy.cm);
                sgaVar.b.G();
            }
        }
    }

    @Override // defpackage.epf
    public final void fM() {
        sga.a.l().ai(8879).u("SetupController::onPause");
    }

    @Override // defpackage.epf
    public final void fv(eqa eqaVar) {
        sga.a.l().ai(8877).u("SetupController::onCreate");
        sga sgaVar = this.a;
        sfz sfzVar = sgaVar.b;
        sfzVar.I();
        sfzVar.H();
        sgaVar.h(sgaVar.f);
    }

    @Override // defpackage.epf
    public final void fw(eqa eqaVar) {
        sga.a.l().ai(8878).u("SetupController::onDestroy");
        sga sgaVar = this.a;
        sfz sfzVar = sgaVar.b;
        sfzVar.E();
        sfzVar.C();
        sfzVar.D();
        if (sgaVar.c) {
            return;
        }
        sgaVar.g.L(yzz.FRX_PRESETUP_EXIT_CONDITIONS, yzy.pS);
    }

    @Override // defpackage.epf
    public final void fx(eqa eqaVar) {
        sga.a.l().ai(8880).u("SetupController::onResume");
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        sga.a.l().ai(8881).u("SetupController::onStart");
    }
}
