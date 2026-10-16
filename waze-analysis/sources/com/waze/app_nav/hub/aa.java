package com.waze.app_nav.hub;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import h.g.b.aq;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f15236a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f15237b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f15238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(af afVar, h.c.e eVar) {
        super(2, eVar);
        this.f15237b = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aa aaVar = new aa(this.f15237b, eVar);
        aaVar.f15238c = obj;
        return aaVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f15236a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f15238c;
            aq aqVar = new aq();
            af afVar2 = this.f15237b;
            this.f15236a = 1;
            if (ai.y(ai.F(new z(ai.K(FlowExtKt.flowWithLifecycle(afVar2.al().b().a(), afVar2.getLifecycle(), Lifecycle.State.STARTED), new u(afVar2, afVar, null)), 0), afVar2.f15246l, new v(afVar2, null))).collect(new w(afVar2, aqVar), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
