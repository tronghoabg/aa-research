package defpackage;

@afdo
/* loaded from: classes.dex */
public final class dhx {
    public final int a;

    public static String a(int i) {
        return 1 != i ? "Normal" : "Italic";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dhx) && this.a == ((dhx) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
