package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class ydc implements defpackage.ymv {
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ymv) {
            return a().equals(((defpackage.ymv) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final java.lang.String toString() {
        return a().toString();
    }
}
