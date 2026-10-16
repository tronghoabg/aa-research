package defpackage;

/* loaded from: classes2.dex */
final class nyw extends afde implements afeg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;
    final /* synthetic */ bym d;
    final /* synthetic */ bwq e;
    final /* synthetic */ bym f;
    final /* synthetic */ bwq g;
    final /* synthetic */ bym h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyw(boolean z, int i, bym bymVar, bwq bwqVar, bym bymVar2, bwq bwqVar2, bym bymVar3, afck afckVar) {
        super(2, afckVar);
        this.b = z;
        this.c = i;
        this.d = bymVar;
        this.e = bwqVar;
        this.f = bymVar2;
        this.g = bwqVar2;
        this.h = bymVar3;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new nyw(this.b, this.c, this.d, this.e, this.f, this.g, this.h, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i != 0) {
            bwq bwqVar = this.e;
            int i2 = nyx.a;
            bwqVar.b(Boolean.valueOf(true));
            this.g.b(true);
        } else {
            bym bymVar = this.d;
            int i3 = nyx.a;
            if (((Boolean) bymVar.a()).booleanValue()) {
                this.e.b(Boolean.valueOf(true));
                return afak.a;
            }
            if (nyx.a(this.f).c) {
                this.e.b(Boolean.valueOf(false));
            } else if (((Boolean) this.g.a()).booleanValue() || !this.b || this.c <= 0 || ((Boolean) this.h.a()).booleanValue()) {
                this.e.b(Boolean.valueOf(true));
            } else {
                this.e.b(Boolean.valueOf(false));
                long jQ = acxa.q();
                this.a = 1;
                if (aiow.c(jQ, this) == afcrVar) {
                    return afcrVar;
                }
                bwq bwqVar2 = this.e;
                int i22 = nyx.a;
                bwqVar2.b(Boolean.valueOf(true));
                this.g.b(true);
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((nyw) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
