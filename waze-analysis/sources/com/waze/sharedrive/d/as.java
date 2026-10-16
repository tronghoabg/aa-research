package com.waze.sharedrive.d;

import com.waze.sound.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final a f38227a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38228b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f38229c;

    public as(a aVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "controllerFactory");
        h.g.b.x.f(eVar, "logger");
        this.f38227a = aVar;
        this.f38228b = eVar;
        this.f38229c = h.g.a(new ar(this, 0));
    }

    static final br b(as asVar) {
        aq aqVarA = asVar.f38227a.a();
        if (aqVarA != null) {
            return new br(aqVarA, asVar.f38228b, 1);
        }
        asVar.f38228b.a("ShareDriveDeeplinkReceiver not created: ShareDriveController not available.");
        return null;
    }

    public final br a() {
        return (br) this.f38229c.getValue();
    }
}
