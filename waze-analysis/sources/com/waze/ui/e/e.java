package com.waze.ui.e;

import androidx.compose.animation.core.Transition;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Transition f42198a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f42199b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.b.w f42200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(Transition transition, v vVar, com.airbnb.lottie.b.w wVar, h.c.e eVar) {
        super(2, eVar);
        this.f42198a = transition;
        this.f42199b = vVar;
        this.f42200c = wVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f42198a, this.f42199b, this.f42200c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Transition transition = this.f42198a;
        x xVar = (x) transition.getTargetState();
        if (a.a.G(this.f42200c) != null && !transition.isRunning()) {
            if (xVar == x.f42253b) {
                this.f42199b.j(x.f42254c);
            } else if (xVar == x.f42256e) {
                this.f42199b.j(x.f42257f);
            }
        }
        return h.ab.f48028a;
    }
}
