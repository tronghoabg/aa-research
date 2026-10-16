package defpackage;

/* loaded from: classes.dex */
public final class dik {
    public final dhs a;
    public final die b;
    public final int c;
    public final int d;
    public final Object e = null;

    public dik(dhs dhsVar, die dieVar, int i, int i2) {
        this.a = dhsVar;
        this.b = dieVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dik)) {
            return false;
        }
        dik dikVar = (dik) obj;
        if (!affa.f(this.a, dikVar.a) || !affa.f(this.b, dikVar.b) || this.c != dikVar.c || this.d != dikVar.d) {
            return false;
        }
        Object obj2 = dikVar.e;
        return true;
    }

    public final int hashCode() {
        dhs dhsVar = this.a;
        return (((((((dhsVar == null ? 0 : dhsVar.hashCode()) * 31) + this.b.o) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + dhx.a(this.c) + ", fontSynthesis=" + dhy.a(this.d) + ", resourceLoaderCacheKey=null)";
    }
}
