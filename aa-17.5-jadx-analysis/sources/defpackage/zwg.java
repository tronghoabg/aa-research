package defpackage;

/* loaded from: classes3.dex */
public final class zwg {
    public final abgx a;
    public final Integer b;
    public final boolean c;

    public zwg(abgx abgxVar, Integer num, boolean z) {
        this.a = abgxVar;
        this.b = num;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zwg) {
            zwg zwgVar = (zwg) obj;
            if (this.a.equals(zwgVar.a) && ((num = this.b) != null ? num.equals(zwgVar.b) : zwgVar.b == null) && this.c == zwgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Integer num = this.b;
        return (true != this.c ? 1237 : 1231) ^ (((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003);
    }

    public final String toString() {
        return "StylingConfig{versatileMapStyle=" + String.valueOf(this.a) + ", backgroundColor=" + this.b + ", usesCustomTiles=" + this.c + "}";
    }

    public zwg() {
        throw null;
    }
}
