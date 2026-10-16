package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wgx {
    public final String a;
    public final wgy b;
    public final xti c;
    public final Object d;
    public List e;
    private final zgp f;
    private final zfz g;
    private final xti h;

    public wgx(wgy wgyVar, zgp zgpVar) {
        wgw wgwVar = new wgw(this);
        zfq zfqVar = zfq.a;
        this.h = new xti(wgwVar, zfqVar);
        this.d = new Object();
        this.e = new ArrayList();
        this.b = wgyVar;
        this.f = zgpVar;
        this.a = wgyVar.e();
        this.c = new xti(wgyVar.a(), zfqVar);
        this.g = new zfz();
        b(new wgm(this, 2));
    }

    @ResultIgnorabilityUnspecified
    public final zgp a(xwx xwxVar, Executor executor) {
        zfk zfkVarB = xur.b(new kew(xwxVar, 16));
        xya.b(xvx.a);
        xua xuaVarAx = woy.ax("Update ".concat(String.valueOf(this.a)));
        try {
            zgp zgpVarA = this.h.a();
            zfz zfzVar = this.g;
            vvx vvxVar = new vvx(zgpVarA, 4);
            zfq zfqVar = zfq.a;
            zfzVar.a(vvxVar, zfqVar);
            zgp zgpVarA2 = zfzVar.a(xur.a(new wgv(this, zgpVarA, zfkVarB, executor, 0)), zfqVar);
            zgpVarA2.getClass();
            if (!zgpVarA.isDone()) {
                if (zgpVarA2.isDone()) {
                    wub.ai(zgpVarA2, zgpVarA);
                } else {
                    zgg zggVar = new zgg(zgpVarA2, zgpVarA);
                    zgpVarA2.c(zggVar, zfqVar);
                    zgpVarA.c(zggVar, zfqVar);
                }
            }
            wub.Z(this.f);
            zgp zgpVarAz = woy.az(zgpVarA2);
            xuaVarAx.a(zgpVarAz);
            xuaVarAx.close();
            return zgpVarAz;
        } finally {
        }
    }

    public final void b(zfk zfkVar) {
        synchronized (this.d) {
            this.e.add(zfkVar);
        }
    }

    public final zgp c() {
        zgp zgpVarH;
        new xya(xvx.a).e();
        xti xtiVar = this.h;
        if (xtiVar.d.isDone()) {
            zgpVarH = this.b.h();
        } else {
            xua xuaVarAw = woy.aw("Get ".concat(String.valueOf(this.a)), xud.a, false);
            try {
                zgp zgpVarA = xtiVar.a();
                wgm wgmVar = new wgm(this, 3);
                int i = xur.a;
                xup xupVar = new xup(xts.e(), wgmVar);
                zfq zfqVar = zfq.a;
                int i2 = zfb.c;
                zez zezVar = new zez(zgpVarA, xupVar);
                zgpVarA.c(zezVar, yrm.aK(zfqVar, zezVar));
                xuaVarAw.a(zezVar);
                xuaVarAw.close();
                zgpVarH = zezVar;
            } catch (Throwable th) {
                try {
                    xuaVarAw.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        wub.Z(this.f);
        return wub.Z(zgpVarH);
    }
}
