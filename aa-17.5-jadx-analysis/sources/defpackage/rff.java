package defpackage;

/* loaded from: classes2.dex */
public final class rff {
    public final yzz a;
    public final yzy b;

    public rff(yzz yzzVar, yzy yzyVar) {
        this.a = yzzVar;
        this.b = yzyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rff) {
            rff rffVar = (rff) obj;
            if (this.a.equals(rffVar.a) && this.b.equals(rffVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        yzy yzyVar = this.b;
        return "EventBatch{context=" + this.a.toString() + ", action=" + yzyVar.toString() + "}";
    }

    public rff() {
        throw null;
    }
}
