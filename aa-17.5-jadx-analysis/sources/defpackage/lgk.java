package defpackage;

/* loaded from: classes.dex */
public final class lgk {
    public final String a;
    public final String b;

    public lgk(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgk)) {
            return false;
        }
        lgk lgkVar = (lgk) obj;
        return affa.f(this.a, lgkVar.a) && affa.f(this.b, lgkVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "HeadUnitUpdateEntry(carInfo=" + this.a + ", url=" + this.b + ")";
    }
}
