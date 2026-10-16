package com.waze.uid.state_impl.e;

import com.waze.uid.d.q;
import com.waze.uid.stats.UidStatsSender$OnboardingContext;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f44636a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ UidStatsSender$OnboardingContext f44637b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f44638c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f44639d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f44640e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f44641f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f44642g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(UidStatsSender$OnboardingContext uidStatsSender$OnboardingContext, String str, long j2, boolean z, boolean z2, boolean z3, e eVar) {
        super(2, eVar);
        this.f44637b = uidStatsSender$OnboardingContext;
        this.f44638c = str;
        this.f44639d = j2;
        this.f44640e = z;
        this.f44641f = z2;
        this.f44642g = z3;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new b(this.f44637b, this.f44638c, this.f44639d, this.f44640e, this.f44641f, this.f44642g, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f44636a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f44636a = 1;
            if (q.f44463a.a().f44467e.h(this) == aVar) {
                return aVar;
            }
        }
        com.waze.uid.d.p pVar = q.f44463a;
        pVar.a().c().w(this.f44637b, this.f44638c, this.f44639d, pVar.a().a().c(), pVar.a().a().b(), this.f44640e, this.f44641f, this.f44642g, pVar.a().a().i());
        return ab.f48028a;
    }
}
