package defpackage;

/* loaded from: classes.dex */
public final class dcl implements epy {
    final /* synthetic */ aitx a;
    final /* synthetic */ bwz b;
    final /* synthetic */ bxn c;
    final /* synthetic */ affv d;

    public dcl(aitx aitxVar, bwz bwzVar, bxn bxnVar, affv affvVar) {
        this.a = aitxVar;
        this.b = bwzVar;
        this.c = bxnVar;
        this.d = affvVar;
    }

    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        aitf aitfVarA = null;
        switch (eprVar.ordinal()) {
            case 0:
                ahnc.d(this.a, null, 4, new dck(this.d, this.c, eqaVar, this, null), 1);
                return;
            case 1:
                bwz bwzVar = this.b;
                if (bwzVar != null) {
                    bwzVar.c();
                }
                bxn bxnVar = this.c;
                synchronized (bxnVar.c) {
                    if (bxnVar.i) {
                        bxnVar.i = false;
                        aitfVarA = bxnVar.A();
                    }
                }
                if (aitfVarA != null) {
                    aitfVarA.w(afak.a);
                    return;
                }
                return;
            case 2:
            case 3:
            case 6:
                return;
            case 4:
                this.c.D();
                return;
            case 5:
                this.c.B();
                return;
            default:
                throw new aezs();
        }
    }
}
