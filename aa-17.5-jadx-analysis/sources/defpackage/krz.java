package defpackage;

/* loaded from: classes.dex */
public final class krz {
    public final krv a;
    public final ksj b;

    public krz(krv krvVar, ksj ksjVar) {
        krvVar.getClass();
        this.a = krvVar;
        this.b = ksjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krz)) {
            return false;
        }
        krz krzVar = (krz) obj;
        return affa.f(this.a, krzVar.a) && affa.f(this.b, krzVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "VersionedPalette(palette=" + this.a + ", themeVersion=" + this.b + ")";
    }
}
