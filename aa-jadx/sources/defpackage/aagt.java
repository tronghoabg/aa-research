package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aagt implements defpackage.aair {
    public static final java.lang.String a = "aagt";
    final int[] b;
    public final java.util.Stack c;
    public final defpackage.aais d;
    public boolean e;

    public aagt() {
        defpackage.aagv aagvVar = defpackage.aagv.a;
        java.lang.String.format("illegal cacheSize: %s", 16);
        int[] iArr = new int[16];
        this.b = iArr;
        java.util.Arrays.fill(iArr, 0);
        this.c = new java.util.Stack();
        this.d = new defpackage.aais(this);
        this.e = false;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final java.lang.Integer a(java.lang.Object obj) {
        defpackage.zlv.n(obj, "key");
        return (java.lang.Integer) this.d.get(obj);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("pool|unused|active: %s => %s => %s", java.util.Arrays.toString(this.b), this.c, this.d);
    }
}
