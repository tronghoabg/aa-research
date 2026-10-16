package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class br extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34903a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f34904b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    br(long j2, h.c.e eVar) {
        super(2, eVar);
        this.f34904b = j2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new br(this.f34904b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((br) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34903a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f34903a = 1;
            if (kotlinx.coroutines.aj.q(this.f34904b, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
