package defpackage;

/* loaded from: classes2.dex */
public final class olt {
    public final olv a;
    public final String b;
    public final olu c;
    public final yfq d;

    public olt(olv olvVar, String str, olu oluVar, yfq yfqVar) {
        this.a = olvVar;
        this.b = str;
        this.c = oluVar;
        this.d = yfqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof olt) {
            olt oltVar = (olt) obj;
            olv olvVar = this.a;
            if (olvVar != null ? olvVar.equals(oltVar.a) : oltVar.a == null) {
                String str = this.b;
                if (str != null ? str.equals(oltVar.b) : oltVar.b == null) {
                    olu oluVar = this.c;
                    if (oluVar != null ? oluVar.equals(oltVar.c) : oltVar.c == null) {
                        if (yrm.W(this.d, oltVar.d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        olv olvVar = this.a;
        int iHashCode = olvVar == null ? 0 : olvVar.hashCode();
        String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = iHashCode ^ 1000003;
        olu oluVar = this.c;
        return (this.d.hashCode() ^ (((((i * 1000003) ^ iHashCode2) * 1000003) ^ (oluVar != null ? oluVar.hashCode() : 0)) * 1000003)) * 1000003;
    }

    public final String toString() {
        yfq yfqVar = this.d;
        olu oluVar = this.c;
        return "AppBarModel{headerIcon=" + String.valueOf(this.a) + ", title=" + this.b + ", headerButton=" + String.valueOf(oluVar) + ", auxiliaryButtons=" + String.valueOf(yfqVar) + ", tabStrip=null}";
    }

    public olt() {
        throw null;
    }
}
