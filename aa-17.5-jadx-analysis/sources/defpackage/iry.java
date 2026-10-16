package defpackage;

/* loaded from: classes.dex */
public final class iry {
    public final yzz a;
    public final yzy b;

    public iry(yzz yzzVar, yzy yzyVar) {
        this.a = yzzVar;
        this.b = yzyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iry) {
            iry iryVar = (iry) obj;
            if (this.a.equals(iryVar.a) && this.b.equals(iryVar.b)) {
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

    public iry() {
        throw null;
    }
}
