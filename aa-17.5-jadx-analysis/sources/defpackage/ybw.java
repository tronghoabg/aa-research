package defpackage;

/* loaded from: classes3.dex */
abstract class ybw implements ylq {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ylq) {
            return a().equals(((ylq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
