package defpackage;

/* loaded from: classes.dex */
public final class bww {
    private final String a;

    public bww(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bww) && affa.f(this.a, ((bww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.a + ")";
    }
}
