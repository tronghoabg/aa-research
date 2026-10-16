package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ejh {
    private final java.lang.Object a;
    private final int b;

    public ejh(java.lang.Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ejh)) {
            return false;
        }
        defpackage.ejh ejhVar = (defpackage.ejh) obj;
        return this.a == ejhVar.a && this.b == ejhVar.b;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.a) * 65535) + this.b;
    }
}
