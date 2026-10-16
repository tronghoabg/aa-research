package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qik implements defpackage.mkj {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yhx b;

    static {
        defpackage.yqm.c("GH.ServiceAuthorizer");
        b = new defpackage.ynu(defpackage.nzd.a);
    }

    public static void e() {
        defpackage.mkp.a.g();
    }

    public static final qij f(defpackage.qsh qshVar, defpackage.qqe qqeVar) throws defpackage.qst {
        if ((qqeVar != defpackage.qqe.f && qqeVar != defpackage.qqe.h) || defpackage.acyr.c()) {
            return null;
        }
        e();
        if (!defpackage.oml.h(qshVar, "allow_unknown_sources")) {
            return null;
        }
        e();
        defpackage.oml.C(qshVar, "allow_unknown_sources", false);
        return new qij(qshVar);
    }

    private static java.util.List g(defpackage.rke rkeVar, java.util.List list) {
        return defpackage.ysr.P(defpackage.ysr.aj(list, new defpackage.juh(rkeVar, 6)));
    }

    @Override // defpackage.mkj
    public final defpackage.ygw a(defpackage.qsh qshVar, defpackage.nzf nzfVar) {
        defpackage.nze nzeVar = nzfVar.a;
        defpackage.nze nzeVarC = nzeVar.c(b);
        defpackage.ysr.bc(nzeVarC.a.isEmpty(), "Received Invalid Filters %s", nzeVarC);
        boolean zD = defpackage.acpj.d();
        java.util.Collection collection = (java.util.List) defpackage.kgu.c(new defpackage.qii(qshVar, nzfVar.c, !zD, nzfVar.b, 1), "GH.ServiceAuthorizer", defpackage.zbe.SERVICE_AUTHORIZER, !zD ? defpackage.zbd.rw : defpackage.zbd.rt, true, "Car no longer connected.", new java.lang.Object[0]);
        if (nzeVar.f()) {
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(collection).filter(new defpackage.mpw(defpackage.nsn.e(), 7));
            int i = defpackage.ygw.d;
            collection = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
        }
        return defpackage.ygw.o(collection);
    }

    @Override // defpackage.mkj
    public final java.util.List b(defpackage.qsh qshVar, android.content.Intent intent, defpackage.rke rkeVar) {
        if (rkeVar == defpackage.rke.a) {
            intent.addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
            return defpackage.ysr.P(defpackage.ysr.aj(c(qshVar, new defpackage.nzf(intent, defpackage.qqe.f, defpackage.nze.b())), new defpackage.pup(2)));
        }
        if (rkeVar == defpackage.rke.b) {
            intent.addCategory("com.google.android.gms.car.category.CATEGORY_CLUSTER_DISPLAY");
            return g(rkeVar, c(qshVar, new defpackage.nzf(intent, defpackage.qqe.f, defpackage.nze.b())));
        }
        if (rkeVar != defpackage.rke.c) {
            return new java.util.ArrayList();
        }
        intent.addCategory("com.google.android.gms.car.category.CATEGORY_AUXILIARY_DISPLAY");
        return g(rkeVar, c(qshVar, new defpackage.nzf(intent, defpackage.qqe.f, defpackage.nze.b())));
    }

    @Override // defpackage.mkj
    public final java.util.List c(defpackage.qsh qshVar, defpackage.nzf nzfVar) {
        defpackage.nze nzeVar = nzfVar.a;
        defpackage.nze nzeVarC = nzeVar.c(b);
        defpackage.ysr.bc(nzeVarC.a.isEmpty(), "Received Invalid Filters %s", nzeVarC);
        boolean zD = defpackage.acpj.d();
        java.util.List list = (java.util.List) defpackage.kgu.c(new defpackage.qii(qshVar, nzfVar.c, !zD, nzfVar.b, 0), "GH.ServiceAuthorizer", defpackage.zbe.SERVICE_AUTHORIZER, !zD ? defpackage.zbd.rw : defpackage.zbd.rt, true, "Car no longer connected.", new java.lang.Object[0]);
        if (!nzeVar.f()) {
            return list;
        }
        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(list).filter(new defpackage.mpw(defpackage.nsn.e(), 6));
        int i = defpackage.ygw.d;
        return (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
    }

    @Override // defpackage.mkj
    public final boolean d(defpackage.qsh qshVar, java.lang.String str, defpackage.qqe qqeVar) {
        defpackage.ysr.aX(qqeVar != defpackage.qqe.d);
        return ((java.lang.Boolean) defpackage.kgu.c(new defpackage.mmh(qshVar, qqeVar, str, 2), "GH.ServiceAuthorizer", defpackage.zbe.SERVICE_AUTHORIZER, defpackage.zbd.ru, true, "Car no longer connected.", new java.lang.Object[0])).booleanValue();
    }
}
