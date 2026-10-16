package defpackage;

/* loaded from: classes3.dex */
public final class trs {
    public final abfi a;
    public final aekf b;
    public final int c;

    public trs(abfi abfiVar, int i, aekf aekfVar) {
        this.a = abfiVar;
        this.c = i;
        this.b = aekfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trs) {
            trs trsVar = (trs) obj;
            if (this.a.equals(trsVar.a)) {
                int i = this.c;
                int i2 = trsVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(trsVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.c;
        a.aW(i);
        return (((((i ^ (iHashCode * 1000003)) * (-429739981)) ^ 1237) * 1000003) ^ 1237) * 1000003;
    }

    public final String toString() {
        int i = this.c;
        return "{" + String.valueOf(this.a) + ", " + (i != 0 ? Integer.toString(i - 1) : "null") + ", null, null, null, null, false, false, " + String.valueOf(this.b) + "}";
    }

    public trs() {
        throw null;
    }
}
