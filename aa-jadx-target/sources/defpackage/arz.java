package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class arz implements defpackage.arl {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public arz(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [aej, java.lang.Object] */
    @Override // defpackage.arl
    public final /* synthetic */ java.lang.Object a(defpackage.apw apwVar, java.lang.Object obj, java.lang.Object obj2, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        if (this.a != 0) {
            java.lang.Object objAn = defpackage.asq.an(apwVar, ((java.lang.Number) obj).floatValue(), defpackage.ca.B(0.0f, ((java.lang.Number) obj2).floatValue()), (defpackage.kwv) this.b, affcVar, afdkVar);
            return objAn == defpackage.afdr.a ? objAn : (defpackage.bil) objAn;
        }
        float fFloatValue = ((java.lang.Number) obj).floatValue();
        float fFloatValue2 = ((java.lang.Number) obj2).floatValue();
        java.lang.Object objL = defpackage.asq.l(apwVar, java.lang.Math.abs(fFloatValue) * java.lang.Math.signum(fFloatValue2), fFloatValue, defpackage.ca.B(0.0f, fFloatValue2), this.b, affcVar, afdkVar);
        return objL == defpackage.afdr.a ? objL : (defpackage.bil) objL;
    }
}
