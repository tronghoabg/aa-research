package defpackage;

/* loaded from: classes2.dex */
public final class fmh extends flq {
    public final int a;

    public fmh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmh) && this.a == ((fmh) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ")";
    }
}
