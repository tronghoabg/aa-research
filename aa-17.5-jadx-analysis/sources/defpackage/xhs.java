package defpackage;

/* loaded from: classes.dex */
public final class xhs implements aboe {
    private final /* synthetic */ int a;

    public xhs(int i) {
        this.a = i;
    }

    @Override // defpackage.aboe
    public final /* synthetic */ Object a(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            xhp xhpVarB = xhp.b(i);
            return xhpVarB == null ? xhp.BLUETOOTH_PAIRING_UNAVAILABLE : xhpVarB;
        }
        if (i2 == 1) {
            zhp zhpVarB = zhp.b(i);
            return zhpVarB == null ? zhp.UNKNOWN : zhpVarB;
        }
        if (i2 == 2) {
            xji xjiVarB = xji.b(i);
            return xjiVarB == null ? xji.FEEDBACK_SELECT : xjiVarB;
        }
        if (i2 == 3) {
            xjk xjkVarB = xjk.b(i);
            return xjkVarB == null ? xjk.FUEL_TYPE_UNKNOWN : xjkVarB;
        }
        if (i2 == 4) {
            xjh xjhVarB = xjh.b(i);
            return xjhVarB == null ? xjh.EV_CONNECTOR_TYPE_UNKNOWN : xjhVarB;
        }
        if (i2 != 5) {
            abrg abrgVarB = abrg.b(i);
            return abrgVarB == null ? abrg.UNRECOGNIZED : abrgVarB;
        }
        xoq xoqVarB = xoq.b(i);
        return xoqVarB == null ? xoq.UI_ELEMENT_UNKNOWN : xoqVarB;
    }
}
