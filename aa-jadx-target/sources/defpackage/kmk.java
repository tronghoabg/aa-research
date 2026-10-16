package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class kmk extends defpackage.kmi {
    private final defpackage.cit a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmk(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new defpackage.cit();
        setFocusable(false);
    }

    public abstract void l(defpackage.bve bveVar, int i);

    @Override // defpackage.kmi
    public final void q(defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1076790593);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(this) : bveVarC.E(this)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.ciu ciuVar = new defpackage.ciu(this.a);
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            long j = bwcVar.u;
            long j2 = j ^ (j >>> 32);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, ciuVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            l(bveVarC, i2 & 14);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jty(this, i, 5);
        }
    }

    @Override // defpackage.kmi, defpackage.rba
    public final boolean s(android.view.View view, int i, android.graphics.Rect rect) {
        if (view.requestFocus(i, null)) {
            return true;
        }
        this.a.a(7);
        return true;
    }

    @Override // defpackage.kmi, defpackage.rba
    public final boolean u(android.view.View view) {
        this.a.a(7);
        return true;
    }

    @Override // defpackage.kmi
    protected final defpackage.bxk[] w() {
        return new defpackage.bxk[]{defpackage.gbp.a.b(defpackage.lfx.a.a())};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kmk(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kmk(android.content.Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ kmk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, defpackage.affu affuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
