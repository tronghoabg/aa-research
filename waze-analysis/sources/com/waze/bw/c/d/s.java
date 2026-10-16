package com.waze.bw.c.d;

import androidx.compose.foundation.lazy.LazyListState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18163a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f18164b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LazyListState f18165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(LazyListState lazyListState, h.c.e eVar) {
        super(2, eVar);
        this.f18165c = lazyListState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        s sVar = new s(this.f18165c, eVar);
        sVar.f18164b = obj;
        return sVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((com.waze.z.a.b.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18163a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            if (((com.waze.z.a.b.ad) this.f18164b) != com.waze.z.a.b.ad.f45736d) {
                this.f18163a = 1;
                if (LazyListState.animateScrollToItem$default(this.f18165c, 0, 0, this, 2, null) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
