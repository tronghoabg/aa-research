package com.waze.car_lib.p;

import androidx.car.app.model.SearchTemplate;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cx implements SearchTemplate.SearchCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f20756a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f20757b;

    cx(h.g.a.l lVar, h.g.a.l lVar2) {
        this.f20756a = lVar;
        this.f20757b = lVar2;
    }

    @Override // androidx.car.app.model.SearchTemplate.SearchCallback
    public final void onSearchSubmitted(String str) {
        h.g.b.x.f(str, "searchTerm");
        this.f20757b.invoke(str);
    }

    @Override // androidx.car.app.model.SearchTemplate.SearchCallback
    public final void onSearchTextChanged(String str) {
        h.g.b.x.f(str, "searchText");
        this.f20756a.invoke(str);
    }
}
