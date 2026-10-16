package com.waze.map;

import android.graphics.Rect;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fg extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28937a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f28938b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fg(h.g.b.aq aqVar, h.c.e eVar) {
        super(2, eVar);
        this.f28938b = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        fg fgVar = new fg(this.f28938b, eVar);
        fgVar.f28937a = obj;
        return fgVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fg) create((Rect) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(h.g.b.x.n((Rect) this.f28937a, this.f28938b.f48105a));
    }
}
