package defpackage;

/* loaded from: classes2.dex */
public final class jtb {
    public final String a;

    public jtb(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jtb) && affa.f(this.a, ((jtb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AlphaJumpKey(label=" + this.a + ")";
    }
}
