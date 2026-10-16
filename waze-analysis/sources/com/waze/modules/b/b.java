package com.waze.modules.b;

import androidx.core.os.EnvironmentCompat;
import e.a.bx;
import e.a.cq;
import e.a.k;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends bx {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29812a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f29813b;

    /* renamed from: c, reason: collision with root package name */
    private volatile bx f29814c;

    public b(com.waze.shared_infra.i.e eVar, h.g.a.a aVar) {
        x.f(eVar, "logger");
        x.f(aVar, "channelFactory");
        this.f29812a = eVar;
        this.f29813b = aVar;
    }

    private final bx c() {
        if (this.f29814c == null) {
            synchronized (this) {
                if (this.f29814c == null) {
                    try {
                        this.f29814c = (bx) this.f29813b.invoke();
                    } catch (Exception e2) {
                        this.f29812a.h("Cannot create channel", e2);
                        return null;
                    }
                }
            }
        }
        return this.f29814c;
    }

    @Override // e.a.i
    public final k a(cq cqVar, e.a.h hVar) {
        bx bxVarC = c();
        if (bxVarC != null) {
            k kVarA = bxVarC.a(cqVar, hVar);
            x.e(kVarA, "newCall(...)");
            return kVarA;
        }
        this.f29812a.g("this client call " + (cqVar != null ? cqVar.toString() : null) + " will NOT be sent to a real backend, channel is not ready");
        return new a();
    }

    @Override // e.a.i
    public final String b() {
        String strB;
        bx bxVarC = c();
        return (bxVarC == null || (strB = bxVarC.b()) == null) ? EnvironmentCompat.MEDIA_UNKNOWN : strB;
    }
}
