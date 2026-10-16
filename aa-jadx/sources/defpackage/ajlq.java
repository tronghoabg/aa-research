package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajlq {
    public static final defpackage.ajob a;
    public static final defpackage.ajob b;
    public static final defpackage.ajob c;
    public static final defpackage.ajob d;
    public static final defpackage.ajob e;
    public static final defpackage.ajob f;
    public final defpackage.ajob g;
    public final defpackage.ajob h;
    public final int i;

    static {
        defpackage.ajob ajobVar = defpackage.ajob.a;
        a = defpackage.airb.b(":");
        b = defpackage.airb.b(":status");
        c = defpackage.airb.b(":method");
        d = defpackage.airb.b(":path");
        e = defpackage.airb.b(":scheme");
        f = defpackage.airb.b(":authority");
    }

    public ajlq(defpackage.ajob ajobVar, defpackage.ajob ajobVar2) {
        this.g = ajobVar;
        this.h = ajobVar2;
        this.i = ajobVar.c() + 32 + ajobVar2.c();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ajlq)) {
            return false;
        }
        defpackage.ajlq ajlqVar = (defpackage.ajlq) obj;
        return defpackage.afga.f(this.g, ajlqVar.g) && defpackage.afga.f(this.h, ajlqVar.h);
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.h.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ajob ajobVar = this.h;
        return this.g.i() + ": " + ajobVar.i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ajlq(defpackage.ajob ajobVar, java.lang.String str) {
        this(ajobVar, defpackage.airb.b(str));
        ajobVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ajlq(java.lang.String str, java.lang.String str2) {
        this(defpackage.airb.b(str), defpackage.airb.b(str2));
        defpackage.ajob ajobVar = defpackage.ajob.a;
    }
}
