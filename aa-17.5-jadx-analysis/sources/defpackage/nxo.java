package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class nxo implements nxp {
    public final eqm b;
    public final eqj c;
    public final eqj d;
    public noh e;
    private final Handler g = new Handler();
    private static final yph f = yph.c("GH.NotificationCtrl");
    public static final ComponentName a = new ComponentName("com.google.android.projection.gearhead", "NotificationCenter");

    public nxo() {
        eqm eqmVar = new eqm(false);
        this.b = eqmVar;
        nxr nxrVar = new nxr();
        int i = nuj.b;
        wer.c();
        nxrVar.r(((nuj) mki.a.i(nuj.class)).a(), new kkl(nxrVar, 7));
        this.c = nxrVar;
        yph yphVar = nxu.a;
        nno nnoVar = new nno(4);
        afco afcoVar = tby.a;
        this.d = eqy.b(eqy.a(new tbn(eqmVar, nxrVar, nnoVar)), new tbt(new nxt(0)));
        this.e = null;
    }

    public static nxo b() {
        return (nxo) mki.a.i(nxo.class);
    }

    @Override // defpackage.nxp
    public final eqj a() {
        return new nxn();
    }

    public final void c() {
        this.g.removeCallbacks(new nqw(this, 12));
        ((ype) f.l().ai((char) 5524)).u("NotificationCenter.hide()");
        if (!f()) {
            this.e = null;
            return;
        }
        ebf.j().o(yzz.NOTIFICATION_CENTER, yzy.lD);
        this.b.m(false);
        if (!acxa.aC()) {
            mpl.e().a();
        }
        this.e.d();
        this.e = null;
        mpe.a();
    }

    @Override // defpackage.nxp
    public final void d() {
        this.g.removeCallbacks(new nqw(this, 12));
        if (f()) {
            (f() ? this.e.a() : null).getClass();
            c();
        }
    }

    public final void e() {
        ((ype) f.l().ai((char) 5529)).u("NotificationCenter.show()");
        if (f()) {
            return;
        }
        ohs ohsVarJ = ebf.j();
        yzz yzzVar = yzz.NOTIFICATION_CENTER;
        ohsVarJ.o(yzzVar, yzy.lC);
        ngf.g().h(nuw.a);
        this.b.m(true);
        if (!acxa.aC()) {
            mpl.e().m();
        }
        leh.a();
        nwz nwzVar = new nwz();
        qsw qswVarN = nsr.c().b().n(nsn.j);
        qswVarN.getClass();
        qswVarN.l = true;
        qswVarN.c(R.anim.coolwalk_app_switch_exit);
        qswVarN.b(R.anim.coolwalk_app_switch_enter);
        leh.a();
        qswVarN.n = true != leh.a().b() ? R.style.Theme_Gearhead_Coolwalk_Dark : R.style.Theme_Gearhead_Coolwalk_DayNight;
        if (nrd.a().f()) {
            mpl.a();
        }
        kgq.d(new mja(this, qswVarN.a(), nwzVar, 6), "GH.NotificationCtrl", yzzVar, yzy.lE, "Unable to show NotificationCenter", new Object[0]);
    }

    public final boolean f() {
        noh nohVar = this.e;
        return (nohVar == null || nohVar.a() == null) ? false : true;
    }
}
