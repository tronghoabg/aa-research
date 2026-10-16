package defpackage;

@afdo
/* loaded from: classes.dex */
public final class ckn {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof ckn) && this.a == ((ckn) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return 1 != this.a ? "NonZero" : "EvenOdd";
    }
}
