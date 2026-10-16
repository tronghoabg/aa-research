package com.waze.reports;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class as implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f33640a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33641b;

    as(EditPlaceFlowActivity editPlaceFlowActivity, int i2, byte[] bArr) {
        this.f33641b = i2;
        Objects.requireNonNull(editPlaceFlowActivity);
        this.f33640a = editPlaceFlowActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f33641b;
        if (i2 == 0) {
            EditPlaceFlowActivity editPlaceFlowActivity = (EditPlaceFlowActivity) this.f33640a;
            editPlaceFlowActivity.v = editPlaceFlowActivity.f33543k.getAddressByLocationNTV(editPlaceFlowActivity.m.b(), editPlaceFlowActivity.m.a());
            return;
        }
        Object obj = this.f33640a;
        if (i2 == 1) {
            ((EditPlaceFlowActivity) obj).f33543k.CloseProgressPopup();
        } else {
            ((bz) obj).f33753g.setCurrentItem(r3.f33757k.getCount() - 1, true);
        }
    }

    as(EditPlaceFlowActivity editPlaceFlowActivity, int i2) {
        this.f33641b = i2;
        Objects.requireNonNull(editPlaceFlowActivity);
        this.f33640a = editPlaceFlowActivity;
    }

    as(bz bzVar, int i2) {
        this.f33641b = i2;
        Objects.requireNonNull(bzVar);
        this.f33640a = bzVar;
    }
}
