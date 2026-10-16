package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class eb extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f23632a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eb(Object obj, int i2) {
        super(0, obj, com.waze.q.l.class, "onBackPressed", "onBackPressed()V", 0);
        this.f23632a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f23632a;
        Object obj = this.receiver;
        if (i2 != 0) {
            ((com.waze.q.l) obj).d();
            return h.ab.f48028a;
        }
        ((com.waze.q.l) obj).e();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eb(Object obj, int i2, byte[] bArr) {
        super(0, obj, com.waze.q.l.class, "onAccept", "onAccept()V", 0);
        this.f23632a = i2;
    }
}
