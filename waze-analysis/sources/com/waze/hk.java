package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f24387a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f24388b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f24389c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f24390d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f24391e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f24392f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f24393g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ NativeManager f24394h;

    hk(NativeManager nativeManager, String str, int i2, int i3, String str2, String str3, String str4, String str5) {
        this.f24387a = str;
        this.f24388b = i2;
        this.f24389c = i3;
        this.f24390d = str2;
        this.f24391e = str3;
        this.f24392f = str4;
        this.f24393g = str5;
        Objects.requireNonNull(nativeManager);
        this.f24394h = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24394h.CreateSharedDriveNTV(this.f24387a, this.f24388b, this.f24389c, this.f24390d, this.f24391e, this.f24392f, this.f24393g);
    }
}
