package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class bs extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18623a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bs(Object obj, int i2) {
        super(1, obj, cb.class, "onClicked", "onClicked(I)V", 0);
        this.f18623a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f18623a != 0) {
            ((cb) this.receiver).a(((Number) obj).intValue());
            return h.ab.f48028a;
        }
        ((cb) this.receiver).a(((Number) obj).intValue());
        return h.ab.f48028a;
    }
}
