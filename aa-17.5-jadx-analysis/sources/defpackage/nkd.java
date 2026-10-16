package defpackage;

/* loaded from: classes2.dex */
public final class nkd {
    public static final yph a = yph.c("GH.StatusElementConfig");
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public nkd(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkd)) {
            return false;
        }
        nkd nkdVar = (nkd) obj;
        return this.b == nkdVar.b && this.c == nkdVar.c && this.d == nkdVar.d;
    }

    public final int hashCode() {
        return (((a.f(this.b) * 31) + a.f(this.c)) * 31) + a.f(this.d);
    }

    public final String toString() {
        return "StatusElementConfig(hideClock=" + this.b + ", hideBatteryStatus=" + this.c + ", hideCellSignal=" + this.d + ")";
    }
}
