package com.waze.a;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f13619a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.uid.stats.b f13620b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.i f13621c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13622d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13623e;

    public e(CompletableDeferred completableDeferred, com.waze.uid.stats.b bVar, com.waze.shared_infra.q.i iVar, boolean z, boolean z2) {
        h.g.b.x.f(bVar, "contextStat");
        this.f13619a = completableDeferred;
        this.f13620b = bVar;
        this.f13621c = iVar;
        this.f13622d = z;
        this.f13623e = z2;
    }

    public final com.waze.shared_infra.q.i a() {
        return this.f13621c;
    }

    public final com.waze.uid.stats.b b() {
        return this.f13620b;
    }

    public final void c(com.waze.a.a.i iVar) {
        h.g.b.x.f(iVar, "action");
        this.f13619a.a(iVar);
    }

    public final boolean d() {
        return this.f13623e;
    }

    public final boolean e() {
        return this.f13622d;
    }
}
