package defpackage;

/* loaded from: classes2.dex */
public final class pxh {
    public static final pxh a = new pxh(false, false);
    public static final pxh b = new pxh(true, true);
    public final boolean c;
    private final String d;
    private final boolean e;

    public pxh(boolean z, boolean z2) {
        this.c = z;
        this.d = "";
        this.e = z2;
    }

    public final String a() {
        boolean z = false;
        if (this.c && !b()) {
            z = true;
        }
        woy.aa(z, "Zwieback cookie is only valid if the Zwieback cookie override is enabled and not clearing the Zwieback cookie.");
        return this.d;
    }

    public final boolean b() {
        woy.aa(this.c, "Zwieback cookie clearing is only valid if the Zwieback cookie override is enabled.");
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pxh) {
            pxh pxhVar = (pxh) obj;
            if (this.c == pxhVar.c && this.d.equals(pxhVar.d) && this.e == pxhVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.c ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        return "{" + this.c + ", " + this.d + ", " + this.e + "}";
    }

    public pxh() {
        throw null;
    }
}
