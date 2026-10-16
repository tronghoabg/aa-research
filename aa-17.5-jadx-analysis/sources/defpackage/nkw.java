package defpackage;

/* loaded from: classes2.dex */
public final class nkw extends afde implements afeg {
    int a;
    /* synthetic */ int b;
    final /* synthetic */ npe c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkw(npe npeVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = npeVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.d != 0) {
            nkw nkwVar = new nkw(this.c, afckVar, 1, null);
            nkwVar.b = ((Number) obj).intValue();
            return nkwVar;
        }
        nkw nkwVar2 = new nkw(this.c, afckVar, 0);
        nkwVar2.b = ((Number) obj).intValue();
        return nkwVar2;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.d != 0) {
            afcr afcrVar = afcr.a;
            int i = this.a;
            woy.dF(obj);
            if (i == 0) {
                int i2 = this.b;
                npe npeVar = this.c;
                this.a = 1;
                if (npeVar.b(i2, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        afcr afcrVar2 = afcr.a;
        if (this.a != 0) {
            woy.dF(obj);
        } else {
            woy.dF(obj);
            int i3 = this.b;
            npe npeVar2 = this.c;
            this.a = 1;
            if (npeVar2.b(i3, this) == afcrVar2) {
                return afcrVar2;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((nkw) b(Integer.valueOf(((Number) obj).intValue()), (afck) obj2)).hT(afak.a);
        }
        return ((nkw) b(Integer.valueOf(((Number) obj).intValue()), (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkw(npe npeVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.c = npeVar;
    }
}
