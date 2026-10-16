package com.waze.search.b;

import com.waze.car_lib.o.ab;
import com.waze.search.SearchNativeManager;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final SearchNativeManager f35533a;

    public e(SearchNativeManager searchNativeManager) {
        x.f(searchNativeManager, "searchNativeManager");
        this.f35533a = searchNativeManager;
    }

    @Override // com.waze.search.b.d
    public final void a(l lVar) {
        x.f("GAS_STATION", "categoryId");
        x.f(lVar, "callback");
        this.f35533a.getCategoryProducts("GAS_STATION", new ab(lVar, 20));
    }
}
