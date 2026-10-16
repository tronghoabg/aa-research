package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rgc {
    public final defpackage.xij a;
    public final defpackage.xik b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;

    public rgc(defpackage.xij xijVar, defpackage.xik xikVar, boolean z, boolean z2, int i, int i2, boolean z3) {
        this.a = xijVar;
        this.b = xikVar;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
    }

    public static defpackage.rgb a() {
        defpackage.rgb rgbVar = new defpackage.rgb();
        rgbVar.f(false);
        rgbVar.d(false);
        rgbVar.b(1);
        rgbVar.c(1);
        rgbVar.e(false);
        return rgbVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rgc) {
            defpackage.rgc rgcVar = (defpackage.rgc) obj;
            defpackage.xij xijVar = this.a;
            if (xijVar != null ? xijVar.equals(rgcVar.a) : rgcVar.a == null) {
                defpackage.xik xikVar = this.b;
                if (xikVar != null ? xikVar.equals(rgcVar.b) : rgcVar.b == null) {
                    if (this.c == rgcVar.c && this.d == rgcVar.d && this.e == rgcVar.e && this.f == rgcVar.f && this.g == rgcVar.g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.xij xijVar = this.a;
        int iHashCode = xijVar == null ? 0 : xijVar.hashCode();
        defpackage.xik xikVar = this.b;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ (xikVar != null ? xikVar.hashCode() : 0)) * (-721379959)) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        defpackage.xik xikVar = this.b;
        return "HuAudioFocusDiagnostics{focusRequestSentToHu=" + java.lang.String.valueOf(this.a) + ", focusResponseFromHu=" + java.lang.String.valueOf(xikVar) + ", voiceSessionEndTimeMillis=null, unsolicited=" + this.c + ", responseTimeout=" + this.d + ", currentAttempt=" + this.e + ", maxAttempts=" + this.f + ", restoreLossTr=" + this.g + "}";
    }

    public rgc() {
        throw null;
    }
}
