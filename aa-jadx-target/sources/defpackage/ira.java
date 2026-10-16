package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ira {
    public final java.lang.String a;
    public final defpackage.xij b;
    public final defpackage.xik c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public ira(java.lang.String str, defpackage.xij xijVar, defpackage.xik xikVar, boolean z, boolean z2, int i) {
        this.a = str;
        this.b = xijVar;
        this.c = xikVar;
        this.d = z;
        this.e = z2;
        this.f = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ira) {
            defpackage.ira iraVar = (defpackage.ira) obj;
            java.lang.String str = this.a;
            if (str != null ? str.equals(iraVar.a) : iraVar.a == null) {
                defpackage.xij xijVar = this.b;
                if (xijVar != null ? xijVar.equals(iraVar.b) : iraVar.b == null) {
                    if (this.c.equals(iraVar.c) && this.d == iraVar.d && this.e == iraVar.e && this.f == iraVar.f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        defpackage.xij xijVar = this.b;
        return this.f ^ ((((((((((iHashCode ^ 1000003) * 1000003) ^ (xijVar != null ? xijVar.hashCode() : 0)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.xik xikVar = this.c;
        return "CarAudioFocusEvent{packageName=" + this.a + ", audioFocusRequestType=" + java.lang.String.valueOf(this.b) + ", audioFocusStateType=" + java.lang.String.valueOf(xikVar) + ", unsolicitedResponse=" + this.d + ", gearheadForcedResponse=" + this.e + ", pendingRequest=" + this.f + "}";
    }

    public ira() {
        throw null;
    }
}
