package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ajve {
    public final java.lang.String a;
    public final int b;

    public ajve(java.lang.String str, int i) {
        defpackage.aguw.e(str, "Value");
        this.a = str;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Type may not be negative or zero");
        }
        this.b = i;
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
