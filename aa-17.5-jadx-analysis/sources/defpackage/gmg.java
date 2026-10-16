package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import androidx.car.app.AppInfo;
import androidx.car.app.IAppManager;
import androidx.car.app.ICarApp;
import androidx.car.app.ICarHost;
import androidx.car.app.navigation.INavigationManager;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class gmg implements gnp {
    public final boolean a;
    public final ComponentName c;
    public final ICarHost d;
    public final gns f;
    public volatile geu g;
    public volatile ICarApp h;
    public volatile IInterface i;
    public volatile IInterface j;
    public volatile Intent k;
    public AppInfo l;
    public volatile glf n;
    public final glf o;
    private final boolean p;
    public final Handler b = new Handler(Looper.getMainLooper(), new gly(this, 0));
    public final ServiceConnection e = new gmf(this);
    public volatile glx m = glx.a;

    public gmg(geu geuVar, ICarHost iCarHost, glf glfVar) {
        this.g = geuVar;
        this.c = ((gmh) geuVar.d()).a;
        this.d = iCarHost;
        this.o = glfVar;
        this.f = geuVar.k();
        geuVar.i();
        this.a = true;
        geuVar.i();
        this.p = true;
    }

    public static void j(glp glpVar, geh gehVar, IInterface iInterface) {
        glpVar.a(gehVar.a, new gma(gehVar, iInterface, 1));
    }

    private final void k(Throwable th) {
        f(glx.a);
        gdp gdpVar = new gdp();
        ComponentName componentName = this.c;
        gdpVar.b = "Failed to bind to ".concat(String.valueOf(String.valueOf(componentName)));
        if (th != null) {
            gdpVar.a = th;
        }
        this.f.d(gnr.b(31, componentName));
        this.g.f().a(new gdq(gdpVar));
    }

    private final void l(glp glpVar, String str, ICarApp iCarApp, dzg dzgVar) {
        glpVar.a(gnk.d, new glu(this, iCarApp, str, dzgVar, 0));
    }

    public final void a(Intent intent) {
        int i;
        int i2 = 0;
        gks.c("CarApp.H", "Binding to %s with intent %s", this, intent);
        Handler handler = this.b;
        handler.removeMessages(1);
        handler.removeMessages(2);
        Intent intent2 = (Intent) intent.getParcelableExtra("com.android.car.libraries.apphost.common.ORIGINAL_INTENT");
        if (intent2 == null) {
            intent2 = intent;
        }
        this.k = intent2;
        int iOrdinal = this.m.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                gks.c("CarApp.H", "Already binding to %s", this.c);
                return;
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                b("car", new geh(gnk.h, new glt(this, intent2, i2)));
                return;
            }
        }
        f(glx.b);
        try {
            if (this.a) {
                int i3 = Build.VERSION.SDK_INT >= 29 ? 4097 : 1;
                if (Build.VERSION.SDK_INT >= 34 && this.p) {
                    i3 |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                }
                i = i3 | 64;
            } else {
                i = 33;
            }
            if (this.g.getApplicationContext().bindService(intent, this.e, i)) {
                this.g.E().k(gnk.y, new gdk() { // from class: gls
                    @Override // defpackage.gdk
                    public final void a(glf glfVar) {
                        this.a.n = glfVar;
                    }
                });
            } else {
                k(null);
            }
        } catch (SecurityException e) {
            gks.f("CarApp.H", e, "Cannot bind to the service.");
            k(e);
        }
    }

    public final void b(String str, final geh gehVar) {
        ICarApp iCarApp = this.h;
        final int i = 1;
        final int i2 = 0;
        if (this.m != glx.c || iCarApp == null) {
            this.f.d(gnr.b(36, this.c));
            gks.e("CarApp.H", "App is not bound when attempting to get service:  %s, call: %s, with binding state: %s", str, gehVar, this.m);
            return;
        }
        final glp glpVarT = this.g.t();
        int iHashCode = str.hashCode();
        if (iHashCode != 96801) {
            if (iHashCode != 98260) {
                if (iHashCode == 1862666772 && str.equals("navigation")) {
                    if (this.j == null) {
                        l(glpVarT, str, iCarApp, new dzg(this) { // from class: glr
                            public final /* synthetic */ gmg a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.dzg
                            public final void a(Object obj) {
                                if (i2 != 0) {
                                    gmg gmgVar = this.a;
                                    gmgVar.i = (IAppManager) obj;
                                    gmg.j(glpVarT, gehVar, gmgVar.i);
                                    return;
                                }
                                gmg gmgVar2 = this.a;
                                gmgVar2.j = (INavigationManager) obj;
                                gmg.j(glpVarT, gehVar, gmgVar2.j);
                            }
                        });
                        return;
                    } else {
                        j(glpVarT, gehVar, this.j);
                        return;
                    }
                }
            } else if (str.equals("car")) {
                j(glpVarT, gehVar, iCarApp);
                return;
            }
        } else if (str.equals(CloudRecognizerProtocolStrings.APP)) {
            if (this.i == null) {
                l(glpVarT, str, iCarApp, new dzg(this) { // from class: glr
                    public final /* synthetic */ gmg a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dzg
                    public final void a(Object obj) {
                        if (i != 0) {
                            gmg gmgVar = this.a;
                            gmgVar.i = (IAppManager) obj;
                            gmg.j(glpVarT, gehVar, gmgVar.i);
                            return;
                        }
                        gmg gmgVar2 = this.a;
                        gmgVar2.j = (INavigationManager) obj;
                        gmg.j(glpVarT, gehVar, gmgVar2.j);
                    }
                });
                return;
            } else {
                j(glpVarT, gehVar, this.i);
                return;
            }
        }
        geb gebVarF = this.g.f();
        gdp gdpVar = new gdp();
        gdpVar.b = "No manager was found for type: ".concat(str);
        gebVarF.a(new gdq(gdpVar));
    }

    public final void c(epr eprVar) {
        gks.c("CarApp.H", "Dispatching lifecycle event: %s, app: %s", eprVar, this.c.toShortString());
        b("car", new geh(gnk.g, new glt(this, eprVar, 1)));
    }

    public final void d(gdq gdqVar) {
        if (this.m != glx.a) {
            gev.c(new esx(this, gdqVar, 16, (char[]) null));
        }
    }

    public final void e() {
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void f(glx glxVar) {
        if (this.m == glxVar) {
            return;
        }
        glx glxVar2 = this.m;
        this.m = glxVar;
        gks.c("CarApp.H", "Binding state changed from %s to %s for %s", glxVar2, glxVar, this.c.flattenToShortString());
    }

    public final void g() {
        gks.c("CarApp.H", "Unbinding from %s", this);
        d(null);
    }

    public final void h(gdq gdqVar) {
        gks.c("CarApp.H", "Unbinding from %s with error: %s", this, gdqVar);
        d(gdqVar);
    }

    public final boolean i() {
        return this.m == glx.c;
    }

    @Override // defpackage.gnp
    public final void p(PrintWriter printWriter) {
        throw null;
    }

    public final String toString() {
        return "[" + this.c.flattenToShortString() + ", state: " + String.valueOf(this.m) + "]";
    }
}
