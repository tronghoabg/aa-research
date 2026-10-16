package defpackage;

/* loaded from: classes.dex */
public final class tea {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public tea(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tea) {
            tea teaVar = (tea) obj;
            if (this.a.equals(teaVar.a) && this.b.equals(teaVar.b) && this.c.equals(teaVar.c) && this.d.equals(teaVar.d) && this.e.equals(teaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        return this.e.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "CarInfoPsd{carManufacturer=" + this.a + ", carModel=" + this.b + ", carModelYear=" + this.c + ", headUnitMake=" + this.d + ", headUnitModel=" + this.e + "}";
    }

    public tea() {
        throw null;
    }
}
