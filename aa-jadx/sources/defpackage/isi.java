package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class isi {
    public final defpackage.xij a;
    public final defpackage.xik b;
    public final java.lang.Long c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public isi(defpackage.xij xijVar, defpackage.xik xikVar, java.lang.Long l, boolean z, boolean z2, int i, int i2, int i3) {
        this.a = xijVar;
        this.b = xikVar;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public static defpackage.ish a() {
        defpackage.ish ishVar = new defpackage.ish();
        ishVar.e(false);
        ishVar.d(false);
        ishVar.b(1);
        ishVar.c(1);
        return ishVar;
    }

    public final boolean equals(java.lang.Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.isi) {
            defpackage.isi isiVar = (defpackage.isi) obj;
            defpackage.xij xijVar = this.a;
            if (xijVar != null ? xijVar.equals(isiVar.a) : isiVar.a == null) {
                defpackage.xik xikVar = this.b;
                if (xikVar != null ? xikVar.equals(isiVar.b) : isiVar.b == null) {
                    java.lang.Long l = this.c;
                    if (l != null ? l.equals(isiVar.c) : isiVar.c == null) {
                        if (this.d == isiVar.d && this.e == isiVar.e && this.f == isiVar.f && this.g == isiVar.g && ((i = this.h) != 0 ? i == isiVar.h : isiVar.h == 0)) {
                            return true;
                        }
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
        int iHashCode2 = xikVar == null ? 0 : xikVar.hashCode();
        int i = iHashCode ^ 1000003;
        java.lang.Long l = this.c;
        int iHashCode3 = ((((((((((((i * 1000003) ^ iHashCode2) * 1000003) ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003;
        int i2 = this.h;
        return iHashCode3 ^ (i2 != 0 ? i2 : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.h;
        defpackage.xik xikVar = this.b;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        java.lang.String strValueOf2 = java.lang.String.valueOf(xikVar);
        if (i == 1) {
            str = "EXPECTING_STATE_GAIN_FROM_HU";
        } else if (i == 2) {
            str = "RECOVERED_BY_STATE_GAIN_RECEIVED";
        } else if (i == 3) {
            str = "CANCELED_BY_UNEXPECTED_STATE_RECEIVED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "CANCELED_BY_GAIN_FOCUS_REQUEST_TIMEOUT";
        } else {
            str = "CANCELED_BY_UNEXPECTED_FOCUS_REQUEST_SENT";
        }
        int i2 = this.g;
        int i3 = this.f;
        boolean z = this.e;
        boolean z2 = this.d;
        return "HuAudioFocusDiagnostics{focusRequestSentToHu=" + strValueOf + ", focusResponseFromHu=" + strValueOf2 + ", voiceSessionEndTimeMillis=" + this.c + ", unsolicited=" + z2 + ", responseTimeout=" + z + ", currentAttempt=" + i3 + ", maxAttempts=" + i2 + ", unsolicitedLossTransientResult=" + str + "}";
    }

    public isi() {
        throw null;
    }
}
