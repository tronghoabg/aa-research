package defpackage;

@afdo
/* loaded from: classes.dex */
public final class dkq {
    public static String a(int i) {
        int i2 = i & 255;
        String str = "Invalid";
        String str2 = i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : i2 == 0 ? "Strategy.Unspecified" : "Invalid";
        int i3 = (i >> 8) & 255;
        if (i3 == 1) {
            str = "Strictness.None";
        } else if (i3 == 2) {
            str = "Strictness.Loose";
        } else if (i3 == 3) {
            str = "Strictness.Normal";
        } else if (i3 == 4) {
            str = "Strictness.Strict";
        } else if (i3 == 0) {
            str = "Strictness.Unspecified";
        }
        int i4 = i >> 16;
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        sb.append(str2);
        sb.append(", strictness=");
        sb.append(str);
        sb.append(", wordBreak=");
        sb.append(1 != i4 ? "WordBreak.Unspecified" : "WordBreak.None");
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
