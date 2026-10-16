package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements e.a.h.ae {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f32370a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f32371b;

    g(h.g.a.l lVar) {
        this.f32370a = lVar;
    }

    @Override // e.a.h.ae
    public final void onCompleted() {
        this.f32370a.invoke(this.f32371b);
    }

    @Override // e.a.h.ae
    public final void onError(Throwable th) {
        this.f32370a.invoke(null);
    }

    @Override // e.a.h.ae
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        byte[] bArr = (byte[]) obj;
        h.g.b.x.f(bArr, "value");
        this.f32371b = bArr;
    }
}
