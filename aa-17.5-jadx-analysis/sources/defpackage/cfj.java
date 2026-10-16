package defpackage;

/* loaded from: classes.dex */
public final class cfj {
    public final int a;
    public final Integer b;

    public cfj(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfj)) {
            return false;
        }
        cfj cfjVar = (cfj) obj;
        return this.a == cfjVar.a && affa.f(this.b, cfjVar.b);
    }

    public final int hashCode() {
        Integer num = this.b;
        return (this.a * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ")";
    }
}
