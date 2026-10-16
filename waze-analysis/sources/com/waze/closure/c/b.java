package com.waze.closure.c;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f22456a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f22457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f22457b = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new b(this.f22457b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f22456a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f22456a = 1;
            if (i.a(this.f22457b, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
