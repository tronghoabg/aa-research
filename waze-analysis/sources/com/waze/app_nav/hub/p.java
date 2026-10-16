package com.waze.app_nav.hub;

import androidx.lifecycle.Observer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class p implements Observer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ af f15363a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15364b;

    public /* synthetic */ p(af afVar, int i2) {
        this.f15364b = i2;
        this.f15363a = afVar;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (this.f15364b != 0) {
            af.au(this.f15363a, (j) obj);
        } else {
            af.av(this.f15363a, (Boolean) obj);
        }
    }
}
