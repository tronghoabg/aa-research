package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lzp {
    public final android.content.ComponentName a;
    private final int b;

    public lzp(android.content.ComponentName componentName, int i) {
        this.a = componentName;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lzp) {
            defpackage.lzp lzpVar = (defpackage.lzp) obj;
            if (this.a.equals(lzpVar.a)) {
                int i = this.b;
                int i2 = lzpVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        defpackage.a.aI(i);
        return i ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.b;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        if (i == 1) {
            str = "NOT_CONNECTED";
        } else if (i != 2) {
            str = i != 3 ? "null" : "CONNECTED";
        } else {
            str = "CONNECTING";
        }
        return defpackage.a.bB(str, strValueOf, "NavigationConnectionStatus{componentName=", ", state=", "}");
    }

    public lzp() {
        throw null;
    }
}
