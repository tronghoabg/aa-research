package defpackage;

import java.util.logging.Level;

/* loaded from: classes.dex */
public final class vpk {
    public final Level a;
    public final String b;
    public final String c;
    public final long d;

    public vpk(Level level, String str, String str2, long j) {
        this.a = level;
        if (str == null) {
            throw new NullPointerException("Null logFormat");
        }
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vpk) {
            vpk vpkVar = (vpk) obj;
            if (this.a.equals(vpkVar.a) && this.b.equals(vpkVar.b) && this.c.equals(vpkVar.c) && this.d == vpkVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "AbseilLogData{logLevel=" + this.a.toString() + ", logFormat=" + this.b + ", fileName=" + this.c + ", threadId=" + this.d + "}";
    }

    public vpk() {
        throw null;
    }
}
