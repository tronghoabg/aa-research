package com.waze.config;

import android.content.SharedPreferences;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class di extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dj f22617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(dj djVar, h.c.e eVar) {
        super(2, eVar);
        this.f22617a = djVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new di(this.f22617a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((di) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        dj djVar = this.f22617a;
        SharedPreferences.Editor editorEdit = djVar.f22623f.c().edit();
        for (f fVar : djVar.f22620c) {
            h.g.b.x.c(editorEdit);
            dj.l(fVar, editorEdit);
        }
        editorEdit.apply();
        return h.ab.f48028a;
    }
}
