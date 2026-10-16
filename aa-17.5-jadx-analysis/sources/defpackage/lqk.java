package defpackage;

import j$.time.Instant;

/* loaded from: classes.dex */
final class lqk {
    public final Instant a;
    public final String b;
    public final boolean c;

    public lqk(Instant instant, String str, boolean z) {
        if (instant == null) {
            throw new NullPointerException("Null eventTime");
        }
        this.a = instant;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqk) {
            lqk lqkVar = (lqk) obj;
            if (this.a.equals(lqkVar.a) && this.b.equals(lqkVar.b) && this.c == lqkVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.c ? 1237 : 1231) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistenceHistoryEntry{eventTime=" + this.a.toString() + ", key=" + this.b + ", value=" + this.c + "}";
    }

    public lqk() {
        throw null;
    }
}
