package com.waze.bw.c.d;

import androidx.compose.foundation.lazy.LazyListState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cm extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18040a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LazyListState f18041b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cm(LazyListState lazyListState, h.c.e eVar) {
        super(2, eVar);
        this.f18041b = lazyListState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new cm(this.f18041b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cm) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18040a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f18040a = 1;
            if (LazyListState.scrollToItem$default(this.f18041b, 0, 0, this, 2, null) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
