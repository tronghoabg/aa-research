package com.waze.car_lib.i.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f19887a = h.g.a(new com.waze.car_lib.b.l(14));

    /* renamed from: b, reason: collision with root package name */
    private final h.f f19888b = h.g.a(new com.waze.car_lib.b.l(15));

    /* renamed from: c, reason: collision with root package name */
    private final h.f f19889c = h.g.a(new com.waze.car_lib.b.l(16));

    @Override // com.waze.car_lib.i.a.k
    public final long a() {
        Object value = this.f19889c.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Number) value).longValue();
    }

    @Override // com.waze.car_lib.i.a.k
    public final long b() {
        Object value = this.f19888b.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Number) value).longValue();
    }

    @Override // com.waze.car_lib.i.a.k
    public final boolean c() {
        Object value = this.f19887a.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }
}
