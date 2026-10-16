package com.waze.main_screen.t.a.a;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f27434a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f27435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(f fVar, h.c.e eVar) {
        super(2, eVar);
        this.f27435b = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new a(this.f27435b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f27434a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f27434a = 1;
            if (this.f27435b.f27442a.a(this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
