package e.a.h;

import androidx.core.app.NotificationCompat;
import com.google.d.b.an;
import e.a.cm;
import e.a.cq;
import e.a.dv;
import e.a.ee;
import e.a.eh;
import l.a.pt;
import l.a.qe;
import l.a.qh;
import l.a.sz;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad {
    ad(ee eeVar) {
        an.C(eeVar, NotificationCompat.CATEGORY_STATUS);
    }

    public static dv a(x xVar) {
        return new ac(xVar);
    }

    public static ae b(cq cqVar, ae aeVar) {
        an.C(aeVar, "responseObserver");
        aeVar.onError(new eh(ee.f47409i.g(String.format("Method %s is unimplemented", cqVar.f()))));
        return new z();
    }

    public static final void c(Throwable th, Throwable th2) {
        h.g.b.x.f(th, "<this>");
        h.g.b.x.f(th2, "exception");
        if (th != th2) {
            h.e.c.f48070a.c(th, th2);
        }
    }

    public static e.a.l d(cm cmVar) {
        return new v(cmVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c e(qe qeVar) {
        h.g.b.x.f(qeVar, "builder");
        return new com.waze.shared_infra.coordinators.c(qeVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c f(pt ptVar) {
        h.g.b.x.f(ptVar, "builder");
        return new com.waze.shared_infra.coordinators.c(ptVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.s.c g(sz szVar) {
        h.g.b.x.f(szVar, "builder");
        return new com.waze.shared_infra.s.c(szVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.s.c h(qh qhVar) {
        h.g.b.x.f(qhVar, "builder");
        return new com.waze.shared_infra.s.c(qhVar);
    }
}
