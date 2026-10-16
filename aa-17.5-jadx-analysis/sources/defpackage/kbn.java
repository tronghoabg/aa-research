package defpackage;

/* loaded from: classes2.dex */
public final class kbn implements ghe, epf {
    public final lzc a;
    final lis b = new lim(this, 1);
    final lit c = new lyq(this, 1);

    static {
        yph.c("CarApp.H");
    }

    public kbn(lzc lzcVar) {
        this.a = lzcVar;
    }

    public static gsn h(lir lirVar) {
        int iOrdinal = lirVar.ordinal();
        if (iOrdinal == 0) {
            return gsn.k;
        }
        if (iOrdinal == 1) {
            return gsn.j;
        }
        if (iOrdinal == 2) {
            return gsn.l;
        }
        throw new RuntimeException(null, null);
    }

    @Override // defpackage.epf
    public final void fM() {
        this.a.m();
        liu liuVarC = lbh.c();
        liuVarC.p(this.c);
        liuVarC.o(this.b);
    }

    @Override // defpackage.epf
    public final void fx(eqa eqaVar) {
        liu liuVarC = lbh.c();
        liuVarC.j(this.b);
        liuVarC.k(this.c);
        this.a.l();
    }

    @Override // defpackage.ghe
    public final void g(gsn gsnVar) {
        int iOrdinal = gsnVar.ordinal();
        if (iOrdinal != 4 && iOrdinal != 5) {
            switch (iOrdinal) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    this.a.k(gsnVar, yzz.APP_HOST_CONTEXT);
                    break;
            }
            return;
        }
        this.a.k(gsnVar, yzz.APP_HOST_CONTEXT);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fL(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }
}
