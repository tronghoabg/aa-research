package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class clh {
    public final int a;

    public static java.lang.String a(int i) {
        if (i == 0) {
            return "Miter";
        }
        return i == 1 ? "Round" : "Bevel";
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.clh) && this.a == ((defpackage.clh) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
