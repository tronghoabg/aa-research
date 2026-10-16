package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mwz implements defpackage.affc {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ defpackage.bys c;
    public final /* synthetic */ defpackage.bys d;
    private final /* synthetic */ int e;

    public /* synthetic */ mwz(long j, float f, defpackage.bys bysVar, defpackage.bys bysVar2, int i) {
        this.e = i;
        this.a = j;
        this.b = f;
        this.c = bysVar;
        this.d = bysVar2;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        if (this.e == 0) {
            defpackage.cxn cxnVar = (defpackage.cxn) obj;
            cxnVar.getClass();
            cxnVar.q();
            defpackage.bys bysVar = this.c;
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(cxnVar.dI(((defpackage.dlr) bysVar.a()).a));
            float f = ((defpackage.dlr) this.d.a()).a - ((defpackage.dlr) bysVar.a()).a;
            float f2 = this.b;
            long jDP = cxnVar.dP(defpackage.tna.aK(f2, f + 0.0f));
            float fDI = cxnVar.dI(f2);
            defpackage.dai.T(cxnVar, this.a, jFloatToRawIntBits & 4294967295L, jDP, (((long) java.lang.Float.floatToRawIntBits(fDI)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fDI)) & 4294967295L), 0.0f, 240);
            return defpackage.afbk.a;
        }
        defpackage.cxn cxnVar2 = (defpackage.cxn) obj;
        cxnVar2.getClass();
        cxnVar2.q();
        defpackage.bys bysVar2 = this.c;
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(cxnVar2.dI(((defpackage.dlr) bysVar2.a()).a));
        float f3 = (((defpackage.dlr) this.d.a()).a - ((defpackage.dlr) bysVar2.a()).a) + 0.0f;
        float f4 = this.b;
        long jDP2 = cxnVar2.dP(defpackage.tna.aK(f3, f4));
        float fDI2 = cxnVar2.dI(f4);
        defpackage.dai.T(cxnVar2, this.a, jFloatToRawIntBits2 << 32, jDP2, (((long) java.lang.Float.floatToRawIntBits(fDI2)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fDI2) << 32), 0.0f, 240);
        return defpackage.afbk.a;
    }
}
