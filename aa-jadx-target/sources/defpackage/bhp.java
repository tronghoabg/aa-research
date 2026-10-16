package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bhp implements defpackage.bht {
    private final defpackage.affj a;
    private final defpackage.bil c = new defpackage.bil((byte[]) null, (char[]) null);
    private final defpackage.bwx b = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);

    public bhp(defpackage.affj affjVar) {
        this.a = affjVar;
    }

    public final defpackage.bho a() {
        return (defpackage.bho) this.b.a();
    }

    @Override // defpackage.bht
    public final java.lang.Object b(defpackage.bhs bhsVar, defpackage.afdk afdkVar) {
        java.lang.Object objR = this.c.r(defpackage.akv.a, new defpackage.bgj(this, new defpackage.bho(bhsVar), (defpackage.afdk) null, 2), afdkVar);
        return objR == defpackage.afdr.a ? objR : defpackage.afbk.a;
    }

    public final void c(defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.afer aferVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(723898654);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(aferVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(this) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.bho bhoVarA = a();
            if (bhoVarA == null) {
                defpackage.bxl bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.agg(this, aferVar, i, 16);
                    return;
                }
                return;
            }
            aferVar2 = aferVar;
            this.a.invoke(bhoVarA, bhoVarA.a, aferVar2, bveVarC, java.lang.Integer.valueOf((i2 << 6) & 896));
        } else {
            aferVar2 = aferVar;
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ2 = bveVarC.J();
        if (bxlVarJ2 != null) {
            bxlVarJ2.c = new defpackage.agg(this, aferVar2, i, 17);
        }
    }

    public final void d(defpackage.bho bhoVar) {
        this.b.b(bhoVar);
    }
}
