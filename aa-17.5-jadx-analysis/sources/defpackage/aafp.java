package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aafp {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public aafp(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        zkt.e(i != 0, "glHandle");
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aafp)) {
            return false;
        }
        aafp aafpVar = (aafp) obj;
        return a.C(this.a, aafpVar.a) && a.C(Integer.valueOf(this.b), Integer.valueOf(aafpVar.b)) && a.C(Integer.valueOf(this.c), Integer.valueOf(aafpVar.c)) && a.C(Integer.valueOf(this.d), Integer.valueOf(aafpVar.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("glShaderVariableName", this.a);
        zsaVarA.e("glHandle", this.b);
        zsaVarA.e("glType", this.c);
        zsaVarA.e("glSize", this.d);
        return zsaVarA.toString();
    }
}
