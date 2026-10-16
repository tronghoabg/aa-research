package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pkx {
    public defpackage.tpm a = null;
    public float b = Float.NaN;
    public float c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public boolean d = false;
    public boolean f = false;
    public float e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public int g = -1;
    private final defpackage.tpm k = null;
    private final float l = -1.0f;
    private final boolean m = false;
    private final float n = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    private final long o = 0;
    private final long p = 0;
    public float i = 1.0f;
    public float j = 1.0f;
    public float h = 1.0f;
    private final boolean q = true;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.pkx)) {
            return false;
        }
        defpackage.pkx pkxVar = (defpackage.pkx) obj;
        defpackage.tpm tpmVar = pkxVar.a;
        if (j$.util.Objects.equals(null, null) && this.b == pkxVar.b) {
            float f = pkxVar.c;
            boolean z = pkxVar.d;
            if (this.f == pkxVar.f) {
                float f2 = pkxVar.e;
                if (this.g == pkxVar.g) {
                    defpackage.tpm tpmVar2 = pkxVar.k;
                    if (j$.util.Objects.equals(null, null)) {
                        float f3 = pkxVar.l;
                        boolean z2 = pkxVar.m;
                        float f4 = pkxVar.n;
                        if (this.i == pkxVar.i && this.j == pkxVar.j && this.h == pkxVar.h) {
                            boolean z3 = pkxVar.q;
                            long j = pkxVar.o;
                            long j2 = pkxVar.p;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Float fValueOf = java.lang.Float.valueOf(this.b);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(this.f);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.g);
        java.lang.Float fValueOf3 = java.lang.Float.valueOf(-1.0f);
        java.lang.Float fValueOf4 = java.lang.Float.valueOf(this.i);
        java.lang.Float fValueOf5 = java.lang.Float.valueOf(this.j);
        java.lang.Float fValueOf6 = java.lang.Float.valueOf(this.h);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return j$.util.Objects.hash(null, fValueOf, fValueOf2, bool, boolValueOf, fValueOf2, numValueOf, fValueOf3, bool, fValueOf2, fValueOf4, fValueOf5, fValueOf6, java.lang.Boolean.TRUE);
    }

    public final java.lang.String toString() {
        return "Invalid point";
    }
}
