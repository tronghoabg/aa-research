package defpackage;

/* loaded from: classes2.dex */
public final class gtc extends gte {
    public final long a;
    public final afdr b;

    public gtc(long j, afdr afdrVar) {
        this.a = j;
        this.b = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtc)) {
            return false;
        }
        gtc gtcVar = (gtc) obj;
        return this.a == gtcVar.a && affa.f(this.b, gtcVar.b);
    }

    public final int hashCode() {
        return (a.g(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Countdown(timeoutMillis=" + this.a + ", getProgress=" + this.b + ")";
    }
}
