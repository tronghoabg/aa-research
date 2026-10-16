package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class gv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f24271a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f24272b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f24273c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f24274d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f24275e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f24276f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f24277g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f24278h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f24279i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ NativeManager f24280j;

    gv(NativeManager nativeManager, String str, String str2, String str3, String str4, boolean z, int i2, String str5, String str6, boolean z2) {
        this.f24271a = str;
        this.f24272b = str2;
        this.f24273c = str3;
        this.f24274d = str4;
        this.f24275e = z;
        this.f24276f = i2;
        this.f24277g = str5;
        this.f24278h = str6;
        this.f24279i = z2;
        Objects.requireNonNull(nativeManager);
        this.f24280j = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24280j.OpenAutoCompletePlaceNTV(this.f24271a, this.f24272b, this.f24273c, this.f24274d, this.f24275e, this.f24276f, this.f24277g, this.f24278h, this.f24279i);
    }
}
