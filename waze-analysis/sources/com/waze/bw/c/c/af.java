package com.waze.bw.c.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class af extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f17781a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f17782b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f17783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(am amVar, List list, h.c.e eVar) {
        super(2, eVar);
        this.f17782b = amVar;
        this.f17783c = list;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new af(this.f17782b, this.f17783c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((af) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f17781a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f17781a = 1;
            if (am.r(this.f17782b, this.f17783c, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
