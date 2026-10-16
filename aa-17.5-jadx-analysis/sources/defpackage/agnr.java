package defpackage;

/* loaded from: classes3.dex */
public final class agnr extends agnu {
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agnr(String str) {
        super(null);
        str.getClass();
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agnr) && affa.f(this.name, ((agnr) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return "Class(name=" + this.name + ')';
    }
}
