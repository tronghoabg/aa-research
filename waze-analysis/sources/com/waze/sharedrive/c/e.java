package com.waze.sharedrive.c;

import com.waze.sharedrive.a.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.b.a f38085a;

    /* renamed from: b, reason: collision with root package name */
    private final ac f38086b;

    /* renamed from: c, reason: collision with root package name */
    private final q f38087c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38088d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f38089e;

    public e(com.waze.sharedrive.b.a aVar, ac acVar, q qVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(acVar, "shareDriveGrpcService");
        h.g.b.x.f(qVar, "dataConverter");
        h.g.b.x.f(eVar, "logger");
        this.f38085a = aVar;
        this.f38086b = acVar;
        this.f38087c = qVar;
        this.f38088d = eVar;
        this.f38089e = h.g.a(new r(this, 1));
    }

    static final p a(e eVar) {
        if (eVar.f38085a.b()) {
            return new p(eVar.f38086b, eVar.f38087c, eVar.f38088d);
        }
        eVar.f38088d.a("ShareDriveApi not created: feature disabled.");
        return null;
    }

    public final p b() {
        return (p) this.f38089e.getValue();
    }
}
