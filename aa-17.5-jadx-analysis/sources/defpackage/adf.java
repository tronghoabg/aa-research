package defpackage;

/* loaded from: classes.dex */
public final class adf {
    public final adu a;
    public long b;

    public adf(adu aduVar, long j) {
        this.a = aduVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adf)) {
            return false;
        }
        adf adfVar = (adf) obj;
        return affa.f(this.a, adfVar.a) && this.b == adfVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.g(this.b);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + dlq.c(this.b) + ")";
    }
}
