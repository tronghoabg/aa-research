package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kb {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f25021a;

    /* renamed from: b, reason: collision with root package name */
    private final ao f25022b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.c f25023c;

    /* renamed from: d, reason: collision with root package name */
    private final kd f25024d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f25025e;

    /* renamed from: f, reason: collision with root package name */
    private bd f25026f;

    public kb(com.waze.shared_infra.i.e eVar, ao aoVar, com.waze.app_nav.hub.b.c cVar, kd kdVar, kotlinx.coroutines.af afVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(cVar, "mobilePopupManager");
        h.g.b.x.f(kdVar, "popupController");
        h.g.b.x.f(afVar, "scope");
        this.f25021a = eVar;
        this.f25022b = aoVar;
        this.f25023c = cVar;
        this.f25024d = kdVar;
        this.f25025e = afVar;
    }

    public final bd a() {
        bd bdVar = this.f25026f;
        if (bdVar != null) {
            return bdVar;
        }
        bd bdVar2 = new bd(this.f25021a, this.f25022b, this.f25023c, this.f25024d, this.f25025e);
        this.f25026f = bdVar2;
        return bdVar2;
    }
}
