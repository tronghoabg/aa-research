package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
final class sfj extends rht {
    final /* synthetic */ sfl a;

    public sfj(sfl sflVar) {
        this.a = sflVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        sfl.m.f().ai(8859).u("Request PreSetup force finish");
        sga sgaVar = this.a.r;
        sgaVar.getClass();
        if (sgaVar.c) {
            return;
        }
        sgaVar.g.L(yzz.FRX_PRESETUP_EXIT_CONDITIONS, yzy.bZ);
        sgaVar.g();
    }
}
