package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class cps {
    public final int a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cps) && this.a == ((defpackage.cps) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return this.a == 1 ? "Touch" : "Keyboard";
    }
}
