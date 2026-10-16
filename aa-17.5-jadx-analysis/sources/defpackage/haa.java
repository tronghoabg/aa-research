package defpackage;

/* loaded from: classes2.dex */
public final class haa implements hab {
    public final gag a;

    public haa(gag gagVar) {
        this.a = gagVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof haa) && affa.f(this.a, ((haa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LargeImage(image=" + this.a + ")";
    }
}
