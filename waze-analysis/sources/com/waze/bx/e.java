package com.waze.bx;

import androidx.media3.datasource.cache.Cache;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f18180a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f18180a = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f18180a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Cache cacheA = this.f18180a.f18194b.a();
        if (cacheA != null) {
            com.waze.sharedui.api.c.b(cacheA);
        }
        return ab.f48028a;
    }
}
