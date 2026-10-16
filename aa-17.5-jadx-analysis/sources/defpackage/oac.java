package defpackage;

/* loaded from: classes2.dex */
public final class oac extends afde implements afeg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oac(bbt bbtVar, boolean z, int i, afck afckVar, int i2) {
        super(2, afckVar);
        this.e = i2;
        this.d = bbtVar;
        this.b = z;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [bwq, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.e == 0) {
            return new oac(this.b, this.c, (bwq) this.d, afckVar, 0);
        }
        return new oac((bbt) this.d, this.b, this.c, afckVar, 1);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [bwq, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.e != 0) {
            afcr afcrVar = afcr.a;
            int i = this.a;
            woy.dF(obj);
            if (i == 0) {
                Object obj2 = this.d;
                int iJ = this.b ? ((bbt) obj2).j() + 1 : (((bbt) obj2).j() + 1) % this.c;
                this.a = 1;
                if (((bbt) obj2).y(iJ, new aft(1.0f, 1500.0f, null), this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        afcr afcrVar2 = afcr.a;
        if (this.a == 0) {
            woy.dF(obj);
            boolean z = this.b;
            ?? r2 = this.d;
            if (z) {
                int iOrdinal = oag.a(r2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        this.a = 1;
                        if (aiow.c(100L, this) == afcrVar2) {
                            return afcrVar2;
                        }
                    } else if (iOrdinal != 2) {
                        throw new aezs();
                    }
                } else if (this.c > 0) {
                    r2.b(nym.c);
                } else {
                    r2.b(nym.b);
                }
            } else {
                r2.b(nym.a);
            }
            return afak.a;
        }
        woy.dF(obj);
        this.d.b(nym.c);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((oac) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((oac) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oac(boolean z, int i, bwq bwqVar, afck afckVar, int i2) {
        super(2, afckVar);
        this.e = i2;
        this.b = z;
        this.c = i;
        this.d = bwqVar;
    }
}
