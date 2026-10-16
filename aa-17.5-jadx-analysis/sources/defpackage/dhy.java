package defpackage;

@afdo
/* loaded from: classes.dex */
public final class dhy {
    public final int a;

    public static String a(int i) {
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dhy) && this.a == ((dhy) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
