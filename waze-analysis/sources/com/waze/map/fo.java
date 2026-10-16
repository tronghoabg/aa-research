package com.waze.map;

import android.graphics.Rect;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fo extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28979a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28980b;

    fo(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        fo foVar = new fo((h.c.e) obj3);
        foVar.f28979a = (da) obj;
        foVar.f28980b = (Rect) obj2;
        return foVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new h.k((da) this.f28979a, (Rect) this.f28980b);
    }
}
