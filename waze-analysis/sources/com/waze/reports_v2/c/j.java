package com.waze.reports_v2.c;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f34504a;

    /* renamed from: b, reason: collision with root package name */
    int f34505b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f34506c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f34507d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f34508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(h.g.a.l lVar, e eVar, k kVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f34506c = lVar;
        this.f34507d = eVar;
        this.f34508e = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new j(this.f34506c, this.f34507d, this.f34508e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.g.a.l lVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34505b != 0) {
            lVar = (h.g.a.l) this.f34504a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            h.g.a.l lVar2 = this.f34506c;
            this.f34504a = lVar2;
            this.f34505b = 1;
            Object objC = this.f34507d.b().c(this);
            if (objC == aVar) {
                return aVar;
            }
            lVar = lVar2;
            obj = objC;
        }
        d dVar = (d) obj;
        com.waze.shared_infra.i.e eVar = this.f34508e.f34514f;
        Objects.toString(dVar);
        eVar.a("sendReport calling callback with result: ".concat(String.valueOf(dVar)));
        lVar.invoke(obj);
        return h.ab.f48028a;
    }
}
