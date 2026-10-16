package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rmo {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public rmo(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static defpackage.rmn a() {
        defpackage.rmn rmnVar = new defpackage.rmn();
        rmnVar.d(false);
        rmnVar.c(false);
        rmnVar.b(false);
        return rmnVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rmo) {
            defpackage.rmo rmoVar = (defpackage.rmo) obj;
            if (this.a == rmoVar.a && this.b == rmoVar.b && this.c == rmoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "GalMessageFilter{videoAckLoggable=" + this.a + ", audioMediaAckLoggable=" + this.b + ", audioGuidanceAckLoggable=" + this.c + "}";
    }

    public rmo() {
        throw null;
    }
}
