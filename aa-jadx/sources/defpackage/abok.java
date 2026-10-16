package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class abok {
    private final java.lang.Object a;
    private final int b;

    public abok(java.lang.Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.abok)) {
            return false;
        }
        defpackage.abok abokVar = (defpackage.abok) obj;
        return this.a == abokVar.a && this.b == abokVar.b;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.a) * 65535) + this.b;
    }
}
