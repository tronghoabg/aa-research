package defpackage;

/* loaded from: classes2.dex */
public final class fyu extends fwl {
    public final gbg a;

    public fyu(gbg gbgVar) {
        this.a = gbgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyu) && affa.f(this.a, ((fyu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageBackgroundUiModel(image=" + this.a + ")";
    }
}
