package com.waze.car_lib.o;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class m extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f20477a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(Object obj, int i2) {
        super(0, obj, com.waze.car_lib.r.b.b.class, "onSaveButtonClicked", "onSaveButtonClicked()V", 0);
        this.f20477a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f20477a;
        Object obj = this.receiver;
        if (i2 != 0) {
            ((com.waze.car_lib.r.b.b) obj).g();
            return h.ab.f48028a;
        }
        ((com.waze.car_lib.r.b.b) obj).h();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(Object obj, int i2, byte[] bArr) {
        super(0, obj, com.waze.car_lib.r.b.b.class, "onBackClicked", "onBackClicked()V", 0);
        this.f20477a = i2;
    }
}
