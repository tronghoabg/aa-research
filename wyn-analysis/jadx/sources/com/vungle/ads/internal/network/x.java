package com.vungle.ads.internal.network;

/* loaded from: classes5.dex */
public final class x implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.vungle.ads.internal.w f33453a;

    public x(com.vungle.ads.internal.x xVar) {
        this.f33453a = xVar;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(o oVar) {
        this.f33453a.onSuccess();
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        this.f33453a.a();
    }
}
