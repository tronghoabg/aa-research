package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class dky {
    public static java.lang.String a(int i) {
        java.lang.String str;
        int i2 = i & 255;
        java.lang.String str2 = "Invalid";
        if (i2 == 1) {
            str = "Strategy.Simple";
        } else if (i2 == 2) {
            str = "Strategy.HighQuality";
        } else if (i2 == 3) {
            str = "Strategy.Balanced";
        } else {
            str = i2 == 0 ? "Strategy.Unspecified" : "Invalid";
        }
        int i3 = (i >> 8) & 255;
        if (i3 == 1) {
            str2 = "Strictness.None";
        } else if (i3 == 2) {
            str2 = "Strictness.Loose";
        } else if (i3 == 3) {
            str2 = "Strictness.Normal";
        } else if (i3 == 4) {
            str2 = "Strictness.Strict";
        } else if (i3 == 0) {
            str2 = "Strictness.Unspecified";
        }
        int i4 = i >> 16;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineBreak(strategy=");
        sb.append(str);
        sb.append(", strictness=");
        sb.append(str2);
        sb.append(", wordBreak=");
        sb.append(1 != i4 ? "WordBreak.Unspecified" : "WordBreak.None");
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
