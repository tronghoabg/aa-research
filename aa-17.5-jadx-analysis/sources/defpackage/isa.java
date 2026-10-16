package defpackage;

/* loaded from: classes.dex */
public final class isa {
    public final xhi a;
    public final xhj b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public isa(xhi xhiVar, xhj xhjVar, Long l, boolean z, boolean z2, int i, int i2, int i3) {
        this.a = xhiVar;
        this.b = xhjVar;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public static irz a() {
        irz irzVar = new irz();
        irzVar.e(false);
        irzVar.d(false);
        irzVar.b(1);
        irzVar.c(1);
        return irzVar;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof isa) {
            isa isaVar = (isa) obj;
            xhi xhiVar = this.a;
            if (xhiVar != null ? xhiVar.equals(isaVar.a) : isaVar.a == null) {
                xhj xhjVar = this.b;
                if (xhjVar != null ? xhjVar.equals(isaVar.b) : isaVar.b == null) {
                    Long l = this.c;
                    if (l != null ? l.equals(isaVar.c) : isaVar.c == null) {
                        if (this.d == isaVar.d && this.e == isaVar.e && this.f == isaVar.f && this.g == isaVar.g && ((i = this.h) != 0 ? i == isaVar.h : isaVar.h == 0)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        xhi xhiVar = this.a;
        int iHashCode = xhiVar == null ? 0 : xhiVar.hashCode();
        xhj xhjVar = this.b;
        int iHashCode2 = xhjVar == null ? 0 : xhjVar.hashCode();
        int i = iHashCode ^ 1000003;
        Long l = this.c;
        int iHashCode3 = ((((((((((((i * 1000003) ^ iHashCode2) * 1000003) ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003;
        int i2 = this.h;
        return iHashCode3 ^ (i2 != 0 ? i2 : 0);
    }

    public final String toString() {
        int i = this.h;
        xhj xhjVar = this.b;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(xhjVar);
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CANCELED_BY_GAIN_FOCUS_REQUEST_TIMEOUT" : "CANCELED_BY_UNEXPECTED_FOCUS_REQUEST_SENT" : "CANCELED_BY_UNEXPECTED_STATE_RECEIVED" : "RECOVERED_BY_STATE_GAIN_RECEIVED" : "EXPECTING_STATE_GAIN_FROM_HU";
        int i2 = this.g;
        int i3 = this.f;
        boolean z = this.e;
        boolean z2 = this.d;
        return "HuAudioFocusDiagnostics{focusRequestSentToHu=" + strValueOf + ", focusResponseFromHu=" + strValueOf2 + ", voiceSessionEndTimeMillis=" + this.c + ", unsolicited=" + z2 + ", responseTimeout=" + z + ", currentAttempt=" + i3 + ", maxAttempts=" + i2 + ", unsolicitedLossTransientResult=" + str + "}";
    }

    public isa() {
        throw null;
    }
}
