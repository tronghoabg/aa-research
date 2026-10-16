package com.waze.modules.b.a;

import com.google.v.fi;
import com.waze.n.ap;
import com.waze.n.ar;
import com.waze.n.as;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    private final ap f29811a;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(ap apVar) {
        x.f(apVar, "stub");
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("UnauthenticatedStats");
        x.e(eVarD, "create(...)");
        super(eVarD);
        this.f29811a = apVar;
    }

    @Override // com.waze.modules.b.a.c
    public final /* synthetic */ Object a() {
        return this.f29811a;
    }

    @Override // com.waze.modules.b.a.c
    public final /* bridge */ /* synthetic */ void b(List list, fi fiVar) {
        com.waze.n.x xVar = (com.waze.n.x) fiVar;
        x.f(list, "stats");
        x.f(xVar, "requestMetadata");
        ar arVarNewBuilder = as.newBuilder();
        arVarNewBuilder.b(xVar);
        arVarNewBuilder.a(list);
        as asVarBuild = arVarNewBuilder.build();
        x.e(asVarBuild, "build(...)");
        ap apVar = this.f29811a;
    }
}
