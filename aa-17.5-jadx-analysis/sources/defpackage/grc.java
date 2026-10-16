package defpackage;

/* loaded from: classes2.dex */
public final class grc implements gre {
    public final String a;

    public grc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grc) && affa.f(this.a, ((grc) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Error(message=" + this.a + ")";
    }

    public grc() {
        this(null);
    }
}
