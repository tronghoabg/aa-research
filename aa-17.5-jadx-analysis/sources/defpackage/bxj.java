package defpackage;

/* loaded from: classes.dex */
public final class bxj extends afde implements afeg {
    /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxj(afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.b;
        if (i == 0) {
            bxj bxjVar = new bxj(afckVar, 0);
            bxjVar.a = obj;
            return bxjVar;
        }
        if (i != 1) {
            bxj bxjVar2 = new bxj(afckVar, 2, (char[]) null);
            bxjVar2.a = obj;
            return bxjVar2;
        }
        bxj bxjVar3 = new bxj(afckVar, 1, (byte[]) null);
        bxjVar3.a = obj;
        return bxjVar3;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.b;
        if (i == 0) {
            woy.dF(obj);
            return Boolean.valueOf(((bxi) this.a) == bxi.a);
        }
        if (i == 1) {
            woy.dF(obj);
            return Boolean.valueOf(((bxi) this.a).compareTo(bxi.e) > 0);
        }
        ehi ehiVar = (ehi) this.a;
        woy.dF(obj);
        return Boolean.valueOf(!(ehiVar instanceof ego));
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return ((bxj) b((bxi) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 1) {
            return ((bxj) b((ehi) obj, (afck) obj2)).hT(afak.a);
        }
        return ((bxj) b((bxi) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxj(afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxj(afck afckVar, int i, char[] cArr) {
        super(2, afckVar);
        this.b = i;
    }
}
