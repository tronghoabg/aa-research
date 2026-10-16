package defpackage;

/* loaded from: classes2.dex */
public final class heg {
    public static final heg a = new heg(hed.a, hef.a);
    public static final heg b = new heg(hed.b, hef.b);
    public final hed c;
    public final hef d;

    public heg(hed hedVar, hef hefVar) {
        hedVar.getClass();
        hefVar.getClass();
        this.c = hedVar;
        this.d = hefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heg)) {
            return false;
        }
        heg hegVar = (heg) obj;
        return affa.f(this.c, hegVar.c) && affa.f(this.d, hegVar.d);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TemplateSectionedItemStyle(rowLeadingImageStyle=" + this.c + ", rowTrailingImageStyle=" + this.d + ")";
    }
}
