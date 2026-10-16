package defpackage;

@afdo
/* loaded from: classes.dex */
public final class crb {
    private final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof crb) && this.a == ((crb) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ")";
    }
}
