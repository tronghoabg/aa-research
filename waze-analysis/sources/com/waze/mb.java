package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class mb extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29616a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29617b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    mb(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29617b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f29617b;
        if (i2 == 0) {
            mb mbVar = new mb(eVar, 0);
            mbVar.f29616a = obj;
            return mbVar;
        }
        if (i2 != 1) {
            mb mbVar2 = new mb(eVar, 2, (char[]) null);
            mbVar2.f29616a = obj;
            return mbVar2;
        }
        mb mbVar3 = new mb(eVar, 1, (byte[]) null);
        mbVar3.f29616a = obj;
        return mbVar3;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f29617b;
        return i2 != 0 ? i2 != 1 ? ((mb) create((cf) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((mb) create((cb) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((mb) create((Long) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f29617b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            Long l2 = (Long) this.f29616a;
            h.g.b.x.c(l2);
            com.waze.log.g.j(l2.longValue());
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(!(((cf) this.f29616a) instanceof an));
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((cb) this.f29616a) == cb.f22058d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    mb(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f29617b = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    mb(h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f29617b = i2;
    }
}
