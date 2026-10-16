package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class j extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18671a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(Object obj, int i2) {
        super(0, obj, k.class, "onShown", "onShown()V", 0);
        this.f18671a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f18671a;
        Object obj = this.receiver;
        if (i2 != 0) {
            ((k) obj).e();
            return h.ab.f48028a;
        }
        k.c((k) obj);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(Object obj, int i2, byte[] bArr) {
        super(0, obj, k.class, "dismiss", "dismiss()V", 0);
        this.f18671a = i2;
    }
}
