package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aduq extends defpackage.adxt {
    private boolean b;
    private final defpackage.ador c;
    private final defpackage.adtj d;
    private final defpackage.adkb[] e;

    public aduq(defpackage.ador adorVar, defpackage.adtj adtjVar, defpackage.adkb[] adkbVarArr) {
        defpackage.ysr.aY(!adorVar.g(), "error must not be OK");
        this.c = adorVar;
        this.d = adtjVar;
        this.e = adkbVarArr;
    }

    @Override // defpackage.adxt
    public final void b(defpackage.advl advlVar) {
        advlVar.b("error", this.c);
        advlVar.b("progress", this.d);
    }

    @Override // defpackage.adxt
    public final void m(adtk adtkVar) {
        defpackage.ysr.bk(!this.b, "already started");
        this.b = true;
        int i = 0;
        while (true) {
            defpackage.adkb[] adkbVarArr = this.e;
            if (i >= adkbVarArr.length) {
                adtkVar.a(this.c, this.d, new defpackage.adnd());
                return;
            } else {
                defpackage.adkb adkbVar = adkbVarArr[i];
                i++;
            }
        }
    }

    public aduq(defpackage.ador adorVar, defpackage.adkb[] adkbVarArr) {
        this(adorVar, defpackage.adtj.a, adkbVarArr);
    }
}
