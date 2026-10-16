package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rfh {
    public final defpackage.xij a;
    public final defpackage.xik b;
    public final boolean c;
    public final boolean d;

    public rfh(defpackage.xij xijVar, defpackage.xik xikVar, boolean z, boolean z2) {
        this.a = xijVar;
        this.b = xikVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rfh) {
            defpackage.rfh rfhVar = (defpackage.rfh) obj;
            defpackage.xij xijVar = this.a;
            if (xijVar != null ? xijVar.equals(rfhVar.a) : rfhVar.a == null) {
                if (this.b.equals(rfhVar.b) && this.c == rfhVar.c && this.d == rfhVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.xij xijVar = this.a;
        return (((((((xijVar == null ? 0 : xijVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        defpackage.xik xikVar = this.b;
        return "CarAudioFocusEvent{audioFocusRequestType=" + java.lang.String.valueOf(this.a) + ", audioFocusStateType=" + java.lang.String.valueOf(xikVar) + ", unsolicitedResponse=" + this.c + ", gearheadForcedResponse=" + this.d + "}";
    }

    public rfh() {
        throw null;
    }
}
