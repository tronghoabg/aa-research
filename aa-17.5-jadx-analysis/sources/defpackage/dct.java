package defpackage;

/* loaded from: classes.dex */
public final class dct {
    public final cng a;
    public final int b;

    public dct(cng cngVar, int i) {
        this.a = cngVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dct)) {
            return false;
        }
        dct dctVar = (dct) obj;
        return affa.f(this.a, dctVar.a) && this.b == dctVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ")";
    }
}
