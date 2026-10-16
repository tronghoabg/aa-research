package com.waze.location;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f25406a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f25407b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(g gVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25408c = i2;
        this.f25407b = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f25408c;
        Object obj2 = this.f25407b;
        return i2 != 0 ? new l((g) obj2, eVar, 1) : new l((n) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f25408c != 0 ? ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f25408c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f25406a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f25407b;
                this.f25406a = 1;
                if (g.d((g) obj2, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f25406a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj3 = this.f25407b;
            q qVarC = n.c((n) obj3);
            Context contextRequireContext = ((android.support.v4.app.ar) obj3).requireContext();
            h.g.b.x.e(contextRequireContext, "requireContext(...)");
            this.f25406a = 1;
            obj = qVarC.d(contextRequireContext, this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        ((n) this.f25407b).f(((h) obj).a());
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(n nVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25408c = i2;
        this.f25407b = nVar;
    }
}
