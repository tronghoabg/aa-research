package defpackage;

/* loaded from: classes2.dex */
final class ajue {
    public final String a;
    public final int b;

    public ajue(String str, int i) {
        ahgm.e(str, "Value");
        this.a = str;
        if (i <= 0) {
            throw new IllegalArgumentException("Type may not be negative or zero");
        }
        this.b = i;
    }

    public final String toString() {
        return this.a;
    }
}
