package defpackage;

import android.content.ComponentName;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class nyl implements lhg, mnd {
    public volatile ComponentName a;

    public static nyl a() {
        return (nyl) mki.a.b(nyl.class, new may(20));
    }

    @Override // defpackage.lhg
    public final void c() {
        mnc.a().c(mnb.x, lbh.d(), this);
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        mnf mnfVarL = mnk.l();
        mng mngVarA = mnh.a();
        mngVarA.a = "Startup Component Name";
        mngVarA.b();
        mngVarA.c('|');
        mngVarA.d(true);
        mnfVarL.b(mngVarA.a());
        mng mngVarA2 = mnh.a();
        mngVarA2.a = "Fallback Component Name";
        mngVarA2.b();
        mngVarA2.c('|');
        mngVarA2.d(true);
        mnfVarL.b(mngVarA2.a());
        ComponentName componentName = this.a;
        mnfVarL.c(componentName == null ? "null" : componentName.toShortString(), mkn.s.toShortString());
        mnfVarL.a().m(printWriter);
        printWriter.println("\n-------------------------------");
    }

    @Override // defpackage.lhg
    public final void d() {
    }
}
