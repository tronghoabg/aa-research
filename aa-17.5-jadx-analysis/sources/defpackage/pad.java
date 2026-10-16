package defpackage;

/* loaded from: classes2.dex */
public final class pad {
    public final ozy a;
    public final String b;
    public final int c;

    public pad(ozy ozyVar, String str, int i) {
        ozyVar.getClass();
        str.getClass();
        this.a = ozyVar;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pad)) {
            return false;
        }
        pad padVar = (pad) obj;
        return affa.f(this.a, padVar.a) && affa.f(this.b, padVar.b) && this.c == padVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "WifiProjectionProtocolOnTcpConfiguration(wifiConfiguration=" + this.a + ", ipAddress=" + this.b + ", port=" + this.c + ")";
    }
}
