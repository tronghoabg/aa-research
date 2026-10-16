package com.waze.cg.b;

import com.waze.ac;
import com.waze.an.a.u;
import com.waze.ao;
import com.waze.cf;
import com.waze.cg.c.g;
import com.waze.cg.c.h;
import com.waze.cg.c.i;
import com.waze.cg.c.p;
import com.waze.cg.c.q;
import com.waze.config.ConfigValues;
import com.waze.cs;
import com.waze.speech.k;
import h.ab;
import h.c.j;
import h.g.b.x;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.cj.c f22292a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.cg.a.e f22293b;

    /* renamed from: c, reason: collision with root package name */
    private final q f22294c;

    /* renamed from: d, reason: collision with root package name */
    private final ac f22295d;

    /* renamed from: e, reason: collision with root package name */
    private final ao f22296e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22297f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f22298g;

    /* renamed from: h, reason: collision with root package name */
    private final bn f22299h;

    /* renamed from: i, reason: collision with root package name */
    private final af f22300i;

    /* renamed from: j, reason: collision with root package name */
    private int f22301j;

    /* renamed from: k, reason: collision with root package name */
    private br f22302k;

    public e(com.waze.cj.c cVar, com.waze.cg.a.e eVar, q qVar, ac acVar, ao aoVar, k kVar, j jVar) {
        x.f(cVar, "zeroSpeedProvider");
        x.f(eVar, "wazeToGoalRepository");
        x.f(qVar, "wazeToGoalPresenter");
        x.f(acVar, "backgroundStateProvider");
        x.f(aoVar, "carManager");
        x.f(kVar, "config");
        x.f(jVar, "coroutineContext");
        this.f22292a = cVar;
        this.f22293b = eVar;
        this.f22294c = qVar;
        this.f22295d = acVar;
        this.f22296e = aoVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeToGoalController");
        x.e(eVarD, "create(...)");
        this.f22297f = eVarD;
        this.f22298g = new ConcurrentSkipListSet();
        this.f22299h = ck.b(null);
        this.f22300i = aj.e(jVar.plus(aj.Q()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(final com.waze.cg.b.e r14, h.c.e r15) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.cg.b.e.c(com.waze.cg.b.e, h.c.e):java.lang.Object");
    }

    static final ab d(e eVar, p pVar, com.waze.cg.c.j jVar) {
        x.f(jVar, "it");
        String strE = pVar.e();
        if (x.n(jVar, com.waze.cg.c.d.f22320a)) {
            k.g(true);
        } else if (x.n(jVar, com.waze.cg.c.e.f22321a)) {
            k.g(false);
        } else if (x.n(jVar, h.f22324a)) {
            eVar.f22298g.add(strE);
            ConfigValues.CONFIG_VALUE_WAZE_TO_GOAL_SHOWN_COUNT.d(Long.valueOf(k.e() + 1));
        } else {
            if (!x.n(jVar, g.f22323a) && !x.n(jVar, i.f22325a) && !x.n(jVar, com.waze.cg.c.f.f22322a)) {
                throw new h.i();
            }
            eVar.f22299h.e(null);
        }
        return ab.f48028a;
    }

    private final boolean g() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_WAZE_TO_GOAL_IS_USER_OPTED_IN.b();
        x.e(boolB, "getValue(...)");
        if (!boolB.booleanValue() || !k.f()) {
            return false;
        }
        Boolean boolB2 = ConfigValues.CONFIG_VALUE_WAZE_TO_GOAL_FOREGROUND_ONLY_ENABLED.b();
        x.e(boolB2, "getValue(...)");
        if (!boolB2.booleanValue()) {
            return true;
        }
        boolean zG = cs.g((cf) this.f22296e.a().d());
        ac acVar = this.f22295d;
        return !(zG ? ((Boolean) acVar.a().d()).booleanValue() : ((Boolean) acVar.b().d()).booleanValue());
    }

    public final void e() {
        this.f22301j++;
        if (!k.f()) {
            this.f22297f.g("Live score feature flag is off, not starting");
        } else if (this.f22302k == null) {
            this.f22302k = aj.z(this.f22300i, null, null, new d(this, null), 3);
        }
    }

    public final void f() {
        int i2 = this.f22301j - 1;
        this.f22301j = i2;
        this.f22297f.g("Stop called, reducing observers count. new count: " + i2);
        if (this.f22301j <= 0) {
            this.f22301j = 0;
            br brVar = this.f22302k;
            if (brVar != null) {
                brVar.s(null);
            }
            this.f22302k = null;
            bn bnVar = this.f22299h;
            u uVar = (u) bnVar.d();
            if (uVar != null) {
                this.f22294c.h(uVar);
            }
            bnVar.e(null);
        }
    }
}
