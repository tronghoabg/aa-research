package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hi extends com.waze.ifs.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hq f24380a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NativeManager f24381b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24382c;

    hi(NativeManager nativeManager, hq hqVar) {
        this.f24380a = hqVar;
        Objects.requireNonNull(nativeManager);
        this.f24381b = nativeManager;
    }

    @Override // com.waze.ifs.a.a
    public final void a() {
        this.f24380a.a(this.f24382c);
    }

    @Override // com.waze.ifs.a.a
    public final void b() {
        this.f24382c = this.f24381b.shouldDisplayGasSettingsNTV();
    }
}
