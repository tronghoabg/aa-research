package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class dmc {
    public final long a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dmc) && this.a == ((defpackage.dmc) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        long j = this.a;
        if (j == 0) {
            return "Unspecified";
        }
        if (j == 4294967296L) {
            return "Sp";
        }
        return j == 8589934592L ? "Em" : "Invalid";
    }
}
