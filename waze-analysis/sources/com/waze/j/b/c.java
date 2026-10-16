package com.waze.j.b;

import com.waze.av.b.n;
import com.waze.w.f;
import com.waze.w.h;
import com.waze.w.i;
import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f24875a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f24876b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f24877c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f24878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(i iVar, e eVar, String str, h.c.e eVar2) {
        super(2, eVar2);
        this.f24876b = iVar;
        this.f24877c = eVar;
        this.f24878d = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f24876b, this.f24877c, this.f24878d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f24875a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            i iVar = this.f24876b;
            if ((iVar instanceof f) || (iVar instanceof com.waze.w.e)) {
                return null;
            }
            if (!(iVar instanceof h)) {
                throw new h.i();
            }
            h hVar = (h) iVar;
            String strC = hVar.b().c().c();
            String strB = hVar.b().c().b();
            e eVar = this.f24877c;
            String str = this.f24878d;
            this.f24875a = 1;
            obj = eVar.f24885d.d(strC, strB, str, hVar.i(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return (n) obj;
    }
}
