package defpackage;

/* loaded from: classes2.dex */
public final class rem {
    public final xhi a;
    public final xhj b;
    public final boolean c;
    public final boolean d;

    public rem(xhi xhiVar, xhj xhjVar, boolean z, boolean z2) {
        this.a = xhiVar;
        this.b = xhjVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rem) {
            rem remVar = (rem) obj;
            xhi xhiVar = this.a;
            if (xhiVar != null ? xhiVar.equals(remVar.a) : remVar.a == null) {
                if (this.b.equals(remVar.b) && this.c == remVar.c && this.d == remVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        xhi xhiVar = this.a;
        return (((((((xhiVar == null ? 0 : xhiVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237);
    }

    public final String toString() {
        xhj xhjVar = this.b;
        return "CarAudioFocusEvent{audioFocusRequestType=" + String.valueOf(this.a) + ", audioFocusStateType=" + String.valueOf(xhjVar) + ", unsolicitedResponse=" + this.c + ", gearheadForcedResponse=" + this.d + "}";
    }

    public rem() {
        throw null;
    }
}
