package com.waze.an.a.a;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bg implements com.waze.an.a.ad {

    /* renamed from: a, reason: collision with root package name */
    private final af f14437a;

    /* renamed from: b, reason: collision with root package name */
    private final List f14438b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f14439c;

    public bg(com.waze.location.a.ae aeVar) {
        h.g.b.x.f(aeVar, "streetNameProvider");
        af afVar = new af();
        this.f14437a = afVar;
        this.f14438b = h.a.i.d(afVar);
        this.f14439c = kotlinx.coroutines.b.ai.y(new bf(aeVar.a(), this, 0));
    }

    @Override // com.waze.an.a.ad
    public final kotlinx.coroutines.b.k a() {
        return this.f14439c;
    }

    @Override // com.waze.an.a.ad
    public final /* synthetic */ void close() {
    }
}
