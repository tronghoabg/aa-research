package defpackage;

/* loaded from: classes2.dex */
public final class hoe extends hdg {
    public static final hnz a = new hnz(5);
    private final String b;

    public hoe(String str) {
        str.getClass();
        this.b = str;
        hnv hnvVar = hnv.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hoe) && affa.f(this.b, ((hoe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SharePhotoParams(query=" + this.b + ")";
    }
}
