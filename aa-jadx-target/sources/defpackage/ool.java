package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ool implements defpackage.lhn, defpackage.mnj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.WeatherManager");
    public final android.os.Handler b;
    public final defpackage.oor c;
    public final defpackage.eqs d;
    public final java.lang.Runnable e;
    public final defpackage.ikx f;
    private final defpackage.eqs g;
    private final android.content.SharedPreferences h;
    private final defpackage.nst i;

    public ool(android.content.Context context) {
        defpackage.oor oorVar = new defpackage.oor(context);
        this.f = new defpackage.ikx(this, 10);
        this.e = new defpackage.ocy(this, 18);
        this.i = new nsd(this, 2);
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("weather_config", 0);
        this.h = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("user_enabled", defpackage.ebq.o() || defpackage.adai.h());
        if (z && !sharedPreferences.contains("user_enabled")) {
            sharedPreferences.edit().putBoolean("user_enabled", true).commit();
        }
        defpackage.eqs eqsVar = new defpackage.eqs();
        eqsVar.m(java.lang.Boolean.valueOf(z));
        this.g = eqsVar;
        this.b = new android.os.Handler(android.os.Looper.getMainLooper());
        this.d = new defpackage.eqs();
        this.c = oorVar;
    }

    public static defpackage.ool a() {
        return (defpackage.ool) defpackage.mkp.a.i(defpackage.ool.class);
    }

    public static void f(defpackage.zbd zbdVar) {
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.WEATHER_MANAGER, zbdVar).l());
    }

    public static java.lang.String m(int i) {
        return defpackage.mkp.a.c.getString(2132085380, java.lang.Integer.valueOf(i));
    }

    public final void b() {
        this.b.removeCallbacksAndMessages(null);
        defpackage.nte.c().b().A(this.i);
    }

    @Override // defpackage.lhn
    public final void d() {
        if (k()) {
            b();
        }
        defpackage.mni.a().d(defpackage.mnh.A);
    }

    public final void e() {
        defpackage.eqs eqsVar = this.d;
        if (eqsVar.e() != null) {
            defpackage.ojm.a();
            j$.time.Instant instantNow = j$.time.Instant.now();
            oom oomVar = (oom) eqsVar.e();
            oomVar.getClass();
            if (instantNow.isAfter(oomVar.d)) {
                ((defpackage.yqj) a.l().ai((char) 6089)).u("Clearing weather data since it's expired.");
                eqsVar.m(null);
            }
        }
        this.e.run();
        defpackage.nte.c().b().w(this.i);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (k()) {
            e();
        }
        defpackage.mni.a().b(defpackage.mnh.A, this);
    }

    public final void g(long j) {
        this.b.postDelayed(this.e, j);
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        mnl mnlVarL = mnq.l();
        mnm mnmVarA = mnn.a();
        mnmVarA.a = "Fine Permission Granted";
        mnmVarA.b();
        mnmVarA.c('|');
        mnmVarA.d(true);
        mnlVarL.b(mnmVarA.a());
        mnm mnmVarA2 = mnn.a();
        mnmVarA2.a = "isEnabled";
        mnmVarA2.b();
        mnmVarA2.c('|');
        mnmVarA2.d(true);
        mnlVarL.b(mnmVarA2.a());
        mnlVarL.c(new java.lang.Object[]{java.lang.Boolean.valueOf(defpackage.mdp.d().s()), java.lang.Boolean.valueOf(k())});
        mnlVarL.a().m(printWriter);
        printWriter.println("\n-------------------------------");
        this.c.h(printWriter);
    }

    public final void i() {
        this.e.run();
    }

    public final void j() {
        f(defpackage.zbd.Bs);
        g(defpackage.adai.c());
    }

    public final boolean k() {
        java.lang.Boolean bool = (java.lang.Boolean) this.g.e();
        bool.getClass();
        return defpackage.mdp.d().s() && bool.booleanValue();
    }

    public final void l(boolean z, android.app.Activity activity) {
        this.h.edit().putBoolean("user_enabled", z).commit();
        this.g.m(java.lang.Boolean.valueOf(z));
        if (!z) {
            this.d.m(null);
            b();
        } else if (defpackage.mdp.d().s()) {
            if (k()) {
                e();
            }
        } else if (activity != null) {
            dst.a(activity, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"}, 100);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 6090)).u("setUserPreference(true) with no permission.");
        }
    }
}
