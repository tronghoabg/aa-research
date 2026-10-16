package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14503a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f14504b;

    public /* synthetic */ q(Object obj, int i2) {
        this.f14504b = i2;
        this.f14503a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.asks.av, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f14504b;
        if (i2 == 0) {
            return Boolean.valueOf(y.k(this.f14503a, (com.waze.location.q) obj));
        }
        if (i2 != 1) {
            return bb.g((bb) this.f14503a, (com.waze.location.q) obj);
        }
        return Boolean.valueOf(y.j((com.waze.asks.at) this.f14503a, (com.waze.location.q) obj));
    }
}
