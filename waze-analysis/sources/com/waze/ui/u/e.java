package com.waze.ui.u;

import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f43453a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableState f43454b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h.g.a.l lVar, MutableState mutableState, h.c.e eVar) {
        super(2, eVar);
        this.f43453a = lVar;
        this.f43454b = mutableState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f43453a, this.f43454b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        MutableState mutableState = this.f43454b;
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            this.f43453a.invoke(k.f43460a);
        } else {
            mutableState.setValue(true);
        }
        return h.ab.f48028a;
    }
}
