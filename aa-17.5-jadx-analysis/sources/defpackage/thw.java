package defpackage;

/* loaded from: classes3.dex */
public final class thw extends thx {
    public static final aezr a;
    public final tjk b;

    static {
        woy.dG(new nqy(16));
        a = woy.dG(new nqy(17));
        woy.dG(new nqy(18));
        woy.dG(new nqy(19));
    }

    public thw(tjk tjkVar) {
        this.b = tjkVar;
    }

    @Override // defpackage.thx
    public final void a(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(140837259);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            int i4 = i2 & 14;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i4 == 4 || objS == buw.a) {
                objS = new ooq(this, 20);
                bvvVar.ad(objS);
            }
            afdr afdrVar = (afdr) objS;
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.d(buxVarC, this.b, new gcl(9));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nqo(this, i, 9);
        }
    }
}
