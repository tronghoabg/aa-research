package com.waze.z.a.f;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f46036a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f46037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f46037b = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new b(this.f46037b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f46036a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f46036a = 1;
            if (com.waze.z.a.e.b.b(this.f46037b, "Hello from Waze Snackbar!", this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
