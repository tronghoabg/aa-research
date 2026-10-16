package com.waze.main_screen.a.a;

import androidx.compose.runtime.State;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.waze.navigate.ek;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f25543a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f25544b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f25545c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ State f25546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(n nVar, LifecycleOwner lifecycleOwner, State state, h.c.e eVar) {
        super(2, eVar);
        this.f25544b = nVar;
        this.f25545c = lifecycleOwner;
        this.f25546d = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f25544b, this.f25545c, this.f25546d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        ek ekVarA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25543a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f25543a = 1;
            obj = ai.k(FlowExtKt.flowWithLifecycle(this.f25544b.i(), this.f25545c.getLifecycle(), Lifecycle.State.STARTED), new d(null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        g gVar = (g) obj;
        if (gVar != null && (ekVarA = gVar.a()) != null) {
            a.a.q(this.f25546d).invoke(ekVarA);
        }
        return ab.f48028a;
    }
}
