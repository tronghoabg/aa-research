package com.waze.install;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f24720a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f24721b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f24722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ae aeVar, h.c.e eVar) {
        super(2, eVar);
        this.f24721b = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aa aaVar = new aa(this.f24721b, eVar);
        aaVar.f24722c = obj;
        return aaVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f24720a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f24722c;
            ae aeVar = this.f24721b;
            aeVar.f24731b.e("daemon is running");
            kotlinx.coroutines.aj.z(afVar, null, null, new y(aeVar, (h.c.e) null, 1, (byte[]) null), 3);
            kotlinx.coroutines.aj.z(afVar, null, null, new y(aeVar, null, 0), 3);
            boolean zIsEmpty = ((com.waze.authentication.aj) aeVar.f24732c.getValue()).a().isEmpty();
            if (zIsEmpty) {
                aeVar.f24734e.e(u.f24795a);
            }
            if (!((Boolean) aeVar.f24735f.invoke(aeVar.f24730a)).booleanValue()) {
                aeVar.f24731b.g("no location permission");
                aeVar.f24734e.e(s.f24793a);
            }
            if (zIsEmpty) {
                aeVar.f24731b.g("no credentials");
                aeVar.f24734e.e(v.f24796a);
                aeVar.f24740k.c();
            }
            this.f24720a = 1;
            if (kotlinx.coroutines.aj.d(new y(aeVar, (h.c.e) null, 2, (char[]) null), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
