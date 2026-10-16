package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class qmd extends qmf {
    public final qmq a;

    public qmd(qmh qmhVar) {
        super(qmhVar);
        this.a = new qmq(qmhVar);
    }

    public final void a(qna qnaVar) {
        s();
        super.p(3, "Hit delivery requested", qnaVar, null, null);
        g().c(new qfa(this, qnaVar, 18, (char[]) null));
    }

    @Override // defpackage.qmf
    protected final void b() {
        this.a.t();
    }

    public final void c(boolean z) {
        super.p(2, "Network connectivity status changed", Boolean.valueOf(z), null, null);
        g().c(new qjv(this, 4, null));
    }

    final void d() {
        qlk.b();
        qlk.b();
        qmq qmqVar = this.a;
        qmqVar.q();
        qmqVar.c = System.currentTimeMillis();
    }

    public final void e() {
        super.p(2, "Radio powered up", null, null, null);
        s();
        Context contextF = f();
        if (!roc.bj(contextF) || !roc.bi(contextF)) {
            s();
            g().c(new qjv(this, 5, null));
        } else {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(contextF, "com.google.android.gms.analytics.AnalyticsService"));
            contextF.startService(intent);
        }
    }
}
