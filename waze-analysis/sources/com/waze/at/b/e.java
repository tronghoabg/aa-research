package com.waze.at.b;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f15663a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f15664b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(2, eVar);
        this.f15664b = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f15664b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f15663a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f15663a = 1;
            obj = this.f15664b.f15666b.a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        f fVar = this.f15664b;
        if (zBooleanValue) {
            fVar.f15665a.c();
        } else {
            fVar.f15669e.c(com.waze.ui.n.f.f43078a);
        }
        return ab.f48028a;
    }
}
