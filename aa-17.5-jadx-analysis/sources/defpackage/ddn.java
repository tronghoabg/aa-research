package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ddn {
    public static final ddn a = new ddn(BitmapDescriptorFactory.HUE_RED, new afgw(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
    public final float b;
    public final afgw c;
    private final int d = 0;

    public ddn(float f, afgw afgwVar) {
        this.b = f;
        this.c = afgwVar;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddn)) {
            return false;
        }
        ddn ddnVar = (ddn) obj;
        if (this.b != ddnVar.b || !affa.f(this.c, ddnVar.c)) {
            return false;
        }
        int i = ddnVar.d;
        return true;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.b) * 31) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.b + ", range=" + this.c + ", steps=0)";
    }
}
