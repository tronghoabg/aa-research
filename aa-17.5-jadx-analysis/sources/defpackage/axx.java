package defpackage;

/* loaded from: classes.dex */
public final class axx extends afde implements afeg {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axx(axr axrVar, int i, afck afckVar, int i2) {
        super(2, afckVar);
        this.e = i2;
        this.c = axrVar;
        this.b = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.e;
        Object obj2 = this.c;
        if (i != 0) {
            axx axxVar = new axx((axr) obj2, this.b, afckVar, 1);
            axxVar.d = obj;
            return axxVar;
        }
        axx axxVar2 = new axx((axz) obj2, this.b, afckVar, 0);
        axxVar2.d = obj;
        return axxVar2;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.e != 0) {
            afcr afcrVar = afcr.a;
            int i = this.a;
            woy.dF(obj);
            if (i == 0) {
                apr aprVar = (apr) this.d;
                Object obj2 = this.c;
                axv axvVar = new axv(aprVar, obj2, 1);
                int i2 = this.b;
                dlg dlgVarD = ((axr) obj2).d();
                this.a = 1;
                if (awx.k(axvVar, i2, 100, dlgVarD, this) == afcrVar) {
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
            apr aprVar2 = (apr) this.d;
            Object obj3 = this.c;
            axv axvVar2 = new axv(aprVar2, obj3, 0);
            int i3 = this.b;
            bwq bwqVar = ((axz) obj3).a;
            dlg dlgVar = ((axu) bwqVar.a()).a;
            this.a = 1;
            if (awx.k(axvVar2, i3, 0, dlgVar, this) == afcrVar2) {
                return afcrVar2;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((axx) b((apr) obj, (afck) obj2)).hT(afak.a);
        }
        return ((axx) b((apr) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axx(axz axzVar, int i, afck afckVar, int i2) {
        super(2, afckVar);
        this.e = i2;
        this.c = axzVar;
        this.b = i;
    }
}
