package defpackage;

import android.os.Handler;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class qjw implements mnq {
    public boolean f;
    private qko k;
    private boolean l;
    private static final yph i = yph.c("GH.StreamItemManager");
    static final long a = 2000;
    public final List b = new ArrayList();
    private final aizk j = aizq.d(0, 1, 2);
    public final List c = new CopyOnWriteArrayList();
    private final Runnable m = new qjv(this, 2, null);
    public final Runnable g = new qjv(this, 0);
    public final Runnable h = new qjv(this, 0);
    public final Handler e = new Handler();
    final qju d = new qju();

    public static final boolean n(moa moaVar) {
        wer.c();
        return moaVar.F().e == 1;
    }

    private final void o(moa moaVar) {
        if (moaVar == null) {
            yph yphVar = i;
            if (((ype) yphVar.h()).Z()) {
                ((ype) ((ype) yphVar.h()).ai((char) 7425)).y("Canceling a non-existent stream item: %s", Objects.toString(null));
                return;
            }
            return;
        }
        this.b.remove(moaVar);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((mnp) it.next()).e(moaVar);
        }
        this.j.c(afak.a);
    }

    @Override // defpackage.mnq
    public final moa a(yzr yzrVar, long j) {
        wer.c();
        for (moa moaVar : this.b) {
            if (moaVar.A() == j && moaVar.J() == yzrVar) {
                return moaVar;
            }
        }
        return null;
    }

    @Override // defpackage.mnq
    public final List b(yzr... yzrVarArr) {
        wer.c();
        HashSet hashSetQ = yrm.q(yzrVarArr);
        ArrayList arrayList = new ArrayList();
        for (moa moaVar : this.b) {
            if (hashSetQ.contains(moaVar.J())) {
                arrayList.add(moaVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.lhg
    public final void c() {
        wer.c();
        this.k = new qko();
        this.f = true;
        Handler handler = this.e;
        handler.postDelayed(this.h, a);
        handler.postDelayed(this.m, 60000L);
        this.l = true;
    }

    @Override // defpackage.lhg
    public final void d() {
        wer.c();
        this.l = false;
        this.e.removeCallbacksAndMessages(null);
        this.b.clear();
        this.k = null;
    }

    @Override // defpackage.mnq
    public final aiyk e() {
        return this.j;
    }

    @Override // defpackage.mnq
    public final void f(mnp mnpVar) {
        this.c.add(mnpVar);
    }

    @Override // defpackage.mnq
    public final void g(moa moaVar) {
        moa moaVar2;
        wer.c();
        yph yphVar = i;
        if (yphVar.l().Z()) {
            ((ype) yphVar.l().ai((char) 7422)).y("cancel() %s", Objects.toString(moaVar));
        }
        yzr yzrVarJ = moaVar.J();
        long jA = moaVar.A();
        wer.c();
        ((ype) yphVar.l().ai(7423)).L("cancel() type=%s,id=%d", yzrVarJ, jA);
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                moaVar2 = null;
                break;
            }
            moaVar2 = (moa) it.next();
            if (yzrVarJ == moaVar2.J() && jA == moaVar2.A()) {
                break;
            }
        }
        o(moaVar2);
    }

    @Override // defpackage.mnq
    public final void h(yzr yzrVar) {
        wer.c();
        ((ype) i.l().ai((char) 7424)).y("cancelAll: %s", yzrVar);
        Iterator it = b(yzrVar).iterator();
        while (it.hasNext()) {
            o((moa) it.next());
        }
    }

    @Override // defpackage.mnq
    public final void i(moa moaVar) {
        wer.c();
        if (!n(moaVar) || this.k == null) {
            return;
        }
        o(moaVar);
        qko qkoVar = this.k;
        Set set = qkoVar.a;
        synchronized (set) {
            set.add(qkoVar.a(moaVar));
        }
        moaVar.W();
        mns mnsVarO = lxr.o();
        mnsVarO.b(moaVar, yzz.OVERVIEW_FACET, yzy.bc);
        mnsVarO.a(moaVar);
    }

    @Override // defpackage.mnq
    public final void j(moa moaVar) {
        wer.c();
        m(moaVar, true);
    }

    @Override // defpackage.mnq
    public final void k(mnp mnpVar) {
        if (this.c.remove(mnpVar)) {
            return;
        }
        ((ype) ((ype) i.h()).ai((char) 7433)).y("Listener was not registered: %s", mnpVar);
    }

    @Override // defpackage.mnq
    public final void l(moa moaVar) {
        wer.c();
        m(moaVar, false);
    }

    protected final void m(moa moaVar, boolean z) {
        boolean zContains;
        moaVar.getClass();
        if (moaVar.J() == yzr.NAV_NOTIFICATION_HERO || moaVar.J() == yzr.NAV_NOTIFICATION_NORMAL) {
            if (!luk.a().i()) {
                tss.q("GH.StreamItemManager", "received nav SI while not connected to a nav provider", new Object[0]);
            }
            if (!luk.a().e().a().getPackageName().equals(moaVar.O())) {
                tss.q("GH.StreamItemManager", "received nav SI from non-provider nav package: %s", moaVar.O());
            }
        }
        if (this.k == null) {
            ((ype) ((ype) i.h()).ai((char) 7432)).u("Ignoring stream item since it was posted before start or after stop.");
            return;
        }
        if (n(moaVar)) {
            qko qkoVar = this.k;
            if (moaVar.F().f != 2) {
                String strA = qkoVar.a(moaVar);
                Set set = qkoVar.a;
                synchronized (set) {
                    zContains = set.contains(strA);
                }
                if (zContains) {
                    return;
                }
            }
        }
        List list = this.b;
        boolean zContains2 = list.contains(moaVar);
        yph yphVar = i;
        if (yphVar.l().Z()) {
            ((ype) yphVar.l().ai(7430)).R("postInternal: Posting %s. #items %d -> %d", Objects.toString(moaVar), Integer.valueOf(list.size()), Integer.valueOf(list.size() + (!zContains2 ? 1 : 0)));
        }
        if (zContains2) {
            int iIndexOf = list.indexOf(moaVar);
            moa moaVar2 = (moa) list.get(iIndexOf);
            list.set(iIndexOf, moaVar);
            this.d.c(list);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((mnp) it.next()).d(moaVar2, moaVar);
            }
        } else if (z) {
            list.add(moaVar);
            this.d.c(list);
            if (this.l) {
                lxr.o().b(moaVar, yzz.OVERVIEW_FACET, yzy.bb);
            } else {
                ((ype) ((ype) yphVar.g()).ai((char) 7428)).u("Trying to log creation event before SIM.start() called");
            }
            if (this.f) {
                Handler handler = this.e;
                Runnable runnable = this.g;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 1000L);
            }
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                ((mnp) it2.next()).c(moaVar);
            }
        }
        this.j.c(afak.a);
    }
}
