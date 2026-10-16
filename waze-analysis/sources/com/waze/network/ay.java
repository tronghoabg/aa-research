package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ay implements ax {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f31909a = h.g.a(new com.waze.native_managers.n(4));

    /* renamed from: b, reason: collision with root package name */
    private final h.f f31910b = h.g.a(new com.waze.native_managers.n(5));

    /* renamed from: c, reason: collision with root package name */
    private final h.f f31911c = h.g.a(new com.waze.native_managers.n(6));

    /* renamed from: d, reason: collision with root package name */
    private final h.f f31912d = h.g.a(new com.waze.native_managers.n(7));

    /* renamed from: e, reason: collision with root package name */
    private final h.f f31913e = h.g.a(new com.waze.native_managers.n(8));

    @Override // com.waze.network.ax
    public final int a() {
        return ((Number) this.f31909a.getValue()).intValue();
    }

    @Override // com.waze.network.ax
    public final long b() {
        Object value = this.f31911c.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Number) value).longValue();
    }

    @Override // com.waze.network.ax
    public final long c() {
        Object value = this.f31913e.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Number) value).longValue();
    }

    @Override // com.waze.network.ax
    public final long d() {
        Object value = this.f31912d.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Number) value).longValue();
    }

    @Override // com.waze.network.ax
    public final String e() {
        return (String) this.f31910b.getValue();
    }

    @Override // com.waze.network.ax
    public final void f() {
    }

    @Override // com.waze.network.ax
    public final void g() {
    }
}
