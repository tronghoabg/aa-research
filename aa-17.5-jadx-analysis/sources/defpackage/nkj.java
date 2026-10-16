package defpackage;

/* loaded from: classes2.dex */
public final class nkj extends afde implements afeg {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkj(byd bydVar, int i, afck afckVar, int i2) {
        super(2, afckVar);
        this.c = i2;
        this.b = bydVar;
        this.a = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.c;
        Object obj2 = this.b;
        if (i != 0) {
            return new nkj((byd) obj2, this.a, afckVar, 1);
        }
        return new nkj((not) obj2, this.a, afckVar, 0);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.c != 0) {
            woy.dF(obj);
            ((byd) this.b).h(this.a);
            return afak.a;
        }
        woy.dF(obj);
        nkl.a.l().K("Displaying Direction: %s at index %s", this.b, this.a);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((nkj) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((nkj) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkj(not notVar, int i, afck afckVar, int i2) {
        super(2, afckVar);
        this.c = i2;
        this.b = notVar;
        this.a = i;
    }
}
