package defpackage;

/* loaded from: classes.dex */
public final class bwe {
    private final Object a;
    private final Object b;

    public bwe(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    private static final int a(Object obj) {
        return obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwe)) {
            return false;
        }
        bwe bweVar = (bwe) obj;
        return affa.f(this.a, bweVar.a) && affa.f(this.b, bweVar.b);
    }

    public final int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ")";
    }
}
