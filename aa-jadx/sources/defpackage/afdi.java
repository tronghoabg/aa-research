package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class afdi implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final defpackage.afdo[] a;

    public afdi(defpackage.afdo[] afdoVarArr) {
        this.a = afdoVarArr;
    }

    private final java.lang.Object readResolve() {
        defpackage.afdo afdoVarPlus = defpackage.afdp.a;
        int i = 0;
        while (true) {
            defpackage.afdo[] afdoVarArr = this.a;
            if (i >= afdoVarArr.length) {
                return afdoVarPlus;
            }
            afdoVarPlus = afdoVarPlus.plus(afdoVarArr[i]);
            i++;
        }
    }
}
