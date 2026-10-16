package defpackage;

/* loaded from: classes3.dex */
public final class usf {
    public static final usf a = new usf("", usg.NO_WRAP);
    public final String b;
    public final usg c;

    public usf(String str, usg usgVar) {
        str.getClass();
        this.b = str;
        this.c = usgVar;
    }

    public final boolean a() {
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof usf) {
            usf usfVar = (usf) obj;
            if (this.b.equals(usfVar.b) && this.c.equals(usfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ 1000003;
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.b + ", " + this.c.toString() + "}";
    }

    public usf() {
        throw null;
    }
}
