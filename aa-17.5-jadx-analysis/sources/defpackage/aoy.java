package defpackage;

/* loaded from: classes.dex */
public final class aoy {
    public final long a;
    public final long b;
    public final boolean c = false;

    public aoy(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final aoy a(aoy aoyVar) {
        return new aoy(a.ai(this.a, aoyVar.a), Math.max(this.b, aoyVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoy)) {
            return false;
        }
        aoy aoyVar = (aoy) obj;
        if (this.a != aoyVar.a || this.b != aoyVar.b) {
            return false;
        }
        boolean z = aoyVar.c;
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + 1237;
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + cja.d(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=false)";
    }
}
