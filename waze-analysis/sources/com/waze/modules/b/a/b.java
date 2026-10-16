package com.waze.modules.b.a;

import com.google.v.fi;
import com.waze.n.ab;
import com.waze.n.ah;
import com.waze.n.ai;
import h.a.i;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final ab f29806a;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(ab abVar) {
        x.f(abVar, "stub");
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("Metrics");
        x.e(eVarD, "create(...)");
        super(eVarD);
        this.f29806a = abVar;
    }

    @Override // com.waze.modules.b.a.c
    public final /* synthetic */ Object a() {
        return this.f29806a;
    }

    @Override // com.waze.modules.b.a.c
    public final /* bridge */ /* synthetic */ void b(List list, fi fiVar) {
        com.waze.n.d dVar = (com.waze.n.d) fiVar;
        x.f(list, "stats");
        x.f(dVar, "requestMetadata");
        ah ahVarNewBuilder = ai.newBuilder();
        ahVarNewBuilder.a(dVar);
        ahVarNewBuilder.b(((ai) i.P(list)).getStat());
        ai aiVarBuild = ahVarNewBuilder.build();
        x.e(aiVarBuild, "build(...)");
        ab abVar = this.f29806a;
    }
}
