package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tsy {
    public final defpackage.tpg a;
    public final java.lang.Float b;
    public final java.lang.Float c;
    public final java.lang.Float d;
    public final java.lang.Integer e;
    public final java.lang.Integer f;

    public tsy(defpackage.tpg tpgVar, java.lang.Float f, java.lang.Float f2, java.lang.Float f3, java.lang.Integer num, java.lang.Integer num2) {
        this.a = tpgVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = num;
        this.f = num2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tsy) {
            defpackage.tsy tsyVar = (defpackage.tsy) obj;
            defpackage.tpg tpgVar = this.a;
            if (tpgVar != null ? tpgVar.equals(tsyVar.a) : tsyVar.a == null) {
                java.lang.Float f = this.b;
                if (f != null ? f.equals(tsyVar.b) : tsyVar.b == null) {
                    java.lang.Float f2 = this.c;
                    if (f2 != null ? f2.equals(tsyVar.c) : tsyVar.c == null) {
                        java.lang.Float f3 = this.d;
                        if (f3 != null ? f3.equals(tsyVar.d) : tsyVar.d == null) {
                            java.lang.Integer num = this.e;
                            if (num != null ? num.equals(tsyVar.e) : tsyVar.e == null) {
                                java.lang.Integer num2 = this.f;
                                if (num2 != null ? num2.equals(tsyVar.f) : tsyVar.f == null) {
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
        defpackage.tpg tpgVar = this.a;
        int iHashCode = tpgVar == null ? 0 : tpgVar.hashCode();
        java.lang.Float f = this.b;
        int iHashCode2 = f == null ? 0 : f.hashCode();
        int i = iHashCode ^ 1000003;
        java.lang.Float f2 = this.c;
        int iHashCode3 = ((((i * (-721379959)) ^ iHashCode2) * 1000003) ^ (f2 == null ? 0 : f2.hashCode())) * 1000003;
        java.lang.Float f3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (f3 == null ? 0 : f3.hashCode())) * 1000003;
        java.lang.Integer num = this.e;
        int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        java.lang.Integer num2 = this.f;
        return (iHashCode5 ^ (num2 != null ? num2.hashCode() : 0)) * 1000003;
    }

    public final java.lang.String toString() {
        return "{" + java.lang.String.valueOf(this.a) + ", null, " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", null}";
    }

    public tsy() {
        throw null;
    }
}
