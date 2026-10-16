package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ljw extends defpackage.nzc {
    public static final defpackage.ljv a = new defpackage.ljv();
    public static final defpackage.yqm b = defpackage.yqm.c("GH.MediaAppProvider");
    public static final defpackage.afhl c = new defpackage.kkv(defpackage.mkp.b, 12);
    public final android.content.ComponentName d;
    public defpackage.yhx e;
    private boolean f;

    public ljw() {
        super("Media");
        this.d = new android.content.ComponentName("com.google.android.projection.gearhead", com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService.class.getName());
    }

    public static final defpackage.ljw d() {
        return a.a();
    }

    private final defpackage.ygw e(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        return n(defpackage.mkc.b().c(qshVar, new defpackage.nzf(new android.content.Intent("android.media.browse.MediaBrowserService"), defpackage.qqe.c, nzeVar.c(new defpackage.ynu(defpackage.nzd.b)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.content.ComponentName a(android.content.ComponentName componentName, defpackage.qsh qshVar) {
        componentName.getClass();
        qshVar.getClass();
        defpackage.ygw ygwVarE = e(qshVar, defpackage.nze.b());
        ygwVarE.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.you youVarListIterator = ygwVarE.listIterator(0);
        while (youVarListIterator.hasNext()) {
            E next = youVarListIterator.next();
            if (defpackage.afga.f(((android.content.ComponentName) next).getPackageName(), componentName.getPackageName())) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.contains(componentName) ? componentName : (android.content.ComponentName) defpackage.afga.az(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nzc
    public final defpackage.ygw b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        qshVar.getClass();
        boolean zP = defpackage.actz.P();
        defpackage.yhx yhxVarP = zP ? defpackage.yhx.p(defpackage.nzd.b, defpackage.nzd.a) : new defpackage.ynu(defpackage.nzd.b);
        yhxVarP.getClass();
        defpackage.mkj mkjVarB = defpackage.mkc.b();
        android.content.Intent intent = new android.content.Intent("androidx.car.app.CarAppService");
        defpackage.qqe qqeVar = defpackage.qqe.h;
        defpackage.ygw ygwVarN = n(mkjVarB.c(qshVar, new defpackage.nzf(intent, qqeVar, nzeVar.c(yhxVarP))));
        ygwVarN.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.you youVarListIterator = ygwVarN.listIterator(0);
        while (youVarListIterator.hasNext()) {
            E next = youVarListIterator.next();
            if (!defpackage.afga.f(((android.content.ComponentName) next).getPackageName(), "com.google.android.projection.gearhead")) {
                arrayList.add(next);
            }
        }
        defpackage.ygw ygwVarAw = defpackage.ysr.aw(arrayList);
        defpackage.mkj mkjVarB2 = defpackage.mkc.b();
        android.content.Intent intent2 = new android.content.Intent("androidx.car.app.CarAppService");
        intent2.addCategory("androidx.car.app.category.SETTINGS");
        defpackage.ygw ygwVarN2 = n(mkjVarB2.c(qshVar, new defpackage.nzf(intent2, qqeVar, nzeVar.c(yhxVarP))));
        defpackage.mkj mkjVarB3 = defpackage.mkc.b();
        android.content.Intent intent3 = new android.content.Intent("androidx.car.app.CarAppService");
        intent3.addCategory("androidx.car.app.category.MEDIA");
        defpackage.ygw ygwVarN3 = n(mkjVarB3.c(qshVar, new defpackage.nzf(intent3, qqeVar, nzeVar.c(yhxVarP))));
        ygwVarN3.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        defpackage.you youVarListIterator2 = ygwVarN3.listIterator(0);
        while (youVarListIterator2.hasNext()) {
            E next2 = youVarListIterator2.next();
            if (!defpackage.afga.f(((android.content.ComponentName) next2).getPackageName(), "com.google.android.projection.gearhead")) {
                arrayList2.add(next2);
            }
        }
        j$.util.Collection collectionAw = defpackage.ysr.aw(arrayList2);
        if (zP && nzeVar.f()) {
            j$.util.Collection arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : collectionAw) {
                if (defpackage.nsn.e().g((android.content.ComponentName) obj)) {
                    arrayList3.add(obj);
                }
            }
            collectionAw = arrayList3;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : ygwVarAw) {
            if (!ygwVarN2.contains((android.content.ComponentName) obj2)) {
                arrayList4.add(obj2);
            }
        }
        java.lang.Object objCollect = j$.util.Collection.-EL.stream(e(qshVar, nzeVar)).filter(new defpackage.koo(new defpackage.jxq(this, arrayList4, 13), 16)).collect(j$.util.stream.Collectors.toList());
        java.util.List list = (java.util.List) objCollect;
        try {
            defpackage.mkp.a.g();
            if (defpackage.oml.t(qshVar) != null) {
                list.add(defpackage.mkt.G);
            }
        } catch (java.lang.IllegalStateException | defpackage.qst | defpackage.qsu unused) {
        }
        if (defpackage.leo.a.a().d() && !defpackage.lmp.a.a().e()) {
            list.add(this.d);
        }
        list.addAll(collectionAw);
        objCollect.getClass();
        java.lang.Iterable<android.content.ComponentName> iterable = (java.lang.Iterable) objCollect;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(defpackage.afga.aj(iterable, 10));
        for (android.content.ComponentName componentName : iterable) {
            componentName.getClass();
            arrayList5.add(new defpackage.mqj(componentName, defpackage.mqg.MEDIA, false, 28));
        }
        defpackage.ygw ygwVarAw2 = defpackage.ysr.aw(arrayList5);
        if (!this.f) {
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.ra);
            java.util.ArrayList arrayList6 = new java.util.ArrayList(defpackage.afga.aj(ygwVarAw2, 10));
            java.util.Iterator<E> it = ygwVarAw2.iterator();
            while (it.hasNext()) {
                arrayList6.add(((defpackage.mqj) it.next()).a());
            }
            rrvVarH.q(arrayList6);
            oimVarU.F(rrvVarH.l());
            this.f = true;
        }
        return ygwVarAw2;
    }
}
