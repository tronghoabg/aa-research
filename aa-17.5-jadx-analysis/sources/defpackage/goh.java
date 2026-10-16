package defpackage;

/* loaded from: classes2.dex */
final class goh {
    public int a = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof goh) && this.a == ((goh) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "MutableInt(value=" + this.a + ")";
    }
}
