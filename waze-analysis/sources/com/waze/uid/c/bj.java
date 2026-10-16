package com.waze.uid.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class bj extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f44275a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(Object obj, int i2) {
        super(0, obj, bl.class, "onBack", "onBack()V", 0);
        this.f44275a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f44275a;
        Object obj = this.receiver;
        if (i2 != 0) {
            as.c((as) obj);
            return h.ab.f48028a;
        }
        ((bl) obj).f();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(Object obj, int i2, byte[] bArr) {
        super(0, obj, as.class, "onEnterPassword", "onEnterPassword()V", 0);
        this.f44275a = i2;
    }
}
