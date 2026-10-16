package defpackage;

/* loaded from: classes2.dex */
public final class gcu implements gmo {
    public final int a;
    public final int b;
    public final gct c;

    public gcu(int i, int i2, gct gctVar) {
        this.a = i;
        this.b = i2;
        this.c = gctVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcu)) {
            return false;
        }
        gcu gcuVar = (gcu) obj;
        return this.a == gcuVar.a && this.b == gcuVar.b && affa.f(this.c, gcuVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SpanWrapperInternalModel(startInclusive=" + this.a + ", endExclusive=" + this.b + ", carSpan=" + this.c + ")";
    }
}
