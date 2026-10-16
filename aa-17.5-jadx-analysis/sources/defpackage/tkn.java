package defpackage;

/* loaded from: classes.dex */
public final class tkn {
    public final int a;
    public final int b;

    public tkn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkn)) {
            return false;
        }
        tkn tknVar = (tkn) obj;
        return this.a == tknVar.a && this.b == tknVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "ThemeColors(darkThemeColor=" + this.a + ", lightThemeColor=" + this.b + ")";
    }
}
