package com.waze.car_lib.p;

import androidx.car.app.model.Toggle;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ce implements Toggle.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f20713a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20714b;

    public /* synthetic */ ce(h.g.a.l lVar, int i2) {
        this.f20714b = i2;
        this.f20713a = lVar;
    }

    @Override // androidx.car.app.model.Toggle.OnCheckedChangeListener
    public final void onCheckedChange(boolean z) {
        int i2 = this.f20714b;
        h.g.a.l lVar = this.f20713a;
        if (i2 != 0) {
            lVar.invoke(Boolean.valueOf(z));
        } else {
            lVar.invoke(Boolean.valueOf(z));
        }
    }
}
