package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class gz implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.reports.ed f24299a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f24300b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f24301c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f24302d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ NativeManager f24303e;

    gz(NativeManager nativeManager, com.waze.reports.ed edVar, String str, String str2, boolean z) {
        this.f24299a = edVar;
        this.f24300b = str;
        this.f24301c = str2;
        this.f24302d = z;
        Objects.requireNonNull(nativeManager);
        this.f24303e = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24303e.venueCreateNTV(this.f24299a.an(), this.f24300b, this.f24301c, this.f24302d);
    }
}
