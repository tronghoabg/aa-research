package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class fmc implements fko, fml, fkb {
    private static final String b = fjo.b("GreedyScheduler");
    Boolean a;
    private final Context c;
    private final fmb e;
    private boolean f;
    private final fkm i;
    private final fiy j;
    private final ajjp l;
    private final sx m;
    private final gjv n;
    private final ajdr o;
    private final Map d = new HashMap();
    private final Object g = new Object();
    private final fkr h = dsz.k(true);
    private final Map k = new HashMap();

    public fmc(Context context, fiy fiyVar, kzt kztVar, fkm fkmVar, sx sxVar, ajdr ajdrVar) {
        this.c = context;
        gjv gjvVar = fiyVar.i;
        this.e = new fmb(this, gjvVar);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.l = new ajjp(gjvVar, sxVar, 5400000L);
        this.o = ajdrVar;
        this.n = new gjv(kztVar);
        this.j = fiyVar;
        this.i = fkmVar;
        this.m = sxVar;
    }

    private final void f() {
        this.a = Boolean.valueOf(fou.a(this.c, this.j));
    }

    private final void g() {
        if (this.f) {
            return;
        }
        this.i.c(this);
        this.f = true;
    }

    @Override // defpackage.fkb
    public final void a(fny fnyVar, boolean z) {
        aivh aivhVar;
        gjv gjvVarC = this.h.c(fnyVar);
        if (gjvVarC != null) {
            this.l.b(gjvVarC);
        }
        synchronized (this.g) {
            aivhVar = (aivh) this.d.remove(fnyVar);
        }
        if (aivhVar != null) {
            fjo fjoVarA = fjo.a();
            String str = b;
            Objects.toString(fnyVar);
            fjoVarA.c(str, "Stopping tracking for ".concat(fnyVar.toString()));
            aivhVar.s(null);
        }
        if (z) {
            return;
        }
        synchronized (this.g) {
            this.k.remove(fnyVar);
        }
    }

    @Override // defpackage.fko
    public final void b(String str) {
        Runnable runnable;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            fjo.a();
            Log.i(b, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        fjo.a().c(b, "Cancelling work ID ".concat(str));
        fmb fmbVar = this.e;
        if (fmbVar != null && (runnable = (Runnable) fmbVar.c.remove(str)) != null) {
            fmbVar.d.i(runnable);
        }
        for (gjv gjvVar : this.h.a(str)) {
            this.l.b(gjvVar);
            sx sxVar = this.m;
            gjvVar.getClass();
            sxVar.x(gjvVar, -512);
        }
    }

    @Override // defpackage.fko
    public final void c(fod... fodVarArr) {
        long jMax;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            fjo.a();
            Log.i(b, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<fod> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (fod fodVar : fodVarArr) {
            fny fnyVarL = dtb.l(fodVar);
            fkr fkrVar = this.h;
            if (!fkrVar.b(fnyVarL)) {
                synchronized (this.g) {
                    fny fnyVarL2 = dtb.l(fodVar);
                    Map map = this.k;
                    akdb akdbVar = (akdb) map.get(fnyVarL2);
                    if (akdbVar == null) {
                        int i = fodVar.k;
                        dsy dsyVar = this.j.g;
                        akdbVar = new akdb(i, System.currentTimeMillis());
                        map.put(fnyVarL2, akdbVar);
                    }
                    jMax = akdbVar.b + (Math.max((fodVar.k - akdbVar.a) - 5, 0) * 30000);
                }
                long jMax2 = Math.max(fodVar.a(), jMax);
                dsy dsyVar2 = this.j.g;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (fodVar.b == fju.a) {
                    if (jCurrentTimeMillis < jMax2) {
                        fmb fmbVar = this.e;
                        if (fmbVar != null) {
                            String str = fodVar.a;
                            Map map2 = fmbVar.c;
                            Runnable runnable = (Runnable) map2.remove(str);
                            if (runnable != null) {
                                fmbVar.d.i(runnable);
                            }
                            esx esxVar = new esx(fmbVar, fodVar, 8);
                            map2.put(str, esxVar);
                            fmbVar.d.j(jMax2 - System.currentTimeMillis(), esxVar);
                        }
                    } else if (fodVar.b()) {
                        fja fjaVar = fodVar.j;
                        if (fjaVar.d) {
                            fjo.a().c(b, a.bm(fodVar, "Ignoring ", ". Requires device idle."));
                        } else if (fjaVar.b()) {
                            fjo.a().c(b, a.bm(fodVar, "Ignoring ", ". Requires ContentUri triggers."));
                        } else {
                            hashSet.add(fodVar);
                            hashSet2.add(fodVar.a);
                        }
                    } else if (!fkrVar.b(dtb.l(fodVar))) {
                        fjo.a().c(b, "Starting work for ".concat(fodVar.a));
                        gjv gjvVarE = fkrVar.e(fodVar);
                        this.l.c(gjvVarE);
                        this.m.w(gjvVarE, null);
                    }
                }
            }
        }
        synchronized (this.g) {
            if (!hashSet.isEmpty()) {
                fjo.a().c(b, a.bz(TextUtils.join(",", hashSet2), "Starting tracking for "));
                for (fod fodVar2 : hashSet) {
                    fny fnyVarL3 = dtb.l(fodVar2);
                    Map map3 = this.d;
                    if (!map3.containsKey(fnyVarL3)) {
                        map3.put(fnyVarL3, fmp.a(this.n, fodVar2, (aitu) this.o.c, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.fko
    public final boolean d() {
        return false;
    }

    @Override // defpackage.fml
    public final void e(fod fodVar, flq flqVar) {
        boolean z = flqVar instanceof fmg;
        fny fnyVarL = dtb.l(fodVar);
        if (z) {
            fkr fkrVar = this.h;
            if (fkrVar.b(fnyVarL)) {
                return;
            }
            fjo fjoVarA = fjo.a();
            String str = b;
            Objects.toString(fnyVarL);
            fjoVarA.c(str, "Constraints met: Scheduling work ID ".concat(fnyVarL.toString()));
            gjv gjvVarD = fkrVar.d(fnyVarL);
            this.l.c(gjvVarD);
            this.m.w(gjvVarD, null);
            return;
        }
        fjo fjoVarA2 = fjo.a();
        String str2 = b;
        Objects.toString(fnyVarL);
        fjoVarA2.c(str2, "Constraints not met: Cancelling work ID ".concat(fnyVarL.toString()));
        gjv gjvVarC = this.h.c(fnyVarL);
        if (gjvVarC != null) {
            this.l.b(gjvVarC);
            this.m.x(gjvVarC, ((fmh) flqVar).a);
        }
    }
}
