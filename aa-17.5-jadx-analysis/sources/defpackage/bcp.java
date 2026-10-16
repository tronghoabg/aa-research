package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bcp implements bcn {
    private final float a;

    public bcp(float f) {
        this.a = f;
        if (f < BitmapDescriptorFactory.HUE_RED || f > 100.0f) {
            asl.c("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.bcn
    public final float a(long j, dlg dlgVar) {
        return cjd.b(j) * (this.a / 100.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcp) && Float.compare(this.a, ((bcp) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
