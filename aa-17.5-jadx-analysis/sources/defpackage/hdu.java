package defpackage;

/* loaded from: classes2.dex */
public final class hdu extends hdy {
    public final aizz a;
    public final boolean b;

    public hdu(aizz aizzVar, boolean z) {
        super(false);
        this.a = aizzVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdu)) {
            return false;
        }
        hdu hduVar = (hdu) obj;
        return affa.f(this.a, hduVar.a) && this.b == hduVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.f(this.b);
    }

    public final String toString() {
        return "RowTrailingRadioButtonUiModel(isSelected=" + this.a + ", isEnabled=" + this.b + ")";
    }
}
