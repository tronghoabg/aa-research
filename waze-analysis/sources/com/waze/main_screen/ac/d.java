package com.waze.main_screen.ac;

import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f25672a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f25673b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f25673b = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new d(this.f25673b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25672a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            e eVar = this.f25673b;
            this.f25672a = 1;
            if (((i) CompositionLocalConsumerModifierNodeKt.currentValueOf(eVar, m.a())).a().collect(new c(eVar), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
