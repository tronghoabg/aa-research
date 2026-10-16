package com.waze.settings.a.a.a;

import h.a.i;
import h.a.r;
import h.ab;
import h.g.a.p;
import h.k.n;
import h.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f36706a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f36707b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f36708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h hVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36708c = i2;
        this.f36707b = hVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f36708c != 0 ? new f(this.f36707b, eVar, 1, null) : new f(this.f36707b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f36708c != 0 ? ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objD;
        if (this.f36708c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f36706a == 0) {
                e.b.c.b(obj);
                h hVar = this.f36707b;
                this.f36706a = 1;
                if (hVar.f36715d.a().collect(new a(hVar), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f36706a != 0) {
            e.b.c.b(obj);
            objA = ((m) obj).b();
        } else {
            e.b.c.b(obj);
            this.f36706a = 1;
            objA = this.f36707b.f36714c.a(this);
            if (objA == aVar2) {
                return aVar2;
            }
        }
        h hVar2 = this.f36707b;
        if (m.e(objA)) {
            List list = (List) objA;
            com.waze.shared_infra.i.e eVar = hVar2.f36712a;
            Objects.toString(list);
            eVar.a("got car list: ".concat(String.valueOf(list)));
            bn bnVar = hVar2.f36719h;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, e.f((e) objD, null, list, null, false, false, 13)));
            List list2 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(i.q(list2, 10)), 16));
            for (Object obj2 : list2) {
                linkedHashMap.put(((com.waze.copilot.data.c) obj2).e(), obj2);
            }
            hVar2.f36718g = linkedHashMap;
        }
        Throwable thC = m.c(objA);
        if (thC != null) {
            hVar2.f36712a.a("car list request failed: ".concat(String.valueOf(thC.getMessage())));
            hVar2.o(b.f36699a);
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h hVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f36708c = i2;
        this.f36707b = hVar;
    }
}
