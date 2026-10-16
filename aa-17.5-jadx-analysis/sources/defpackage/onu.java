package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.google.android.projection.gearhead.R;
import j$.time.Instant;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class onu implements lhg, mnd {
    public static final yph a = yph.c("GH.WeatherManager");
    public final Handler b;
    public final ooa c;
    public final eqm d;
    public final Runnable e;
    public final ikn f;
    private final eqm g;
    private final SharedPreferences h;
    private final nsg i;

    public onu(Context context) {
        ooa ooaVar = new ooa(context);
        this.f = new ikn(this, 10);
        this.e = new oez(this, 9);
        this.i = new nrp(this, 2);
        SharedPreferences sharedPreferences = context.getSharedPreferences("weather_config", 0);
        this.h = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("user_enabled", dsg.A() || aczg.h());
        if (z && !sharedPreferences.contains("user_enabled")) {
            sharedPreferences.edit().putBoolean("user_enabled", true).commit();
        }
        eqm eqmVar = new eqm();
        eqmVar.m(Boolean.valueOf(z));
        this.g = eqmVar;
        this.b = new Handler(Looper.getMainLooper());
        this.d = new eqm();
        this.c = ooaVar;
    }

    public static onu a() {
        return (onu) mki.a.i(onu.class);
    }

    public static void f(yzy yzyVar) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.WEATHER_MANAGER, yzyVar).l());
    }

    public static String l(int i) {
        return mki.a.c.getString(R.string.temperature_unit_unspecified, Integer.valueOf(i));
    }

    public final void b() {
        this.b.removeCallbacksAndMessages(null);
        nsr.c().b().A(this.i);
    }

    @Override // defpackage.lhg
    public final void c() {
        if (j()) {
            e();
        }
        mnc.a().b(mnb.A, this);
    }

    @Override // defpackage.lhg
    public final void d() {
        if (j()) {
            b();
        }
        mnc.a().d(mnb.A);
    }

    public final void e() {
        eqm eqmVar = this.d;
        if (eqmVar.e() != null) {
            oit.a();
            Instant instantNow = Instant.now();
            onv onvVar = (onv) eqmVar.e();
            onvVar.getClass();
            if (instantNow.isAfter(onvVar.d)) {
                ((ype) a.l().ai((char) 6063)).u("Clearing weather data since it's expired.");
                eqmVar.m(null);
            }
        }
        this.e.run();
        nsr.c().b().w(this.i);
    }

    public final void g(long j) {
        this.b.postDelayed(this.e, j);
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        mnf mnfVarL = mnk.l();
        mng mngVarA = mnh.a();
        mngVarA.a = "Fine Permission Granted";
        mngVarA.b();
        mngVarA.c('|');
        mngVarA.d(true);
        mnfVarL.b(mngVarA.a());
        mng mngVarA2 = mnh.a();
        mngVarA2.a = "isEnabled";
        mngVarA2.b();
        mngVarA2.c('|');
        mngVarA2.d(true);
        mnfVarL.b(mngVarA2.a());
        mnfVarL.c(Boolean.valueOf(lgv.c().s()), Boolean.valueOf(j()));
        mnfVarL.a().m(printWriter);
        printWriter.println("\n-------------------------------");
        this.c.h(printWriter);
    }

    public final void i() {
        f(yzy.Bo);
        g(aczg.c());
    }

    public final boolean j() {
        Boolean bool = (Boolean) this.g.e();
        bool.getClass();
        return lgv.c().s() && bool.booleanValue();
    }

    public final void k(boolean z, Activity activity) {
        this.h.edit().putBoolean("user_enabled", z).commit();
        this.g.m(Boolean.valueOf(z));
        if (!z) {
            this.d.m(null);
            b();
        } else if (lgv.c().s()) {
            if (j()) {
                e();
            }
        } else if (activity != null) {
            dsm.a(activity, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 100);
        } else {
            ((ype) ((ype) a.h()).ai((char) 6064)).u("setUserPreference(true) with no permission.");
        }
    }
}
