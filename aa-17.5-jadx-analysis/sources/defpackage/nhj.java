package defpackage;

/* loaded from: classes.dex */
public final class nhj extends afde implements afeg {
    final /* synthetic */ boolean a;
    final /* synthetic */ bwq b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhj(bwq bwqVar, boolean z, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = bwqVar;
        this.a = z;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return this.c != 0 ? new nhj(this.b, this.a, afckVar, 1) : new nhj(this.a, (byd) this.b, afckVar, 0);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.c != 0) {
            woy.dF(obj);
            bwq bwqVar = this.b;
            if (((asi) bwqVar.a()) != null) {
                bwqVar.b(null);
            }
            return afak.a;
        }
        woy.dF(obj);
        if (!this.a) {
            ((byd) this.b).h(r1.e() - 1);
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((nhj) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((nhj) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhj(boolean z, byd bydVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = z;
        this.b = bydVar;
    }
}
