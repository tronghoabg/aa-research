package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ruq {
    public final int a;
    public final int b;

    public ruq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ruq) {
            defpackage.ruq ruqVar = (defpackage.ruq) obj;
            if (this.a == ruqVar.a && this.b == ruqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ 1231;
    }

    public final java.lang.String toString() {
        return "HuInfo{headUnitProtocolMajorVersionNumber=" + this.a + ", headUnitProtocolMinorVersionNumber=" + this.b + ", sslHandshakeCompleted=true}";
    }

    public ruq() {
        throw null;
    }
}
