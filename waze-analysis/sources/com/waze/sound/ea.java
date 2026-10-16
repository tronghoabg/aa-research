package com.waze.sound;

import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ea extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f39868a;

    /* renamed from: b, reason: collision with root package name */
    Object f39869b;

    /* renamed from: c, reason: collision with root package name */
    Object f39870c;

    /* renamed from: d, reason: collision with root package name */
    int f39871d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ List f39872e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ eb f39873f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f39874g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ea(List list, eb ebVar, String str, h.c.e eVar) {
        super(2, eVar);
        this.f39872e = list;
        this.f39873f = ebVar;
        this.f39874g = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ea(this.f39872e, this.f39873f, this.f39874g, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ea) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        eb ebVar;
        String str;
        Iterator it;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f39871d != 0) {
            it = (Iterator) this.f39870c;
            str = (String) this.f39869b;
            ebVar = (eb) this.f39868a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            List list = this.f39872e;
            ebVar = this.f39873f;
            str = this.f39874g;
            it = list.iterator();
        }
        while (it.hasNext()) {
            ao aoVar = (ao) it.next();
            ebVar.f39881g.put(new h.k(str, new Long(aoVar.a())), aoVar.b());
            ebVar.f39884j.getAndAdd(aoVar.b().a().size());
            iv ivVar = ebVar.f39877c;
            List listA = aoVar.b().a();
            com.waze.search.h.az azVar = new com.waze.search.h.az(ebVar, str, 11);
            this.f39868a = ebVar;
            this.f39869b = str;
            this.f39870c = it;
            this.f39871d = 1;
            if (ivVar.f(listA, azVar, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
