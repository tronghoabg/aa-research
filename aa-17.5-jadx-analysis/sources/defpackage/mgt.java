package defpackage;

/* loaded from: classes.dex */
public final class mgt implements epy {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public mgt(epf epfVar, epy epyVar, int i) {
        this.a = i;
        this.c = epfVar;
        this.b = epyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [epf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [epf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [epf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [epf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [epf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [epf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mgm] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, mgm] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, mgu] */
    /* JADX WARN: Type inference failed for: r2v4, types: [epy, java.lang.Object] */
    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        if (this.a == 0) {
            mfl mflVarA = ((mfm) mki.a.i(mfm.class)).a();
            epr eprVar2 = epr.ON_CREATE;
            mfp mfpVar = (mfp) mflVarA;
            mgn mgnVar = mfpVar.b;
            if (eprVar != eprVar2) {
                if (eprVar == epr.ON_DESTROY) {
                    mgnVar.c(this.c);
                    return;
                }
                return;
            } else if (mfpVar.c != null) {
                mgnVar.b(this.c);
                return;
            } else {
                ((ype) ((ype) mgv.a.h()).ai((char) 4903)).u("Session is null at ON_CREATE, finishing early");
                this.b.finish();
                return;
            }
        }
        switch (eprVar.ordinal()) {
            case 0:
                this.c.fv(eqaVar);
                break;
            case 1:
                this.c.fy(eqaVar);
                break;
            case 2:
                this.c.fx(eqaVar);
                break;
            case 3:
                this.c.fM();
                break;
            case 4:
                this.c.fL(eqaVar);
                break;
            case 5:
                this.c.fw(eqaVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not be sent by anybody");
            default:
                throw new aezs();
        }
        ?? r2 = this.b;
        if (r2 != 0) {
            r2.a(eqaVar, eprVar);
        }
    }

    public mgt(mgu mguVar, mgm mgmVar, int i) {
        this.a = i;
        this.b = mguVar;
        this.c = mgmVar;
    }
}
