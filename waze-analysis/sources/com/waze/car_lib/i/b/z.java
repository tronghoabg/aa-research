package com.waze.car_lib.i.b;

import com.waze.map.canvas.MainCanvasDelegatorImpl;
import com.waze.map.el;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20050a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.i.c.h f20051b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f20052c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f20053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(com.waze.car_lib.i.c.h hVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20053d = i2;
        this.f20051b = hVar;
        this.f20052c = mainCanvasDelegatorImpl;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f20053d != 0 ? new z(this.f20051b, (MainCanvasDelegatorImpl) this.f20052c, eVar, 1) : new z(this.f20051b, (kotlinx.coroutines.b.k) this.f20052c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f20053d != 0 ? ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f20053d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f20050a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f20050a = 1;
                if (this.f20051b.a(el.b(((MainCanvasDelegatorImpl) this.f20052c).J()), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f20050a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f20050a = 1;
            if (this.f20051b.a(this.f20052c, this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(com.waze.car_lib.i.c.h hVar, kotlinx.coroutines.b.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20053d = i2;
        this.f20051b = hVar;
        this.f20052c = kVar;
    }
}
