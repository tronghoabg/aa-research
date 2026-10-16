package defpackage;

import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class uub {
    final uua a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;

    public uub(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, uua uuaVar) {
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.b = i;
        this.d = i2;
        this.e = i3;
        this.c = i4;
        this.f = i5;
        this.a = uuaVar;
        boolean z = false;
        if (str3 != null && str3.toLowerCase(Locale.ROOT).contains("mali")) {
            z = true;
        }
        this.g = z;
    }

    public final boolean a(boolean z) {
        uua uuaVar = this.a;
        return z ? uuaVar.e : uuaVar.d;
    }

    public final boolean b() {
        return this.d != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uub) {
            uub uubVar = (uub) obj;
            if (Objects.equals(this.h, uubVar.h) && Objects.equals(this.i, uubVar.i) && Objects.equals(this.j, uubVar.j) && this.b == uubVar.b && this.d == uubVar.d && this.e == uubVar.e && this.c == uubVar.c && this.f == uubVar.f && this.a == uubVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.h, this.i, this.j, Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.c), Integer.valueOf(this.f), this.a);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("gpuVendor", this.h);
        xxgVarAo.b("glVersion", this.i);
        xxgVarAo.b("glRenderer", this.j);
        xxgVarAo.f("maxTextureSize", this.b);
        xxgVarAo.f("maxVertexTextureImageUnits", this.d);
        xxgVarAo.f("maxVertexUniformVectors", this.e);
        xxgVarAo.f("maxSupportedLineWidth", this.c);
        xxgVarAo.f("maxVertexAttribs", this.f);
        xxgVarAo.b("nonPowerOfTwoTextureSupport", this.a);
        return xxgVarAo.toString();
    }
}
