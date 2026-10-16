package com.waze.network.e;

import com.waze.network.f.af;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f32254a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f32255b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f32256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, af afVar, h.c.e eVar) {
        super(2, eVar);
        this.f32255b = mVar;
        this.f32256c = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new l(this.f32255b, this.f32256c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32254a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            m mVar = this.f32255b;
            af afVar = this.f32256c;
            this.f32254a = 1;
            if (m.a(mVar).c(afVar, false, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
