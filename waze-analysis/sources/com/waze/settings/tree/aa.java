package com.waze.settings.tree;

import com.waze.settings.de;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f37510a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ de f37511b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ab f37512c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.ifs.ui.x f37513d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f37514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(de deVar, ab abVar, com.waze.ifs.ui.x xVar, h.c.e eVar) {
        super(2, eVar);
        this.f37511b = deVar;
        this.f37512c = abVar;
        this.f37513d = xVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aa aaVar = new aa(this.f37511b, this.f37512c, this.f37513d, eVar);
        aaVar.f37514e = obj;
        return aaVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aa) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f37510a == 0) {
            e.b.c.b(obj);
            af afVar = (af) this.f37514e;
            de deVar = this.f37511b;
            this.f37510a = 1;
            if (deVar.k().B().collect(new z(this.f37512c, this.f37513d, deVar, afVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
