package com.waze.main_screen.k.a;

import com.waze.an.c.ac;
import com.waze.an.c.af;
import com.waze.an.c.ai;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class n extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26543a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26544b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ boolean f26545c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ u f26546d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ af f26547e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.an.c.a.p f26548f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(u uVar, com.waze.an.c.a.p pVar, af afVar, h.c.e eVar) {
        super(4, eVar);
        this.f26546d = uVar;
        this.f26548f = pVar;
        this.f26547e = afVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        n nVar = new n(this.f26546d, this.f26548f, this.f26547e, (h.c.e) obj4);
        nVar.f26543a = (ac) obj;
        nVar.f26544b = (ai) obj2;
        nVar.f26545c = zBooleanValue;
        return nVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ac acVar = (ac) this.f26543a;
        return this.f26546d.f26570d.o(this.f26548f, (ai) this.f26544b, this.f26547e, acVar, this.f26545c);
    }
}
