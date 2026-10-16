package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class ddw {
    public final int a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ddw) && this.a == ((defpackage.ddw) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        return i == 4 ? "Tab" : "Image";
    }
}
