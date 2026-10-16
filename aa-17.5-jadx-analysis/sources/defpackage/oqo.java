package defpackage;

/* loaded from: classes2.dex */
public final class oqo {
    public final boolean a;
    public final boolean b;
    private final String c;

    public oqo(String str, boolean z, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oqo) {
            oqo oqoVar = (oqo) obj;
            if (this.c.equals(oqoVar.c) && this.a == oqoVar.a && this.b == oqoVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "AndroidAutoBluetoothDevice{name=" + this.c + ", supportsWifi=" + this.a + ", hasPreviouslyConnected=" + this.b + "}";
    }

    public oqo() {
        throw null;
    }
}
