package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class odx {
    private final int a;
    private final defpackage.xzi b;
    private final int c;
    private final defpackage.zbe d;
    private final boolean e;
    private final defpackage.acbk f;

    public odx(int i, int i2, boolean z, defpackage.acbk acbkVar, defpackage.zbe zbeVar) {
        this.a = i;
        this.b = new defpackage.joi(8);
        this.c = i2;
        this.d = zbeVar;
        this.e = z;
        this.f = acbkVar;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final odl a(odj odjVar, ngx ngxVar) {
        java.lang.String str = (java.lang.String) this.b.fF();
        if (str == null) {
            int i = this.a;
            int i2 = this.c;
            defpackage.ocx ocxVar = odjVar.c;
            android.content.Context contextC = ocxVar.c();
            if (i2 != 0) {
                odjVar.c(contextC.getText(i), contextC.getDrawable(i2));
            } else {
                odjVar.b(ocxVar.c().getText(i));
            }
        } else {
            int i3 = this.c;
            android.content.Context contextC2 = odjVar.c.c();
            if (i3 != 0) {
                odjVar.c(str, contextC2.getDrawable(i3));
            } else {
                odjVar.b(str);
            }
        }
        odjVar.g = this.d;
        defpackage.ngy.g().i(ngxVar);
        defpackage.omf.u().n(java.util.Collections.singletonList(this.f));
        int i4 = 0;
        try {
            boolean z = this.e;
            if (odjVar.g == defpackage.zbe.UNKNOWN_CONTEXT) {
                throw new java.lang.IllegalStateException("Tooltip.Builder.setTelemetryContext(UiContext) must be called before showing.");
            }
            odr odrVar = odjVar.h;
            if (odrVar == odj.a) {
                throw new java.lang.IllegalStateException("No view has been set for this tooltip builder");
            }
            if (z) {
                odjVar.a(defpackage.zbd.lN);
                odi odiVar = new odi(odjVar.g);
                odk odkVar = odjVar.f;
                if (odkVar != null) {
                    odjVar.c.h(new defpackage.ocy(odkVar, i4));
                }
                return odiVar;
            }
            defpackage.nrr nrrVarA = defpackage.nrr.a();
            boolean z2 = (nrrVarA.c() || nrrVarA.e()) ? false : true;
            defpackage.mkp.a.g();
            defpackage.sax saxVarU = defpackage.oml.u(defpackage.kit.b().e());
            odg odgVar = new odg();
            odjVar.c.e(new ocz(odjVar, saxVarU, odrVar, z2));
            return odgVar;
        } catch (defpackage.qst | defpackage.qsu e) {
            defpackage.rox.p("GH.TooltipPresenter", e, "Unable to show tooltip", new java.lang.Object[0]);
            return null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.odx)) {
            return false;
        }
        defpackage.odx odxVar = (defpackage.odx) obj;
        return this.a == odxVar.a && this.c == odxVar.c && this.e == odxVar.e && j$.util.Objects.equals(this.b.fF(), odxVar.b.fF()) && this.d == odxVar.d && this.f == odxVar.f;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b, java.lang.Integer.valueOf(this.c), this.d, java.lang.Boolean.valueOf(this.e), this.f});
    }

    public odx(defpackage.xzi xziVar, int i, boolean z, defpackage.acbk acbkVar, defpackage.zbe zbeVar) {
        this.a = 0;
        this.b = xziVar;
        this.c = i;
        this.d = zbeVar;
        this.e = z;
        this.f = acbkVar;
    }

    public odx(java.lang.String str, int i, boolean z, defpackage.acbk acbkVar, defpackage.zbe zbeVar) {
        this((defpackage.xzi) new inr(str, 10), i, z, acbkVar, zbeVar);
    }
}
