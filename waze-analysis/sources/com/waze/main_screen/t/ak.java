package com.waze.main_screen.t;

import androidx.compose.runtime.State;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ak extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27480a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f27481b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f27482c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ State f27483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(boolean z, am amVar, State state, h.c.e eVar) {
        super(2, eVar);
        this.f27481b = z;
        this.f27482c = amVar;
        this.f27483d = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ak(this.f27481b, this.f27482c, this.f27483d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f27480a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            if ((al.F(this.f27483d) instanceof com.waze.ui.u.q) && !this.f27481b) {
                this.f27480a = 1;
                if (this.f27482c.a().c().n(this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
