package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f24402a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f24403b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f24404c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f24405d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f24406e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f24407f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f24408g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ com.waze.rtalerts.y f24409h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ NativeManager f24410i;

    hp(NativeManager nativeManager, String str, String str2, String str3, int i2, int i3, int i4, int i5, com.waze.rtalerts.y yVar) {
        this.f24402a = str;
        this.f24403b = str2;
        this.f24404c = str3;
        this.f24405d = i2;
        this.f24406e = i3;
        this.f24407f = i4;
        this.f24408g = i5;
        this.f24409h = yVar;
        Objects.requireNonNull(nativeManager);
        this.f24410i = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24410i.sendAlertRequestNTV(this.f24402a, this.f24403b, this.f24404c, this.f24405d, this.f24406e, this.f24407f, this.f24408g, this.f24409h.a());
    }
}
