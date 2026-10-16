package defpackage;

import j$.time.Instant;

/* loaded from: classes2.dex */
public final class sit {
    public final Instant a;

    public sit(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null eventTime");
        }
        this.a = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sit) {
            return this.a.equals(((sit) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LogSamplerProperties{eventTime=" + this.a.toString() + "}";
    }

    public sit() {
        throw null;
    }
}
