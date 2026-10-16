package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ldf {
    public static final defpackage.lde a = new defpackage.lde();
    public static final defpackage.yqm b = defpackage.yqm.c("GH.CsatRunner");
    public static final defpackage.afhl c = new defpackage.lco(defpackage.afga.bZ(new defpackage.mko[]{defpackage.mko.b, defpackage.mko.a}), 4);
    public final defpackage.ldd d;
    public final defpackage.afhs e;

    public /* synthetic */ ldf(byte[] bArr) {
        defpackage.ldd lddVar = (defpackage.ldd) defpackage.ldd.c.getValue(defpackage.ldd.a, defpackage.ldb.a[0]);
        defpackage.afhr afhrVar = defpackage.afhs.a;
        afhrVar.getClass();
        this.d = lddVar;
        this.e = afhrVar;
    }

    public static final defpackage.ldf a() {
        return a.a();
    }

    public final void b(defpackage.lby lbyVar) {
        lbyVar.getClass();
        b.l().y("Survey %s: display resource not available", lbyVar.name());
        defpackage.jzl.g(lbyVar, defpackage.zbd.FN);
    }

    public final void c(defpackage.lby lbyVar, ldk ldkVar) {
        lbyVar.getClass();
        b.l().M("Survey %s: user response was %s", lbyVar.name(), ldkVar.a().sn);
        defpackage.jzl.g(lbyVar, ldkVar.a());
        if ((ldkVar instanceof ldh) || (ldkVar instanceof ldg)) {
            defpackage.ldd lddVar = this.d;
            if (defpackage.acqq.c()) {
                defpackage.ldd.a(lddVar.e.E(new lcz(lbyVar)));
            } else {
                defpackage.ldd.a(lddVar.d.a(new defpackage.iku(new defpackage.kwz(lbyVar, 9), 12), defpackage.zgt.INSTANCE));
            }
        }
    }

    public ldf() {
        this(null);
    }
}
