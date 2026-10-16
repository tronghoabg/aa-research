package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class ezc {
    public aitx a;
    public Executor b;
    public Executor c;
    public eys d;
    public boolean e;
    public eyk i;
    public final sx j = new sx((char[]) null);
    public final ThreadLocal f = new ThreadLocal();
    public final Map g = new LinkedHashMap();
    public boolean h = true;

    private final Object s(afdr afdrVar) {
        if (!o()) {
            return ckf.m(this, false, true, new ewm(afdrVar, 8));
        }
        k();
        try {
            Object objInvoke = afdrVar.invoke();
            n();
            return objInvoke;
        } finally {
            l();
        }
    }

    public abstract eys a();

    public final eys b() {
        eys eysVar = this.d;
        if (eysVar != null) {
            return eysVar;
        }
        affa.d("internalTracker");
        return null;
    }

    public ezg c() {
        throw new aezt("An operation is not implemented.");
    }

    public final fbp d() {
        eyk eykVar = this.i;
        if (eykVar == null) {
            affa.d("connectionManager");
            eykVar = null;
        }
        fbp fbpVar = eykVar.d;
        if (fbpVar != null) {
            return fbpVar;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object e(Callable callable) {
        return s(new epp(callable, 18));
    }

    public List f(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(affa.h((afhe) entry.getKey()), entry.getValue());
        }
        return afbe.a;
    }

    public Map g() {
        return new LinkedHashMap(afpt.e(woy.aV(woy.bp(afbg.a, 10)), 16));
    }

    public Set h() {
        return woy.cl(new ArrayList(woy.bp(afbg.a, 10)));
    }

    public final afco i() {
        aitx aitxVar = this.a;
        if (aitxVar == null) {
            affa.d("coroutineScope");
            aitxVar = null;
        }
        return ((ajbw) aitxVar).a;
    }

    public final void j() {
        if (!this.e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void k() {
        j();
        j();
        fbl fblVarB = d().b();
        if (!fblVarB.g()) {
            ezd.d(new btm(b(), (afck) null, 12));
        }
        if (((fbs) fblVarB).e.isWriteAheadLoggingEnabled()) {
            fblVarB.c();
        } else {
            fblVarB.b();
        }
    }

    public final void l() {
        d().b().d();
        if (p()) {
            return;
        }
        eys eysVarB = b();
        eysVarB.b.f(eysVarB.f, eysVarB.g);
    }

    public final void m(Runnable runnable) {
        s(new epp(runnable, 17));
    }

    public final void n() {
        d().b().f();
    }

    public final boolean o() {
        eyk eykVar = this.i;
        if (eykVar == null) {
            affa.d("connectionManager");
            eykVar = null;
        }
        return eykVar.d != null;
    }

    public final boolean p() {
        return q() && d().b().g();
    }

    public final boolean q() {
        eyk eykVar = this.i;
        if (eykVar == null) {
            affa.d("connectionManager");
            eykVar = null;
        }
        fbl fblVar = eykVar.e;
        if (fblVar != null) {
            return fblVar.h();
        }
        return false;
    }

    public final Object r(afeg afegVar, afck afckVar) {
        eyk eykVar = this.i;
        if (eykVar == null) {
            affa.d("connectionManager");
            eykVar = null;
        }
        fag fagVar = (fag) afckVar.hH().get(fag.b);
        faf fafVar = fagVar != null ? fagVar.a : null;
        if (fafVar != null) {
            return afegVar.invoke(fafVar, afckVar);
        }
        fah fahVar = eykVar.f;
        faf fafVar2 = new faf(fahVar.b, (fca) fahVar.c.a());
        return ahnc.a(new fag(fafVar2), new ehs(afegVar, fafVar2, (afck) null, 7), afckVar);
    }
}
