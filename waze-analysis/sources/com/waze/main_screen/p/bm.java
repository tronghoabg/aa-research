package com.waze.main_screen.p;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bv.s f27203a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.q.b.i f27204b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.l.b.j f27205c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.notifications.b.a f27206d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.d.a.d f27207e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.main_screen.b.a.f f27208f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.main_screen.j.a.h f27209g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.a.m f27210h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.c.e.k f27211i;

    /* renamed from: j, reason: collision with root package name */
    private final bl f27212j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.main_screen.ag.a.i f27213k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.map.isolated.k f27214l;

    public bm(com.waze.bv.s sVar, com.waze.main_screen.q.b.i iVar, com.waze.main_screen.l.b.j jVar, com.waze.notifications.b.a aVar, com.waze.main_screen.d.a.d dVar, com.waze.main_screen.b.a.f fVar, com.waze.main_screen.j.a.h hVar, com.waze.main_screen.ag.a.i iVar2, com.waze.reports_v2.presentation.a.m mVar, com.waze.c.e.k kVar, com.waze.map.isolated.k kVar2, bl blVar) {
        h.g.b.x.f(kVar2, "navigationState");
        this.f27203a = sVar;
        this.f27204b = iVar;
        this.f27205c = jVar;
        this.f27206d = aVar;
        this.f27207e = dVar;
        this.f27208f = fVar;
        this.f27209g = hVar;
        this.f27213k = iVar2;
        this.f27210h = mVar;
        this.f27211i = kVar;
        this.f27214l = kVar2;
        this.f27212j = blVar;
    }

    public static /* synthetic */ bm m(bm bmVar, com.waze.bv.s sVar, com.waze.main_screen.q.b.i iVar, com.waze.main_screen.l.b.j jVar, com.waze.notifications.b.a aVar, com.waze.main_screen.d.a.d dVar, com.waze.main_screen.b.a.f fVar, com.waze.main_screen.j.a.h hVar, com.waze.main_screen.ag.a.i iVar2, com.waze.reports_v2.presentation.a.m mVar, com.waze.map.isolated.k kVar, bl blVar, int i2) {
        if ((i2 & 1) != 0) {
            sVar = bmVar.f27203a;
        }
        com.waze.bv.s sVar2 = sVar;
        if ((i2 & 2) != 0) {
            iVar = bmVar.f27204b;
        }
        com.waze.main_screen.q.b.i iVar3 = iVar;
        com.waze.main_screen.l.b.j jVar2 = (i2 & 4) != 0 ? bmVar.f27205c : jVar;
        com.waze.notifications.b.a aVar2 = (i2 & 8) != 0 ? bmVar.f27206d : aVar;
        com.waze.main_screen.d.a.d dVar2 = (i2 & 16) != 0 ? bmVar.f27207e : dVar;
        com.waze.main_screen.b.a.f fVar2 = (i2 & 32) != 0 ? bmVar.f27208f : fVar;
        com.waze.main_screen.j.a.h hVar2 = (i2 & 64) != 0 ? bmVar.f27209g : hVar;
        com.waze.main_screen.ag.a.i iVar4 = (i2 & 128) != 0 ? bmVar.f27213k : iVar2;
        com.waze.reports_v2.presentation.a.m mVar2 = (i2 & 256) != 0 ? bmVar.f27210h : mVar;
        com.waze.c.e.k kVar2 = (i2 & 512) != 0 ? bmVar.f27211i : null;
        com.waze.map.isolated.k kVar3 = (i2 & 1024) != 0 ? bmVar.f27214l : kVar;
        bl blVar2 = (i2 & 2048) != 0 ? bmVar.f27212j : blVar;
        h.g.b.x.f(kVar3, "navigationState");
        return new bm(sVar2, iVar3, jVar2, aVar2, dVar2, fVar2, hVar2, iVar4, mVar2, kVar2, kVar3, blVar2);
    }

    public final com.waze.c.e.k a() {
        return this.f27211i;
    }

    public final com.waze.main_screen.b.a.f b() {
        return this.f27208f;
    }

    public final com.waze.main_screen.d.a.d c() {
        return this.f27207e;
    }

    public final com.waze.main_screen.j.a.h d() {
        return this.f27209g;
    }

    public final com.waze.main_screen.l.b.j e() {
        return this.f27205c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return h.g.b.x.n(this.f27203a, bmVar.f27203a) && h.g.b.x.n(this.f27204b, bmVar.f27204b) && h.g.b.x.n(this.f27205c, bmVar.f27205c) && h.g.b.x.n(this.f27206d, bmVar.f27206d) && h.g.b.x.n(this.f27207e, bmVar.f27207e) && h.g.b.x.n(this.f27208f, bmVar.f27208f) && h.g.b.x.n(this.f27209g, bmVar.f27209g) && h.g.b.x.n(this.f27213k, bmVar.f27213k) && h.g.b.x.n(this.f27210h, bmVar.f27210h) && h.g.b.x.n(this.f27211i, bmVar.f27211i) && h.g.b.x.n(this.f27214l, bmVar.f27214l) && h.g.b.x.n(this.f27212j, bmVar.f27212j);
    }

    public final bl f() {
        return this.f27212j;
    }

    public final com.waze.main_screen.q.b.i g() {
        return this.f27204b;
    }

    public final com.waze.notifications.b.a h() {
        return this.f27206d;
    }

    public final int hashCode() {
        com.waze.bv.s sVar = this.f27203a;
        int iHashCode = sVar == null ? 0 : sVar.hashCode();
        com.waze.main_screen.q.b.i iVar = this.f27204b;
        int iHashCode2 = iVar == null ? 0 : iVar.hashCode();
        int i2 = iHashCode * 31;
        com.waze.main_screen.l.b.j jVar = this.f27205c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (jVar == null ? 0 : jVar.hashCode())) * 31;
        com.waze.notifications.b.a aVar = this.f27206d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.waze.main_screen.d.a.d dVar = this.f27207e;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        com.waze.main_screen.b.a.f fVar = this.f27208f;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        com.waze.main_screen.j.a.h hVar = this.f27209g;
        int iHashCode7 = (iHashCode6 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        com.waze.main_screen.ag.a.i iVar2 = this.f27213k;
        int iHashCode8 = (iHashCode7 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        com.waze.reports_v2.presentation.a.m mVar = this.f27210h;
        int iHashCode9 = (iHashCode8 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        com.waze.c.e.k kVar = this.f27211i;
        return ((((iHashCode9 + (kVar == null ? 0 : kVar.hashCode())) * 31) + this.f27214l.hashCode()) * 31) + (this.f27212j != null ? DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS : 0);
    }

    public final com.waze.reports_v2.presentation.a.m i() {
        return this.f27210h;
    }

    public final com.waze.bv.s j() {
        return this.f27203a;
    }

    public final com.waze.main_screen.ag.a.i k() {
        return this.f27213k;
    }

    public final com.waze.map.isolated.k l() {
        return this.f27214l;
    }

    public final String toString() {
        return "State(speedometerStateHolder=" + this.f27203a + ", nearingDestinationStateHolder=" + this.f27204b + ", navigationInstructionsListStateHolder=" + this.f27205c + ", notificationStateHolder=" + this.f27206d + ", compassStateHolder=" + this.f27207e + ", audioSdkButtonStateHolder=" + this.f27208f + ", googleAssistantButtonStateHolder=" + this.f27209g + ", zoomControlsStateHolder=" + this.f27213k + ", reportFeedbackPointsStateHolder=" + this.f27210h + ", alternateRoutesFTETooltipStateHolder=" + this.f27211i + ", navigationState=" + this.f27214l + ", openAltRoutesRequest=" + this.f27212j + ")";
    }
}
