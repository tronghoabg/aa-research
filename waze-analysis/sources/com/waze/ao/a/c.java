package com.waze.ao.a;

import com.waze.an.e.m;
import com.waze.shared_infra.i.e;
import h.f;
import h.g;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final a f14887a;

    /* renamed from: b, reason: collision with root package name */
    private final e f14888b;

    /* renamed from: c, reason: collision with root package name */
    private final f f14889c;

    public /* synthetic */ c(byte[] bArr) {
        a aVar = new a();
        e eVarD = com.waze.shared_infra.i.a.d("InsightFeedbackEndOfDriveController");
        x.e(eVarD, "create(...)");
        x.f(aVar, "config");
        x.f(eVarD, "logger");
        this.f14887a = aVar;
        this.f14888b = eVarD;
        this.f14889c = g.a(new h.g.a.a() { // from class: com.waze.ao.a.b
            @Override // h.g.a.a
            public final Object invoke() {
                return c.b(this.f14886a);
            }
        });
    }

    static final m b(c cVar) {
        if (cVar.f14887a.c()) {
            return new m();
        }
        cVar.f14888b.g("A required Feature flags is disabled, return null");
        return null;
    }

    public final m a() {
        return (m) this.f14889c.getValue();
    }

    public c() {
        this(null);
    }
}
