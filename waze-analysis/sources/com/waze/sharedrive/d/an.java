package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class an extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38200a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f38201b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f38202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(aq aqVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38202c = i2;
        this.f38201b = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f38202c;
        return i2 != 0 ? i2 != 1 ? new an(this.f38201b, eVar, 2, (char[]) null) : new an(this.f38201b, eVar, 1, (byte[]) null) : new an(this.f38201b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f38202c;
        return i2 != 0 ? i2 != 1 ? ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f38202c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f38200a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f38200a = 1;
                if (aq.f(this.f38201b, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f38200a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f38200a = 1;
                if (aq.d(this.f38201b, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f38200a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f38200a = 1;
            if (aq.g(this.f38201b, this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(aq aqVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f38202c = i2;
        this.f38201b = aqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(aq aqVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f38202c = i2;
        this.f38201b = aqVar;
    }
}
