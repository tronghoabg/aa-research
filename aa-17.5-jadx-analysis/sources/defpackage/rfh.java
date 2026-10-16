package defpackage;

/* loaded from: classes2.dex */
public final class rfh {
    public final xhi a;
    public final xhj b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;

    public rfh(xhi xhiVar, xhj xhjVar, boolean z, boolean z2, int i, int i2, boolean z3) {
        this.a = xhiVar;
        this.b = xhjVar;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
    }

    public static rfg a() {
        rfg rfgVar = new rfg();
        rfgVar.f(false);
        rfgVar.d(false);
        rfgVar.b(1);
        rfgVar.c(1);
        rfgVar.e(false);
        return rfgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfh) {
            rfh rfhVar = (rfh) obj;
            xhi xhiVar = this.a;
            if (xhiVar != null ? xhiVar.equals(rfhVar.a) : rfhVar.a == null) {
                xhj xhjVar = this.b;
                if (xhjVar != null ? xhjVar.equals(rfhVar.b) : rfhVar.b == null) {
                    if (this.c == rfhVar.c && this.d == rfhVar.d && this.e == rfhVar.e && this.f == rfhVar.f && this.g == rfhVar.g) {
                        return true;
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
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ (xhjVar != null ? xhjVar.hashCode() : 0)) * (-721379959)) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final String toString() {
        xhj xhjVar = this.b;
        return "HuAudioFocusDiagnostics{focusRequestSentToHu=" + String.valueOf(this.a) + ", focusResponseFromHu=" + String.valueOf(xhjVar) + ", voiceSessionEndTimeMillis=null, unsolicited=" + this.c + ", responseTimeout=" + this.d + ", currentAttempt=" + this.e + ", maxAttempts=" + this.f + ", restoreLossTr=" + this.g + "}";
    }

    public rfh() {
        throw null;
    }
}
