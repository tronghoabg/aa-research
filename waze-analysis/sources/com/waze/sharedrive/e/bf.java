package com.waze.sharedrive.e;

import com.waze.navigate.dg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.b.a f38416a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedrive.d.a f38417b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ao f38418c;

    /* renamed from: d, reason: collision with root package name */
    private final dg f38419d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f38420e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38421f;

    /* renamed from: g, reason: collision with root package name */
    private final i f38422g;

    public bf(com.waze.sharedrive.b.a aVar, com.waze.sharedrive.d.a aVar2, com.waze.ao aoVar, dg dgVar, kotlinx.coroutines.af afVar, i iVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(aVar2, "controllerFactory");
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(dgVar, "navigationInfo");
        h.g.b.x.f(afVar, "coroutineScope");
        h.g.b.x.f(iVar, "distanceCalculator");
        h.g.b.x.f(eVar, "logger");
        this.f38416a = aVar;
        this.f38417b = aVar2;
        this.f38418c = aoVar;
        this.f38419d = dgVar;
        this.f38420e = afVar;
        this.f38422g = iVar;
        this.f38421f = eVar;
    }

    public final bn a() {
        com.waze.sharedrive.b.a aVar = this.f38416a;
        if (!aVar.b()) {
            this.f38421f.a("ShareDriveInterceptor not created: feature disabled.");
            return null;
        }
        com.waze.sharedrive.d.aq aqVarA = this.f38417b.a();
        if (aqVarA != null) {
            return new bn(aqVarA, aVar, this.f38418c, this.f38419d, this.f38420e, this.f38422g, this.f38421f);
        }
        this.f38421f.g("ShareDriveController not available, cannot create ShareDriveInterceptor.");
        return null;
    }
}
