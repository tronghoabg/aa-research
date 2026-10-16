package com.waze.main_screen.a.b;

import androidx.compose.runtime.State;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f25593a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.a.b.a.g f25594b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f25595c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ State f25596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(com.waze.main_screen.a.b.a.g gVar, LifecycleOwner lifecycleOwner, State state, h.c.e eVar) {
        super(2, eVar);
        this.f25594b = gVar;
        this.f25595c = lifecycleOwner;
        this.f25596d = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new f(this.f25594b, this.f25595c, this.f25596d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25593a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f25593a = 1;
            if (ai.k(FlowExtKt.flowWithLifecycle(new e(this.f25594b.e()), this.f25595c.getLifecycle(), Lifecycle.State.STARTED), new b(null), this) == aVar) {
                return aVar;
            }
        }
        a.a.t(this.f25596d).invoke();
        return ab.f48028a;
    }
}
