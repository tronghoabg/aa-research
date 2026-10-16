package com.waze.map.canvas;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28580a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f28581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(String str, h.c.e eVar) {
        super(2, eVar);
        this.f28581b = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bc bcVar = new bc(this.f28581b, eVar);
        bcVar.f28580a = obj;
        return bcVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bc) create((Set) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((Set) this.f28580a).contains(this.f28581b));
    }
}
