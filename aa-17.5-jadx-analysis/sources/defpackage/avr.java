package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class avr implements avp {
    public final float a;
    public final float b;
    private final float c;
    private final float d;

    public avr(float f, float f2, float f3, float f4) {
        this.c = f;
        this.a = f2;
        this.d = f3;
        this.b = f4;
        if (!((f >= BitmapDescriptorFactory.HUE_RED) & (f2 >= BitmapDescriptorFactory.HUE_RED) & (f3 >= BitmapDescriptorFactory.HUE_RED)) || !(f4 >= BitmapDescriptorFactory.HUE_RED)) {
            awx.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.avp
    public final float a() {
        return this.b;
    }

    @Override // defpackage.avp
    public final float b(dlr dlrVar) {
        return dlrVar == dlr.a ? this.c : this.d;
    }

    @Override // defpackage.avp
    public final float c(dlr dlrVar) {
        return dlrVar == dlr.a ? this.d : this.c;
    }

    @Override // defpackage.avp
    public final float d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avr)) {
            return false;
        }
        avr avrVar = (avr) obj;
        return Float.compare(this.c, avrVar.c) == 0 && Float.compare(this.a, avrVar.a) == 0 && Float.compare(this.d, avrVar.d) == 0 && Float.compare(this.b, avrVar.b) == 0;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        float f = this.b;
        float f2 = this.d;
        float f3 = this.a;
        return "PaddingValues(start=" + dlj.b(this.c) + ", top=" + dlj.b(f3) + ", end=" + dlj.b(f2) + ", bottom=" + dlj.b(f) + ")";
    }
}
