package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.ai f38567a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.b.cj f38568b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedrive.d.a f38569c;

    /* renamed from: d, reason: collision with root package name */
    private final av f38570d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38571e;

    public x(com.waze.map.b.ai aiVar, com.waze.map.b.cj cjVar, com.waze.sharedrive.d.a aVar, av avVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aiVar, "mainMapController");
        h.g.b.x.f(cjVar, "mapViewControllerFactory");
        h.g.b.x.f(aVar, "sharedDriveControllerFactory");
        h.g.b.x.f(avVar, "participantPinRenderer");
        h.g.b.x.f(eVar, "logger");
        this.f38567a = aiVar;
        this.f38568b = cjVar;
        this.f38569c = aVar;
        this.f38570d = avVar;
        this.f38571e = eVar;
    }

    @Override // com.waze.sharedrive.e.w
    public final z a() {
        com.waze.sharedrive.d.aq aqVarA = this.f38569c.a();
        if (aqVarA == null) {
            this.f38571e.g("create called while controller is null, check FF");
            return null;
        }
        com.waze.map.b.ai aiVar = this.f38567a;
        com.waze.map.b.cj cjVar = this.f38568b;
        com.waze.shared_infra.i.e eVar = this.f38571e;
        return new ah(aiVar, aqVarA, cjVar.a(eVar, com.waze.map.b.ch.f28144a), this.f38570d, eVar);
    }
}
