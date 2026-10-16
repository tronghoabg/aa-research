package defpackage;

/* loaded from: classes.dex */
public final class dfe {
    public final dff a;
    public final int b;
    public final int c;

    public dfe(dff dffVar, int i, int i2) {
        this.a = dffVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfe)) {
            return false;
        }
        dfe dfeVar = (dfe) obj;
        return affa.f(this.a, dfeVar.a) && this.b == dfeVar.b && this.c == dfeVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ")";
    }
}
