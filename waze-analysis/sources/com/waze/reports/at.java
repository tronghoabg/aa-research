package com.waze.reports;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class at implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ au f33642a;

    at(au auVar) {
        Objects.requireNonNull(auVar);
        this.f33642a = auVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditPlaceFlowActivity editPlaceFlowActivity = this.f33642a.f33646d;
        editPlaceFlowActivity.f33541f.D(editPlaceFlowActivity.m);
    }
}
