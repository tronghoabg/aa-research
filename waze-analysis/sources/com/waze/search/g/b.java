package com.waze.search.g;

import com.waze.av.b.n;
import com.waze.w.y;
import h.g.a.l;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.a.b f35759a;

    /* renamed from: b, reason: collision with root package name */
    private final y f35760b;

    public b(com.waze.av.a.b bVar, y yVar) {
        x.f(bVar, "genericPlaceRepository");
        x.f(yVar, "categoriesRepository");
        this.f35759a = bVar;
        this.f35760b = yVar;
    }

    @Override // com.waze.av.a.b
    public final n a(l lVar) {
        x.f(lVar, "predicate");
        return this.f35759a.a(lVar);
    }

    @Override // com.waze.av.a.b
    public final k b(com.waze.av.a.n nVar) {
        x.f(nVar, "genericPlaceType");
        return this.f35759a.b(nVar);
    }

    @Override // com.waze.search.g.a
    public final List c() {
        return this.f35760b.b();
    }

    @Override // com.waze.search.g.a
    public final k d() {
        return this.f35760b.c();
    }
}
