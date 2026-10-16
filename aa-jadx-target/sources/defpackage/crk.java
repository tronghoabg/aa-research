package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class crk {
    private final int a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.crk) && this.a == ((defpackage.crk) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ")";
    }
}
