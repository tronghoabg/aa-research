package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yml extends defpackage.ymi implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.lang.Object a;
    private final int b;

    public yml(java.lang.Object obj, int i) {
        this.a = obj;
        this.b = i;
        defpackage.ysr.aL(i, "count");
    }

    @Override // defpackage.ymg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ymg
    public final java.lang.Object b() {
        return this.a;
    }
}
