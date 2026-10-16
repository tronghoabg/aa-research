package com.waze.search;

import androidx.compose.foundation.lazy.LazyListState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f35487a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LazyListState f35488b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(LazyListState lazyListState, h.c.e eVar) {
        super(2, eVar);
        this.f35488b = lazyListState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ab(this.f35488b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f35487a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f35487a = 1;
            if (LazyListState.scrollToItem$default(this.f35488b, 0, 0, this, 2, null) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
