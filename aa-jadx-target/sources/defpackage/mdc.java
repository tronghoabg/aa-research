package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mdc extends defpackage.nzc {
    public static final defpackage.mdb a = new defpackage.mdb();
    public static final defpackage.yqm b = defpackage.yqm.c("GH.OEMAppProvider");
    public static final defpackage.afhl c = new defpackage.kkv(defpackage.mkp.b, 14);
    private boolean d;

    public mdc() {
        super("OEM");
    }

    @Override // defpackage.nzc
    public final defpackage.ygw b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        qshVar.getClass();
        j$.util.stream.Stream streamSorted = j$.util.Collection.-EL.stream(defpackage.mkc.b().b(qshVar, new android.content.Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION_OEM"), defpackage.rke.a)).sorted(j$.util.Comparator.-CC.comparing(new defpackage.lpk(new defpackage.eyx((java.lang.Object) this, 14, (char[][][]) null), 5), defpackage.zej.TRUE_FIRST));
        java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
        setNewSetFromMap.getClass();
        j$.util.stream.Stream map = streamSorted.filter(new defpackage.lpa(setNewSetFromMap, 15)).map(new defpackage.lpk(new defpackage.mcz(0), 6));
        map.getClass();
        j$.util.stream.Stream streamFilter = map.filter(new defpackage.lpa(new defpackage.mcz(1), 16));
        streamFilter.getClass();
        j$.util.stream.Stream map2 = streamFilter.filter(new defpackage.lpa(new defpackage.mda(qshVar, 0), 17)).map(new defpackage.lpk(new defpackage.mcz(2), 7));
        int i = defpackage.ygw.d;
        java.lang.Object objCollect = map2.collect(defpackage.yds.a);
        objCollect.getClass();
        defpackage.ygw ygwVar = (defpackage.ygw) objCollect;
        if (!this.d) {
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.OEM_FACET, defpackage.zbd.rb);
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(ygwVar, 10));
            java.util.Iterator<E> it = ygwVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.mqj) it.next()).a());
            }
            rrvVarH.q(arrayList);
            oimVarU.F(rrvVarH.l());
            this.d = true;
        }
        ((defpackage.yqj) b.f()).y("OemAppProvider.getApps: %s", ygwVar);
        return ygwVar;
    }
}
