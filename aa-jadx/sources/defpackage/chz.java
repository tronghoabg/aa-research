package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class chz {
    public final int a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.chz) && this.a == ((defpackage.chz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        return i == 7 ? "Enter" : "Exit";
    }
}
