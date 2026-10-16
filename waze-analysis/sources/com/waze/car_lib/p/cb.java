package com.waze.car_lib.p;

import androidx.car.app.model.ItemList;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class cb implements ItemList.OnSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f20704a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20705b;

    public /* synthetic */ cb(h.g.a.l lVar, int i2) {
        this.f20705b = i2;
        this.f20704a = lVar;
    }

    @Override // androidx.car.app.model.ItemList.OnSelectedListener
    public final void onSelected(int i2) {
        int i3 = this.f20705b;
        if (i3 == 0) {
            this.f20704a.invoke(Integer.valueOf(i2));
        } else if (i3 != 1) {
            this.f20704a.invoke(Integer.valueOf(i2));
        } else {
            this.f20704a.invoke(Integer.valueOf(i2));
        }
    }
}
