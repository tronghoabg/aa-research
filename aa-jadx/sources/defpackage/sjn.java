package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sjn {
    public final j$.time.Instant a;

    public sjn(j$.time.Instant instant) {
        if (instant == null) {
            throw new java.lang.NullPointerException("Null eventTime");
        }
        this.a = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.sjn) {
            return this.a.equals(((defpackage.sjn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "LogSamplerProperties{eventTime=" + this.a.toString() + "}";
    }

    public sjn() {
        throw null;
    }
}
