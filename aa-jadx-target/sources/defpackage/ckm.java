package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class ckm {
    public final int a;

    public static boolean a(int i, java.lang.Object obj) {
        return (obj instanceof defpackage.ckm) && i == ((defpackage.ckm) obj).a;
    }

    public final boolean equals(java.lang.Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        return i == 3 ? "F16" : "Gpu";
    }
}
