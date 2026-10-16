package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jcx {
    public final boolean a;
    public final int b;

    public jcx(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.jcx) {
            defpackage.jcx jcxVar = (defpackage.jcx) obj;
            if (this.a == jcxVar.a && this.b == jcxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "PoolLeakConfiguration{crashOnLeakEnabled=" + this.a + ", crashOnLeakThreshold=" + this.b + "}";
    }

    public jcx() {
        throw null;
    }
}
