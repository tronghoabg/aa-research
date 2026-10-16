package defpackage;

/* loaded from: classes2.dex */
public final class gin extends afde implements afeg {
    int a;
    int b;
    final /* synthetic */ afdr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gin(afdr afdrVar, afck afckVar) {
        super(2, afckVar);
        this.c = afdrVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new gin(this.c, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i;
        afcr afcrVar = afcr.a;
        if (this.b != 0) {
            i = this.a;
            woy.dF(obj);
        } else {
            woy.dF(obj);
            i = 0;
        }
        while (i < 3 && !((Boolean) this.c.invoke()).booleanValue()) {
            i++;
            this.a = i;
            this.b = 1;
            if (aiow.c(100L, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gin) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
