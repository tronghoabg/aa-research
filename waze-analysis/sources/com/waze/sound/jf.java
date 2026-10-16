package com.waze.sound;

import androidx.media3.datasource.cache.Cache;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jf extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f40297a;

    /* renamed from: b, reason: collision with root package name */
    int f40298b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ jl f40299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jf(jl jlVar, h.c.e eVar) {
        super(2, eVar);
        this.f40299c = jlVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new jf(this.f40299c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((jf) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        jl jlVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40298b != 0) {
            jlVar = (jl) this.f40297a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            jl jlVar2 = this.f40299c;
            this.f40297a = jlVar2;
            this.f40298b = 1;
            Object objY = jlVar2.y(this);
            if (objY == aVar) {
                return aVar;
            }
            obj = objY;
            jlVar = jlVar2;
        }
        jlVar.u((Cache) obj);
        return h.ab.f48028a;
    }
}
