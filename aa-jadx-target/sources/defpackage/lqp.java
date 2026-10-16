package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lqp {
    public final j$.time.Instant a;
    public final java.lang.String b;
    public final boolean c;

    public lqp(j$.time.Instant instant, java.lang.String str, boolean z) {
        if (instant == null) {
            throw new java.lang.NullPointerException("Null eventTime");
        }
        this.a = instant;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lqp) {
            defpackage.lqp lqpVar = (defpackage.lqp) obj;
            if (this.a.equals(lqpVar.a) && this.b.equals(lqpVar.b) && this.c == lqpVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.c ? 1237 : 1231) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final java.lang.String toString() {
        return "PersistenceHistoryEntry{eventTime=" + this.a.toString() + ", key=" + this.b + ", value=" + this.c + "}";
    }

    public lqp() {
        throw null;
    }
}
