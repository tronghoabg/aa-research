package com.waze.rtalerts;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends com.waze.ifs.a.a {

    /* renamed from: a, reason: collision with root package name */
    boolean f35146a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f35147b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f35148c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ RtAlertsNativeManager f35149d;

    o(RtAlertsNativeManager rtAlertsNativeManager, int i2, r rVar) {
        this.f35147b = i2;
        this.f35148c = rVar;
        Objects.requireNonNull(rtAlertsNativeManager);
        this.f35149d = rtAlertsNativeManager;
    }

    @Override // com.waze.ifs.a.a
    public final void a() {
        this.f35148c.a(this.f35146a);
    }

    @Override // com.waze.ifs.a.a
    public final void b() {
        this.f35146a = this.f35149d.PostCommentValidateNTV(this.f35147b);
    }
}
