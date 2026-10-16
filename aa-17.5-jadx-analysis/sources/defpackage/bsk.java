package defpackage;

/* loaded from: classes.dex */
public final class bsk extends afde implements afeg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsk(gwc gwcVar, gwa gwaVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.a = gwcVar;
        this.b = gwaVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.d;
        if (i == 0) {
            bsk bskVar = new bsk((ksx) this.a, (bcm) this.b, afckVar, 0, null);
            bskVar.c = obj;
            return bskVar;
        }
        if (i == 1) {
            bsk bskVar2 = new bsk((ksx) this.a, (bcm) this.b, afckVar, 1, null, null);
            bskVar2.c = obj;
            return bskVar2;
        }
        Object obj2 = this.a;
        if (i != 2) {
            bsk bskVar3 = new bsk((ksx) obj2, (bcm) this.b, afckVar, 3);
            bskVar3.c = obj;
            return bskVar3;
        }
        bsk bskVar4 = new bsk((gwc) obj2, (gwa) this.b, afckVar, 2);
        bskVar4.c = obj;
        return bskVar4;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.d;
        if (i == 0) {
            woy.dF(obj);
            aitx aitxVar = (aitx) this.c;
            Object obj2 = this.b;
            ksx ksxVar = (ksx) this.a;
            bcm bcmVar = (bcm) obj2;
            ahnc.d(aitxVar, null, 0, new bns(ksxVar, bcmVar, (afck) null, 10, (byte[]) null), 3);
            ahnc.d(aitxVar, null, 0, new bns(ksxVar, bcmVar, (afck) null, 11, (char[]) null), 3);
            ahnc.d(aitxVar, null, 0, new bns(ksxVar, bcmVar, (afck) null, 12, (short[]) null), 3);
            return ahnc.d(aitxVar, null, 0, new bns(ksxVar, bcmVar, (afck) null, 13, (int[]) null), 3);
        }
        if (i == 1) {
            woy.dF(obj);
            aitx aitxVar2 = (aitx) this.c;
            Object obj3 = this.b;
            ksx ksxVar2 = (ksx) this.a;
            bcm bcmVar2 = (bcm) obj3;
            ahnc.d(aitxVar2, null, 0, new bns(ksxVar2, bcmVar2, (afck) null, 4, (boolean[]) null), 3);
            ahnc.d(aitxVar2, null, 0, new bns(ksxVar2, bcmVar2, (afck) null, 5, (byte[]) null, (byte[]) null), 3);
            ahnc.d(aitxVar2, null, 0, new bns(ksxVar2, bcmVar2, (afck) null, 6, (char[]) null, (byte[]) null), 3);
            return ahnc.d(aitxVar2, null, 0, new bns(ksxVar2, bcmVar2, (afck) null, 7, (short[]) null, (byte[]) null), 3);
        }
        if (i == 2) {
            woy.dF(obj);
            aitx aitxVar3 = (aitx) this.c;
            Object obj4 = this.b;
            gwc gwcVar = (gwc) this.a;
            gwa gwaVar = (gwa) obj4;
            ahnc.d(aitxVar3, null, 0, new ehs(gwcVar, gwaVar, (afck) null, 13), 3);
            ahnc.d(aitxVar3, null, 0, new ehs(gwcVar, gwaVar, (afck) null, 14, (byte[]) null), 3);
            return afak.a;
        }
        woy.dF(obj);
        aitx aitxVar4 = (aitx) this.c;
        Object obj5 = this.b;
        ksx ksxVar3 = (ksx) this.a;
        bcm bcmVar3 = (bcm) obj5;
        ahnc.d(aitxVar4, null, 0, new ksw(ksxVar3, bcmVar3, (afck) null, 2, (byte[]) null), 3);
        ahnc.d(aitxVar4, null, 0, new ksw(ksxVar3, bcmVar3, (afck) null, 3, (char[]) null), 3);
        ahnc.d(aitxVar4, null, 0, new ksw(ksxVar3, bcmVar3, (afck) null, 4, (short[]) null), 3);
        return ahnc.d(aitxVar4, null, 0, new ksw(ksxVar3, bcmVar3, (afck) null, 5, (int[]) null), 3);
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((bsk) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((bsk) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 2) {
            return ((bsk) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((bsk) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsk(ksx ksxVar, bcm bcmVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.a = ksxVar;
        this.b = bcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsk(ksx ksxVar, bcm bcmVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.a = ksxVar;
        this.b = bcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsk(ksx ksxVar, bcm bcmVar, afck afckVar, int i, byte[] bArr, byte[] bArr2) {
        super(2, afckVar);
        this.d = i;
        this.a = ksxVar;
        this.b = bcmVar;
    }
}
