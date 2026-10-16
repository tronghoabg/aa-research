package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lee {
    public boolean d;
    private final defpackage.afhl e;
    private final defpackage.afhl f;
    private final defpackage.afar g;
    static final /* synthetic */ defpackage.afja[] b = {new defpackage.afgo(defpackage.lee.class, "flagEnabled", "getFlagEnabled(Lcom/google/android/gms/car/CarClientToken;)Z"), new defpackage.afgo(defpackage.lee.class, "hasTouchInput", "getHasTouchInput(Lcom/google/android/gms/car/CarClientToken;)Z")};
    public static final defpackage.led a = new defpackage.led();
    public static final defpackage.afhl c = new defpackage.kkv(defpackage.mkp.b, 5);

    public lee() {
        int i = 16;
        this.e = new defpackage.lib(new defpackage.dbj(this, i), new defpackage.lhu(false));
        this.f = new defpackage.lib(new defpackage.krx(i), new defpackage.lhu(false));
        this.g = new defpackage.afay(new defpackage.ksa(i));
    }

    public static final defpackage.lee a() {
        return a.a();
    }

    public final boolean b() {
        defpackage.yqm yqmVar = defpackage.kit.a;
        defpackage.kit kitVar = (defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class);
        try {
            if (!kitVar.r()) {
                return this.d;
            }
            defpackage.qsh qshVarE = kitVar.e();
            qshVarE.getClass();
            return c(qshVarE);
        } catch (java.lang.IllegalStateException | defpackage.qst unused) {
            return this.d;
        }
    }

    public final boolean c(defpackage.qsh qshVar) {
        qshVar.getClass();
        defpackage.afja<?>[] afjaVarArr = b;
        if (((java.lang.Boolean) this.e.getValue(qshVar, afjaVarArr[0])).booleanValue()) {
            return ((java.lang.Boolean) this.g.a()).booleanValue() || ((java.lang.Boolean) this.f.getValue(qshVar, afjaVarArr[1])).booleanValue();
        }
        return false;
    }

    public final boolean d(defpackage.qsh qshVar) {
        defpackage.mkp.a.g();
        return qshVar.a().p(defpackage.rbf.Z);
    }
}
