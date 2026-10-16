package com.waze.cf;

import h.ab;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f22235a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f22236b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22237c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f22237c = i2;
        this.f22236b = hVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [h.l.f, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f22237c != 0 ? new g((h.l.f) this.f22236b, eVar, 1) : new g((h) this.f22236b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f22237c != 0 ? ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f22237c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f22235a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                l lVar = (l) this.f22236b;
                this.f22235a = 1;
                if (lVar.invoke(this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f22235a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            h hVar = (h) this.f22236b;
            this.f22235a = 1;
            if (ai.e(ai.y(new f(hVar.f22238a.a())), new c(hVar, null), this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h.l.f fVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f22237c = i2;
        this.f22236b = fVar;
    }
}
