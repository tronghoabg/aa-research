package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class eq implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f21566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21567b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21568c;

    public /* synthetic */ eq(ey eyVar, cq cqVar, int i2) {
        this.f21568c = i2;
        this.f21567b = eyVar;
        this.f21566a = cqVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f21568c;
        if (i2 == 0) {
            return ey.f((ey) this.f21566a, (com.waze.w.i) this.f21567b);
        }
        if (i2 == 1) {
            return dp.f((dp) this.f21566a, (com.waze.av.b.aa) this.f21567b);
        }
        Object obj = this.f21566a;
        return i2 != 2 ? ey.r((ey) this.f21567b, (cq) obj) : ey.q((ey) this.f21567b, (cq) obj);
    }

    public /* synthetic */ eq(Object obj, Object obj2, int i2) {
        this.f21568c = i2;
        this.f21566a = obj;
        this.f21567b = obj2;
    }
}
