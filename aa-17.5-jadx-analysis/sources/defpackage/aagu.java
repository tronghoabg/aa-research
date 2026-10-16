package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class aagu {
    public final String e;
    public final float f;
    public final float g;

    public aagu(String str, float f, float f2) {
        zkt.n(str, "panoId");
        this.e = str;
        zkt.l(f, "dXm cannot be NaN");
        this.f = f;
        zkt.l(f2, "dYm cannot be NaN");
        this.g = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aagu)) {
            return false;
        }
        aagu aaguVar = (aagu) obj;
        return a.C(this.e, aaguVar.e) && a.C(Float.valueOf(this.f), Float.valueOf(aaguVar.f)) && a.C(Float.valueOf(this.g), Float.valueOf(aaguVar.g));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, Float.valueOf(this.f), Float.valueOf(this.g)});
    }

    public String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("panoId", this.e);
        zsaVarA.d("dXm", this.f);
        zsaVarA.d("dYm", this.g);
        return zsaVarA.toString();
    }
}
