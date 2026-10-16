package defpackage;

/* loaded from: classes.dex */
public final class cqb implements cqr {
    public final int a;

    public cqb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!affa.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a == ((cqb) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidPointerIcon(type=" + this.a + ")";
    }
}
