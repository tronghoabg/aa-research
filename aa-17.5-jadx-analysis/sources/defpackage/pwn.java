package defpackage;

/* loaded from: classes2.dex */
public final class pwn {
    public final String a;
    public final Object b;

    public pwn(String str, Object obj) {
        this.a = str;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pwn) {
            pwn pwnVar = (pwn) obj;
            if (this.a.equals(pwnVar.a) && this.b.equals(pwnVar.b)) {
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
        return "{" + this.a + ", " + this.b.toString() + "}";
    }

    public pwn() {
        throw null;
    }
}
