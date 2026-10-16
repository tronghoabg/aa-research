package defpackage;

/* loaded from: classes2.dex */
public final class hdj implements hju {
    public final gab a;
    public final hdi b;

    public hdj(gab gabVar, hdi hdiVar) {
        this.a = gabVar;
        this.b = hdiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdj)) {
            return false;
        }
        hdj hdjVar = (hdj) obj;
        return affa.f(this.a, hdjVar.a) && this.b == hdjVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RowLeadingImageUiModel(image=" + this.a + ", imageType=" + this.b + ")";
    }
}
