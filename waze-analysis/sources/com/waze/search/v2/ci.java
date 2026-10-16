package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ci extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f36243a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ck f36244b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f36245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ci(ck ckVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36245c = i2;
        this.f36244b = ckVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f36245c != 0) {
            ci ciVar = new ci(this.f36244b, eVar, 1, null);
            ciVar.f36243a = ((Boolean) obj).booleanValue();
            return ciVar;
        }
        ci ciVar2 = new ci(this.f36244b, eVar, 0);
        ciVar2.f36243a = ((Boolean) obj).booleanValue();
        return ciVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.f36245c != 0) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((ci) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
        }
        Boolean bool2 = (Boolean) obj;
        bool2.booleanValue();
        return ((ci) create(bool2, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f36245c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            boolean z = this.f36243a;
            ck ckVar = this.f36244b;
            ck.C(ckVar, z ? ckVar.f36253e : ckVar.f36252d, z ? ckVar.f36252d : ckVar.f36253e);
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ck ckVar2 = this.f36244b;
        boolean z2 = this.f36243a;
        fr frVar = ckVar2.f36252d;
        if (frVar != null) {
            if (!z2 || ckVar2.Y()) {
                frVar.d(ckVar2.X());
            } else {
                ckVar2.W(frVar, 6);
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ci(ck ckVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f36245c = i2;
        this.f36244b = ckVar;
    }
}
