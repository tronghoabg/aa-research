package com.waze.reports_v2.presentation.a;

import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f34642a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableState f34643b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(int i2, MutableState mutableState, h.c.e eVar) {
        super(2, eVar);
        this.f34642a = i2;
        this.f34643b = mutableState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new aj(this.f34642a, this.f34643b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f34643b.setValue(Integer.valueOf(this.f34642a));
        return h.ab.f48028a;
    }
}
