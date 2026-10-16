package com.waze.modules.b.a;

import com.google.v.fi;
import com.waze.ch.a.a.g;
import com.waze.ch.a.a.h;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ch.a.a.e f29803a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f29804b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.perf.a f29805c;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(com.waze.ch.a.a.e eVar, com.waze.shared_infra.i.b bVar, com.waze.perf.a aVar) {
        x.f(eVar, "stub");
        x.f(bVar, "exceptionReporter");
        x.f(aVar, "config");
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AdEvents");
        x.e(eVarD, "create(...)");
        super(eVarD);
        this.f29803a = eVar;
        this.f29804b = bVar;
        this.f29805c = aVar;
    }

    @Override // com.waze.modules.b.a.c
    public final /* synthetic */ Object a() {
        return this.f29803a;
    }

    @Override // com.waze.modules.b.a.c
    public final /* bridge */ /* synthetic */ void b(List list, fi fiVar) {
        x.f(list, "stats");
        x.f((com.waze.n.d) fiVar, "requestMetadata");
        g gVarNewBuilder = h.newBuilder();
        gVarNewBuilder.a(list);
        h hVarBuild = gVarNewBuilder.build();
        x.e(hVarBuild, "build(...)");
        h hVar = hVarBuild;
        int serializedSize = hVar.getSerializedSize();
        if (serializedSize > this.f29805c.a()) {
            this.f29804b.a(new RuntimeException("Large ad event payload size: " + serializedSize + " bytes"), null);
        }
        com.waze.ch.a.a.e eVar = this.f29803a;
    }
}
