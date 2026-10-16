package defpackage;

/* loaded from: classes.dex */
public final class dey extends dez {
    public final String a;
    public final dfu b;

    public dey(String str, dfu dfuVar) {
        this.a = str;
        this.b = dfuVar;
    }

    @Override // defpackage.dez
    public final dfu a() {
        return this.b;
    }

    @Override // defpackage.dez
    public final glf b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dey)) {
            return false;
        }
        dey deyVar = (dey) obj;
        return affa.f(this.a, deyVar.a) && affa.f(this.b, deyVar.b) && affa.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dfu dfuVar = this.b;
        return (iHashCode + (dfuVar != null ? dfuVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.a + ")";
    }
}
