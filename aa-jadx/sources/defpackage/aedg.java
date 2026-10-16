package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aedg {
    public static final defpackage.ajob a;
    public static final defpackage.ajob b;
    public static final defpackage.ajob c;
    public static final defpackage.ajob d;
    public static final defpackage.ajob e;
    public final defpackage.ajob f;
    public final defpackage.ajob g;
    final int h;

    static {
        defpackage.ajob ajobVar = defpackage.ajob.a;
        a = defpackage.airb.b(":status");
        b = defpackage.airb.b(":method");
        c = defpackage.airb.b(":path");
        d = defpackage.airb.b(":scheme");
        e = defpackage.airb.b(":authority");
        defpackage.airb.b(":host");
        defpackage.airb.b(":version");
    }

    public aedg(defpackage.ajob ajobVar, defpackage.ajob ajobVar2) {
        this.f = ajobVar;
        this.g = ajobVar2;
        this.h = ajobVar.c() + 32 + ajobVar2.c();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aedg) {
            defpackage.aedg aedgVar = (defpackage.aedg) obj;
            if (this.f.equals(aedgVar.f) && this.g.equals(aedgVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s: %s", this.f.i(), this.g.i());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aedg(defpackage.ajob ajobVar, java.lang.String str) {
        this(ajobVar, defpackage.airb.b(str));
        defpackage.ajob ajobVar2 = defpackage.ajob.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aedg(java.lang.String str, java.lang.String str2) {
        this(defpackage.airb.b(str), defpackage.airb.b(str2));
        defpackage.ajob ajobVar = defpackage.ajob.a;
    }
}
