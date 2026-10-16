package defpackage;

/* loaded from: classes.dex */
public final class dla {
    public static final dla a = new dla(2, false);
    private static final dla d = new dla(1, true);
    public final int b;
    public final boolean c;

    public dla(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dla)) {
            return false;
        }
        dla dlaVar = (dla) obj;
        return this.b == dlaVar.b && this.c == dlaVar.c;
    }

    public final int hashCode() {
        return (this.b * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return affa.f(this, a) ? "TextMotion.Static" : affa.f(this, d) ? "TextMotion.Animated" : "Invalid";
    }
}
