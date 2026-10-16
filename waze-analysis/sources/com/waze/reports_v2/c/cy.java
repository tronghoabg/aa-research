package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cy extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34380a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f34381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cy(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34381b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f34381b != 0) {
            cy cyVar = new cy(eVar, 1, null);
            cyVar.f34380a = obj;
            return cyVar;
        }
        cy cyVar2 = new cy(eVar, 0);
        cyVar2.f34380a = obj;
        return cyVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f34381b != 0 ? ((cy) create((com.waze.navigate.ei) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((cy) create((cs) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f34381b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(((com.waze.navigate.ei) this.f34380a) == com.waze.navigate.ei.f31311b);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((cs) this.f34380a).a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cy(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f34381b = i2;
    }
}
