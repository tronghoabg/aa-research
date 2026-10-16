package com.waze.car_lib.p;

import androidx.car.app.navigation.model.PanModeListener;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ae implements PanModeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f20537a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20538b;

    public /* synthetic */ ae(h.g.a.l lVar, int i2) {
        this.f20538b = i2;
        this.f20537a = lVar;
    }

    @Override // androidx.car.app.navigation.model.PanModeListener
    public final void onPanModeChanged(boolean z) {
        switch (this.f20538b) {
            case 0:
                this.f20537a.invoke(Boolean.valueOf(z));
                break;
            case 1:
                this.f20537a.invoke(Boolean.valueOf(z));
                break;
            case 2:
                this.f20537a.invoke(Boolean.valueOf(z));
                break;
            case 3:
                this.f20537a.invoke(Boolean.valueOf(z));
                break;
            case 4:
                this.f20537a.invoke(Boolean.valueOf(z));
                break;
            case 5:
                this.f20537a.invoke(Boolean.valueOf(z));
                break;
            case 6:
                this.f20537a.invoke(Boolean.valueOf(z));
                break;
            case 7:
                this.f20537a.invoke(Boolean.valueOf(z));
                break;
            case 8:
                this.f20537a.invoke(Boolean.valueOf(z));
                break;
            default:
                this.f20537a.invoke(Boolean.valueOf(z));
                break;
        }
    }
}
