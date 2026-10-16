package com.waze.main_screen.l.b;

import h.ab;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26623a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f26624b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(r rVar, h.c.e eVar) {
        super(2, eVar);
        this.f26624b = rVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new m(this.f26624b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((m) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26623a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f26623a = 1;
            obj = this.f26624b.f26635b.b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list = (List) obj;
        bn bnVar = this.f26624b.f26641h;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, i.d((i) objD, list, null, 5)));
        return ab.f48028a;
    }
}
