package com.waze.car_lib.screens;

import androidx.car.app.model.ItemList;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class cu implements ItemList.OnItemVisibilityChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f21982a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21983b;

    public /* synthetic */ cu(Object obj, int i2) {
        this.f21983b = i2;
        this.f21982a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [h.g.a.p, java.lang.Object] */
    @Override // androidx.car.app.model.ItemList.OnItemVisibilityChangedListener
    public final void onItemVisibilityChanged(int i2, int i3) {
        if (this.f21983b == 0) {
            cy.h((cy) this.f21982a);
            return;
        }
        this.f21982a.invoke(Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
