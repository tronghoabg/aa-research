package com.waze.network.e;

import com.waze.authentication.x;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class k extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f32251a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f32252b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f32253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(m mVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f32253c = i2;
        this.f32252b = mVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f32253c;
        Object obj2 = this.f32252b;
        return i2 != 0 ? new k((m) obj2, eVar, 1, null) : new k((m) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f32253c != 0 ? ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f32253c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f32251a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.f32251a = 1;
            Object objA = ((m) this.f32252b).f32260d.a(this);
            return objA == aVar ? aVar : objA;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f32251a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        this.f32251a = 1;
        Object objA2 = m.a((m) this.f32252b).a(new x(false), this);
        return objA2 == aVar2 ? aVar2 : objA2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(m mVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f32253c = i2;
        this.f32252b = mVar;
    }
}
