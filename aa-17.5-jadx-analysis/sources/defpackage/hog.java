package defpackage;

/* loaded from: classes2.dex */
public final class hog extends hdg {
    public static final hnz a = new hnz(7);
    private final String b;

    public hog(String str) {
        str.getClass();
        this.b = str;
        hnv hnvVar = hnv.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hog) && affa.f(this.b, ((hog) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TextPasteParams(text=" + this.b + ")";
    }
}
