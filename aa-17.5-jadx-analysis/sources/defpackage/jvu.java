package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.location.LocationManager;
import android.os.IBinder;
import android.provider.Settings;
import java.io.PrintWriter;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class jvu extends fud {
    public static final yph c = yph.c("CarApp.H.Har");
    public final boolean d;
    public final gms e;
    private final jvt f;

    public jvu(geu geuVar, boolean z) {
        super(geuVar, "CarApp.H.Har");
        this.f = new jvt(this);
        this.e = new gms((short[]) null);
        this.d = z;
    }

    public static boolean c(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            ((ype) ((ype) ((ype) c.h()).p(e)).ai((char) 2782)).u("Failed to resolve location mode.");
            return false;
        } catch (SecurityException unused) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager != null) {
                return locationManager.isLocationEnabled();
            }
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    private final void d() {
        gms gmsVar = this.e;
        Iterator it = gmsVar.g().iterator();
        while (it.hasNext()) {
            jwa.a().e((jvv) it.next());
        }
        gmsVar.a.clear();
    }

    public final ComponentName a() {
        return ((gmh) this.a.d()).a;
    }

    public final String b() {
        return a().getPackageName();
    }

    @Override // defpackage.fud
    public final void k() {
        d();
    }

    @Override // defpackage.fud
    public final void m() {
        d();
    }

    @Override // defpackage.fud, defpackage.gnp
    public final void p(PrintWriter printWriter) {
        printWriter.print("System wide location enabled:");
        printWriter.println(this.d);
        mnf mnfVarL = mnk.l();
        mng mngVarA = mnh.a();
        mngVarA.a = "Sensor Type";
        mngVarA.b();
        mngVarA.c('|');
        mngVarA.d(true);
        mnfVarL.b(mngVarA.a());
        mng mngVarA2 = mnh.a();
        mngVarA2.a = "Result Type";
        mngVarA2.b();
        mngVarA2.c('|');
        mngVarA2.d(true);
        mnfVarL.b(mngVarA2.a());
        mng mngVarA3 = mnh.a();
        mngVarA3.a = "Sensor Rate";
        mngVarA3.b();
        mngVarA3.c('|');
        mngVarA3.d(true);
        mnfVarL.b(mngVarA3.a());
        mng mngVarA4 = mnh.a();
        mngVarA4.a = "Num Responses";
        mngVarA4.b();
        mngVarA4.c('|');
        mngVarA4.d(true);
        mnfVarL.b(mngVarA4.a());
        for (jvv jvvVar : this.e.g()) {
            mnfVarL.c(Integer.valueOf(jvvVar.a), Integer.valueOf(jvvVar.b), Integer.valueOf(jvvVar.c), Integer.valueOf(jvvVar.d));
        }
        mnfVarL.a().m(printWriter);
    }

    @Override // defpackage.fuh
    public final /* bridge */ /* synthetic */ IBinder q() {
        g();
        return this.f;
    }
}
