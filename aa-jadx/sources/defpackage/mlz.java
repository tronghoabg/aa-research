package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mlz {
    public final defpackage.rzs a;
    public final defpackage.rzq b;
    public final boolean c;
    private final boolean d;

    public mlz(defpackage.rzs rzsVar, defpackage.rzq rzqVar, boolean z, boolean z2) {
        this.a = rzsVar;
        this.b = rzqVar;
        this.d = z;
        this.c = z2;
    }

    static defpackage.rfg a() {
        defpackage.rfg rfgVar = new defpackage.rfg();
        rfgVar.f(false);
        rfgVar.d(false);
        defpackage.rzp rzpVar = new defpackage.rzp();
        rzpVar.b(false);
        rzpVar.c(0);
        rzpVar.e(0);
        rzpVar.f(0);
        rzpVar.d(0);
        rfgVar.e(rzpVar.a());
        rfgVar.e = defpackage.rzs.b().a();
        return rfgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mlz) {
            defpackage.mlz mlzVar = (defpackage.mlz) obj;
            if (this.a.equals(mlzVar.a) && this.b.equals(mlzVar.b) && this.d == mlzVar.d && this.c == mlzVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.a() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        defpackage.rzq rzqVar = this.b;
        return "ConnectionState{usbState=" + java.lang.String.valueOf(this.a) + ", portStatus=" + java.lang.String.valueOf(rzqVar) + ", androidAutoStarted=" + this.d + ", projectionStarted=" + this.c + "}";
    }

    public mlz() {
        throw null;
    }
}
