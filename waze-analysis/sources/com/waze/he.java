package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class he implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f24373a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f24374b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f24375c;

    he(NativeManager nativeManager, int i2, int i3, int i4) {
        this.f24373a = i2;
        this.f24374b = i3;
        this.f24375c = i4;
        Objects.requireNonNull(nativeManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.waze.reports.j jVar = (com.waze.reports.j) com.waze.web.r.i(com.waze.reports.j.class);
        if (jVar != null) {
            jVar.a(this.f24373a, this.f24374b, this.f24375c);
        }
    }
}
