package com.waze.cb;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f22115a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f22116b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f22117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(s sVar, h.c.e eVar) {
        super(2, eVar);
        this.f22116b = sVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        r rVar = new r(this.f22116b, eVar);
        rVar.f22117c = obj;
        return rVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f22115a == 0) {
            e.b.c.b(obj);
            af afVar = (af) this.f22117c;
            s sVar = this.f22116b;
            this.f22115a = 1;
            if (sVar.f22118a.f().collect(new q(sVar, afVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
