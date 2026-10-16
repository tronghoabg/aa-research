package defpackage;

/* loaded from: classes2.dex */
public final class pth {
    public final Class a;
    public final pwz b;

    public pth(Class cls, pwz pwzVar) {
        cls.getClass();
        this.a = cls;
        this.b = pwzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pth) {
            pth pthVar = (pth) obj;
            if (this.a.equals(pthVar.a) && this.b.equals(pthVar.b)) {
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
        pwz pwzVar = this.b;
        return "{" + this.a.toString() + ", " + pwzVar.toString() + "}";
    }

    public pth() {
        throw null;
    }
}
