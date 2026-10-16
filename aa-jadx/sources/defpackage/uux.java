package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uux {
    final defpackage.uuw a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final java.lang.String j;

    public uux(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, int i4, int i5, defpackage.uuw uuwVar) {
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.b = i;
        this.d = i2;
        this.e = i3;
        this.c = i4;
        this.f = i5;
        this.a = uuwVar;
        boolean z = false;
        if (str3 != null && str3.toLowerCase(java.util.Locale.ROOT).contains("mali")) {
            z = true;
        }
        this.g = z;
    }

    public final boolean a(boolean z) {
        defpackage.uuw uuwVar = this.a;
        return z ? uuwVar.e : uuwVar.d;
    }

    public final boolean b() {
        return this.d != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uux) {
            defpackage.uux uuxVar = (defpackage.uux) obj;
            if (j$.util.Objects.equals(this.h, uuxVar.h) && j$.util.Objects.equals(this.i, uuxVar.i) && j$.util.Objects.equals(this.j, uuxVar.j) && this.b == uuxVar.b && this.d == uuxVar.d && this.e == uuxVar.e && this.c == uuxVar.c && this.f == uuxVar.f && this.a == uuxVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.h, this.i, this.j, java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.f), this.a);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("gpuVendor", this.h);
        xymVarBy.b("glVersion", this.i);
        xymVarBy.b("glRenderer", this.j);
        xymVarBy.f("maxTextureSize", this.b);
        xymVarBy.f("maxVertexTextureImageUnits", this.d);
        xymVarBy.f("maxVertexUniformVectors", this.e);
        xymVarBy.f("maxSupportedLineWidth", this.c);
        xymVarBy.f("maxVertexAttribs", this.f);
        xymVarBy.b("nonPowerOfTwoTextureSupport", this.a);
        return xymVarBy.toString();
    }
}
