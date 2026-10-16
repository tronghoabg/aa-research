package com.waze.o.b.b;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f32746a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f32747b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.t.b.h f32748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, com.waze.t.b.h hVar, h.c.e eVar) {
        super(2, eVar);
        this.f32747b = kVar;
        this.f32748c = hVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new j(this.f32747b, this.f32748c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32746a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f32746a = 1;
            if (k.b(this.f32747b, this.f32748c, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
