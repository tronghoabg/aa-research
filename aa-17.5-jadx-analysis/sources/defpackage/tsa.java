package defpackage;

/* loaded from: classes3.dex */
public final class tsa {
    public final toi a;
    public final Float b;
    public final Float c;
    public final Float d;
    public final Integer e;
    public final Integer f;

    public tsa(toi toiVar, Float f, Float f2, Float f3, Integer num, Integer num2) {
        this.a = toiVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = num;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tsa) {
            tsa tsaVar = (tsa) obj;
            toi toiVar = this.a;
            if (toiVar != null ? toiVar.equals(tsaVar.a) : tsaVar.a == null) {
                Float f = this.b;
                if (f != null ? f.equals(tsaVar.b) : tsaVar.b == null) {
                    Float f2 = this.c;
                    if (f2 != null ? f2.equals(tsaVar.c) : tsaVar.c == null) {
                        Float f3 = this.d;
                        if (f3 != null ? f3.equals(tsaVar.d) : tsaVar.d == null) {
                            Integer num = this.e;
                            if (num != null ? num.equals(tsaVar.e) : tsaVar.e == null) {
                                Integer num2 = this.f;
                                if (num2 != null ? num2.equals(tsaVar.f) : tsaVar.f == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        toi toiVar = this.a;
        int iHashCode = toiVar == null ? 0 : toiVar.hashCode();
        Float f = this.b;
        int iHashCode2 = f == null ? 0 : f.hashCode();
        int i = iHashCode ^ 1000003;
        Float f2 = this.c;
        int iHashCode3 = ((((i * (-721379959)) ^ iHashCode2) * 1000003) ^ (f2 == null ? 0 : f2.hashCode())) * 1000003;
        Float f3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (f3 == null ? 0 : f3.hashCode())) * 1000003;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.f;
        return (iHashCode5 ^ (num2 != null ? num2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + ", null, " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", null}";
    }

    public tsa() {
        throw null;
    }
}
