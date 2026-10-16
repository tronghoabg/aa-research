package defpackage;

@afdo
/* loaded from: classes.dex */
public final class cky {
    public final int a;

    public static String a(int i) {
        return i == 0 ? "Butt" : i == 1 ? "Round" : "Square";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cky) && this.a == ((cky) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
