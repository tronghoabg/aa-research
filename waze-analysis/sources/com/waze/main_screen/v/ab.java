package com.waze.main_screen.v;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ab extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableTransitionState f27777a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableState f27778b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f27779c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(MutableTransitionState mutableTransitionState, MutableState mutableState, n nVar, h.c.e eVar) {
        super(2, eVar);
        this.f27777a = mutableTransitionState;
        this.f27778b = mutableState;
        this.f27779c = nVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ab(this.f27777a, this.f27778b, this.f27779c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = false;
        if (((Boolean) this.f27778b.getValue()).booleanValue() && this.f27779c != null) {
            z = true;
        }
        this.f27777a.setTargetState$animation_core(Boolean.valueOf(z));
        return h.ab.f48028a;
    }
}
