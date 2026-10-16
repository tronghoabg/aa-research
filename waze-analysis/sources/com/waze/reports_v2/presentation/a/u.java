package com.waze.reports_v2.presentation.a;

import androidx.compose.ui.node.Ref;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref f34755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(Ref ref, h.c.e eVar) {
        super(2, eVar);
        this.f34755a = ref;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new u(this.f34755a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.reports_v2.presentation.ap apVar = (com.waze.reports_v2.presentation.ap) this.f34755a.getValue();
        if (apVar != null) {
            apVar.m();
        }
        return h.ab.f48028a;
    }
}
