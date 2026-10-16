package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ogv extends defpackage.nzc {
    public static final defpackage.ogu a = new defpackage.ogu();
    public static final defpackage.afhl b = new defpackage.nfw(defpackage.mkp.b, 8);
    public static final defpackage.ypg c = defpackage.ypg.c("com/google/android/apps/auto/components/telecom/provider/PhoneAppProvider");
    private static final defpackage.mqj d;
    private boolean e;
    private final defpackage.afar f;
    private final defpackage.afar g;

    static {
        android.content.ComponentName componentName = defpackage.mkt.b;
        componentName.getClass();
        d = new defpackage.mqj(componentName, defpackage.mqg.PHONE, false, 28);
    }

    public ogv() {
        super("Phone");
        this.f = new defpackage.afay(new defpackage.nhn(17));
        this.g = new defpackage.afay(new defpackage.njw(this, 9));
    }

    public static final defpackage.ogv d() {
        return a.a();
    }

    public static final boolean i() {
        return a.b();
    }

    public static final boolean k() {
        return a.c();
    }

    public static final void o(defpackage.zbd zbdVar, java.lang.String str) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.DIALER_FALLBACK, zbdVar);
        rrvVarH.p(new android.content.ComponentName(str, ""));
        defpackage.omf.u().F(rrvVarH.l());
    }

    public static final boolean p(android.content.Context context, java.lang.String str) {
        if (!new defpackage.ths(context, defpackage.acrf.i()).a(str)) {
            ((defpackage.ype) c.f().ai(5897)).y("Phone dialer %s isn't allowed to replace Gearhead dialer by our filter flag.", str);
            o(defpackage.zbd.MI, str);
            return false;
        }
        if (defpackage.oeh.a().M(context, str)) {
            return true;
        }
        ((defpackage.ype) c.f().ai(5902)).y("Phone dialer %s is not pre installed", str);
        o(defpackage.zbd.MJ, str);
        return false;
    }

    public final defpackage.mqj a() {
        return (defpackage.mqj) this.g.a();
    }

    @Override // defpackage.nzc
    public final defpackage.ygw b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        qshVar.getClass();
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        ygrVar.i(d);
        java.util.List listE = e(qshVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listE) {
            java.lang.String packageName = ((defpackage.mqj) obj).a().getPackageName();
            packageName.getClass();
            if (!g(packageName)) {
                arrayList.add(obj);
            }
        }
        ygrVar.k(arrayList);
        defpackage.ygw ygwVarG = ygrVar.g();
        ygwVarG.getClass();
        defpackage.yhv yhvVar = new defpackage.yhv();
        yhvVar.k(ygwVarG);
        defpackage.ygw ygwVarB = defpackage.luv.e().b(qshVar, defpackage.nze.b());
        ygwVarB.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : ygwVarB) {
            if (((defpackage.mqj) obj2).b == defpackage.mqg.PHONE) {
                arrayList2.add(obj2);
            }
        }
        yhvVar.k(arrayList2);
        defpackage.ygw ygwVarD = yhvVar.g().d();
        ygwVarD.getClass();
        if (!this.e) {
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_FACET, defpackage.zbd.re);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.afga.aj(ygwVarD, 10));
            java.util.Iterator<E> it = ygwVarD.iterator();
            while (it.hasNext()) {
                arrayList3.add(((defpackage.mqj) it.next()).a());
            }
            rrvVarH.q(arrayList3);
            oimVarU.F(rrvVarH.l());
            this.e = true;
        }
        return ygwVarD;
    }

    public final java.util.List e(defpackage.qsh qshVar) {
        defpackage.ygw ygwVarB = defpackage.jva.a().b(qshVar, defpackage.nze.b());
        ygwVarB.getClass();
        return ygwVarB;
    }

    public final boolean f() {
        return a() != null;
    }

    public final boolean g(java.lang.String str) {
        str.getClass();
        return ((defpackage.ths) this.f.a()).b(str);
    }

    public final boolean j(android.content.Context context) {
        return defpackage.afga.f(defpackage.oeh.a().o(context), "com.google.android.dialer") && p(context, "com.google.android.dialer");
    }
}
