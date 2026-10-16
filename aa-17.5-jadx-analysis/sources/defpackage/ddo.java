package defpackage;

@afdo
/* loaded from: classes.dex */
public final class ddo {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof ddo) && this.a == ((ddo) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : "Image";
    }
}
