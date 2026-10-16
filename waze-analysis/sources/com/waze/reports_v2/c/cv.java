package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cv extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f34371a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f34372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cv(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34372b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f34372b != 0) {
            cv cvVar = new cv(eVar, 1, null);
            cvVar.f34371a = ((Boolean) obj).booleanValue();
            return cvVar;
        }
        cv cvVar2 = new cv(eVar, 0);
        cvVar2.f34371a = ((Boolean) obj).booleanValue();
        return cvVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.f34372b != 0) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((cv) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
        }
        Boolean bool2 = (Boolean) obj;
        bool2.booleanValue();
        return ((cv) create(bool2, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f34372b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(this.f34371a);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(this.f34371a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cv(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f34372b = i2;
    }
}
