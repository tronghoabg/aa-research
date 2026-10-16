package defpackage;

/* JADX INFO: renamed from: try, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Ctry {
    public final defpackage.aelf a;
    public final int b;
    public final java.lang.String c;
    public final int d;
    public final boolean e;
    public final j$.util.Optional f;
    public final boolean g;

    public Ctry(defpackage.aelf aelfVar, java.lang.String str, int i, boolean z, j$.util.Optional optional) {
        this.a = aelfVar;
        this.b = 30;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = optional;
        this.g = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.Ctry) {
            defpackage.Ctry ctry = (defpackage.Ctry) obj;
            if (this.a.equals(ctry.a) && this.b == ctry.b && this.c.equals(ctry.c) && this.d == ctry.d && this.e == ctry.e && this.f.equals(ctry.f) && this.g == ctry.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((this.b ^ 942107342) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237) * (-721379959)) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.f;
        return "{false, false, " + java.lang.String.valueOf(this.a) + ", false, " + this.b + ", false, false, " + this.c + ", " + this.d + ", false, false, false, false, false, false, " + this.e + ", false, 0, false, false, false, " + java.lang.String.valueOf(optional) + ", false, false, false, false, false, " + this.g + "}";
    }

    public Ctry() {
        throw null;
    }
}
