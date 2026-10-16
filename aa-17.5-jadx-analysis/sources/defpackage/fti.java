package defpackage;

/* loaded from: classes2.dex */
public final class fti extends a {
    public final int a;

    public fti(int i) {
        super(null);
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fti) && this.a == ((fti) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
