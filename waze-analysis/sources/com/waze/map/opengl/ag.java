package com.waze.map.opengl;

import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ag extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f29540a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f29541b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29542c = i2;
        this.f29541b = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.h.a] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlinx.coroutines.h.a] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f29542c;
        return i2 != 0 ? i2 != 1 ? new ag(this.f29541b, eVar, 2, null) : new ag((l) this.f29541b, eVar, 1) : new ag((kotlinx.coroutines.h.a) this.f29541b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f29542c;
        return i2 != 0 ? i2 != 1 ? ((ag) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ag) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ag) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlinx.coroutines.h.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlinx.coroutines.h.a] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f29542c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f29540a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f29540a = 1;
                if (this.f29541b.lock(null, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f29540a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f29540a = 1;
                if (this.f29541b.lock(null, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f29540a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f29540a = 1;
            if (aj.q(5000L, this) == aVar3) {
                return aVar3;
            }
        }
        ((l) this.f29541b).d(30);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(kotlinx.coroutines.h.a aVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29542c = i2;
        this.f29541b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(kotlinx.coroutines.h.a aVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f29542c = i2;
        this.f29541b = aVar;
    }
}
