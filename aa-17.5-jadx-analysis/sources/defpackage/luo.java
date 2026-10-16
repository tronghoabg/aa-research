package defpackage;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class luo implements mnd {
    private final yfq a;

    public luo() {
        int i = yfq.d;
        this.a = yls.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        mnf mnfVarL = mnk.l();
        mng mngVarA = mnh.a();
        mngVarA.a = "isMessaging";
        mngVarA.b();
        mngVarA.c('|');
        mngVarA.d(true);
        mnfVarL.b(mngVarA.a());
        mng mngVarA2 = mnh.a();
        mngVarA2.a = "isOem";
        mngVarA2.b();
        mngVarA2.c('|');
        mngVarA2.d(true);
        mnfVarL.b(mngVarA2.a());
        mng mngVarA3 = mnh.a();
        mngVarA3.a = "isMedia";
        mngVarA3.b();
        mngVarA3.c('|');
        mngVarA3.d(true);
        mnfVarL.b(mngVarA3.a());
        mng mngVarA4 = mnh.a();
        mngVarA4.a = "isNav";
        mngVarA4.b();
        mngVarA4.c('|');
        mngVarA4.d(true);
        mnfVarL.b(mngVarA4.a());
        mng mngVarA5 = mnh.a();
        mngVarA5.a = "componentName";
        mngVarA5.b();
        mngVarA5.c('|');
        mngVarA5.d(true);
        mnfVarL.b(mngVarA5.a());
        yfq yfqVar = this.a;
        int i = ((yls) yfqVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            lun lunVar = (lun) yfqVar.get(i2);
            mnfVarL.c(Boolean.valueOf(lunVar.c()), Boolean.valueOf(lunVar.e()), Boolean.valueOf(lunVar.b()), Boolean.valueOf(lunVar.d()), lunVar.a());
        }
        mnfVarL.a().m(printWriter);
    }
}
