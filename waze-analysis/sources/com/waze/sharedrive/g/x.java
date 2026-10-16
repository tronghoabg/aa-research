package com.waze.sharedrive.g;

import androidx.compose.runtime.State;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ State f38752a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f38753b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f38754c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f38755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(com.waze.sharedrive.e.at atVar, State state, State state2, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38755d = i2;
        this.f38753b = atVar;
        this.f38754c = state;
        this.f38752a = state2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.waze.sharedrive.e.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f38755d != 0) {
            return new x((com.waze.sharedrive.e.r) this.f38754c, (h.g.a.a) this.f38753b, this.f38752a, eVar, 1);
        }
        return new x((com.waze.sharedrive.e.at) this.f38753b, (State) this.f38754c, this.f38752a, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f38755d != 0 ? ((x) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((x) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.waze.sharedrive.e.r, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f38755d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            if (bf.M(this.f38752a).a() instanceof r) {
                this.f38754c.e();
                this.f38753b.invoke();
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        if (bf.I(this.f38754c).e()) {
            a.a.q(this.f38752a).invoke(null);
            ((com.waze.sharedrive.e.at) this.f38753b).p();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(com.waze.sharedrive.e.r rVar, h.g.a.a aVar, State state, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38755d = i2;
        this.f38754c = rVar;
        this.f38753b = aVar;
        this.f38752a = state;
    }
}
