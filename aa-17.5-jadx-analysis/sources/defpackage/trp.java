package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class trp {
    public final toi a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final trq f;
    public final float g;
    public final float h;

    public trp(toi toiVar, float f, float f2, float f3, float f4, trq trqVar, float f5, float f6) {
        this.a = toiVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = trqVar;
        this.g = f5;
        this.h = f6;
    }

    public static tro a() {
        tro troVar = new tro();
        troVar.a = new toi(0.0d, 0.0d);
        troVar.d(BitmapDescriptorFactory.HUE_RED);
        troVar.e(BitmapDescriptorFactory.HUE_RED);
        troVar.b = trq.a;
        troVar.c(BitmapDescriptorFactory.HUE_RED);
        troVar.f(BitmapDescriptorFactory.HUE_RED);
        troVar.h(2.0f);
        troVar.g(30.0f);
        return troVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trp) {
            trp trpVar = (trp) obj;
            if (this.a.equals(trpVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(trpVar.b)) {
                    if (Float.floatToIntBits(this.c) == Float.floatToIntBits(trpVar.c)) {
                        if (Float.floatToIntBits(this.d) == Float.floatToIntBits(trpVar.d)) {
                            if (Float.floatToIntBits(this.e) == Float.floatToIntBits(trpVar.e) && this.f.equals(trpVar.f)) {
                                if (Float.floatToIntBits(this.g) == Float.floatToIntBits(trpVar.g)) {
                                    if (Float.floatToIntBits(this.h) == Float.floatToIntBits(trpVar.h)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ Float.floatToIntBits(this.g);
        return Float.floatToIntBits(this.h) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        trq trqVar = this.f;
        return "{" + String.valueOf(this.a) + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + String.valueOf(trqVar) + ", " + this.g + ", " + this.h + "}";
    }

    public trp() {
        throw null;
    }
}
