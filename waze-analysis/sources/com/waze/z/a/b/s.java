package com.waze.z.a.b;

import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f45774a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f45775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(ab abVar, h.c.e eVar) {
        super(2, eVar);
        this.f45775b = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new s(this.f45775b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objN;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f45774a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ab abVar = this.f45775b;
            s sVar = this;
            this.f45774a = 1;
            ad adVarG = abVar.g();
            ad adVar = ad.f45733a;
            int iOrdinal = adVarG.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                objN = abVar.n(sVar);
                if (objN != aVar) {
                    objN = h.ab.f48028a;
                }
            } else if (iOrdinal == 2) {
                objN = abVar.l(sVar);
                if (objN != aVar) {
                    objN = h.ab.f48028a;
                }
            } else {
                if (iOrdinal != 3) {
                    throw new h.i();
                }
                objN = abVar.k(sVar);
                if (objN != aVar) {
                    objN = h.ab.f48028a;
                }
            }
            if (objN == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
