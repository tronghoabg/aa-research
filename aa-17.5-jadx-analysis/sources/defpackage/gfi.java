package defpackage;

/* loaded from: classes2.dex */
public final class gfi {
    public final boolean a;
    public final boolean b;

    public gfi(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfi)) {
            return false;
        }
        gfi gfiVar = (gfi) obj;
        return this.a == gfiVar.a && this.b == gfiVar.b;
    }

    public final int hashCode() {
        return (a.f(this.a) * 31) + a.f(this.b);
    }

    public final String toString() {
        return "ContentFade(topEnabled=" + this.a + ", bottomEnabled=" + this.b + ")";
    }
}
