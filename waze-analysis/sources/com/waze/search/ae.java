package com.waze.search;

import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f35498a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f35499b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f35500c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.al f35501d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f35502e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f35503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(int i2, int i3, com.waze.z.a.al alVar, kotlinx.coroutines.af afVar, h.c.e eVar) {
        super(2, eVar);
        this.f35499b = i2;
        this.f35500c = i3;
        this.f35501d = alVar;
        this.f35502e = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ae aeVar = new ae(this.f35499b, this.f35500c, this.f35501d, this.f35502e, eVar);
        aeVar.f35503f = obj;
        return aeVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ae) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f35498a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f35503f;
            final int i2 = this.f35499b;
            final int i3 = this.f35500c;
            final com.waze.z.a.al alVar = this.f35501d;
            br brVarZ = kotlinx.coroutines.aj.z(afVar, null, null, new ad(i2, i3, alVar, (h.c.e) null, 1, (byte[]) null), 3);
            final kotlinx.coroutines.af afVar2 = this.f35502e;
            brVarZ.bY(new h.g.a.l() { // from class: com.waze.search.ac
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    kotlinx.coroutines.aj.z(afVar2, null, null, new ad(i2, i3, alVar, null, 0), 3);
                    return h.ab.f48028a;
                }
            });
            this.f35503f = brVarZ;
            this.f35498a = 1;
            if (brVarZ.m(this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
