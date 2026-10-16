package defpackage;

/* loaded from: classes2.dex */
public final class mmi extends erm {
    public final eqj a;
    private final eqj b;

    public mmi() {
        oix oixVar;
        oiv oivVarA = oiv.a();
        synchronized (oivVarA) {
            if (oivVarA.c == null) {
                oivVarA.c = new oix(oivVarA.a, oivVarA.b());
            }
            oixVar = oivVarA.c;
        }
        int i = yfq.d;
        eqj eqjVarB = eqy.b(oixVar, new mcm(yls.a, 12));
        this.b = eqjVarB;
        this.a = eqy.b(eqjVarB, new mii(4));
    }
}
