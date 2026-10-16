package com.waze.speech;

import com.waze.a.af;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40442a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f40443b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f40444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, af afVar, h.c.e eVar) {
        super(2, eVar);
        this.f40443b = jVar;
        this.f40444c = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f40443b, this.f40444c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40442a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            j jVar = this.f40443b;
            af afVar = this.f40444c;
            this.f40442a = 1;
            if (jVar.f40455k.emit(afVar, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
