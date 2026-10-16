package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bjv implements defpackage.affc {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bjv(defpackage.afer aferVar, boolean z, defpackage.cjr cjrVar, defpackage.cke ckeVar, int i) {
        this.e = i;
        this.b = aferVar;
        this.a = z;
        this.d = cjrVar;
        this.c = ckeVar;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        if (this.e != 0) {
            boolean z = this.a;
            ((defpackage.cuw) obj).w(new defpackage.bbg((java.util.List) this.c, (java.util.List) this.b, z, 1));
            this.d.a();
            return defpackage.afbk.a;
        }
        defpackage.cxn cxnVar = (defpackage.cxn) obj;
        cxnVar.q();
        if (((java.lang.Boolean) this.b.invoke()).booleanValue()) {
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.d;
            if (this.a) {
                long jN = cxnVar.n();
                defpackage.cmi cmiVarR = cxnVar.r();
                long jA = cmiVarR.a();
                cmiVarR.b().g();
                try {
                    cmiVarR.c.k(-1.0f, 1.0f, jN);
                    defpackage.dai.W(cxnVar, (defpackage.cjr) obj3, 0L, 0.0f, (defpackage.cke) obj2, 0, 46);
                } finally {
                    cmiVarR.b().e();
                    cmiVarR.h(jA);
                }
            } else {
                defpackage.dai.W(cxnVar, (defpackage.cjr) obj3, 0L, 0.0f, (defpackage.cke) obj2, 0, 46);
            }
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ bjv(defpackage.bwx bwxVar, java.util.List list, java.util.List list2, boolean z, int i) {
        this.e = i;
        this.d = bwxVar;
        this.c = list;
        this.b = list2;
        this.a = z;
    }
}
