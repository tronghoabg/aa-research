package com.waze.car_lib.p;

import androidx.car.app.model.SearchTemplate;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o implements SearchTemplate.SearchCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f20812a;

    o(h.g.a.l lVar) {
        this.f20812a = lVar;
    }

    @Override // androidx.car.app.model.SearchTemplate.SearchCallback
    public final void onSearchSubmitted(String str) {
        h.g.b.x.f(str, "searchTerm");
        this.f20812a.invoke(str);
    }

    @Override // androidx.car.app.model.SearchTemplate.SearchCallback
    public final void onSearchTextChanged(String str) {
        h.g.b.x.f(str, "searchText");
        this.f20812a.invoke(str);
    }
}
