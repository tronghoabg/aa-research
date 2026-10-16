package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.Display;
import androidx.car.app.SessionInfo;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class jwq extends geu {
    public static final /* synthetic */ int i = 0;
    public final gdr a;
    public final SessionInfo b;
    public final gdv c;
    public final gns d;
    public gdq e;
    public final jwl f;
    public final glp g;
    public final gjv h;
    private final gen j;
    private final ges k;
    private final gku l;
    private final gdx m;
    private final Context n;
    private final geb o;
    private final ggl p;
    private boolean q;
    private boolean r;
    private final jsj s;
    private final jyk t;
    private final kdg u;
    private final nas v;
    private final jti w;
    private final wsj x;
    private final urf y;
    private final kzt z;

    public jwq(Context context, mqb mqbVar, gen genVar, ges gesVar, final geb gebVar, nas nasVar, Display display, gku gkuVar, jsj jsjVar, gdr gdrVar, gdx gdxVar, jyk jykVar, jti jtiVar, boolean z, kdg kdgVar, SessionInfo sessionInfo) {
        super(context);
        this.j = genVar;
        this.k = gesVar;
        this.v = nasVar;
        this.l = gkuVar;
        this.s = jsjVar;
        this.a = gdrVar;
        this.m = gdxVar;
        this.t = jykVar;
        this.w = jtiVar;
        this.u = kdgVar;
        this.b = sessionInfo;
        gmh gmhVar = new gmh(context, mqbVar.a, z);
        this.c = gmhVar;
        gjv gjvVar = new gjv((byte[]) null);
        this.h = gjvVar;
        this.x = new wsj(gjvVar);
        this.o = new geb() { // from class: jwp
            @Override // defpackage.geb
            public final void a(gdq gdqVar) {
                this.a.e = gdqVar;
                gebVar.a(gdqVar);
            }
        };
        jwo jwoVar = new jwo(ebf.j());
        this.d = jwoVar;
        kzt kztVar = new kzt(mqbVar.a, gebVar, jwoVar, gjvVar);
        this.z = kztVar;
        this.p = new jvd(gmhVar);
        urf urfVar = new urf(null, null);
        this.y = urfVar;
        ComponentName componentName = mqbVar.a;
        boolean z2 = false;
        if (acob.P() && affa.f(mqbVar.a.getPackageName(), "com.google.android.projection.gearhead")) {
            z2 = true;
        }
        this.g = new glp(componentName, gebVar, kztVar, jwoVar, urfVar, z2);
        H();
        s(ggk.class, new jve(gmhVar, context));
        Context contextG = gbt.g(context, mqbVar.a.getPackageName());
        if (contextG == null) {
            this.n = null;
        } else {
            Context contextCreateConfigurationContext = contextG.createDisplayContext(display).createConfigurationContext(getResources().getConfiguration());
            this.n = contextCreateConfigurationContext;
            contextCreateConfigurationContext.setTheme(gbt.f(context, mqbVar.a));
        }
        this.f = new jwl(this, mqbVar.a, gjvVar);
    }

    private final void H() {
        int i2 = jux.a;
        Context baseContext = getBaseContext();
        baseContext.getClass();
        setBaseContext(jux.b(baseContext, jux.a(this)));
    }

    @Override // defpackage.geu
    public final jti A() {
        return this.w;
    }

    @Override // defpackage.geu
    public final gjv B() {
        return this.h;
    }

    @Override // defpackage.geu
    public final wsj C() {
        return this.x;
    }

    @Override // defpackage.geu
    public final urf D() {
        return this.y;
    }

    @Override // defpackage.geu
    public final kzt E() {
        return this.z;
    }

    @Override // defpackage.geu
    public final void G(PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.printf("- app package info: %s\n", this.c);
        Object obj = this.e;
        if (obj == null) {
            obj = "n/a";
        }
        printWriter.printf("- last error: %s\n", obj);
    }

    @Override // defpackage.geu
    public final Context a() {
        return this.n;
    }

    @Override // defpackage.geu
    public final SessionInfo b() {
        return this.b;
    }

    @Override // defpackage.geu
    public final gdr c() {
        return this.a;
    }

    @Override // defpackage.geu
    public final gdv d() {
        return this.c;
    }

    @Override // defpackage.geu
    public final gdx e() {
        return this.m;
    }

    @Override // defpackage.geu
    public final geb f() {
        return this.o;
    }

    @Override // defpackage.geu
    public final gen g() {
        return this.j;
    }

    @Override // defpackage.geu
    public final ges h() {
        return this.k;
    }

    @Override // defpackage.geu
    public final ggl i() {
        return this.p;
    }

    @Override // defpackage.geu
    public final gku j() {
        return this.l;
    }

    @Override // defpackage.geu
    public final gns k() {
        return this.d;
    }

    @Override // defpackage.geu
    public final void m() {
        this.q = false;
    }

    @Override // defpackage.geu
    public final void n() {
        this.r = false;
    }

    @Override // defpackage.geu
    public final void o(Configuration configuration) {
        Resources resources;
        configuration.getClass();
        if (leh.a.a().b()) {
            this.q = true;
        }
        H();
        Context context = this.n;
        if (context != null && (resources = context.getResources()) != null) {
            resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
        }
        this.h.a(7);
    }

    @Override // defpackage.geu
    public final void p() {
        leh.a.a();
        if (acxa.an()) {
            this.r = true;
        }
        H();
        this.h.a(8);
    }

    @Override // defpackage.geu
    public final boolean q() {
        return this.q;
    }

    @Override // defpackage.geu
    public final boolean r() {
        return this.r;
    }

    @Override // defpackage.geu
    public final glp t() {
        return this.g;
    }

    @Override // defpackage.geu
    public final kdg u() {
        return this.u;
    }

    @Override // defpackage.geu
    public final jyk v() {
        return this.t;
    }

    @Override // defpackage.geu
    public final jwl w() {
        return this.f;
    }

    @Override // defpackage.geu
    public final jsj x() {
        return this.s;
    }

    @Override // defpackage.geu
    public final nas y() {
        return this.v;
    }

    @Override // defpackage.geu
    public final gcx z() {
        return new gcx();
    }
}
