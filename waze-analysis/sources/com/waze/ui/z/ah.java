package com.waze.ui.z;

import androidx.compose.foundation.lazy.LazyListState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ah extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f43903a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LazyListState f43904b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(LazyListState lazyListState, h.c.e eVar) {
        super(2, eVar);
        this.f43904b = lazyListState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ah(this.f43904b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ah) create((com.waze.z.a.b.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f43903a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f43903a = 1;
            if (LazyListState.animateScrollToItem$default(this.f43904b, 0, 0, this, 2, null) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
