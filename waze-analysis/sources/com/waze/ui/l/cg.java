package com.waze.ui.l;

import android.util.Log;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cg {

    /* renamed from: a, reason: collision with root package name */
    private final ba f42674a = new ba();

    /* renamed from: b, reason: collision with root package name */
    private final ba f42675b = new ba();

    /* renamed from: c, reason: collision with root package name */
    private final AnimationSpec f42676c = AnimationSpecKt.tween$default(500, 0, null, 4, null);

    /* renamed from: d, reason: collision with root package name */
    private final MutableState f42677d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    /* renamed from: e, reason: collision with root package name */
    private final MutableState f42678e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    private final MutableState f42679f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: g, reason: collision with root package name */
    private final MutableState f42680g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    /* renamed from: h, reason: collision with root package name */
    private final Animatable f42681h = AnimatableKt.Animatable$default(0.5f, 0.0f, 2, null);

    /* renamed from: i, reason: collision with root package name */
    private final Animatable f42682i = AnimatableKt.Animatable$default(0.5f, 0.0f, 2, null);

    /* renamed from: j, reason: collision with root package name */
    private final MutableState f42683j = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new bp(false, false, false, false, 0.0f, 0.0f, bo.f42584a), null, 2, null);

    public static final /* synthetic */ Object C(ba baVar, float f2, h.c.e eVar) {
        if (baVar.j() == null && baVar.k() == null) {
            return h.ab.f48028a;
        }
        Object objCollect = kotlinx.coroutines.b.ai.Z(new cd(kotlinx.coroutines.b.ai.F(baVar.r(), SnapshotStateKt.snapshotFlow(new com.waze.sharedrive.c.r(baVar, 15)), new ce(null)), f2, baVar)).collect(cf.f42671a, eVar);
        return objCollect != h.c.a.a.f48038a ? h.ab.f48028a : objCollect;
    }

    private final void D(boolean z) {
        this.f42680g.setValue(Boolean.valueOf(z));
    }

    static final h.k m(cg cgVar) {
        return new h.k(cgVar.f42674a.l(), cgVar.f42675b.l());
    }

    public static final /* synthetic */ void n(cg cgVar, kotlinx.coroutines.af afVar, bj bjVar) {
        ba baVar;
        ba baVar2;
        ba baVar3 = cgVar.f42675b;
        ba baVar4 = cgVar.f42674a;
        t tVarA = bjVar.a();
        ad adVarJ = baVar4.j();
        ad adVarJ2 = baVar3.j();
        if (adVarJ != null && h.g.b.x.n(l.e(adVarJ), tVarA.c())) {
            baVar2 = baVar3;
            baVar = baVar4;
        } else if ((adVarJ2 == null || !h.g.b.x.n(l.e(adVarJ2), tVarA.c())) && (adVarJ2 == null || !(adVarJ2 instanceof t))) {
            if (adVarJ != null) {
                boolean z = adVarJ instanceof r;
            }
            baVar2 = baVar3;
            baVar = baVar4;
        } else {
            baVar = baVar3;
            baVar2 = baVar4;
        }
        kotlinx.coroutines.aj.z(afVar, null, null, new au(baVar2, (h.c.e) null, 4, (int[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new bq(cgVar, baVar2, baVar, tVarA, null), 3);
    }

    public static final /* synthetic */ void o(cg cgVar, kotlinx.coroutines.af afVar, bl blVar) {
        boolean z;
        ba baVar;
        ba baVar2 = cgVar.f42674a;
        ba baVar3 = cgVar.f42675b;
        ad adVarA = blVar.a();
        ad adVarJ = baVar2.j();
        ad adVarJ2 = baVar3.j();
        boolean z2 = true;
        if ((adVarJ2 == null || !h.g.b.x.n(l.e(adVarJ2), l.e(adVarA))) && ((adVarJ != null && h.g.b.x.n(l.e(adVarJ), l.e(adVarA))) || adVarJ2 == null || adVarJ != null)) {
            z2 = false;
        }
        if (z2) {
            z = z2;
            baVar = baVar3;
        } else {
            z = z2;
            baVar = baVar2;
        }
        Animatable animatable = z ? cgVar.f42682i : cgVar.f42681h;
        ba baVar4 = z ? baVar2 : baVar3;
        kotlinx.coroutines.aj.z(afVar, null, null, new au(baVar4, (h.c.e) null, 5, (boolean[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new bs(baVar, cgVar, baVar4, adVarA, animatable, null), 3);
    }

    public static final /* synthetic */ void p(cg cgVar, kotlinx.coroutines.af afVar, bm bmVar) {
        boolean z;
        ba baVar;
        ba baVar2;
        aa aaVarB = bmVar.b();
        r rVarA = bmVar.a();
        ba baVar3 = cgVar.f42674a;
        ba baVar4 = cgVar.f42675b;
        ad adVarJ = baVar3.j();
        ad adVarJ2 = baVar4.j();
        boolean z2 = true;
        if (adVarJ != null && adVarJ2 != null) {
            boolean z3 = adVarJ instanceof r;
            ba baVar5 = z3 ? baVar3 : baVar4;
            if (true == z3) {
                baVar3 = baVar4;
            }
            kotlinx.coroutines.aj.z(afVar, null, null, new br(baVar5, rVarA, (h.c.e) null, 3), 3);
            kotlinx.coroutines.aj.z(afVar, null, null, new br(baVar3, aaVarB, (h.c.e) null, 4), 3);
            return;
        }
        boolean z4 = (adVarJ != null && h.g.b.x.n(l.e(adVarJ), rVarA.b())) || ((adVarJ2 == null || !h.g.b.x.n(l.e(adVarJ2), rVarA.b())) && ((adVarJ == null || !h.g.b.x.n(l.e(adVarJ), aaVarB.c())) && ((adVarJ2 != null && h.g.b.x.n(l.e(adVarJ2), aaVarB.c())) || (!(adVarJ2 instanceof r) && (adVarJ instanceof r)))));
        if (z4) {
            z = z4;
            baVar = baVar4;
        } else {
            z = z4;
            baVar = baVar3;
        }
        Animatable animatable = z ? cgVar.f42682i : cgVar.f42681h;
        if (!z) {
            baVar3 = baVar4;
        }
        Animatable animatable2 = z ? cgVar.f42681h : cgVar.f42682i;
        if ((baVar.j() instanceof t) || (baVar.j() instanceof ab) || (baVar.j() instanceof aa)) {
            baVar2 = baVar3;
        } else {
            baVar2 = baVar3;
            z2 = false;
        }
        boolean z5 = z2;
        kotlinx.coroutines.aj.z(afVar, null, null, new bu(z5, cgVar, baVar, baVar2, animatable2, rVarA, null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new bv(z5, cgVar, baVar2, animatable, baVar, aaVarB, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A() {
        return ((Boolean) this.f42678e.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B() {
        return ((Boolean) this.f42680g.getValue()).booleanValue();
    }

    public final Animatable a() {
        return this.f42681h;
    }

    public final Animatable b() {
        return this.f42682i;
    }

    public final ad d() {
        return this.f42674a.j();
    }

    public final ad e() {
        return this.f42675b.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h.g.b.x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        h.g.b.x.d(obj, "null cannot be cast to non-null type com.waze.ui.insight.InsightState");
        cg cgVar = (cg) obj;
        return x() == cgVar.x() && A() == cgVar.A() && h.g.b.x.n(d(), cgVar.d()) && h.g.b.x.n(e(), cgVar.e());
    }

    public final ad f() {
        return this.f42674a.k();
    }

    public final ad g() {
        return this.f42675b.k();
    }

    public final ba h() {
        return this.f42674a;
    }

    public final int hashCode() {
        int iA = a.a.a(x());
        int iA2 = a.a.a(A());
        ad adVarD = d();
        int iHashCode = adVarD != null ? adVarD.hashCode() : 0;
        int i2 = (iA * 31) + iA2;
        ad adVarE = e();
        return (((i2 * 31) + iHashCode) * 31) + (adVarE != null ? adVarE.hashCode() : 0);
    }

    public final ba i() {
        return this.f42675b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bp j() {
        return (bp) this.f42683j.getValue();
    }

    public final Object k(ad adVar, ad adVar2, boolean z, boolean z2, boolean z3, h.c.e eVar) {
        this.f42677d.setValue(Boolean.valueOf(z));
        this.f42678e.setValue(Boolean.valueOf(z2));
        this.f42679f.setValue(Boolean.valueOf(z3));
        this.f42675b.B(z3);
        this.f42674a.B(z3);
        Object objD = kotlinx.coroutines.aj.d(new bw(this, adVar, adVar2, null), eVar);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }

    public final Object l(h.c.e eVar) {
        h.g.b.am amVar = new h.g.b.am();
        h.g.b.am amVar2 = new h.g.b.am();
        h.g.b.am amVar3 = new h.g.b.am();
        h.g.b.am amVar4 = new h.g.b.am();
        h.g.b.an anVar = new h.g.b.an();
        anVar.f48102a = 0.0f;
        h.g.b.an anVar2 = new h.g.b.an();
        anVar2.f48102a = 0.0f;
        Object objCollect = kotlinx.coroutines.b.ai.y(new bz(kotlinx.coroutines.b.ai.y(SnapshotStateKt.snapshotFlow(new h.g.a.a() { // from class: com.waze.ui.l.bi
            @Override // h.g.a.a
            public final Object invoke() {
                return cg.m(this.f42578a);
            }
        })), amVar, amVar3, anVar, amVar4, amVar2, anVar2, this)).collect(new ca(this), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    public final void q() {
        if (y()) {
            Log.i("InsightState", "continueResizeAnimation");
        }
        this.f42674a.u().e(false);
        this.f42675b.u().e(false);
    }

    public final void r() {
        D(false);
    }

    public final void s() {
        ad adVarD = d();
        boolean z = adVarD instanceof m;
        ad adVarE = e();
        if (z) {
            ((m) adVarD).a().invoke();
        }
        if (adVarE instanceof m) {
            ((m) adVarE).a().invoke();
        }
    }

    public final void t() {
        ad adVarD = d();
        boolean z = adVarD instanceof y;
        ad adVarE = e();
        if (z) {
            ((y) adVarD).d().invoke();
        }
        if (adVarE instanceof y) {
            ((y) adVarE).d().invoke();
        }
    }

    public final void u(bp bpVar) {
        h.g.b.x.f(bpVar, "<set-?>");
        this.f42683j.setValue(bpVar);
    }

    public final void v() {
        D(true);
    }

    public final void w() {
        if (y()) {
            Log.i("InsightState", "suspendResizeAnimation");
        }
        this.f42674a.u().e(true);
        this.f42675b.u().e(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x() {
        return ((Boolean) this.f42677d.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y() {
        return ((Boolean) this.f42679f.getValue()).booleanValue();
    }

    public final boolean z() {
        return (this.f42675b.k() == null && this.f42674a.k() == null) ? false : true;
    }
}
