package defpackage;

@afdo
/* loaded from: classes.dex */
public final class ckz {
    public final int a;

    public static String a(int i) {
        return i == 0 ? "Miter" : i == 1 ? "Round" : "Bevel";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ckz) && this.a == ((ckz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
