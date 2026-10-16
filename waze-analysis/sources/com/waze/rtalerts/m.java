package com.waze.rtalerts;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m extends com.waze.ifs.a.a {

    /* renamed from: a, reason: collision with root package name */
    RtAlertsCommentData[] f35139a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f35140b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f35141c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ RtAlertsNativeManager f35142d;

    m(RtAlertsNativeManager rtAlertsNativeManager, int i2, p pVar) {
        this.f35140b = i2;
        this.f35141c = pVar;
        Objects.requireNonNull(rtAlertsNativeManager);
        this.f35142d = rtAlertsNativeManager;
    }

    @Override // com.waze.ifs.a.a
    public final void a() {
        this.f35141c.a(this.f35139a);
    }

    @Override // com.waze.ifs.a.a
    public final void b() {
        this.f35139a = this.f35142d.GetRtAlertsCommentNTV(this.f35140b);
    }
}
