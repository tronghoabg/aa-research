package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.SystemClock;
import com.google.android.gms.car.AnalyticsSessionInfo;
import j$.util.OptionalLong;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public abstract class lig implements lhm {
    public static final yph a = yph.c("GH.LifetimeManager");
    public OptionalLong b = OptionalLong.empty();
    public final Context c;
    public final eqc d;
    public boolean e;
    public boolean f;
    public boolean g;
    public volatile AnalyticsSessionInfo h;
    public final List i;
    public final lia j;
    public final ServiceConnection k;
    public int l;
    private boolean m;
    private boolean n;
    private final kfn o;

    public lig(Context context) {
        eqc eqcVar = new eqc(this, true);
        this.d = eqcVar;
        int i = yfq.d;
        this.h = new AnalyticsSessionInfo(-1, yls.a);
        this.l = 1;
        this.i = new CopyOnWriteArrayList();
        this.k = new lhx();
        this.o = new lhy(this);
        this.c = context;
        eqcVar.e(epr.ON_CREATE);
        this.j = new lia(new Supplier() { // from class: lhw
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.h;
            }
        });
    }

    public static String j(String str, String str2) {
        try {
            mki.a.g();
            return ols.y(kio.b().e(), str, str2);
        } catch (qrz e) {
            return (String) tss.r("GH.LifetimeManager", e, "Failed to getStringCarServiceSetting(%s)", str);
        }
    }

    public static void l(AnalyticsSessionInfo analyticsSessionInfo, rqu rquVar) {
        int i = analyticsSessionInfo.a;
        woy.aa(i != -1, "Session ID is invalid");
        rquVar.c = xxh.h(Integer.valueOf(i));
        rquVar.d = yfq.o(yfq.o(analyticsSessionInfo.b));
    }

    public static void q(lhg lhgVar) {
        ((ype) a.l().ai((char) 3950)).y("Stopping %s", lhgVar);
        lhgVar.d();
    }

    public static boolean r(raj rajVar) {
        mki.a.g();
        return ols.z(kio.b().e(), rajVar);
    }

    public static yyy t(int i, int i2) {
        abnp abnpVarN = yyy.a.n();
        abnpVarN.t();
        yyy yyyVar = (yyy) abnpVarN.b;
        yyyVar.b |= 1;
        yyyVar.e = i - 1;
        abnpVarN.t();
        yyy yyyVar2 = (yyy) abnpVarN.b;
        yyyVar2.c = 4;
        yyyVar2.d = Integer.valueOf(i2);
        return (yyy) abnpVarN.q();
    }

    public static yyy u(int i, boolean z) {
        abnp abnpVarN = yyy.a.n();
        abnpVarN.t();
        yyy yyyVar = (yyy) abnpVarN.b;
        yyyVar.b |= 1;
        yyyVar.e = i - 1;
        abnpVarN.t();
        yyy yyyVar2 = (yyy) abnpVarN.b;
        yyyVar2.c = 2;
        yyyVar2.d = Boolean.valueOf(z);
        return (yyy) abnpVarN.q();
    }

    @Override // defpackage.lhm
    public final void c() {
        ((ype) ((ype) a.f()).ai((char) 3936)).u("connectToCarService");
        wer.c();
        if (this.l != 1) {
            throw new IllegalStateException();
        }
        this.l = 2;
        yph yphVar = kio.a;
        ((kio) mki.a.i(kio.class)).v(this.o);
        ((kio) mki.a.i(kio.class)).c();
    }

    @Override // defpackage.lhm
    public final void d(lhl lhlVar) {
        wer.c();
        this.i.remove(lhlVar);
    }

    @Override // defpackage.lhm
    public final boolean g() {
        return this.f || this.e;
    }

    @Override // defpackage.lhm
    public final void gK(lhl lhlVar) {
        gL(lhlVar, false);
    }

    @Override // defpackage.lhm
    public final void gL(lhl lhlVar, boolean z) {
        wer.c();
        if (z && this.e) {
            lhlVar.c();
            if (this.g) {
                lhlVar.a();
            }
        }
        this.i.add(lhlVar);
    }

    @Override // defpackage.lhm
    public final boolean gM() {
        return this.g;
    }

    @Override // defpackage.lhm
    public final boolean gN() {
        return this.e;
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.d;
    }

    @Override // defpackage.lhm
    public final boolean h() {
        return (g() || this.n) ? false : true;
    }

    @Override // defpackage.lhm
    public final boolean i() {
        return !g() || this.n;
    }

    public abstract List k();

    public final void m(boolean z, boolean z2) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((lhl) it.next()).d(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        wer.c();
        if (!this.g && this.e) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LIFETIME, yzy.pf).l());
            tfk tfkVar = tfk.a;
            tfj tfjVar = tfj.GEARHEAD_PROJECTION_LIFETIME_DELAYED_START;
            tfkVar.b(tfjVar);
            ((ype) ((ype) a.f()).ai((char) 3939)).u("Kicking off delayed start");
            yfq yfqVar = lif.c;
            int i = ((yls) yfqVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                ((lib) yfqVar.get(i2)).a("delayed");
            }
            if (lzf.c()) {
                lif.d.a("delayed");
                this.m = true;
            }
            o();
            this.g = true;
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((lhl) it.next()).a();
            }
            tfkVar.d(tfjVar, 1);
        }
    }

    protected abstract void o();

    protected void p() {
        throw null;
    }

    protected abstract void s();

    protected abstract void v();

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(boolean z) {
        long jElapsedRealtime;
        yph yphVar = a;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(3948);
        zjc zjcVar = zjc.a;
        ypeVar.M("stop(transitionToProjected=%s, disconnectFromCarService=%s)", new zjd(zjcVar, false), new zjd(zjcVar, Boolean.valueOf(z)));
        wer.c();
        this.n = true;
        if (this.e) {
            if (lbh.c().e() == lir.a) {
                ebf.j().x(8, yyv.EXIT_WHILE_MOVING);
            }
            s();
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((lhl) it.next()).b();
            }
            this.d.e(epr.ON_STOP);
            ((ype) yphVar.l().ai((char) 3953)).u("Stopping lifetime services");
            v();
            ((ype) yphVar.l().ai((char) 3956)).y("Unbinding lifetime service: %s", k());
            this.c.unbindService(this.k);
            yfq yfqVarH = lif.b.h();
            int size = yfqVarH.size();
            for (int i = 0; i < size; i++) {
                ((lib) yfqVarH.get(i)).b();
            }
            ((ype) yphVar.l().ai((char) 3951)).u("Stopping mismatched lifetime services");
            q(lxr.l());
            if (!acur.n()) {
                q(luk.a());
            }
            q(lnm.m());
            if (actj.x() || actj.w()) {
                q(lnm.j());
            }
            if (!actj.x() || !actj.w()) {
                q(lnm.k());
                q(lnm.l());
            }
            q(luv.a());
            q(mbs.a());
            q(lau.c());
            q(kfl.h());
            q(lbh.c());
            q(lem.d());
            q(lnm.y());
            q(loy.j());
            odj odjVarA = ebf.A();
            odjVarA.x();
            q(ngf.g());
            q(lxr.p());
            q(nuj.b());
            q(mlq.e());
            q(odjVarA);
            q(lem.a());
            q(jrv.a());
            q(nrz.e());
            q(mox.b());
            q(mrr.a());
            q(msd.a());
            q(mjv.d());
            ((ype) yphVar.l().ai((char) 3952)).u("Stopped mismatched lifetime services");
            if (this.g) {
                yfq yfqVarH2 = lif.c.h();
                int size2 = yfqVarH2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    lib libVar = (lib) yfqVarH2.get(i2);
                    if (!(libVar.a.a() instanceof odj)) {
                        libVar.b();
                    }
                }
                if (this.m) {
                    lif.d.b();
                    this.m = false;
                }
            } else {
                ((ype) ((ype) yphVar.f()).ai((char) 3954)).u("Skipping stop for delayed start services.");
            }
            ((ype) yphVar.l().ai((char) 3955)).u("Lifetime services stopped");
            ohs ohsVarJ = ebf.j();
            yxy yxyVar = yxy.GEARHEAD;
            rqu rquVarH = rqv.h(yxyVar, 8, yyv.LIFETIME_END);
            rquVarH.n = xxh.h(acqv.c());
            if (this.b.isPresent()) {
                oit.a();
                jElapsedRealtime = SystemClock.elapsedRealtime() - this.b.getAsLong();
            } else {
                jElapsedRealtime = 0;
            }
            rquVarH.f = xxh.h(Long.valueOf(jElapsedRealtime));
            ohsVarJ.F(rquVarH.l());
            ebf.j().F(rrc.h(yxyVar, yzz.LIFETIME, yzy.pc).l());
            this.j.d();
            p();
            this.e = false;
            this.g = false;
        }
        if (z && this.l != 1) {
            kio.b().d();
            kio.b().w(this.o);
            this.l = 1;
        }
        this.n = false;
    }
}
