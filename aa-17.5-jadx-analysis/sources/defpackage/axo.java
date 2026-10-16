package defpackage;

/* loaded from: classes.dex */
public final class axo extends afde implements afeg {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axo(afck afckVar, int i) {
        super(2, afckVar);
        this.a = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? new axo(afckVar, 2, (char[]) null) : new axo(afckVar, 1, (byte[]) null) : new axo(afckVar, 0);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.a;
        if (i == 0) {
            woy.dF(obj);
            return afak.a;
        }
        if (i != 1) {
            woy.dF(obj);
            return afak.a;
        }
        woy.dF(obj);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            return new axo((afck) obj2, 0).hT(afak.a);
        }
        if (i != 1) {
            return new axo((afck) obj2, 2, (char[]) null).hT(afak.a);
        }
        return new axo((afck) obj2, 1, (byte[]) null).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axo(afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axo(afck afckVar, int i, char[] cArr) {
        super(2, afckVar);
        this.a = i;
    }
}
