package com.waze.main_screen.v;

import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class g extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27792a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f27793b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MutableState f27794c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o f27795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(n nVar, MutableState mutableState, o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f27793b = nVar;
        this.f27794c = mutableState;
        this.f27795d = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new g(this.f27793b, this.f27794c, this.f27795d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f27792a == 0) {
            e.b.c.b(obj);
            if (!((Boolean) this.f27794c.getValue()).booleanValue()) {
                String strE = this.f27793b.e();
                if (strE != null) {
                    o oVar = this.f27795d;
                    this.f27792a = 1;
                    if (oVar.b(strE, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return h.ab.f48028a;
        }
        e.b.c.b(obj);
        this.f27794c.setValue(true);
        return h.ab.f48028a;
    }
}
