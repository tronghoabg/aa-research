package com.waze.uid.state_impl.e;

import com.waze.uid.d.q;
import com.waze.uid.stats.UidStatsSender$OnboardingContext;
import com.waze.uid.stats.d;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f44633a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ UidStatsSender$OnboardingContext f44634b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f44635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(UidStatsSender$OnboardingContext uidStatsSender$OnboardingContext, d dVar, e eVar) {
        super(2, eVar);
        this.f44634b = uidStatsSender$OnboardingContext;
        this.f44635c = dVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new a(this.f44634b, this.f44635c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f44633a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f44633a = 1;
            if (q.f44463a.a().f44467e.h(this) == aVar) {
                return aVar;
            }
        }
        q.f44463a.a().c().g(this.f44634b, this.f44635c);
        return ab.f48028a;
    }
}
