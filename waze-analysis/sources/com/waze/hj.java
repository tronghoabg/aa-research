package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hj extends com.waze.ifs.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f24383a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hr f24384b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ NativeManager f24385c;

    /* renamed from: d, reason: collision with root package name */
    private String f24386d;

    hj(NativeManager nativeManager, String str, hr hrVar) {
        this.f24383a = str;
        this.f24384b = hrVar;
        Objects.requireNonNull(nativeManager);
        this.f24385c = nativeManager;
    }

    @Override // com.waze.ifs.a.a
    public final void a() {
        this.f24384b.a(this.f24386d);
    }

    @Override // com.waze.ifs.a.a
    public final void b() {
        this.f24386d = this.f24385c.GetTitleNTV(this.f24383a);
    }
}
