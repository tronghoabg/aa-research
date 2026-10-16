package com.waze.c.e;

import androidx.compose.runtime.State;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.waze.navigate.ek;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ag extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18501a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ al f18502b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f18503c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ State f18504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(al alVar, LifecycleOwner lifecycleOwner, State state, h.c.e eVar) {
        super(2, eVar);
        this.f18502b = alVar;
        this.f18503c = lifecycleOwner;
        this.f18504d = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ag(this.f18502b, this.f18503c, this.f18504d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ag) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18501a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f18501a = 1;
            obj = kotlinx.coroutines.b.ai.k(FlowExtKt.flowWithLifecycle(new af(this.f18502b.e()), this.f18503c.getLifecycle(), Lifecycle.State.RESUMED), new as((h.c.e) null, 1, (byte[]) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ek ekVar = (ek) obj;
        if (ekVar != null) {
            a.a.q(this.f18504d).invoke(ekVar);
        }
        return h.ab.f48028a;
    }
}
