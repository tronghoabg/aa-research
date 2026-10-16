package com.waze.copilot.data.b;

import com.waze.copilot.data.z;
import h.ab;
import h.g.b.aq;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f22978a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f22979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(aq aqVar, f fVar, h.c.e eVar) {
        super(2, eVar);
        this.f22978a = aqVar;
        this.f22979b = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f22978a, this.f22979b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        f fVar = this.f22979b;
        z zVar = fVar.f22984e;
        String path = fVar.f22980a.getCacheDir().getPath();
        x.e(path, "getPath(...)");
        this.f22978a.f48105a = zVar.a(new com.waze.shared_infra.b.b(path, "copilotCarCacheFile"));
        return ab.f48028a;
    }
}
