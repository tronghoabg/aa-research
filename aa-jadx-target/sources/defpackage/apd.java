package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class apd {
    public final long a;
    public final long b;
    public final boolean c = false;

    public apd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final defpackage.apd a(defpackage.apd apdVar) {
        return new defpackage.apd(defpackage.a.ah(this.a, apdVar.a), java.lang.Math.max(this.b, apdVar.b));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.apd)) {
            return false;
        }
        defpackage.apd apdVar = (defpackage.apd) obj;
        if (this.a != apdVar.a || this.b != apdVar.b) {
            return false;
        }
        boolean z = apdVar.c;
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "MouseWheelScrollDelta(value=" + defpackage.cji.d(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=false)";
    }
}
