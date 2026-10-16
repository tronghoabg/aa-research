package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.Display;
import androidx.car.app.SessionInfo;

/* loaded from: classes2.dex */
public final class jso extends jsd {
    public final /* synthetic */ jsp b;

    public jso(jsp jspVar) {
        this.b = jspVar;
    }

    @Override // defpackage.jsd
    public final /* bridge */ /* synthetic */ Object a(Pair pair) {
        mqc mqcVarA;
        mqb mqbVar = (mqb) pair.first;
        SessionInfo sessionInfo = (SessionInfo) pair.second;
        gdr gdrVar = new gdr(this, mqbVar, sessionInfo);
        jsp jspVar = this.b;
        gdrVar.a = jspVar;
        Context contextRequireContext = jspVar.requireContext();
        juh juhVar = new juh(jspVar, 1);
        jrz jrzVar = new jrz(jspVar, new jda((Object) this, (Object) mqbVar, (Object) sessionInfo, 8, (short[]) null));
        nas nasVar = new nas(this, mqbVar);
        Display display = jspVar.n;
        display.getClass();
        gku gkuVar = jspVar.i;
        gkuVar.getClass();
        gdx gdxVar = jspVar.o;
        jyk jykVarA = jyk.a();
        qrn qrnVar = jspVar.m;
        boolean z = (qrnVar == null || (mqcVarA = lem.a().a(qrnVar, mqbVar)) == null || mqcVarA.b != mpz.b) ? false : true;
        jti jtiVar = jspVar.t;
        jsj jsjVar = jspVar.s;
        ges gesVar = jspVar.e;
        kdg kdgVar = kdg.a;
        SessionInfo sessionInfo2 = jspVar.q;
        esm.a(jspVar);
        int i = jwq.i;
        mqbVar.getClass();
        gesVar.getClass();
        jsjVar.getClass();
        gdxVar.getClass();
        jtiVar.getClass();
        sessionInfo2.getClass();
        jwq jwqVar = new jwq(contextRequireContext, mqbVar, new gen(juhVar), gesVar, jrzVar, nasVar, display, gkuVar, jsjVar, gdrVar, gdxVar, jykVarA, jtiVar, z, kdgVar, sessionInfo2);
        jwqVar.s(gsf.class, new jsn(this));
        jwqVar.s(gsy.class, new gsz(jwqVar, new jsl(this, mqbVar, sessionInfo, 0)));
        int i2 = ghl.d;
        ggk ggkVar = (ggk) jwqVar.F(ggk.class);
        jwl jwlVar = jwqVar.f;
        SessionInfo sessionInfo3 = jwqVar.b;
        gjv gjvVar = jwqVar.h;
        gns gnsVar = jwqVar.d;
        gdv gdvVar = jwqVar.c;
        aboh abohVar = aczc.m().b;
        abohVar.getClass();
        jwqVar.s(ghl.class, new ghl(ggp.a(jwlVar.a, abohVar, 0), sessionInfo3, gjvVar, gnsVar, gdvVar, ggkVar.K(), ggkVar.g()));
        jwqVar.s(gyz.class, new gyz(jwqVar));
        jwqVar.s(hjr.class, new kaf(mqbVar.a));
        jwqVar.s(gio.class, new gio(jwqVar));
        jwqVar.s(gnf.class, new jwy());
        jwqVar.s(gef.class, new gmi(gjvVar, new ajmd(jspVar)));
        jwqVar.s(gdu.class, new jwm(jwqVar));
        jwqVar.s(hgh.class, new hgh(jwqVar));
        jwqVar.s(gdw.class, new gdw());
        jwqVar.s(hmc.class, new hmc(jwqVar));
        jwqVar.s(gpd.class, new keo(jwqVar));
        jwqVar.s(gdl.class, new gdl(jwqVar));
        jym jymVar = new jym(jwqVar);
        jwqVar.s(gvb.class, jymVar);
        jspVar.getLifecycle().c(jymVar);
        jwqVar.s(gei.class, new gei());
        jwqVar.s(gts.class, new gts(jwqVar));
        jwqVar.s(hgq.class, new hgq(jwqVar));
        jwqVar.s(gsc.class, new jxu(jwqVar));
        jwqVar.s(gse.class, new jyf());
        jwqVar.s(gsd.class, lxs.b());
        if (acob.ad()) {
            jwqVar.s(gnj.class, new gnj(new gnn(), new gnn(), new gnn(), new gnn(), new gnn(), new gnn()));
        } else {
            jwqVar.s(gnj.class, new jwx());
        }
        jwqVar.s(geq.class, new jsm());
        jxd jxdVar = new jxd();
        jwqVar.s(gbl.class, jxdVar);
        jwqVar.s(gqb.class, jxdVar);
        jwqVar.s(gyw.class, new gyw());
        jwqVar.s(gyy.class, new gyy());
        jwqVar.s(gtt.class, new kbm());
        jwqVar.s(gaq.class, lfr.b());
        jwqVar.s(hmk.class, new ker(jspVar.getLifecycle()));
        jwqVar.s(gve.class, new gve());
        return jwqVar;
    }
}
