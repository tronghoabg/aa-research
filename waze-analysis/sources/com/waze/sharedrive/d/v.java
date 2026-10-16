package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38275a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f38276b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f38277c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f38278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(aq aqVar, q qVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38278d = i2;
        this.f38277c = aqVar;
        this.f38276b = qVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f38278d;
        if (i2 == 0) {
            return new v((aq) this.f38276b, (String) this.f38277c, eVar, 0);
        }
        if (i2 == 1) {
            return new v((aq) this.f38276b, (String) this.f38277c, eVar, 1, (byte[]) null);
        }
        Object obj2 = this.f38277c;
        if (i2 != 2) {
            return new v((aq) obj2, (q) this.f38276b, eVar, 3, (byte[]) null);
        }
        return new v((aq) obj2, (q) this.f38276b, eVar, 2);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f38278d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f38278d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f38275a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f38276b;
                Object obj3 = this.f38277c;
                this.f38275a = 1;
                if (((aq) obj2).f38213a.h((String) obj3, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f38275a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj4 = this.f38277c;
                    this.f38275a = 1;
                    if (aq.i((aq) obj4, ((com.waze.sharedrive.c.a.m) ((q) this.f38276b).a().b()).b(), this) == aVar2) {
                        return aVar2;
                    }
                }
                return h.ab.f48028a;
            }
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f38275a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj5 = this.f38277c;
                this.f38275a = 1;
                if (aq.h((aq) obj5, ((com.waze.sharedrive.c.a.m) ((q) this.f38276b).a().b()).b(), this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f38275a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj6 = this.f38276b;
            Object obj7 = this.f38277c;
            this.f38275a = 1;
            obj = ((aq) obj6).f38213a.g((String) obj7, this);
            if (obj == aVar4) {
                return aVar4;
            }
        }
        Object obj8 = this.f38276b;
        Object obj9 = this.f38277c;
        com.waze.sharedrive.ab abVar = (com.waze.sharedrive.ab) obj;
        Object objB = abVar.b();
        if (objB != null) {
            aq aqVar = (aq) obj8;
            aq.s(aqVar, (String) obj9, (com.waze.sharedrive.c.a.m) objB);
        }
        Object objC = abVar.c();
        if (objC != null) {
            aq aqVar2 = (aq) obj8;
            aq.r(aqVar2, (String) obj9, (com.waze.sharedrive.q) objC);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(aq aqVar, q qVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f38278d = i2;
        this.f38277c = aqVar;
        this.f38276b = qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(aq aqVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38278d = i2;
        this.f38276b = aqVar;
        this.f38277c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(aq aqVar, String str, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f38278d = i2;
        this.f38276b = aqVar;
        this.f38277c = str;
    }
}
