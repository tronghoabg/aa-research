package com.waze.main_screen.t;

import com.waze.reports_v2.presentation.bp;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bv.s f27504a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.q.b.i f27505b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.notifications.b.a f27506c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.main_screen.d.a.d f27507d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.b.a.f f27508e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f27509f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.a.m f27510g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.main_screen.h.a.a f27511h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.br.c.o f27512i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f27513j;

    /* renamed from: k, reason: collision with root package name */
    private final h.ab f27514k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.main_screen.ag.a.i f27515l;
    private final bp m;
    private final com.waze.ao.b.f n;

    public as(com.waze.bv.s sVar, com.waze.main_screen.q.b.i iVar, com.waze.notifications.b.a aVar, com.waze.main_screen.d.a.d dVar, com.waze.main_screen.b.a.f fVar, com.waze.main_screen.ag.a.i iVar2, boolean z, com.waze.reports_v2.presentation.a.m mVar, bp bpVar, com.waze.main_screen.h.a.a aVar2, com.waze.ao.b.f fVar2, com.waze.br.c.o oVar, boolean z2, h.ab abVar) {
        h.g.b.x.f(aVar2, "floatingNotificationStateHolder");
        this.f27504a = sVar;
        this.f27505b = iVar;
        this.f27506c = aVar;
        this.f27507d = dVar;
        this.f27508e = fVar;
        this.f27515l = iVar2;
        this.f27509f = z;
        this.f27510g = mVar;
        this.m = bpVar;
        this.f27511h = aVar2;
        this.n = fVar2;
        this.f27512i = oVar;
        this.f27513j = z2;
        this.f27514k = abVar;
    }

    public static /* synthetic */ as m(as asVar, com.waze.bv.s sVar, com.waze.main_screen.q.b.i iVar, com.waze.notifications.b.a aVar, com.waze.main_screen.d.a.d dVar, com.waze.main_screen.b.a.f fVar, com.waze.main_screen.ag.a.i iVar2, boolean z, com.waze.reports_v2.presentation.a.m mVar, com.waze.ao.b.f fVar2, com.waze.br.c.o oVar, boolean z2, h.ab abVar, int i2) {
        com.waze.bv.s sVar2 = (i2 & 1) != 0 ? asVar.f27504a : sVar;
        com.waze.main_screen.q.b.i iVar3 = (i2 & 2) != 0 ? asVar.f27505b : iVar;
        com.waze.notifications.b.a aVar2 = (i2 & 4) != 0 ? asVar.f27506c : aVar;
        com.waze.main_screen.d.a.d dVar2 = (i2 & 8) != 0 ? asVar.f27507d : dVar;
        com.waze.main_screen.b.a.f fVar3 = (i2 & 16) != 0 ? asVar.f27508e : fVar;
        com.waze.main_screen.ag.a.i iVar4 = (i2 & 32) != 0 ? asVar.f27515l : iVar2;
        boolean z3 = (i2 & 64) != 0 ? asVar.f27509f : z;
        com.waze.reports_v2.presentation.a.m mVar2 = (i2 & 128) != 0 ? asVar.f27510g : mVar;
        bp bpVar = (i2 & 256) != 0 ? asVar.m : null;
        com.waze.main_screen.h.a.a aVar3 = (i2 & 512) != 0 ? asVar.f27511h : null;
        com.waze.ao.b.f fVar4 = (i2 & 1024) != 0 ? asVar.n : fVar2;
        com.waze.br.c.o oVar2 = (i2 & 2048) != 0 ? asVar.f27512i : oVar;
        boolean z4 = (i2 & 4096) != 0 ? asVar.f27513j : z2;
        h.ab abVar2 = (i2 & 8192) != 0 ? asVar.f27514k : abVar;
        h.g.b.x.f(aVar3, "floatingNotificationStateHolder");
        return new as(sVar2, iVar3, aVar2, dVar2, fVar3, iVar4, z3, mVar2, bpVar, aVar3, fVar4, oVar2, z4, abVar2);
    }

    public final com.waze.main_screen.b.a.f a() {
        return this.f27508e;
    }

    public final com.waze.main_screen.d.a.d b() {
        return this.f27507d;
    }

    public final com.waze.main_screen.q.b.i c() {
        return this.f27505b;
    }

    public final com.waze.notifications.b.a d() {
        return this.f27506c;
    }

    public final com.waze.reports_v2.presentation.a.m e() {
        return this.f27510g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return h.g.b.x.n(this.f27504a, asVar.f27504a) && h.g.b.x.n(this.f27505b, asVar.f27505b) && h.g.b.x.n(this.f27506c, asVar.f27506c) && h.g.b.x.n(this.f27507d, asVar.f27507d) && h.g.b.x.n(this.f27508e, asVar.f27508e) && h.g.b.x.n(this.f27515l, asVar.f27515l) && this.f27509f == asVar.f27509f && h.g.b.x.n(this.f27510g, asVar.f27510g) && h.g.b.x.n(this.m, asVar.m) && h.g.b.x.n(this.f27511h, asVar.f27511h) && h.g.b.x.n(this.n, asVar.n) && h.g.b.x.n(this.f27512i, asVar.f27512i) && this.f27513j == asVar.f27513j && h.g.b.x.n(this.f27514k, asVar.f27514k);
    }

    public final com.waze.br.c.o f() {
        return this.f27512i;
    }

    public final com.waze.bv.s g() {
        return this.f27504a;
    }

    public final h.ab h() {
        return this.f27514k;
    }

    public final int hashCode() {
        com.waze.bv.s sVar = this.f27504a;
        int iHashCode = sVar == null ? 0 : sVar.hashCode();
        com.waze.main_screen.q.b.i iVar = this.f27505b;
        int iHashCode2 = iVar == null ? 0 : iVar.hashCode();
        int i2 = iHashCode * 31;
        com.waze.notifications.b.a aVar = this.f27506c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.waze.main_screen.d.a.d dVar = this.f27507d;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        com.waze.main_screen.b.a.f fVar = this.f27508e;
        int iHashCode5 = (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        com.waze.main_screen.ag.a.i iVar2 = this.f27515l;
        int iHashCode6 = (((iHashCode5 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31) + a.a.a(this.f27509f)) * 31;
        com.waze.reports_v2.presentation.a.m mVar = this.f27510g;
        int iHashCode7 = (iHashCode6 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        bp bpVar = this.m;
        int iHashCode8 = (((iHashCode7 + (bpVar == null ? 0 : bpVar.hashCode())) * 31) + this.f27511h.hashCode()) * 31;
        com.waze.ao.b.f fVar2 = this.n;
        int iHashCode9 = (iHashCode8 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        com.waze.br.c.o oVar = this.f27512i;
        int iHashCode10 = (((iHashCode9 + (oVar == null ? 0 : oVar.hashCode())) * 31) + a.a.a(this.f27513j)) * 31;
        h.ab abVar = this.f27514k;
        return iHashCode10 + (abVar != null ? abVar.hashCode() : 0);
    }

    public final boolean i() {
        return this.f27509f;
    }

    public final boolean j() {
        return this.f27513j;
    }

    public final com.waze.ao.b.f k() {
        return this.n;
    }

    public final com.waze.main_screen.ag.a.i l() {
        return this.f27515l;
    }

    public final String toString() {
        return "State(speedometerStateHolder=" + this.f27504a + ", arrivedToDestinationStateHolder=" + this.f27505b + ", notificationStateHolder=" + this.f27506c + ", compassStateHolder=" + this.f27507d + ", audioSDKButtonStateHolder=" + this.f27508e + ", zoomControlsStateHolder=" + this.f27515l + ", mapQuickSettingsButton=" + this.f27509f + ", reportFeedbackPointsStateHolder=" + this.f27510g + ", reportMenuButtonStateHolder=" + this.m + ", floatingNotificationStateHolder=" + this.f27511h + ", insightFeedbackEndOfDriveStateHolder=" + this.n + ", searchMateSessionStateHolder=" + this.f27512i + ", navigating=" + this.f27513j + ", savedParkingDone=" + this.f27514k + ")";
    }
}
