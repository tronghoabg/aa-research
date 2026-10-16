package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class dlb {
    public final int a;

    public static java.lang.String a(int i) {
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dlb) && this.a == ((defpackage.dlb) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
