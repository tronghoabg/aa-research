package defpackage;

@afdo
/* loaded from: classes.dex */
public final class cpj {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof cpj) && this.a == ((cpj) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.a == 1 ? "Touch" : "Keyboard";
    }
}
