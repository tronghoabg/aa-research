package defpackage;

import android.os.Looper;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class rpp {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public rpp(aan aanVar, String str, afdr afdrVar) {
        this.a = aanVar;
        this.c = str;
        this.b = afdrVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, pr] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, rpq] */
    public final void a(int i, boolean z) {
        woy.Z(Looper.myLooper() == Looper.getMainLooper());
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.a("CAR.PROJECTION.PLSCM", null, "onProjectionLifetimeStateChanged");
        }
        ?? r4 = this.a;
        Integer numValueOf = Integer.valueOf(i);
        if (!((Boolean) r4.a(numValueOf)).booleanValue()) {
            if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
                rrd.d(3, "CAR.PROJECTION.PLSCM", null, "Projection lifetime not at correct state: %s", numValueOf);
                return;
            }
            return;
        }
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.d(3, "CAR.PROJECTION.PLSCM", null, "Projection lifetime at correct state %s. Running action. startedLifetimeVerified:%b", numValueOf, Boolean.valueOf(z));
        }
        Object obj = this.c;
        woy.Z(Looper.myLooper() == Looper.getMainLooper());
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.a("CAR.PROJECTION.PLSCM", null, "unregisterProjectionLifetimeCallback");
        }
        rps rpsVar = (rps) obj;
        Set set = rpsVar.e;
        set.remove(this);
        if (!rpsVar.b && set.isEmpty()) {
            rpsVar.c();
        }
        this.b.a(z);
    }

    public final void b() {
        aan aanVar = (aan) this.a;
        Object obj = this.c;
        List list = (List) aanVar.i(obj);
        if (list != null) {
            list.remove(this.b);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        aanVar.m(obj, list);
    }

    public /* synthetic */ rpp(mdd mddVar, vky vkyVar, rrc rrcVar) {
        this.a = mddVar;
        this.b = vkyVar;
        this.c = rrcVar;
    }

    public rpp(rps rpsVar, pr prVar, rpq rpqVar) {
        this.a = prVar;
        this.b = rpqVar;
        this.c = rpsVar;
    }
}
