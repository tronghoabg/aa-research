package com.waze.ev;

import h.ab;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f23707a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f23708b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f23709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(s sVar, List list, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f23707a = sVar;
        this.f23708b = list;
        this.f23709c = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new p(this.f23707a, this.f23708b, this.f23709c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        s sVar = this.f23707a;
        sVar.f23723g.i(com.waze.ac.e.d(sVar.f23718b, this.f23708b, (String) sVar.f23723g.f().d(), sVar.f()));
        if (this.f23709c) {
            sVar.f23723g.g(true);
        }
        return ab.f48028a;
    }
}
