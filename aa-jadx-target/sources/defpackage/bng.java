package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bng implements defpackage.affg {
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bng(long j, defpackage.affg affgVar, int i) {
        this.c = i;
        this.a = j;
        this.b = affgVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [affi, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.c;
        if (i == 0) {
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            return bnj.a(this.a, (defpackage.affg) this.b, (defpackage.bve) obj, iIntValue);
        }
        if (i == 1) {
            int iIntValue2 = ((java.lang.Integer) obj2).intValue();
            return bnj.a(this.a, (defpackage.affg) this.b, (defpackage.bve) obj, iIntValue2);
        }
        defpackage.bve bveVar = (defpackage.bve) obj;
        int iIntValue3 = ((java.lang.Integer) obj2).intValue();
        int i2 = iIntValue3 & 3;
        if (bveVar.I(i2 != 2, iIntValue3 & 1)) {
            long j = this.a;
            this.b.invoke(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))), bveVar, 0);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ bng(defpackage.affi affiVar, long j, int i) {
        this.c = i;
        this.b = affiVar;
        this.a = j;
    }
}
