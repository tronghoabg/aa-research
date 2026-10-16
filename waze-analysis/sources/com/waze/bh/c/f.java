package com.waze.bh.c;

import com.waze.ui.v.j;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f16780a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f16781b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h hVar, h.c.e eVar) {
        super(2, eVar);
        this.f16781b = hVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new f(this.f16781b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f16780a == 0) {
            e.b.c.b(obj);
            h hVar = this.f16781b;
            String strC = hVar.c();
            if (strC != null) {
                this.f16780a = 1;
                obj = hVar.f16786a.c(strC, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            this.f16781b.f16789d.c(com.waze.ui.v.g.f43506a);
            return ab.f48028a;
        }
        e.b.c.b(obj);
        if (((Boolean) obj).booleanValue()) {
            h hVar2 = this.f16781b;
            hVar2.f16789d.c(j.f43509a);
            hVar2.f16788c.a();
        } else {
            this.f16781b.f16789d.c(com.waze.ui.v.g.f43506a);
        }
        return ab.f48028a;
    }
}
