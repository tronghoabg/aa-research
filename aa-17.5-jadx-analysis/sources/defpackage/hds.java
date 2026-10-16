package defpackage;

/* loaded from: classes2.dex */
public final class hds extends hdy {
    public final gab a;
    public final hdr b;

    public hds(gab gabVar, hdr hdrVar) {
        super(false);
        this.a = gabVar;
        this.b = hdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hds)) {
            return false;
        }
        hds hdsVar = (hds) obj;
        return affa.f(this.a, hdsVar.a) && this.b == hdsVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RowTrailingImageUiModel(image=" + this.a + ", imageType=" + this.b + ")";
    }
}
