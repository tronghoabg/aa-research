package com.waze.car_lib.p;

import androidx.car.app.model.InputCallback;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r implements InputCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f20824a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f20825b;

    r(h.g.a.l lVar, h.g.a.l lVar2) {
        this.f20824a = lVar;
        this.f20825b = lVar2;
    }

    @Override // androidx.car.app.model.InputCallback
    public final void onInputSubmitted(String str) {
        h.g.b.x.f(str, "text");
        this.f20824a.invoke(str);
    }

    @Override // androidx.car.app.model.InputCallback
    public final void onInputTextChanged(String str) {
        h.g.b.x.f(str, "text");
        h.g.a.l lVar = this.f20825b;
        if (lVar != null) {
            lVar.invoke(str);
        }
    }
}
