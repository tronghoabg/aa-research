package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cfp implements cfn {
    private final float a;
    private final float b = -1.0f;

    public cfp(float f) {
        this.a = f;
    }

    @Override // defpackage.cfn
    public final long a(long j, long j2, dlr dlrVar) {
        long j3 = ((-((int) (j >> 32))) << 32) | ((-((int) (j & 4294967295L))) & 4294967295L);
        return (Math.round((((int) (j3 & 4294967295L)) / 2.0f) * BitmapDescriptorFactory.HUE_RED) & 4294967295L) | (Math.round((((int) (j3 >> 32)) / 2.0f) * (this.a + 1.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfp)) {
            return false;
        }
        cfp cfpVar = (cfp) obj;
        if (Float.compare(this.a, cfpVar.a) != 0) {
            return false;
        }
        float f = cfpVar.b;
        return Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(-1.0f);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
