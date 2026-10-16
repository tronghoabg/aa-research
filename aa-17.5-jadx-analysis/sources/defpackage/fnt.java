package defpackage;

/* loaded from: classes2.dex */
public final class fnt {
    public final String a;
    public final int b;
    public final int c;

    public fnt(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnt)) {
            return false;
        }
        fnt fntVar = (fnt) obj;
        return affa.f(this.a, fntVar.a) && this.b == fntVar.b && this.c == fntVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ")";
    }
}
