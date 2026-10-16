package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ad extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f13872a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f13873b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f13874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(h.c.e eVar, int i2) {
        super(3, eVar);
        this.f13874c = i2;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f13874c != 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            ad adVar = new ad((h.c.e) obj3, 1, null);
            adVar.f13872a = zBooleanValue;
            adVar.f13873b = zBooleanValue2;
            return adVar.invokeSuspend(h.ab.f48028a);
        }
        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
        ad adVar2 = new ad((h.c.e) obj3, 0);
        adVar2.f13872a = zBooleanValue3;
        adVar2.f13873b = zBooleanValue4;
        return adVar2.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f13874c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf((this.f13872a || this.f13873b) ? false : true);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(this.f13872a && this.f13873b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(h.c.e eVar, int i2, byte[] bArr) {
        super(3, eVar);
        this.f13874c = i2;
    }
}
