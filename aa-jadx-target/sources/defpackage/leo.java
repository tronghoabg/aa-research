package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class leo {
    public static final defpackage.len a = new defpackage.len();
    public static final defpackage.afhl b = new defpackage.kkv(defpackage.mkp.b, 8);
    public static final defpackage.yqm c = defpackage.yqm.c("GH.Hero");
    private static final java.util.List f = defpackage.afga.ac("connect-s", "connect_s");
    private static final java.util.List g = defpackage.afga.ac("connect-l", "connect_l");
    private static final java.util.List h = defpackage.afga.ac("connect-w", "connect_w");
    public volatile java.lang.Boolean d;
    public volatile java.lang.Boolean e;

    public static final defpackage.leo a() {
        return a.a();
    }

    public final void b(defpackage.rjf rjfVar) {
        java.lang.Boolean boolValueOf;
        defpackage.yqm yqmVar = c;
        yqmVar.l().u("Setting persistent car controls state for the session.");
        boolean z = true;
        this.d = java.lang.Boolean.valueOf(rjfVar != null);
        if (rjfVar == null) {
            yqmVar.l().u("CarControlManager is null, hasPersistentCarControls is false");
            boolValueOf = java.lang.Boolean.FALSE;
        } else {
            defpackage.rji rjiVar = rjfVar.b;
            rjiVar.getClass();
            java.util.List list = (java.util.List) rjfVar.a.b(new defpackage.res(rjiVar, 4));
            list.getClass();
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                } while (((com.google.android.gms.car.control.CarControlGroup) it.next()).a != 1);
            } else {
                z = false;
                break;
            }
            boolValueOf = java.lang.Boolean.valueOf(z);
            boolValueOf.getClass();
            yqmVar.l().y("hasPersistentCarControls is %b", java.lang.Boolean.valueOf(z));
        }
        this.e = boolValueOf;
    }

    public final boolean c() {
        defpackage.actb actbVar = defpackage.actb.a;
        if (!actbVar.fF().h() || !actbVar.fF().c()) {
            return false;
        }
        java.lang.Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        c.l().u("Setting car control info from isCarControlsEnabled");
        try {
            defpackage.mkp.a.g();
            defpackage.yqm yqmVar = defpackage.kit.a;
            b(((defpackage.qtv) ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).e()).d().e());
        } catch (defpackage.qsu unused) {
            b(null);
        } catch (java.lang.Throwable unused2) {
            return false;
        }
        return defpackage.afga.f(this.d, java.lang.Boolean.TRUE);
    }

    public final boolean d() {
        if (defpackage.actb.j()) {
            try {
                defpackage.mkp.a.g();
                if (defpackage.oml.r(defpackage.kit.b().e()) != null) {
                    return true;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }

    public final boolean e() {
        defpackage.yqm yqmVar = defpackage.kiv.a;
        com.google.android.gms.car.CarInfo carInfoB = ((defpackage.kiv) defpackage.mkp.a.i(defpackage.kiv.class)).b();
        if (carInfoB != null) {
            java.util.List<java.lang.String> list = f;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                for (java.lang.String str : list) {
                    java.lang.String str2 = carInfoB.j;
                    str2.getClass();
                    java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
                    lowerCase.getClass();
                    if (afzh.u(lowerCase, str, false)) {
                        return true;
                    }
                }
            }
        }
        if (carInfoB != null) {
            java.util.List<java.lang.String> list2 = g;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                for (java.lang.String str3 : list2) {
                    java.lang.String str4 = carInfoB.j;
                    str4.getClass();
                    java.lang.String lowerCase2 = str4.toLowerCase(java.util.Locale.ROOT);
                    lowerCase2.getClass();
                    if (afzh.u(lowerCase2, str3, false)) {
                        return true;
                    }
                }
            }
        }
        if (carInfoB != null) {
            java.util.List<java.lang.String> list3 = h;
            if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                for (java.lang.String str5 : list3) {
                    java.lang.String str6 = carInfoB.j;
                    str6.getClass();
                    java.lang.String lowerCase3 = str6.toLowerCase(java.util.Locale.ROOT);
                    lowerCase3.getClass();
                    if (afzh.u(lowerCase3, str5, false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean f() {
        defpackage.qsh qshVarE = defpackage.kit.b().e();
        qshVarE.getClass();
        return g(qshVarE);
    }

    public final boolean g(defpackage.qsh qshVar) {
        defpackage.actb actbVar = defpackage.actb.a;
        if (!actbVar.fF().h() || !actbVar.fF().r()) {
            return false;
        }
        defpackage.mkp.a.g();
        return qshVar.a().p(defpackage.rbf.U);
    }
}
