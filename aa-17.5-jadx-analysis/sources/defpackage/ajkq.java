package defpackage;

/* loaded from: classes2.dex */
public final class ajkq {
    public static final ajnb a;
    public static final ajnb b;
    public static final ajnb c;
    public static final ajnb d;
    public static final ajnb e;
    public static final ajnb f;
    public final ajnb g;
    public final ajnb h;
    public final int i;

    static {
        ajnb ajnbVar = ajnb.a;
        a = ahfd.b(":");
        b = ahfd.b(":status");
        c = ahfd.b(":method");
        d = ahfd.b(":path");
        e = ahfd.b(":scheme");
        f = ahfd.b(":authority");
    }

    public ajkq(ajnb ajnbVar, ajnb ajnbVar2) {
        this.g = ajnbVar;
        this.h = ajnbVar2;
        this.i = ajnbVar.c() + 32 + ajnbVar2.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajkq)) {
            return false;
        }
        ajkq ajkqVar = (ajkq) obj;
        return affa.f(this.g, ajkqVar.g) && affa.f(this.h, ajkqVar.h);
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.h.hashCode();
    }

    public final String toString() {
        ajnb ajnbVar = this.h;
        return this.g.i() + ": " + ajnbVar.i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ajkq(ajnb ajnbVar, String str) {
        this(ajnbVar, ahfd.b(str));
        ajnbVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ajkq(String str, String str2) {
        this(ahfd.b(str), ahfd.b(str2));
        ajnb ajnbVar = ajnb.a;
    }
}
