package com.waze.settings.tree.d;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends h.i.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f37541a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Object obj, g gVar) {
        super(obj);
        this.f37541a = gVar;
    }

    @Override // h.i.a
    protected final void afterChange(h.l.r<?> rVar, Boolean bool, Boolean bool2) {
        x.f(rVar, "property");
        Boolean bool3 = bool2;
        bool3.booleanValue();
        bool.booleanValue();
        this.f37541a.f37544b.e(bool3);
    }
}
