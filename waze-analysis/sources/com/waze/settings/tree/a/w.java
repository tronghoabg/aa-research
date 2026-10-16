package com.waze.settings.tree.a;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class w extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f37503a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f37504b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(View view, h.c.e eVar) {
        super(2, eVar);
        this.f37504b = view;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        w wVar = new w(this.f37504b, eVar);
        wVar.f37503a = ((Boolean) obj).booleanValue();
        return wVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((w) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f37503a;
        View view = this.f37504b;
        if (z) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
        return h.ab.f48028a;
    }
}
