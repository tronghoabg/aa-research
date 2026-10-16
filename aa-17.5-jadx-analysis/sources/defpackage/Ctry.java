package defpackage;

/* renamed from: try, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Ctry {
    public final abfi a;
    public final int b;

    static {
        a().h();
    }

    public Ctry(abfi abfiVar, int i) {
        this.a = abfiVar;
        this.b = i;
    }

    public static ajnt a() {
        ajnt ajntVar = new ajnt((char[]) null);
        ajntVar.b = abfi.WORLD_ENCODING_LAT_LNG_E7;
        ajntVar.a = 2;
        return ajntVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ctry) {
            Ctry ctry = (Ctry) obj;
            if (this.a.equals(ctry.a)) {
                int i = this.b;
                int i2 = ctry.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        a.aW(i);
        return i ^ (iHashCode * 1000003);
    }

    public final String toString() {
        int i = this.b;
        return a.bC(i != 0 ? Integer.toString(i - 1) : "null", String.valueOf(this.a), "{", ", ", "}");
    }

    public Ctry() {
        throw null;
    }
}
