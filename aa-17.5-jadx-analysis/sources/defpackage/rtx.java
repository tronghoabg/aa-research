package defpackage;

/* loaded from: classes.dex */
public final class rtx {
    public final int a;
    public final int b;

    public rtx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rtx) {
            rtx rtxVar = (rtx) obj;
            if (this.a == rtxVar.a && this.b == rtxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ 1231;
    }

    public final String toString() {
        return "HuInfo{headUnitProtocolMajorVersionNumber=" + this.a + ", headUnitProtocolMinorVersionNumber=" + this.b + ", sslHandshakeCompleted=true}";
    }

    public rtx() {
        throw null;
    }
}
