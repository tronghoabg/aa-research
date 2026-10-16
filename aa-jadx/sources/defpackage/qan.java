package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qan implements java.io.Serializable {
    private final int a;

    public qan(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof defpackage.qan) && this.a == ((defpackage.qan) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final java.lang.String toString() {
        return "{" + this.a + "}";
    }

    protected qan() {
        throw null;
    }
}
