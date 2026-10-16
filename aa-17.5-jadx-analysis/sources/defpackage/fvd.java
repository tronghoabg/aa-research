package defpackage;

/* loaded from: classes2.dex */
public final class fvd {
    public final String a;

    public fvd(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvd) && affa.f(this.a, ((fvd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AlphaJumpKey(label=" + this.a + ")";
    }
}
