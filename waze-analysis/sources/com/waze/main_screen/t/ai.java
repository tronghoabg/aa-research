package com.waze.main_screen.t;

import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ai extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27471a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f27472b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f27473c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f27474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(am amVar, LifecycleOwner lifecycleOwner, h.c.e eVar) {
        super(2, eVar);
        this.f27472b = amVar;
        this.f27473c = lifecycleOwner;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ai aiVar = new ai(this.f27472b, this.f27473c, eVar);
        aiVar.f27474d = obj;
        return aiVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ai) create((ProduceStateScope) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f27471a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ProduceStateScope produceStateScope = (ProduceStateScope) this.f27474d;
            this.f27471a = 1;
            if (FlowExtKt.flowWithLifecycle(kotlinx.coroutines.b.ai.y(new ah(this.f27472b.w(), 0)), this.f27473c.getLifecycle(), Lifecycle.State.STARTED).collect(new w(produceStateScope, 3), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
