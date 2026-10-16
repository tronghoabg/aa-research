package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class utb {
    public static final defpackage.utb a = new defpackage.utb("", defpackage.utc.NO_WRAP);
    public final java.lang.String b;
    public final defpackage.utc c;

    public utb(java.lang.String str, defpackage.utc utcVar) {
        str.getClass();
        this.b = str;
        this.c = utcVar;
    }

    public final boolean a() {
        return this.b.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.utb) {
            defpackage.utb utbVar = (defpackage.utb) obj;
            if (this.b.equals(utbVar.b) && this.c.equals(utbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ 1000003;
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        return "{" + this.b + ", " + this.c.toString() + "}";
    }

    public utb() {
        throw null;
    }
}
