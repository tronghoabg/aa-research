package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dla {
    public static final defpackage.dla a;
    public final float b;
    public final int c;
    public final int d = 0;

    static {
        defpackage.dkz.a(-1.0f);
        a = new defpackage.dla(-1.0f, 17);
    }

    public dla(float f, int i) {
        this.b = f;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dla)) {
            return false;
        }
        defpackage.dla dlaVar = (defpackage.dla) obj;
        if (java.lang.Float.compare(this.b, dlaVar.b) != 0 || this.c != dlaVar.c) {
            return false;
        }
        int i = dlaVar.d;
        return true;
    }

    public final int hashCode() {
        return ((java.lang.Float.floatToIntBits(this.b) * 31) + this.c) * 31;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        float f = this.b;
        if (f == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            str = "LineHeightStyle.Alignment.Top";
        } else if (f == 0.5f) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f == -1.0f) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f == 1.0f) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f + ")";
        }
        int i = this.c;
        if (i == 1) {
            str2 = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str2 = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str2 = "LineHeightStyle.Trim.Both";
        } else {
            str2 = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        return "LineHeightStyle(alignment=" + str + ", trim=" + str2 + ",mode=LineHeightStyle.Mode.Fixed)";
    }
}
