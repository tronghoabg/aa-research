package com.waze.search.a.a;

import com.waze.w.t;
import com.waze.w.y;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final t f35442a;

    /* renamed from: b, reason: collision with root package name */
    private final y f35443b;

    public b(t tVar, y yVar) {
        x.f(tVar, "categoriesDataSource");
        x.f(yVar, "categoryGroupsDataSource");
        this.f35442a = tVar;
        this.f35443b = yVar;
    }

    @Override // com.waze.search.a.a.a
    public final List a() {
        return this.f35442a.b();
    }

    @Override // com.waze.search.a.a.a
    public final List b() {
        return this.f35443b.b();
    }
}
