package defpackage;

/* loaded from: classes3.dex */
final class zoh {
    public final String a;
    public final Integer b;

    public zoh(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zoh) {
            zoh zohVar = (zoh) obj;
            if (this.a.equals(zohVar.a) && ((num = this.b) != null ? num.equals(zohVar.b) : zohVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Integer num = this.b;
        return (num == null ? 0 : num.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "PhoneContext{rawContext=" + this.a + ", countryCode=" + this.b + "}";
    }

    public zoh() {
        throw null;
    }
}
