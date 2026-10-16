package defpackage;

@afdo
/* loaded from: classes.dex */
public final class aps {
    public final long a;

    public final boolean equals(Object obj) {
        return (obj instanceof aps) && this.a == ((aps) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ScrollValue(bits=" + this.a + ")";
    }
}
