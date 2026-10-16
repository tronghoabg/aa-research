package defpackage;

@afdo
/* loaded from: classes.dex */
public final class cke {
    public final int a;

    public static boolean a(int i, Object obj) {
        return (obj instanceof cke) && i == ((cke) obj).a;
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : "Gpu";
    }
}
