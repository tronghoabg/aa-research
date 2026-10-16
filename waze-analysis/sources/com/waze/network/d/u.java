package com.waze.network.d;

import com.google.d.b.ai;
import e.a.am;
import e.a.cm;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class u extends am {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32230a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32231b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(e.a.k kVar, com.waze.shared_infra.i.e eVar, String str) {
        super(kVar);
        x.f(kVar, "delegate");
        x.f(eVar, "logger");
        x.f(str, "api");
        this.f32230a = eVar;
        this.f32231b = str;
    }

    @Override // e.a.an, e.a.k
    public final void e(com.waze.uid.f fVar, cm cmVar) {
        x.f(fVar, "responseListener");
        x.f(cmVar, "headers");
        ai aiVarB = ai.b();
        x.e(aiVarB, "createStarted(...)");
        super.e(new v(fVar, aiVarB, this.f32230a, this.f32231b), cmVar);
    }
}
