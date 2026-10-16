package defpackage;

/* loaded from: classes2.dex */
public final class omn {
    public final int a;
    public final int b;

    public omn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omn)) {
            return false;
        }
        omn omnVar = (omn) obj;
        return this.a == omnVar.a && this.b == omnVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "BackgroundColors(colorNormal=" + this.a + ", colorFocused=" + this.b + ")";
    }
}
