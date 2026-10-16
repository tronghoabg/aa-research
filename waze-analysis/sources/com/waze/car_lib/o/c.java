package com.waze.car_lib.o;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.config.b f20462a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f20463b;

    public c(com.waze.config.b bVar, h.g.a.a aVar) {
        h.g.b.x.f(bVar, "config");
        this.f20462a = bVar;
        this.f20463b = aVar;
    }

    @Override // com.waze.car_lib.o.d
    public final /* bridge */ /* synthetic */ Object a() {
        Boolean boolB = this.f20462a.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB;
    }

    @Override // com.waze.car_lib.o.d
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        this.f20462a.d(bool);
        if (this.f20463b != null) {
            i.d();
        }
    }
}
