package defpackage;

@afdo
/* loaded from: classes.dex */
public final class dlu {
    public final long a;

    public final boolean equals(Object obj) {
        return (obj instanceof dlu) && this.a == ((dlu) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.a;
        return j == 0 ? "Unspecified" : j == 4294967296L ? "Sp" : j == 8589934592L ? "Em" : "Invalid";
    }
}
