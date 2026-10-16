package defpackage;

import android.content.ComponentName;
import android.os.RemoteException;
import androidx.car.app.FailureResponse;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.SurfaceContainer;

/* loaded from: classes2.dex */
public final class glp {
    public final ComponentName a;
    public final geb b;
    public final gns c;
    public final urf d;
    private final boolean e;
    private final kzt f;

    public glp(ComponentName componentName, geb gebVar, kzt kztVar, gns gnsVar, urf urfVar, boolean z) {
        this.a = componentName;
        this.b = gebVar;
        this.f = kztVar;
        this.c = gnsVar;
        this.d = urfVar;
        this.e = z;
    }

    public static final void d(glp glpVar, gnk gnkVar, gdm gdmVar, Exception exc) {
        glpVar.c.c(glpVar.a, gnkVar, gns.a(new FailureResponse(exc)));
        gdp gdpVar = new gdp();
        gdpVar.a = exc;
        gdpVar.b = "Remote call " + gnkVar.name() + " failed.";
        gdmVar.a(new gdq(gdpVar));
        if (glpVar.e) {
            xyg.c(exc);
            throw new IllegalStateException("Failed calling internal app", exc);
        }
    }

    public final void a(gnk gnkVar, gek gekVar) {
        c(new glz(this, 1), gnkVar, gekVar);
    }

    public final void b(gnk gnkVar, afec afecVar) {
        t(gnkVar, new gdg(afecVar, this, 12));
    }

    public final void c(final gdm gdmVar, final gnk gnkVar, final gek gekVar) {
        gks.c("CarApp.H", "Dispatching call %s", gnkVar.name());
        this.f.k(gnkVar, new gdk() { // from class: gll
            @Override // defpackage.gdk
            public final void a(glf glfVar) {
                glp glpVar = this;
                gnk gnkVar2 = gnkVar;
                gek gekVar2 = gekVar;
                gdm gdmVar2 = gdmVar;
                try {
                    gekVar2.a(glfVar);
                } catch (RemoteException e) {
                    glp.d(glpVar, gnkVar2, gdmVar2, e);
                } catch (RuntimeException e2) {
                    glp.d(glpVar, gnkVar2, gdmVar2, e2);
                } catch (xr e3) {
                    glp.d(glpVar, gnkVar2, gdmVar2, e3);
                }
            }
        });
    }

    public final void e(ta taVar, int i) {
        b(gnk.G, new aia(taVar, i, 8));
    }

    public final void f(ta taVar) {
        b(gnk.F, new fzl(taVar, 18));
    }

    public final void g(uo uoVar, boolean z) {
        b(gnk.w, new glh(uoVar, z, 0));
    }

    public final void h(uq uqVar) {
        uqVar.getClass();
        b(gnk.n, new fzl(uqVar, 19));
    }

    public final void i(sr srVar, String str) {
        srVar.getClass();
        b(gnk.J, new gdg(srVar, str, 8, null));
    }

    public final void j(uc ucVar, String str) {
        str.getClass();
        b(gnk.z, new gdg(ucVar, str, 13, null));
    }

    public final void k(uc ucVar, String str) {
        str.getClass();
        b(gnk.A, new gdg(ucVar, str, 7, null));
    }

    public final void l(uw uwVar, int i, int i2) {
        b(gnk.v, new gli(uwVar, i, i2, 0));
    }

    public final void m(String str, afdr afdrVar) {
        try {
            afdrVar.invoke();
        } catch (RemoteException e) {
            geb gebVar = this.b;
            gdp gdpVar = new gdp();
            gdpVar.a = e;
            gdpVar.b = a.bq(str, "Remote call ", " failed.");
            gebVar.a(new gdq(gdpVar));
        }
    }

    public final void n(xc xcVar, boolean z) {
        b(gnk.C, new glh(xcVar, z, 2));
    }

    public final void o(vi viVar, String str) {
        str.getClass();
        b(gnk.q, new gdg(viVar, str, 10, null));
    }

    public final void p(vi viVar, String str) {
        str.getClass();
        b(gnk.p, new gdg(viVar, str, 5, null));
    }

    public final void q(uy uyVar, int i) {
        b(gnk.o, new aia(uyVar, i, 9));
    }

    public final void r(ISurfaceCallback iSurfaceCallback, SurfaceContainer surfaceContainer) {
        surfaceContainer.getClass();
        b(gnk.j, new gdg(iSurfaceCallback, surfaceContainer, 9, null));
    }

    public final void s(vu vuVar, String str) {
        vuVar.getClass();
        str.getClass();
        b(gnk.H, new gdg(vuVar, str, 6, null));
    }

    public final void t(gnk gnkVar, final afec afecVar) {
        a(gnkVar, new gek() { // from class: glg
            @Override // defpackage.gek
            public final void a(glf glfVar) {
                afecVar.invoke(glfVar);
            }
        });
    }
}
