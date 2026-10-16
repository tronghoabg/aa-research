package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class pkd {
    public too a = null;
    public float b = Float.NaN;
    public float c = BitmapDescriptorFactory.HUE_RED;
    public boolean d = false;
    public boolean f = false;
    public float e = BitmapDescriptorFactory.HUE_RED;
    public int g = -1;
    private final too k = null;
    private final float l = -1.0f;
    private final boolean m = false;
    private final float n = BitmapDescriptorFactory.HUE_RED;
    private final long o = 0;
    private final long p = 0;
    public float i = 1.0f;
    public float j = 1.0f;
    public float h = 1.0f;
    private final boolean q = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkd)) {
            return false;
        }
        pkd pkdVar = (pkd) obj;
        too tooVar = pkdVar.a;
        if (Objects.equals(null, null) && this.b == pkdVar.b) {
            float f = pkdVar.c;
            boolean z = pkdVar.d;
            if (this.f == pkdVar.f) {
                float f2 = pkdVar.e;
                if (this.g == pkdVar.g) {
                    too tooVar2 = pkdVar.k;
                    if (Objects.equals(null, null)) {
                        float f3 = pkdVar.l;
                        boolean z2 = pkdVar.m;
                        float f4 = pkdVar.n;
                        if (this.i == pkdVar.i && this.j == pkdVar.j && this.h == pkdVar.h) {
                            boolean z3 = pkdVar.q;
                            long j = pkdVar.o;
                            long j2 = pkdVar.p;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Float fValueOf = Float.valueOf(this.b);
        Float fValueOf2 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        return Objects.hash(null, fValueOf, fValueOf2, false, Boolean.valueOf(this.f), fValueOf2, Integer.valueOf(this.g), Float.valueOf(-1.0f), false, fValueOf2, Float.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.h), true);
    }

    public final String toString() {
        return "Invalid point";
    }
}
