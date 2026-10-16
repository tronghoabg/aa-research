package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class npu {
    public static final defpackage.npr a = new defpackage.npr();
    public static final defpackage.afhl b = new defpackage.lco(defpackage.mkp.b, 19);
    public static final defpackage.yqm c = defpackage.yqm.c("GH.HvacManager");
    public final j$.util.concurrent.ConcurrentHashMap d = new j$.util.concurrent.ConcurrentHashMap();

    public static final kkf c(int i, kls klsVar) {
        java.lang.Object next;
        java.util.Iterator it = juc.f(defpackage.kjx.a.a().i(), i).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (defpackage.afga.f(((kkf) next).a.b, klsVar)) {
                return (kkf) next;
            }
        }
        next = null;
        return (kkf) next;
    }

    public static final nps d(int i, kls klsVar, defpackage.affc affcVar) {
        kkf kkfVarC = c(i, klsVar);
        if (kkfVarC != null) {
            return (nps) affcVar.invoke(kkfVarC);
        }
        c.l().M("Requested Control is null: Property %s not supported for Area %s", new kly(i), klsVar);
        return null;
    }

    public final nps a(npt nptVar, defpackage.afer aferVar) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.d;
        nps npsVar = (nps) concurrentHashMap.get(nptVar);
        if (npsVar != null) {
            c.l().y("Requested Control: Key=%s, Found in cache", nptVar);
            return npsVar;
        }
        nps npsVar2 = (nps) aferVar.invoke();
        if (npsVar2 != null) {
            concurrentHashMap.put(nptVar, npsVar2);
        }
        c.l().N("Requested Control (getOrCreateControl): Key=%s, Success=%b", nptVar, npsVar2 != null);
        return npsVar2;
    }

    public final nqr b(kls klsVar) {
        return a(new npt("syncControl", klsVar), new defpackage.nma(this, klsVar, 7, null));
    }
}
