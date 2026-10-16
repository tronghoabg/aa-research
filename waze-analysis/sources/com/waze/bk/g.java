package com.waze.bk;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16861a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f16862b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16863c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f16864d;

    public g(boolean z, com.waze.shared_infra.i.b bVar, com.waze.shared_infra.i.e eVar) {
        x.f(bVar, "nonFatalErrorReporter");
        x.f(eVar, "logger");
        this.f16861a = z;
        this.f16862b = bVar;
        this.f16863c = eVar;
        this.f16864d = h.g.a(new f(this, 0));
    }

    static final e b(g gVar) {
        e eVar = new e(true, gVar.f16862b, gVar.f16863c);
        eVar.start();
        return eVar;
    }

    public final e a() {
        if (this.f16861a) {
            return (e) this.f16864d.getValue();
        }
        e eVar = new e(false, this.f16862b, this.f16863c);
        eVar.start();
        return eVar;
    }
}
