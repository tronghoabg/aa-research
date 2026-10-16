package defpackage;

/* loaded from: classes.dex */
public final class jcq {
    public final boolean a;
    public final int b;

    public jcq(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jcq) {
            jcq jcqVar = (jcq) obj;
            if (this.a == jcqVar.a && this.b == jcqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "PoolLeakConfiguration{crashOnLeakEnabled=" + this.a + ", crashOnLeakThreshold=" + this.b + "}";
    }

    public jcq() {
        throw null;
    }
}
