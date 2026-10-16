package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ha implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.reports.ed f24359a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.reports.ed f24360b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f24361c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f24362d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ NativeManager f24363e;

    ha(NativeManager nativeManager, com.waze.reports.ed edVar, com.waze.reports.ed edVar2, String str, String str2) {
        this.f24359a = edVar;
        this.f24360b = edVar2;
        this.f24361c = str;
        this.f24362d = str2;
        Objects.requireNonNull(nativeManager);
        this.f24363e = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.waze.reports.ed edVar = this.f24360b;
        this.f24363e.venueUpdateNTV(this.f24359a.an(), edVar == null ? null : edVar.an(), this.f24361c, this.f24362d);
    }
}
