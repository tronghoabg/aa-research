package defpackage;

/* loaded from: classes2.dex */
public final class rto {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public rto(int i, int i2, boolean z, boolean z2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = i3;
    }

    public static rtn a() {
        rtn rtnVar = new rtn();
        rtnVar.d(16128);
        rtnVar.e(false);
        rtnVar.b(0);
        rtnVar.f(false);
        rtnVar.c(-1);
        return rtnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rto) {
            rto rtoVar = (rto) obj;
            if (this.a == rtoVar.a && this.b == rtoVar.b && this.c == rtoVar.c && this.d == rtoVar.d && this.e == rtoVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.c ? 1237 : 1231;
        int i2 = this.a;
        int i3 = this.b;
        return this.e ^ ((((i ^ ((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        return "FramerConnectionSettings{fragmentSize=" + this.a + ", bufferedStreamSize=" + this.b + ", useConcurrentChannelMap=" + this.c + ", isQoSEnabled=" + this.d + ", connectionType=" + this.e + "}";
    }

    public rto() {
        throw null;
    }
}
