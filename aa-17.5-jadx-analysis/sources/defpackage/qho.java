package defpackage;

import android.content.Intent;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class qho implements mkc {
    public static final /* synthetic */ int a = 0;
    private static final ygr b;

    static {
        yph.c("GH.ServiceAuthorizer");
        b = new ymp(nyi.a);
    }

    public static void e() {
        mki.a.g();
    }

    public static final qhn f(qrn qrnVar, qpi qpiVar) throws qrz {
        if ((qpiVar != qpi.f && qpiVar != qpi.h) || acxp.c()) {
            return null;
        }
        e();
        if (!ols.h(qrnVar, "allow_unknown_sources")) {
            return null;
        }
        e();
        ols.C(qrnVar, "allow_unknown_sources", false);
        return new qhn(qrnVar);
    }

    private static List g(rji rjiVar, List list) {
        return yrm.P(yrm.aj(list, new jud(rjiVar, 6)));
    }

    @Override // defpackage.mkc
    public final yfq a(qrn qrnVar, nyk nykVar) {
        nyj nyjVar = nykVar.a;
        nyj nyjVarC = nyjVar.c(b);
        woy.S(nyjVarC.a.isEmpty(), "Received Invalid Filters %s", nyjVarC);
        boolean zD = acoh.d();
        Collection collection = (List) kgq.c(new qhm(qrnVar, nykVar.c, !zD, nykVar.b, 1), "GH.ServiceAuthorizer", yzz.SERVICE_AUTHORIZER, !zD ? yzy.ru : yzy.rr, true, "Car no longer connected.", new Object[0]);
        if (nyjVar.f()) {
            Stream streamFilter = Collection.EL.stream(collection).filter(new mqu(nrz.e(), 6));
            int i = yfq.d;
            collection = (yfq) streamFilter.collect(ycm.a);
        }
        return yfq.o(collection);
    }

    @Override // defpackage.mkc
    public final List b(qrn qrnVar, Intent intent, rji rjiVar) {
        if (rjiVar == rji.a) {
            intent.addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
            return yrm.P(yrm.aj(c(qrnVar, new nyk(intent, qpi.f, nyj.b())), new ptu(2)));
        }
        if (rjiVar == rji.b) {
            intent.addCategory("com.google.android.gms.car.category.CATEGORY_CLUSTER_DISPLAY");
            return g(rjiVar, c(qrnVar, new nyk(intent, qpi.f, nyj.b())));
        }
        if (rjiVar != rji.c) {
            return new ArrayList();
        }
        intent.addCategory("com.google.android.gms.car.category.CATEGORY_AUXILIARY_DISPLAY");
        return g(rjiVar, c(qrnVar, new nyk(intent, qpi.f, nyj.b())));
    }

    @Override // defpackage.mkc
    public final List c(qrn qrnVar, nyk nykVar) {
        nyj nyjVar = nykVar.a;
        nyj nyjVarC = nyjVar.c(b);
        woy.S(nyjVarC.a.isEmpty(), "Received Invalid Filters %s", nyjVarC);
        boolean zD = acoh.d();
        List list = (List) kgq.c(new qhm(qrnVar, nykVar.c, !zD, nykVar.b, 0), "GH.ServiceAuthorizer", yzz.SERVICE_AUTHORIZER, !zD ? yzy.ru : yzy.rr, true, "Car no longer connected.", new Object[0]);
        if (!nyjVar.f()) {
            return list;
        }
        Stream streamFilter = Collection.EL.stream(list).filter(new mqu(nrz.e(), 5));
        int i = yfq.d;
        return (yfq) streamFilter.collect(ycm.a);
    }

    @Override // defpackage.mkc
    public final boolean d(qrn qrnVar, String str, qpi qpiVar) {
        woy.N(qpiVar != qpi.d);
        return ((Boolean) kgq.c(new mmb(qrnVar, qpiVar, str, 2), "GH.ServiceAuthorizer", yzz.SERVICE_AUTHORIZER, yzy.rs, true, "Car no longer connected.", new Object[0])).booleanValue();
    }
}
