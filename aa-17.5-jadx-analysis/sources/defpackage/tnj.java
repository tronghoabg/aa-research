package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class tnj {
    private final List a;
    private final int b;

    public tnj(tnk tnkVar) {
        List listBg = woy.bg(tnkVar);
        this.b = 2;
        this.a = listBg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnj)) {
            return false;
        }
        tnj tnjVar = (tnj) obj;
        return this.b == tnjVar.b && affa.f(this.a, tnjVar.a);
    }

    public final int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IneligibleFeature(feature=");
        sb.append((Object) (this.b != 1 ? "Nav3DMap" : "Buildings3DLayer"));
        sb.append(", reasons=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }

    public tnj() {
        throw null;
    }
}
