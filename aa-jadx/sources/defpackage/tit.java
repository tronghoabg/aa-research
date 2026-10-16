package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tit extends defpackage.tiv {
    private final defpackage.affh a;

    public tit(defpackage.affh affhVar) {
        this.a = affhVar;
    }

    @Override // defpackage.tiv
    public final void a(defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1261855081);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            this.a.invoke(defpackage.tjj.a, bveVarC, 6);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nlu(this, i, 9);
        }
    }
}
