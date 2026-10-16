package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cx {

    /* renamed from: a, reason: collision with root package name */
    private final Object f28713a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f28714b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f28715c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f28716d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f28717e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f28718f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f28719g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f28720h;

    public cx(h.g.a.l lVar, h.g.a.l lVar2, h.g.a.l lVar3, h.g.a.l lVar4, h.g.a.l lVar5, h.g.a.l lVar6, h.g.a.l lVar7, h.g.a.l lVar8) {
        h.g.b.x.f(lVar, "onMapEvent");
        h.g.b.x.f(lVar2, "onMarkerClicked");
        h.g.b.x.f(lVar3, "onPolylineClicked");
        h.g.b.x.f(lVar4, "onMapSkinStateChanged");
        h.g.b.x.f(lVar5, "onMapMovementStateChanged");
        h.g.b.x.f(lVar6, "onMapVisibleAreaStateChanged");
        h.g.b.x.f(lVar7, "onMapDataShowingStateChanged");
        h.g.b.x.f(lVar8, "onMapNorthLockStateChanged");
        this.f28716d = lVar;
        this.f28718f = lVar2;
        this.f28713a = lVar3;
        this.f28717e = lVar4;
        this.f28715c = lVar5;
        this.f28720h = lVar6;
        this.f28719g = lVar7;
        this.f28714b = lVar8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    public final kotlinx.coroutines.b.k a() {
        return this.f28719g;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    public final kotlinx.coroutines.b.k b() {
        return this.f28716d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    public final kotlinx.coroutines.b.k c() {
        return this.f28715c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    public final kotlinx.coroutines.b.k d() {
        return this.f28714b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    public final kotlinx.coroutines.b.k e() {
        return this.f28717e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    public final kotlinx.coroutines.b.k f() {
        return this.f28720h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    public final kotlinx.coroutines.b.k g() {
        return this.f28718f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final kotlinx.coroutines.b.ch h() {
        return this.f28713a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    public final h.g.a.l i() {
        return this.f28719g;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    public final h.g.a.l j() {
        return this.f28716d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    public final h.g.a.l k() {
        return this.f28715c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    public final h.g.a.l l() {
        return this.f28714b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    public final h.g.a.l m() {
        return this.f28717e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    public final h.g.a.l n() {
        return this.f28720h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    public final h.g.a.l o() {
        return this.f28718f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    public final h.g.a.l p() {
        return this.f28713a;
    }

    public cx(kotlinx.coroutines.b.ch chVar, kotlinx.coroutines.b.k kVar, kotlinx.coroutines.b.k kVar2, kotlinx.coroutines.b.k kVar3, kotlinx.coroutines.b.k kVar4, kotlinx.coroutines.b.k kVar5, kotlinx.coroutines.b.k kVar6, kotlinx.coroutines.b.k kVar7) {
        h.g.b.x.f(chVar, "configurationRequests");
        h.g.b.x.f(kVar, "mapContentRequests");
        h.g.b.x.f(kVar2, "mapBoundsRequests");
        h.g.b.x.f(kVar3, "etaLabelPositionsRequests");
        h.g.b.x.f(kVar4, "positionTrackingRequests");
        h.g.b.x.f(kVar5, "zoomRequests");
        h.g.b.x.f(kVar6, "darkenHightlightRequests");
        h.g.b.x.f(kVar7, "userLocationPositionRequests");
        this.f28713a = chVar;
        this.f28714b = kVar;
        this.f28715c = kVar2;
        this.f28716d = kVar3;
        this.f28717e = kVar4;
        this.f28718f = kVar5;
        this.f28719g = kVar6;
        this.f28720h = kVar7;
    }
}
