package com.waze.ad.c;

import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f13899a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f13900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(h.g.a.a aVar, e eVar) {
        super(2, eVar);
        this.f13900b = aVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new a(this.f13900b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f13899a == 0) {
                c.b(obj);
                this.f13899a = 1;
                if (aj.p(this) == aVar) {
                    return aVar;
                }
            } else {
                c.b(obj);
            }
            throw new h.e();
        } catch (Throwable th) {
            this.f13900b.invoke();
            throw th;
        }
    }
}
