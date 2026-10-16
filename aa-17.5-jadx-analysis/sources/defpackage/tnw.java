package defpackage;

/* loaded from: classes3.dex */
public final class tnw {
    private final boolean a;
    private final xxh b;
    private final yfq c;

    public tnw(boolean z, xxh xxhVar, yfq yfqVar) {
        this.a = z;
        this.b = xxhVar;
        this.c = yfqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tnw) {
            tnw tnwVar = (tnw) obj;
            if (this.a == tnwVar.a && this.b.equals(tnwVar.b) && yrm.W(this.c, tnwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ (((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        yfq yfqVar = this.c;
        return "{" + this.a + ", false, false, " + String.valueOf(this.b) + ", false, false, " + String.valueOf(yfqVar) + "}";
    }

    public tnw() {
        throw null;
    }
}
