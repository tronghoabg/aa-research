package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rpu implements defpackage.rpv {
    private final defpackage.yhe a;

    public rpu(defpackage.mku mkuVar) {
        this.a = defpackage.ysr.F(((defpackage.yha) mkuVar.b).d(true));
        defpackage.ysr.F(((defpackage.yha) mkuVar.a).d(true));
        defpackage.ysr.F(((defpackage.yha) mkuVar.c).d(true));
        defpackage.ysr.F(((defpackage.yha) mkuVar.d).d(true));
    }

    @Override // defpackage.rpv
    public final boolean K(defpackage.rpt rptVar) {
        java.lang.Boolean bool = (java.lang.Boolean) this.a.get(rptVar);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new java.lang.IllegalStateException(defpackage.a.bU(rptVar, "No flag value was set for key: ", "!"));
    }
}
