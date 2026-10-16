package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jv {
    private final android.graphics.Typeface a;
    private final java.lang.String b;
    private final int c;

    public jv(android.graphics.Typeface typeface, java.lang.String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.jv)) {
            return false;
        }
        defpackage.jv jvVar = (defpackage.jv) obj;
        return this.c == jvVar.c && j$.util.Objects.equals(this.a, jvVar.a) && j$.util.Objects.equals(this.b, jvVar.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, java.lang.Integer.valueOf(this.c));
    }
}
