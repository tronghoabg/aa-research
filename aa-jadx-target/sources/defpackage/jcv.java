package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jcv implements defpackage.jcw {
    public static final defpackage.jcu a = new defpackage.jcu(java.nio.ByteBuffer.allocateDirect(0), null, false);
    public static final defpackage.jcu b = new defpackage.jcu(java.nio.ByteBuffer.allocate(0), null, false);
    public final defpackage.ygw c;
    public final boolean d;
    public final boolean e;
    public final defpackage.yxx f;
    public final defpackage.yqm g;

    private jcv(defpackage.ygw ygwVar, boolean z, boolean z2, defpackage.yxx yxxVar) {
        this.c = ygwVar;
        this.d = z;
        this.f = yxxVar;
        this.e = z2;
        defpackage.yqm yqmVar = new defpackage.yqm(defpackage.yrs.d("CAR.".concat(java.lang.String.valueOf(yxxVar.name()))));
        this.g = yqmVar;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1886)).M("Initializing %s buffer pools with %s buffers", true != ygwVar.isEmpty() ? "managed" : "unmanaged", true != z ? "heap" : "direct");
    }

    public static synchronized defpackage.jcv a(java.util.List list, boolean z, boolean z2, defpackage.yxx yxxVar, defpackage.jcx jcxVar) {
        defpackage.ygr ygrVar;
        ygrVar = new defpackage.ygr(4);
        int i = 0;
        while (i < list.size()) {
            defpackage.ysr.cW(i);
            if (i >= 31) {
                throw new java.lang.ArithmeticException(defpackage.a.bm(i, "overflow: checkedPow(2, ", ")"));
            }
            boolean z3 = z;
            defpackage.yxx yxxVar2 = yxxVar;
            defpackage.jcx jcxVar2 = jcxVar;
            ygrVar.i(new defpackage.jcs(1 << i, ((java.lang.Integer) list.get(i)).intValue(), z3, yxxVar2, jcxVar2));
            i++;
            z = z3;
            yxxVar = yxxVar2;
            jcxVar = jcxVar2;
        }
        return new defpackage.jcv(ygrVar.g(), z, z2, yxxVar);
    }
}
