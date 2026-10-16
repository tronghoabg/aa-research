package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tex {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;

    public tex(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tex) {
            defpackage.tex texVar = (defpackage.tex) obj;
            if (this.a.equals(texVar.a) && this.b.equals(texVar.b) && this.c.equals(texVar.c) && this.d.equals(texVar.d) && this.e.equals(texVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        return this.e.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        return "CarInfoPsd{carManufacturer=" + this.a + ", carModel=" + this.b + ", carModelYear=" + this.c + ", headUnitMake=" + this.d + ", headUnitModel=" + this.e + "}";
    }

    public tex() {
        throw null;
    }
}
