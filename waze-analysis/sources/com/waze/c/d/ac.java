package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ac extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18264a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f18265b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ae aeVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18266c = i2;
        this.f18265b = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18266c;
        return i2 != 0 ? i2 != 1 ? new ac(this.f18265b, eVar, 2, (char[]) null) : new ac(this.f18265b, eVar, 1, (byte[]) null) : new ac(this.f18265b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f18266c;
        return i2 != 0 ? i2 != 1 ? ((ac) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ac) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ac) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f18266c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f18264a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f18264a = 1;
                if (ae.h(this.f18265b, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f18264a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f18264a = 1;
                if (ae.i(this.f18265b, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f18264a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f18264a = 1;
            if (ae.g(this.f18265b, this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ae aeVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18266c = i2;
        this.f18265b = aeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ae aeVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f18266c = i2;
        this.f18265b = aeVar;
    }
}
