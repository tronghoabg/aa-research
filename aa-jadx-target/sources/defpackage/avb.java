package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class avb implements defpackage.affc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ avb(int i, defpackage.cux cuxVar, int i2, int i3) {
        this.d = i3;
        this.a = i;
        this.c = cuxVar;
        this.b = i2;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.d;
        if (i == 0) {
            ((defpackage.cuw) obj).r((defpackage.cux) this.c, this.a, this.b, 0.0f);
            return defpackage.afbk.a;
        }
        if (i == 1) {
            int i2 = this.b;
            ((defpackage.cuw) obj).y((defpackage.cux) this.c, this.a, i2, defpackage.cuy.a);
            return defpackage.afbk.a;
        }
        if (i == 2) {
            ((defpackage.cuw) obj).r((defpackage.cux) this.c, this.a, this.b, 0.0f);
            return defpackage.afbk.a;
        }
        if (i == 3) {
            defpackage.cux cuxVar = (defpackage.cux) this.c;
            ((defpackage.cuw) obj).r(cuxVar, defpackage.afhi.k((this.a - cuxVar.a) / 2.0f), defpackage.afhi.k((this.b - cuxVar.b) / 2.0f), 0.0f);
            return defpackage.afbk.a;
        }
        if (i != 4) {
            defpackage.cuw cuwVar = (defpackage.cuw) obj;
            defpackage.yqm yqmVar = defpackage.nif.a;
            cuwVar.getClass();
            defpackage.cux cuxVar2 = (defpackage.cux) this.c;
            cuwVar.x(cuxVar2, (this.a - cuxVar2.a) / 2, (this.b - cuxVar2.b) / 2);
            return defpackage.afbk.a;
        }
        defpackage.dfk dfkVar = (defpackage.dfk) obj;
        defpackage.deu deuVar = dfkVar.g;
        int iE = dfkVar.e(this.a);
        int iE2 = dfkVar.e(this.b);
        if (iE < 0 || iE > iE2 || iE2 > deuVar.c.length()) {
            defpackage.dki.c("start(" + iE + ") or end(" + iE2 + ") is out of range [0.." + deuVar.c.length() + "], or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        defpackage.dgp dgpVar = deuVar.b;
        dgpVar.d.getSelectionPath(iE, iE2, path);
        int i3 = dgpVar.f;
        if (i3 != 0 && !path.isEmpty()) {
            path.offset(0.0f, i3);
        }
        java.lang.Object obj2 = this.c;
        defpackage.cju cjuVar = new defpackage.cju(path);
        cjuVar.n(((long) java.lang.Float.floatToRawIntBits(dfkVar.e)) & 4294967295L);
        ((defpackage.cju) obj2).p(cjuVar);
        return defpackage.afbk.a;
    }

    public /* synthetic */ avb(java.lang.Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }
}
