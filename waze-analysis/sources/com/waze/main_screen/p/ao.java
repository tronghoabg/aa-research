package com.waze.main_screen.p;

import androidx.compose.runtime.State;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ao extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f27039a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f27040b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27041c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(bf bfVar, State state, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27041c = i2;
        this.f27040b = bfVar;
        this.f27039a = state;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f27041c != 0) {
            return new ao((bf) this.f27040b, (State) this.f27039a, eVar, 1);
        }
        return new ao((bf) this.f27039a, (h.g.a.l) this.f27040b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f27041c != 0 ? ((ao) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ao) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f27041c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            if (!((Boolean) this.f27039a.getValue()).booleanValue()) {
                ((bf) this.f27040b).h().C(null);
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.reports_v2.presentation.a.au auVarC = ((bf) this.f27039a).r().c();
        if (auVarC != null) {
            this.f27040b.invoke(auVarC);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(bf bfVar, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27041c = i2;
        this.f27039a = bfVar;
        this.f27040b = lVar;
    }
}
