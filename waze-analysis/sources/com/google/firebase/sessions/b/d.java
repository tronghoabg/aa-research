package com.google.firebase.sessions.b;

import android.util.Log;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f10874a;

    d(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(eVar);
        dVar.f10874a = obj;
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((String) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: ".concat(String.valueOf((String) this.f10874a)));
        return ab.f48028a;
    }
}
