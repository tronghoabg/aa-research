package com.waze.t;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f40644a = h.g.a(new com.waze.car_lib.o.a(2));

    /* renamed from: b, reason: collision with root package name */
    private final h.f f40645b = h.g.a(new com.waze.car_lib.o.a(3));

    /* renamed from: c, reason: collision with root package name */
    private final h.f f40646c = h.g.a(new com.waze.car_lib.o.a(4));

    @Override // com.waze.t.a
    public final long a() {
        return ((Number) this.f40645b.getValue()).longValue();
    }

    @Override // com.waze.t.a
    public final long b() {
        return ((h.o.a) this.f40646c.getValue()).w();
    }

    @Override // com.waze.t.a
    public final boolean c() {
        Object value = this.f40644a.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }
}
