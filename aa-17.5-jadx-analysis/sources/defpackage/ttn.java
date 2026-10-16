package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class ttn implements Serializable {
    public static final ttn a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public final toi g;
    public final too h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final tto o;
    public toh p;

    static {
        ttl ttlVar = new ttl();
        ttlVar.e(new too(0, 0));
        ttlVar.e = 20.0f;
        ttlVar.f = BitmapDescriptorFactory.HUE_RED;
        ttlVar.g = BitmapDescriptorFactory.HUE_RED;
        ttlVar.i = tto.a;
        ttlVar.c = BitmapDescriptorFactory.HUE_RED;
        ttlVar.d = BitmapDescriptorFactory.HUE_RED;
        ttlVar.h = 30.0f;
        a = ttlVar.a();
        tmo.v();
        b = 8;
        c = 1;
        d = 2;
        e = 4;
        f = 8;
    }

    public ttn(toi toiVar, float f2, float f3, float f4, tto ttoVar, float f5, float f6, float f7) {
        toiVar.getClass();
        ttoVar.getClass();
        if (f3 <= BitmapDescriptorFactory.HUE_RED) {
            f3 = 0.0f;
        } else if (f3 > 90.0f) {
            f3 = 90.0f;
        }
        this.g = toiVar;
        this.h = tmo.q(toiVar);
        this.l = Math.max(2.0f, Math.min(f2, 21.0f));
        this.m = f3 + BitmapDescriptorFactory.HUE_RED;
        this.n = (((double) f4) <= 0.0d ? (f4 % 360.0f) + 360.0f : f4) % 360.0f;
        this.o = tto.d(ttoVar);
        this.i = f5;
        this.k = f6;
        this.j = f7;
    }

    public static final trp a(ttn ttnVar) {
        toi toiVar = ttnVar.g;
        tro troVarA = trp.a();
        troVarA.a = toiVar;
        troVarA.d(ttnVar.i);
        troVarA.e(ttnVar.k);
        troVarA.h(ttnVar.l);
        troVarA.f(ttnVar.m);
        troVarA.c(ttnVar.n);
        tto ttoVar = ttnVar.o;
        troVarA.b = trq.a(ttoVar.b, ttoVar.c);
        troVarA.g(ttnVar.j);
        return troVarA.a();
    }

    public static final ttn b(trp trpVar) {
        ttl ttlVar = new ttl();
        ttlVar.a = trpVar.a;
        ttlVar.c = trpVar.b;
        ttlVar.d = trpVar.c;
        ttlVar.e = trpVar.h;
        ttlVar.f = trpVar.e;
        ttlVar.g = trpVar.d;
        trq trqVar = trpVar.f;
        ttlVar.i = new tto(trqVar.b, trqVar.c);
        ttlVar.h = trpVar.g;
        return ttlVar.a();
    }

    public final Object c(int i) {
        switch (i - 1) {
            case 0:
                return this.h;
            case 1:
                return Float.valueOf(this.l);
            case 2:
                return Float.valueOf(this.m);
            case 3:
                return Float.valueOf(this.n);
            case 4:
                return this.o;
            case 5:
                return Float.valueOf(this.i);
            case 6:
                return Float.valueOf(this.k);
            default:
                return Float.valueOf(this.j);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttn)) {
            return false;
        }
        ttn ttnVar = (ttn) obj;
        return this.g.equals(ttnVar.g) && Float.floatToIntBits(this.l) == Float.floatToIntBits(ttnVar.l) && Float.floatToIntBits(this.m) == Float.floatToIntBits(ttnVar.m) && Float.floatToIntBits(this.n) == Float.floatToIntBits(ttnVar.n) && this.o.equals(ttnVar.o) && Float.floatToIntBits(this.i) == Float.floatToIntBits(ttnVar.i) && Float.floatToIntBits(this.k) == Float.floatToIntBits(ttnVar.k) && Float.floatToIntBits(this.j) == Float.floatToIntBits(ttnVar.j);
    }

    public final int hashCode() {
        return Objects.hash(this.g, Float.valueOf(this.l), Float.valueOf(this.m), Float.valueOf(this.n), this.o, Float.valueOf(this.i), Float.valueOf(this.k), Float.valueOf(this.j));
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("target", this.g);
        xxgVarAo.e("zoom", this.l);
        xxgVarAo.e("tilt", this.m);
        xxgVarAo.e("bearing", this.n);
        xxgVarAo.b("lookAhead", this.o);
        xxgVarAo.e("targetAltitude", this.i);
        xxgVarAo.e("targetAltitudeStrength", this.k);
        xxgVarAo.e("verticalFov", this.j);
        return xxgVarAo.toString();
    }
}
