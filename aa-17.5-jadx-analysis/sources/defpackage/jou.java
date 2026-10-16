package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class jou implements jnj, jpy {
    public static final yph a = yph.c("GH.CarConnSessMgr");
    public final Context b;
    public final ima c;
    public final Handler d;
    public final Handler e;
    public final jni f;
    public final Optional g;
    public volatile jos h;
    public volatile iyq i;
    public volatile boolean j;
    public final ipp k;
    private final xyc l;
    private final Duration m;

    public jou(Context context, Handler handler, Handler handler2, ima imaVar, jni jniVar) {
        imq imqVar = new imq(10);
        ipp ippVarA = null;
        ilk ilkVar = Build.VERSION.SDK_INT >= 33 ? new ilk(context, 17) : null;
        if (Build.VERSION.SDK_INT >= 33 && acuc.a.gu().a()) {
            ippVarA = ipp.a(context, imaVar.O);
        }
        this.j = false;
        this.b = context;
        this.c = imaVar;
        this.d = handler;
        this.e = handler2;
        this.f = jniVar;
        this.l = imqVar;
        this.g = Optional.ofNullable(ilkVar);
        this.m = Duration.ofMillis(aczv.a.gu().d());
        this.k = ippVarA;
    }

    private final void l() {
        f();
        try {
            dsg.w(new kqn(this, 1)).get(this.m.toMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2535)).u("Failed to unrregister vehicle with CDM");
        } catch (TimeoutException e2) {
            ((ype) ((ype) ((ype) a.g()).p(e2)).ai((char) 2536)).u("CDM did not return disappear callback within timeout");
            ols.M(this.b, yxi.CAR_CONNECTION_CDM_DISAPPEAR_TIMEOUT);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean m() {
        f();
        ((ype) a.l().ai((char) 2531)).u("sendDeviceAppeared to CDM");
        ols.M(this.b, yxi.CAR_CONNECTION_CDM_REQUESTED);
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                Optional optional = this.g;
                if (true == optional.isPresent()) {
                    ((jlu) ((xyc) optional.get()).gu()).c();
                }
            }
            return ((Boolean) dsg.w(new rdo(this, 1)).get(this.m.toMillis(), TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2532)).u("Failed to register vehicle with CDM");
            throw new IllegalStateException("Failed to register vehicle with CDM", e);
        } catch (TimeoutException e2) {
            ((ype) ((ype) ((ype) a.g()).p(e2)).ai(2533)).x("CDM did not return appear callback within timeout (%d ms)", this.m.toMillis());
            ols.M(this.b, yxi.CAR_CONNECTION_CDM_APPEAR_TIMEOUT);
            throw new IllegalStateException("CDM did not return appear callback within timeout", e2);
        }
    }

    @Override // defpackage.jnj
    public final void a(long j, List list, Map map, ParcelFileDescriptor parcelFileDescriptor, rwm rwmVar) {
        f();
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 2542)).u("Start required services");
        ols.K(this.b, "com.google.android.gms.car.GEARHEAD_ENDPOINTS", rrx.a.ordinal(), null);
        if (k(j)) {
            this.e.post(new jon(this, d(), j, rwmVar, list, map, parcelFileDescriptor));
        } else {
            ((ype) ((ype) yphVar.h()).ai(2543)).H("Rejecting startRequiredServices call: requested session %d doesn't match active session %d", j, e());
            this.e.post(new jlh(this, rwmVar, 9, (char[]) null));
        }
    }

    @Override // defpackage.jnj
    public final void b(long j) {
        f();
        ((ype) ((ype) a.f()).ai(2544)).H("Teardown called for session %d, current session is %d", j, e());
        h();
        if (k(j)) {
            i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [jqm] */
    /* JADX WARN: Type inference failed for: r9v2, types: [izs] */
    /* JADX WARN: Type inference failed for: r9v37, types: [jbi] */
    /* JADX WARN: Type inference failed for: r9v39 */
    @Override // defpackage.jnj
    public final void c(long j, int i, tgu tguVar, rwy rwyVar, String str, CarBluetoothData carBluetoothData) {
        ?? jbiVar;
        int i2;
        f();
        rwyVar.getClass();
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai(2539)).F("Starting car connection for session %d of type %d", j, i);
        if (k(j)) {
            ((ype) ((ype) yphVar.f()).ai(2541)).x("Session %d is already active", j);
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && !this.j) {
            this.j = m();
            if (!this.j) {
                return;
            }
            if (acuc.a.gu().a() && this.k != null) {
                this.e.post(new jgu(this, 17));
            }
        }
        if (j()) {
            ols.M(this.b, yxi.CAR_CONNECTION_STARTING_NEW_SESSION_OVER_ACTIVE_SESSION);
            ((ype) yphVar.l().ai((char) 2540)).u("Requesting teardown to clear previous session state");
            this.e.post(new jgu(this.h, 19));
            Long lE = e();
            lE.getClass();
            b(lE.longValue());
        }
        if (i == 2) {
            jbiVar = new jqm(this.b, (int) aczp.b(), (int) aczp.c(), (int) aczp.d(), this.c.O);
            i2 = 2;
        } else {
            jbiVar = 0;
            i2 = i;
        }
        Context context = this.b;
        Handler handler = this.e;
        jot jotVar = new jot(this, j, i2);
        ima imaVar = this.c;
        joi joiVar = new joi(context, j, i2, handler, jotVar, imaVar, jbiVar, carBluetoothData);
        iyq iyqVar = this.i;
        int i3 = 1;
        if (iyqVar != null) {
            iyqVar.a(0, 1);
        }
        context.getClass();
        acrz acrzVar = acrz.a;
        jai jneVar = (acrzVar.gu().i() && acrzVar.gu().m()) ? new jne(context) : new jag();
        if (jbiVar == 0) {
            jbiVar = new jbi(context, acnv.a.gu().d());
        }
        jov jovVar = new jov(imaVar.O);
        final boolean z = joiVar.w;
        f();
        xyc xycVar = this.l;
        ypf ypfVar = jbp.a;
        jbl jblVar = new jbl();
        jblVar.b = context;
        jblVar.x = 2;
        jblVar.c = xycVar;
        jblVar.d = joiVar;
        jblVar.r = jneVar;
        jblVar.a = tguVar;
        jblVar.g = tguVar.a();
        jblVar.j = tguVar.b();
        jblVar.k = jbiVar;
        jblVar.m = R.raw.car_android_32;
        jblVar.i = R.raw.car_android_64;
        jblVar.h = R.raw.car_android_128;
        jblVar.n = R.string.car_hu_label;
        jblVar.e = iyqVar;
        jblVar.o = str;
        jblVar.t = false;
        rlg rlgVarA = rlh.a();
        acrb acrbVar = acrb.a;
        rlgVarA.c(acrbVar.gu().y());
        rlgVarA.b(1000);
        jblVar.f = rlgVarA.a();
        jblVar.u = jovVar;
        abnp abnpVarN = jbu.a.n();
        boolean zU = acrbVar.gu().u();
        abnpVarN.t();
        jbu jbuVar = (jbu) abnpVarN.b;
        jbuVar.b |= 1;
        jbuVar.c = zU;
        boolean zC = acrbVar.gu().C();
        abnpVarN.t();
        jbu jbuVar2 = (jbu) abnpVarN.b;
        jbuVar2.b |= 2;
        jbuVar2.d = zC;
        long jN = acrbVar.gu().n();
        abnpVarN.t();
        jbu jbuVar3 = (jbu) abnpVarN.b;
        jbuVar3.b |= 4;
        jbuVar3.e = jN;
        long jQ = acrbVar.gu().q();
        abnpVarN.t();
        jbu jbuVar4 = (jbu) abnpVarN.b;
        jbuVar4.b |= 16;
        jbuVar4.g = jQ;
        long jB = acrbVar.gu().b();
        abnpVarN.t();
        jbu jbuVar5 = (jbu) abnpVarN.b;
        jbuVar5.b |= 64;
        jbuVar5.i = jB;
        long jM = acrbVar.gu().m();
        abnpVarN.t();
        jbu jbuVar6 = (jbu) abnpVarN.b;
        jbuVar6.b |= 8;
        jbuVar6.f = jM;
        long jP = acrbVar.gu().p();
        abnpVarN.t();
        jbu jbuVar7 = (jbu) abnpVarN.b;
        jbuVar7.b |= 32;
        jbuVar7.h = jP;
        long jA = acrbVar.gu().a();
        abnpVarN.t();
        jbu jbuVar8 = (jbu) abnpVarN.b;
        jbuVar8.b |= 128;
        jbuVar8.j = jA;
        boolean zO = a.O();
        abnpVarN.t();
        jbu jbuVar9 = (jbu) abnpVarN.b;
        jbuVar9.b |= 256;
        jbuVar9.k = zO;
        boolean zE = acmx.a.gu().e();
        abnpVarN.t();
        jbu jbuVar10 = (jbu) abnpVarN.b;
        jbuVar10.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        jbuVar10.l = zE;
        int iG = (int) acrbVar.gu().g();
        abnpVarN.t();
        jbu jbuVar11 = (jbu) abnpVarN.b;
        jbuVar11.b |= 1024;
        jbuVar11.m = iG;
        int iH = (int) acrbVar.gu().h();
        abnpVarN.t();
        jbu jbuVar12 = (jbu) abnpVarN.b;
        jbuVar12.b |= 2048;
        jbuVar12.n = iH;
        boolean zA = acrbVar.gu().A();
        abnpVarN.t();
        jbu jbuVar13 = (jbu) abnpVarN.b;
        jbuVar13.b |= 4096;
        jbuVar13.o = zA;
        jblVar.v = (jbu) abnpVarN.q();
        jblVar.l = "GmsCore_OpenSSL";
        jblVar.w = new wcf(imaVar, i3);
        if (i2 == 1) {
            izy izyVarA = izz.a();
            izyVarA.e(jblVar.v);
            izyVarA.c(1);
            jblVar.p = izyVarA.a();
        } else if (i2 == 2) {
            izy izyVarA2 = izz.a();
            izyVarA2.e(jblVar.v);
            izyVarA2.c(2);
            int i4 = jblVar.v.m;
            if (i4 > 0) {
                izyVarA2.d(i4);
            }
            int i5 = jblVar.v.n;
            if (i5 > 0) {
                izyVarA2.b(i5);
            }
            jblVar.p = izyVarA2.a();
        }
        final boolean z2 = Build.VERSION.SDK_INT >= 30;
        jblVar.y = new fbf(new jcu() { // from class: jdz
            @Override // defpackage.jcu
            public final jcv a(jbj jbjVar) {
                int i6 = jbjVar.u;
                boolean z3 = z;
                return i6 != 1 ? i6 != 9 ? (i6 == 3 || i6 == 4 || i6 == 5) ? z3 ? jcv.b : jcv.a : jcv.b : jcv.a : new jea(z3, 0);
            }
        }, new jcu() { // from class: jdy
            @Override // defpackage.jcu
            public final jcv a(jbj jbjVar) {
                int i6 = jbjVar.u;
                boolean z3 = z;
                return i6 != 1 ? i6 != 7 ? i6 != 9 ? (i6 == 3 || i6 == 4 || i6 == 5) ? z3 ? jcv.b : jcv.a : jcv.b : jcv.a : z2 ? jcv.b : jcv.a : new jea(z3, 1);
            }
        });
        jblVar.q = new jcr(new jcu() { // from class: jdz
            @Override // defpackage.jcu
            public final jcv a(jbj jbjVar) {
                int i6 = jbjVar.u;
                boolean z3 = z;
                return i6 != 1 ? i6 != 9 ? (i6 == 3 || i6 == 4 || i6 == 5) ? z3 ? jcv.b : jcv.a : jcv.b : jcv.a : new jea(z3, 0);
            }
        }, new jcu() { // from class: jdy
            @Override // defpackage.jcu
            public final jcv a(jbj jbjVar) {
                int i6 = jbjVar.u;
                boolean z3 = z;
                return i6 != 1 ? i6 != 7 ? i6 != 9 ? (i6 == 3 || i6 == 4 || i6 == 5) ? z3 ? jcv.b : jcv.a : jcv.b : jcv.a : z2 ? jcv.b : jcv.a : new jea(z3, 1);
            }
        });
        if (acrbVar.gu().B()) {
            abrk abrkVarT = acrbVar.gu().t();
            abnp abnpVarN2 = xiv.a.n();
            abnp abnpVarN3 = xmg.a.n();
            int i6 = abrkVarT.e;
            abnpVarN3.t();
            xmg xmgVar = (xmg) abnpVarN3.b;
            xmgVar.b |= 8;
            xmgVar.f = i6;
            int i7 = abrkVarT.b;
            abnpVarN3.t();
            xmg xmgVar2 = (xmg) abnpVarN3.b;
            xmgVar2.b |= 1;
            xmgVar2.c = i7;
            int i8 = abrkVarT.c;
            abnpVarN3.t();
            xmg xmgVar3 = (xmg) abnpVarN3.b;
            xmgVar3.b |= 2;
            xmgVar3.d = i8;
            int i9 = abrkVarT.d;
            abnpVarN3.t();
            xmg xmgVar4 = (xmg) abnpVarN3.b;
            xmgVar4.b |= 4;
            xmgVar4.e = i9;
            xmg xmgVar5 = (xmg) abnpVarN3.q();
            abnpVarN2.t();
            xiv xivVar = (xiv) abnpVarN2.b;
            xmgVar5.getClass();
            xivVar.c = xmgVar5;
            xivVar.b |= 1;
            jblVar.s = (xiv) abnpVarN2.q();
            ((ype) yphVar.l().ai((char) 2519)).y("Set GAL connection ping configuration Ping to: %s", abrkVarT);
        }
        jbp jbpVar = new jbp(jblVar);
        sji sjiVar = new sji(joiVar);
        joiVar.l = jbpVar;
        joiVar.y = sjiVar;
        this.h = new jos(joiVar, rwyVar);
        handler.post(new aq(joiVar, rwyVar, 20));
    }

    public final jnh d() {
        f();
        jos josVar = this.h;
        josVar.getClass();
        return josVar.a;
    }

    public final Long e() {
        f();
        if (j()) {
            return Long.valueOf(((joi) d()).c);
        }
        return null;
    }

    public final void f() {
        woy.aa(this.d.getLooper() == Looper.myLooper(), "Must be called on the connection session manager thread");
    }

    final void g(int i, long j) {
        f();
        ((ype) ((ype) a.f()).ai((char) 2529)).u("Revoking active session");
        this.h = null;
        jqa jqaVar = (jqa) this.f;
        jqaVar.i.set(-1, false);
        Set set = jqaVar.d;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                qwg qwgVar = (qwg) it.next();
                try {
                    qwgVar.c();
                } catch (RemoteException unused) {
                    ((ype) ((ype) jqa.a.f()).ai(2585)).y("RemoteException notifying listener %s onDisconnected.", new zjd(zjc.a, qwgVar));
                    it.remove();
                }
            }
        }
        if (i == 1) {
            if (jqaVar.j.remove(Long.valueOf(j))) {
                jqaVar.g.c(rrc.h(yxy.CAR_SERVICE, yzz.CAR_SERVICE, yzy.ue).l());
            } else {
                ((ype) ((ype) jqa.a.h()).ai(2584)).x("Car connection with sessionId %d not started", j);
                jqaVar.g.c(rrc.h(yxy.CAR_SERVICE, yzz.CAR_SERVICE, yzy.uf).l());
            }
        }
    }

    public final void h() {
        if (this.j) {
            l();
            if (Build.VERSION.SDK_INT >= 33 && acuc.a.gu().a()) {
                this.e.post(new jgu(this, 18));
            }
            this.j = false;
        }
    }

    public final void i() {
        f();
        ((ype) ((ype) a.f()).ai((char) 2545)).u("Tearing down active session");
        jnh jnhVarD = d();
        joi joiVar = (joi) jnhVarD;
        g(joiVar.d, joiVar.c);
        this.e.post(new jgu(jnhVarD, 20));
    }

    public final boolean j() {
        f();
        return this.h != null;
    }

    public final boolean k(long j) {
        f();
        return j() && ((joi) d()).c == j;
    }
}
