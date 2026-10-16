package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xvj extends defpackage.xvk implements defpackage.xvi {
    public static final defpackage.xvk a = new defpackage.xvj(null, new defpackage.aba(0)).e();
    static final defpackage.xvk b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        defpackage.xvi xviVarB = defpackage.xvk.b();
        xviVarB.a(defpackage.xvk.e, java.lang.Boolean.TRUE);
        b = ((defpackage.xvk) xviVarB).e();
    }

    @Override // defpackage.xvi
    public final void a(defpackage.ysr ysrVar, java.lang.Object obj) {
        defpackage.ysr.bk(!this.d, "Can't mutate after handing to trace");
        defpackage.ysr.bk(!h(ysrVar), "Key already present");
        this.c.put(ysrVar, obj);
    }
}
