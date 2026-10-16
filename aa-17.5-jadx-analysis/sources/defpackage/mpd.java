package defpackage;

import android.content.ComponentName;
import android.os.SystemClock;
import android.util.ArrayMap;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.Objects;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class mpd implements qqp, lhg, mnd {
    public static final yph a = yph.c("GH.ActivityTracker");
    public static final ygr b = ygr.q("com.google.android.projection.gearhead.pctsverifier", "com.google.android.projection.gearhead", RemoteApiConstants.NOW_PACKAGE);
    public boolean f;
    public boolean g;
    public final ygr c = ygr.q(mkn.y, mkn.z, mkn.g);
    public final List d = new CopyOnWriteArrayList();
    public final Map e = new HashMap();
    public final mpc h = new mpc();
    public final wyd i = new wyd(this);
    private final wyd j = new wyd((Object) this);

    public static mpd b() {
        return (mpd) mki.a.i(mpd.class);
    }

    public static void l(Object obj, CarRegionId carRegionId, eqm eqmVar) {
        ArrayMap arrayMap = new ArrayMap();
        Map map = (Map) eqmVar.e();
        if (map != null) {
            arrayMap.putAll(map);
        }
        if (obj == null) {
            arrayMap.remove(carRegionId);
        } else {
            arrayMap.put(carRegionId, obj);
        }
        nsx nsxVarE = lxw.E();
        kio.b().e();
        yfq yfqVarA = nsxVarE.a(carRegionId);
        int size = yfqVarA.size();
        for (int i = 0; i < size; i++) {
            CarRegionId carRegionId2 = (CarRegionId) yfqVarA.get(i);
            if (obj == null) {
                arrayMap.remove(carRegionId2);
            } else {
                arrayMap.put(carRegionId2, obj);
            }
        }
        eqmVar.m(arrayMap);
    }

    public static final boolean n(mqc mqcVar, mqc mqcVar2) {
        mqb mqbVar = mqcVar2 == null ? null : mqcVar2.a;
        mqb mqbVar2 = mqcVar != null ? mqcVar.a : null;
        return mqbVar2 != null && mqbVar2.equals(mqbVar);
    }

    public static int o(mpz mpzVar) {
        int iOrdinal = mpzVar.ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 5 : 4;
        }
        return 3;
    }

    public final mpa a(CarRegionId carRegionId) {
        Map map = this.e;
        if (!map.containsKey(carRegionId)) {
            map.put(carRegionId, new mpa());
        }
        return (mpa) map.get(carRegionId);
    }

    @Override // defpackage.lhg
    public final void c() {
        if (this.f) {
            return;
        }
        this.e.clear();
        this.h.m(new HashMap());
        mki.a.g();
        kgq.d(new kyi(this, 7), "GH.ActivityTracker", yzz.ACTIVITY_TRACKER, yzy.pb, "Error registering activity listener.", new Object[0]);
        lxw.E().e(this.j);
        mnc.a().b(mnb.a, this);
    }

    @Override // defpackage.lhg
    public final void d() {
        if (this.f) {
            int i = 0;
            this.f = false;
            Map map = this.e;
            for (CarRegionId carRegionId : map.keySet()) {
                mpa mpaVarA = a(carRegionId);
                if (Objects.equals(mpaVarA.b, carRegionId)) {
                    ((ype) a.l().ai(5151)).M("Logging stop for car region %s current app %s", carRegionId, mpaVarA.c);
                    i(null, carRegionId);
                }
            }
            map.clear();
            mpc mpcVar = this.h;
            maf mafVar = new maf(3);
            if (mpcVar.n()) {
                mpcVar.a = mafVar;
            } else {
                mpcVar.m(new HashMap());
            }
            if (kio.b().q()) {
                rdm rdmVarD = ((qsz) kio.b().e()).d();
                rdmVarD.h.F(new rcs(this, i));
                if (this.g) {
                    qrn qrnVarE = kio.b().e();
                    wyd wydVar = this.i;
                    rdm rdmVarD2 = ((qsz) qrnVarE).d();
                    if (omc.c("CAR.CLIENT", 3)) {
                        rrd.a("CAR.CLIENT", null, "Multi-display client enabled. UnregisterCarActivityLifecycleEventListener");
                    }
                    rdmVarD2.j.F(new rcs(wydVar, 1));
                    this.g = false;
                }
            }
            this.d.clear();
            lxw.E().f(this.j);
            mnc.a().d(mnb.a);
        }
    }

    public final mqc e(CarRegionId carRegionId) {
        return a(carRegionId).c;
    }

    public final mqc f() {
        return e(CarRegionId.a);
    }

    public final void g(mpb mpbVar) {
        this.d.add(mpbVar);
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        for (Map.Entry entry : this.e.entrySet()) {
            printWriter.println("------- " + String.valueOf(entry.getKey()) + " -------");
            printWriter.println("Current app " + String.valueOf(((mpa) entry.getValue()).c) + " on region " + String.valueOf(((mpa) entry.getValue()).b));
        }
        printWriter.println("activeProjectionApps: ".concat(String.valueOf(String.valueOf(this.h.e()))));
    }

    public final void i(mqc mqcVar, CarRegionId carRegionId) {
        mpa mpaVarA = a(carRegionId);
        mqc mqcVar2 = mpaVarA.c;
        if (n(mqcVar, mqcVar2)) {
            return;
        }
        if (mqcVar2 != null) {
            CarRegionId carRegionId2 = (CarRegionId) new ntn(mpaVarA.b).i(carRegionId);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - a(carRegionId2).d;
            ComponentName componentNameA = mqcVar2.a();
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PROJECTION_CONTEXT, yzy.Mr);
            rrbVarH.p(componentNameA);
            rrbVarH.u(jElapsedRealtime);
            rrbVarH.n(carRegionId2);
            ohsVarJ.F(rrbVarH.l());
            ebf.j().r(o(mqcVar2.b), componentNameA, jElapsedRealtime, carRegionId2);
        }
        if (mqcVar != null) {
            ComponentName componentNameA2 = mqcVar.a();
            ohs ohsVarJ2 = ebf.j();
            rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.PROJECTION_CONTEXT, yzy.Mq);
            rrbVarH2.p(componentNameA2);
            rrbVarH2.n(carRegionId);
            ohsVarJ2.F(rrbVarH2.l());
            ebf.j().s(o(mqcVar.b), componentNameA2, carRegionId);
        }
    }

    public final void j(mpb mpbVar) {
        this.d.remove(mpbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(CarRegionId carRegionId, mqc mqcVar, long j) {
        nsx nsxVarE = lxw.E();
        kio.b().e();
        yfq yfqVarA = nsxVarE.a(carRegionId);
        int size = yfqVarA.size();
        for (int i = 0; i < size; i++) {
            mpa mpaVarA = a((CarRegionId) yfqVarA.get(i));
            mpaVarA.c = mqcVar;
            if (mqcVar == null) {
                mpaVarA.b = null;
            } else {
                mpaVarA.b = carRegionId;
                mpaVarA.d = j;
            }
        }
    }

    public final boolean m() {
        if (this.f) {
            return acxa.aK() && !kio.b().p();
        }
        return true;
    }
}
