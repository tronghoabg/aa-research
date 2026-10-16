package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class clg {
    public final int a;

    public static java.lang.String a(int i) {
        if (i == 0) {
            return "Butt";
        }
        return i == 1 ? "Round" : "Square";
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.clg) && this.a == ((defpackage.clg) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
