package com.waze.ui.z;

import androidx.compose.ui.geometry.Rect;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44020a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f44021b;

    v(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        v vVar = new v((h.c.e) obj3);
        vVar.f44020a = (f) obj;
        vVar.f44021b = (Rect) obj2;
        return vVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return as.G((Rect) this.f44021b, (f) this.f44020a, false);
    }
}
