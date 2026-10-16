package com.waze.sdk.b;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g implements com.b.b.a.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f35280a;

    g(m mVar) {
        Objects.requireNonNull(mVar);
        this.f35280a = mVar;
    }

    @Override // com.b.b.a.j
    public final void a(Throwable th) {
        m.ak("downloadPlayListImage ".concat(String.valueOf(th.getMessage())));
        m mVar = this.f35280a;
        int i2 = mVar.f35303i;
        mVar.f35303i = i2 + 1;
        mVar.U(i2);
    }
}
