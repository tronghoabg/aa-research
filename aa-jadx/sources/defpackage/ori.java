package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ori {
    public final boolean a;
    public final boolean b;
    private final java.lang.String c;

    public ori(java.lang.String str, boolean z, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ori) {
            defpackage.ori oriVar = (defpackage.ori) obj;
            if (this.c.equals(oriVar.c) && this.a == oriVar.a && this.b == oriVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "AndroidAutoBluetoothDevice{name=" + this.c + ", supportsWifi=" + this.a + ", hasPreviouslyConnected=" + this.b + "}";
    }

    public ori() {
        throw null;
    }
}
