package com.waze.main_screen.k.a;

import h.ab;
import h.g.b.aq;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26561a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f26562b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aq f26563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(u uVar, aq aqVar, h.c.e eVar) {
        super(2, eVar);
        this.f26562b = uVar;
        this.f26563c = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        s sVar = new s(this.f26562b, this.f26563c, eVar);
        sVar.f26561a = obj;
        return sVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((List) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f26561a;
        u uVar = this.f26562b;
        if (uVar.k()) {
            uVar.f26571e.e((List) this.f26563c.f48105a, list);
        }
        this.f26563c.f48105a = list;
        return ab.f48028a;
    }
}
