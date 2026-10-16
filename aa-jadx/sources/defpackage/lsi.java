package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lsi {
    public final java.lang.String a;
    public final j$.time.Instant b;
    private final android.os.Bundle c;

    public lsi(java.lang.String str, android.os.Bundle bundle, j$.time.Instant instant) {
        this.a = str;
        this.c = bundle;
        if (instant == null) {
            throw new java.lang.NullPointerException("Null processedTime");
        }
        this.b = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lsi) {
            defpackage.lsi lsiVar = (defpackage.lsi) obj;
            if (this.a.equals(lsiVar.a) && this.c.equals(lsiVar.c) && this.b.equals(lsiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        j$.time.Instant instant = this.b;
        return "MediaSearch{query=" + this.a + ", extras=" + this.c.toString() + ", processedTime=" + instant.toString() + "}";
    }

    public lsi() {
        throw null;
    }
}
