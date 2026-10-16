package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dks {
    public static final dks a;
    public final float b;
    public final int c;
    public final int d = 0;

    static {
        dkr.a(-1.0f);
        a = new dks(-1.0f, 17);
    }

    public dks(float f, int i) {
        this.b = f;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dks)) {
            return false;
        }
        dks dksVar = (dks) obj;
        if (Float.compare(this.b, dksVar.b) != 0 || this.c != dksVar.c) {
            return false;
        }
        int i = dksVar.d;
        return true;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.b) * 31) + this.c) * 31;
    }

    public final String toString() {
        String str;
        float f = this.b;
        if (f == BitmapDescriptorFactory.HUE_RED) {
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
        return "LineHeightStyle(alignment=" + str + ", trim=" + (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid") + ",mode=LineHeightStyle.Mode.Fixed)";
    }
}
