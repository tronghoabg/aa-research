package defpackage;

/* loaded from: classes2.dex */
public final class lgl {
    public final String a;
    public final String b;
    public final String c;

    public lgl(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgl)) {
            return false;
        }
        lgl lglVar = (lgl) obj;
        return affa.f(this.a, lglVar.a) && affa.f(this.b, lglVar.b) && affa.f(this.c, lglVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HeadUnitUpdateEntry(carInfo=" + this.a + ", softwareVersionInfo=" + this.b + ", url=" + this.c + ")";
    }
}
