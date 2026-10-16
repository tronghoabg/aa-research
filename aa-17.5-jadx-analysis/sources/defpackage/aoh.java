package defpackage;

/* loaded from: classes.dex */
final class aoh extends afde implements afeh {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoh(afck afckVar, int i) {
        super(3, afckVar);
        this.a = i;
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

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        if (i == 0) {
            ((Number) obj2).floatValue();
            return new aoh((afck) obj3, 0).hT(afak.a);
        }
        if (i != 1) {
            long j = ((cja) obj2).a;
            return new aoh((afck) obj3, 2, (char[]) null).hT(afak.a);
        }
        long j2 = ((cja) obj2).a;
        return new aoh((afck) obj3, 1, (byte[]) null).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoh(afck afckVar, int i, byte[] bArr) {
        super(3, afckVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoh(afck afckVar, int i, char[] cArr) {
        super(3, afckVar);
        this.a = i;
    }
}
