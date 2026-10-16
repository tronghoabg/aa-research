package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bfd implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bfd(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v23, types: [bhs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29, types: [bgb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [cwm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v39, types: [cwn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v42, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v46, types: [cwn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v60, types: [cwn, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Boolean.valueOf(((defpackage.bff) this.a).b() > 0.0f);
            case 1:
                defpackage.bff bffVar = (defpackage.bff) this.a;
                return java.lang.Boolean.valueOf(bffVar.b() < bffVar.a());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.bfk bfkVar = (defpackage.bfk) this.a;
                defpackage.dfb dfbVar = bfkVar.b;
                defpackage.dga dgaVarA = bfkVar.a();
                return java.lang.Boolean.valueOf(defpackage.afga.f(dfbVar, dgaVarA != null ? dgaVarA.a.a : null));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.dlw(((defpackage.dlx) this.a).d());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return this.a.b();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.ctc ctcVar = (defpackage.ctc) this.a.a();
                if (ctcVar != null) {
                    return ctcVar;
                }
                defpackage.asq.b("Required value was null.");
                throw new defpackage.afap();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i = defpackage.bgq.a;
                this.a.a();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ctc ctcVar2 = (defpackage.ctc) this.a.a();
                if (ctcVar2 != null) {
                    return ctcVar2;
                }
                defpackage.asq.b("Required value was null.");
                throw new defpackage.afap();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ?? r4 = this.a;
                defpackage.bhd bhdVar = (defpackage.bhd) r4;
                bhdVar.b.b((android.content.res.Configuration) defpackage.cjv.y(r4, defpackage.daj.a));
                bhdVar.c.b((android.content.Context) defpackage.cjv.y(r4, defpackage.daj.b));
                return defpackage.afbk.a;
            case 9:
                ?? r5 = this.a;
                return ((defpackage.cge) r5).A ? defpackage.axd.T(r5) : defpackage.bfx.a;
            case 10:
                defpackage.ctc ctcVar3 = (defpackage.ctc) this.a.a();
                if (ctcVar3 != null) {
                    return ctcVar3;
                }
                defpackage.asq.b("Required value was null.");
                throw new defpackage.afap();
            case 11:
                defpackage.cjv.v(this.a);
                return defpackage.afbk.a;
            case 12:
                ((defpackage.bih) this.a).f.j(true);
                return java.lang.Boolean.TRUE;
            case 13:
                ((defpackage.bih) this.a).f.y(true);
                return java.lang.Boolean.TRUE;
            case 14:
                ((defpackage.bih) this.a).f.z();
                return java.lang.Boolean.TRUE;
            case 15:
                defpackage.cjv.v(this.a);
                return defpackage.afbk.a;
            case 16:
                ((defpackage.bih) this.a).f.A();
                return java.lang.Boolean.TRUE;
            case 17:
                defpackage.bih bihVar = (defpackage.bih) this.a;
                bihVar.c.n.invoke(new defpackage.djk(bihVar.g.f));
                return java.lang.Boolean.TRUE;
            case 18:
                defpackage.bih bihVar2 = (defpackage.bih) this.a;
                defpackage.asq.ak(bihVar2.c, bihVar2.h);
                return java.lang.Boolean.TRUE;
            case 19:
                java.lang.Object systemService = ((android.view.View) ((defpackage.bil) this.a).a).getContext().getSystemService("input_method");
                systemService.getClass();
                return (android.view.inputmethod.InputMethodManager) systemService;
            default:
                return new android.view.inputmethod.BaseInputConnection(((defpackage.bis) this.a).a, false);
        }
    }
}
