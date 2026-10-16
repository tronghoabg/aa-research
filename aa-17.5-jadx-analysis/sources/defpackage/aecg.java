package defpackage;

/* loaded from: classes3.dex */
public final class aecg {
    public static final ajnb a;
    public static final ajnb b;
    public static final ajnb c;
    public static final ajnb d;
    public static final ajnb e;
    public final ajnb f;
    public final ajnb g;
    final int h;

    static {
        ajnb ajnbVar = ajnb.a;
        a = ahfd.b(":status");
        b = ahfd.b(":method");
        c = ahfd.b(":path");
        d = ahfd.b(":scheme");
        e = ahfd.b(":authority");
        ahfd.b(":host");
        ahfd.b(":version");
    }

    public aecg(ajnb ajnbVar, ajnb ajnbVar2) {
        this.f = ajnbVar;
        this.g = ajnbVar2;
        this.h = ajnbVar.c() + 32 + ajnbVar2.c();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aecg) {
            aecg aecgVar = (aecg) obj;
            if (this.f.equals(aecgVar.f) && this.g.equals(aecgVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f.i(), this.g.i());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aecg(ajnb ajnbVar, String str) {
        this(ajnbVar, ahfd.b(str));
        ajnb ajnbVar2 = ajnb.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aecg(String str, String str2) {
        this(ahfd.b(str), ahfd.b(str2));
        ajnb ajnbVar = ajnb.a;
    }
}
