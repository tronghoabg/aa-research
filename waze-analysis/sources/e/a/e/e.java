package e.a.e;

import com.waze.sharedui.web.as;
import e.a.cm;
import e.a.cq;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f47371a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a.h f47372b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a.i f47373c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ cq f47374d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ cm f47375e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ as f47376f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f47377g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(e.a.h hVar, e.a.i iVar, cq cqVar, cm cmVar, as asVar, h.c.e eVar) {
        super(2, eVar);
        this.f47372b = hVar;
        this.f47373c = iVar;
        this.f47374d = cqVar;
        this.f47375e = cmVar;
        this.f47376f = asVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        e eVar2 = new e(this.f47372b, this.f47373c, this.f47374d, this.f47375e, this.f47376f, eVar);
        eVar2.f47377g = obj;
        return eVar2;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f47371a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            l lVar = (l) this.f47377g;
            this.f47371a = 1;
            if (aj.d(new d(this.f47372b, this.f47373c, this.f47374d, this.f47375e, lVar, this.f47376f, null), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
