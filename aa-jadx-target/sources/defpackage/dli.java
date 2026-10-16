package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dli {
    public static final defpackage.dli a = new defpackage.dli(2, false);
    private static final defpackage.dli d = new defpackage.dli(1, true);
    public final int b;
    public final boolean c;

    public dli(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dli)) {
            return false;
        }
        defpackage.dli dliVar = (defpackage.dli) obj;
        return this.b == dliVar.b && this.c == dliVar.c;
    }

    public final int hashCode() {
        return (this.b * 31) + (true != this.c ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        if (defpackage.afga.f(this, a)) {
            return "TextMotion.Static";
        }
        return defpackage.afga.f(this, d) ? "TextMotion.Animated" : "Invalid";
    }
}
