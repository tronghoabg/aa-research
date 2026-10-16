package com.waze.utils;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class am extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44847a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ao f44848b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f44849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(ao aoVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f44849c = i2;
        this.f44848b = aoVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f44849c != 0) {
            am amVar = new am(this.f44848b, eVar, 1, null);
            amVar.f44847a = obj;
            return amVar;
        }
        am amVar2 = new am(this.f44848b, eVar, 0);
        amVar2.f44847a = obj;
        return amVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f44849c != 0 ? ((am) create((Boolean) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((am) create((Boolean) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f44849c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            Boolean bool = (Boolean) this.f44847a;
            h.g.b.x.c(bool);
            this.f44848b.f37918a = bool.booleanValue();
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Boolean bool2 = (Boolean) this.f44847a;
        h.g.b.x.c(bool2);
        this.f44848b.f37919b = bool2.booleanValue();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(ao aoVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f44849c = i2;
        this.f44848b = aoVar;
    }
}
