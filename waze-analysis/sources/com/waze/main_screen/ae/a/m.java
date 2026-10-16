package com.waze.main_screen.ae.a;

import com.waze.sdk.bk;
import h.ab;
import h.g.a.q;
import h.g.b.x;
import j$.util.Optional;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class m extends h.c.b.a.g implements q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25741a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25742b;

    m(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m mVar = new m((h.c.e) obj3);
        mVar.f25741a = (bk) obj;
        mVar.f25742b = (Optional) obj2;
        return mVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        bk bkVar = (bk) this.f25741a;
        Optional optional = (Optional) this.f25742b;
        x.c(optional);
        x.f(optional, "<this>");
        return new b(bkVar, (c) optional.orElse(null));
    }
}
