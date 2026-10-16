package com.waze.ui.m;

import androidx.compose.animation.core.MutableTransitionState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class di extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f42970a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f42971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(MutableTransitionState mutableTransitionState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42971b = i2;
        this.f42970a = mutableTransitionState;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f42971b != 0 ? new di((MutableTransitionState) this.f42970a, eVar, 1) : new di((h.g.a.l) this.f42970a, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f42971b != 0 ? ((di) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((di) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f42971b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((MutableTransitionState) this.f42970a).setTargetState$animation_core(true);
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f42970a.invoke(bi.f42825a);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42971b = i2;
        this.f42970a = lVar;
    }
}
