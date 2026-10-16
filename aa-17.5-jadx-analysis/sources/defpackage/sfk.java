package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
final class sfk extends rht {
    final /* synthetic */ sfl a;

    public sfk(sfl sflVar) {
        this.a = sflVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        sfl.m.f().ai(8860).u("Received USB disconnect");
        sga sgaVar = this.a.r;
        sgaVar.getClass();
        if (sgaVar.c) {
            return;
        }
        sga.a.l().ai(8884).u("Usb detached");
        sgaVar.g.L(yzz.FRX_PRESETUP_GENERAL, yzy.pU);
    }
}
