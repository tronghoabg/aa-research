package com.waze.modules.b.a;

import com.google.v.fi;
import com.waze.n.ab;
import com.waze.n.ad;
import com.waze.n.ae;
import com.waze.perf.w;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d extends c {

    /* renamed from: a, reason: collision with root package name */
    private final ab f29808a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f29809b;

    /* renamed from: c, reason: collision with root package name */
    private final w f29810c;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(ab abVar, com.waze.shared_infra.i.b bVar, w wVar) {
        x.f(abVar, "stub");
        x.f(bVar, "exceptionReporter");
        x.f(wVar, "config");
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("Stats");
        x.e(eVarD, "create(...)");
        super(eVarD);
        this.f29808a = abVar;
        this.f29809b = bVar;
        this.f29810c = wVar;
    }

    @Override // com.waze.modules.b.a.c
    public final /* synthetic */ Object a() {
        return this.f29808a;
    }

    @Override // com.waze.modules.b.a.c
    public final /* bridge */ /* synthetic */ void b(List list, fi fiVar) {
        com.waze.n.d dVar = (com.waze.n.d) fiVar;
        x.f(list, "stats");
        x.f(dVar, "requestMetadata");
        ad adVarNewBuilder = ae.newBuilder();
        adVarNewBuilder.b(dVar);
        adVarNewBuilder.a(list);
        ae aeVarBuild = adVarNewBuilder.build();
        x.e(aeVarBuild, "build(...)");
        ae aeVar = aeVarBuild;
        int serializedSize = aeVar.getSerializedSize();
        if (serializedSize > this.f29810c.a()) {
            this.f29809b.a(new RuntimeException("Large stat payload size: " + serializedSize + " bytes"), null);
        }
        ab abVar = this.f29808a;
    }
}
