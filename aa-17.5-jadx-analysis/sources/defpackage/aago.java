package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aago {
    public final String a;
    public final float b;

    public aago(String str, float f) {
        zkt.n(str, "text");
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aago)) {
            return false;
        }
        aago aagoVar = (aago) obj;
        return a.C(this.a, aagoVar.a) && a.C(Float.valueOf(this.b), Float.valueOf(aagoVar.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("text", this.a);
        zsaVarA.d("bearingDeg", this.b);
        return zsaVarA.toString();
    }
}
