package defpackage;

/* loaded from: classes3.dex */
public final class thv extends thx {
    private final afeh a;

    public thv(afeh afehVar) {
        this.a = afehVar;
    }

    @Override // defpackage.thx
    public final void a(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1261855081);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            this.a.invoke(til.a, buxVarC, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nqo(this, i, 8);
        }
    }
}
