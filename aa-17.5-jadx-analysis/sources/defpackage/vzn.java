package defpackage;

/* loaded from: classes.dex */
public final class vzn {
    public final boolean a;
    public final boolean b;

    public vzn(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static vzm a() {
        vzm vzmVar = new vzm();
        vzmVar.b(false);
        vzmVar.a = true;
        vzmVar.b = (byte) (vzmVar.b | 2);
        return vzmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vzn) {
            vzn vznVar = (vzn) obj;
            if (this.a == vznVar.a && this.b == vznVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "PerfgateMetricTransmitterConfigurations{useEventNamePostfix=" + this.a + ", includeEventNameTag=" + this.b + "}";
    }

    public vzn() {
        throw null;
    }
}
