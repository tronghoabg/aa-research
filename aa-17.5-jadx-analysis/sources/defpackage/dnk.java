package defpackage;

import android.os.IBinder;

/* loaded from: classes.dex */
public final class dnk {
    public final String a;
    public final float b;
    public final float c;
    public final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final IBinder j;
    private final float k;
    private final ckv l;

    public dnk(byte[] bArr) {
        this.e = true;
        this.f = true;
        this.d = 1;
        this.g = true;
        this.h = true;
        this.a = "";
        this.i = 2;
        this.j = null;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.k = Float.NaN;
        this.l = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnk)) {
            return false;
        }
        dnk dnkVar = (dnk) obj;
        boolean z = dnkVar.e;
        boolean z2 = dnkVar.f;
        int i = dnkVar.d;
        boolean z3 = dnkVar.g;
        boolean z4 = dnkVar.h;
        int i2 = dnkVar.i;
        IBinder iBinder = dnkVar.j;
        float f = dnkVar.b;
        if (Float.compare(Float.NaN, Float.NaN) == 0) {
            float f2 = dnkVar.c;
            if (Float.compare(Float.NaN, Float.NaN) == 0) {
                float f3 = dnkVar.k;
                if (Float.isNaN(Float.NaN) && Float.isNaN(Float.NaN)) {
                    ckv ckvVar = dnkVar.l;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(Float.NaN) + 713370657) * 31) + Float.floatToIntBits(Float.NaN)) * 31) + Float.floatToIntBits(Float.NaN)) * 31;
    }

    public dnk() {
        this(null);
    }
}
