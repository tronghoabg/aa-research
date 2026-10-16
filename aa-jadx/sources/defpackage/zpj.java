package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zpj {
    public final java.lang.String a;
    public final java.lang.Integer b;

    public zpj(java.lang.String str, java.lang.Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zpj) {
            defpackage.zpj zpjVar = (defpackage.zpj) obj;
            if (this.a.equals(zpjVar.a) && ((num = this.b) != null ? num.equals(zpjVar.b) : zpjVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.Integer num = this.b;
        return (num == null ? 0 : num.hashCode()) ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        return "PhoneContext{rawContext=" + this.a + ", countryCode=" + this.b + "}";
    }

    public zpj() {
        throw null;
    }
}
