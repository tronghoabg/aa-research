package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xit implements defpackage.abpg {
    private final /* synthetic */ int a;

    public xit(int i) {
        this.a = i;
    }

    @Override // defpackage.abpg
    public final /* synthetic */ java.lang.Object a(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            defpackage.xiq xiqVarB = defpackage.xiq.b(i);
            return xiqVarB == null ? defpackage.xiq.BLUETOOTH_PAIRING_UNAVAILABLE : xiqVarB;
        }
        if (i2 == 1) {
            defpackage.zir zirVarB = defpackage.zir.b(i);
            return zirVarB == null ? defpackage.zir.UNKNOWN : zirVarB;
        }
        if (i2 == 2) {
            defpackage.xkj xkjVarB = defpackage.xkj.b(i);
            return xkjVarB == null ? defpackage.xkj.FEEDBACK_SELECT : xkjVarB;
        }
        if (i2 == 3) {
            defpackage.xkl xklVarB = defpackage.xkl.b(i);
            return xklVarB == null ? defpackage.xkl.FUEL_TYPE_UNKNOWN : xklVarB;
        }
        if (i2 == 4) {
            defpackage.xki xkiVarB = defpackage.xki.b(i);
            return xkiVarB == null ? defpackage.xki.EV_CONNECTOR_TYPE_UNKNOWN : xkiVarB;
        }
        if (i2 != 5) {
            defpackage.absj absjVarB = defpackage.absj.b(i);
            return absjVarB == null ? defpackage.absj.UNRECOGNIZED : absjVarB;
        }
        defpackage.xpr xprVarB = defpackage.xpr.b(i);
        return xprVarB == null ? defpackage.xpr.UI_ELEMENT_UNKNOWN : xprVarB;
    }
}
