package defpackage;

/* loaded from: classes.dex */
public final class iqs {
    public final String a;
    public final xhi b;
    public final xhj c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public iqs(String str, xhi xhiVar, xhj xhjVar, boolean z, boolean z2, int i) {
        this.a = str;
        this.b = xhiVar;
        this.c = xhjVar;
        this.d = z;
        this.e = z2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iqs) {
            iqs iqsVar = (iqs) obj;
            String str = this.a;
            if (str != null ? str.equals(iqsVar.a) : iqsVar.a == null) {
                xhi xhiVar = this.b;
                if (xhiVar != null ? xhiVar.equals(iqsVar.b) : iqsVar.b == null) {
                    if (this.c.equals(iqsVar.c) && this.d == iqsVar.d && this.e == iqsVar.e && this.f == iqsVar.f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        xhi xhiVar = this.b;
        return this.f ^ ((((((((((iHashCode ^ 1000003) * 1000003) ^ (xhiVar != null ? xhiVar.hashCode() : 0)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        xhj xhjVar = this.c;
        return "CarAudioFocusEvent{packageName=" + this.a + ", audioFocusRequestType=" + String.valueOf(this.b) + ", audioFocusStateType=" + String.valueOf(xhjVar) + ", unsolicitedResponse=" + this.d + ", gearheadForcedResponse=" + this.e + ", pendingRequest=" + this.f + "}";
    }

    public iqs() {
        throw null;
    }
}
