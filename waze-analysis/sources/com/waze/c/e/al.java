package com.waze.c.e;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.b.p f18516a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.b.a f18517b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f18518c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f18519d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f18520e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.l f18521f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.l f18522g;

    /* renamed from: h, reason: collision with root package name */
    private final MutableState f18523h;

    /* renamed from: i, reason: collision with root package name */
    private final MutableState f18524i;

    public al(com.waze.ui.b.p pVar, com.waze.ui.b.a aVar, kotlinx.coroutines.b.ch chVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.l lVar, h.g.a.l lVar2) {
        h.g.b.x.f(pVar, "mapListSegmentedSwitchState");
        h.g.b.x.f(aVar, "alternativeRoutesCardsLayoutState");
        h.g.b.x.f(chVar, "screenState");
        h.g.b.x.f(aVar2, "onCardsListScrolled");
        h.g.b.x.f(aVar3, "onNavigationInstructionsListBackClicked");
        h.g.b.x.f(lVar, "onMapViewPortChange");
        h.g.b.x.f(lVar2, "onTimelineShown");
        this.f18516a = pVar;
        this.f18517b = aVar;
        this.f18518c = chVar;
        this.f18519d = aVar2;
        this.f18520e = aVar3;
        this.f18521f = lVar;
        this.f18522g = lVar2;
        this.f18523h = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m11162boximpl(1.0f), null, 2, null);
        this.f18524i = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m11162boximpl(1.0f), null, 2, null);
    }

    public final MutableState a() {
        return this.f18524i;
    }

    public final MutableState b() {
        return this.f18523h;
    }

    public final com.waze.ui.b.a c() {
        return this.f18517b;
    }

    public final com.waze.ui.b.p d() {
        return this.f18516a;
    }

    public final kotlinx.coroutines.b.ch e() {
        return this.f18518c;
    }

    public final void f() {
        this.f18520e.invoke();
    }

    public final void g() {
        this.f18519d.invoke();
    }

    public final void h(String str) {
        h.g.b.x.f(str, "alternativeRouteUuid");
        this.f18522g.invoke(str);
    }

    public final void i(Rect rect) {
        h.g.b.x.f(rect, "rect");
        this.f18521f.invoke(rect);
    }
}
