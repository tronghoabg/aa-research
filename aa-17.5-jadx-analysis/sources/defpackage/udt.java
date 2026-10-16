package defpackage;

/* loaded from: classes3.dex */
public final class udt {
    public final yfq a;
    public final yfq b;
    public final yfq c;

    public udt(yfq yfqVar, yfq yfqVar2, yfq yfqVar3) {
        yfqVar.getClass();
        this.a = yfqVar;
        yfqVar2.getClass();
        this.b = yfqVar2;
        yfqVar3.getClass();
        this.c = yfqVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udt) {
            udt udtVar = (udt) obj;
            if (yrm.W(this.a, udtVar.a) && yrm.W(this.b, udtVar.b) && yrm.W(this.c, udtVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        yfq yfqVar = this.c;
        yfq yfqVar2 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(yfqVar2) + ", " + String.valueOf(yfqVar) + "}";
    }

    public udt() {
        throw null;
    }
}
