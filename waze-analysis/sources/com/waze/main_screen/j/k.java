package com.waze.main_screen.j;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class k extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f26486a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f26487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(m mVar, h.c.e eVar) {
        super(2, eVar);
        this.f26487b = mVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f26487b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26486a == 0) {
            e.b.c.b(obj);
            m mVar = this.f26487b;
            this.f26486a = 1;
            if (mVar.f26489a.i().collect(new j(mVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
